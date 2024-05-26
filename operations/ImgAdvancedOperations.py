import sys

import torch
from PIL import Image
import io
import os
import cv2
import numpy as np
from rembg import remove
import torchsr
import torchvision.transforms.functional as TF


# Model files for the colorization model
script_dir = os.path.dirname(__file__)
parent_dir = os.path.dirname(script_dir)
PROTOTXT = os.path.join(parent_dir, "model", "colorization_deploy_v2.prototxt")
MODEL = os.path.join(parent_dir, "model", "colorization_release_v2.caffemodel")
POINTS = os.path.join(parent_dir, "model", "pts_in_hull.npy")


class ImgAdvancedOperations:
    def __init__(self, image):
        self.image = image

    def compress(self, image_format):
        """
        Compress the image using the specified format.
        :param image_format: The format to save the image as (e.g., 'JPEG', 'PNG').
        :return: The compressed image.
        """
        image = self.image

        image_format = image_format.upper()
        if image_format not in Image.registered_extensions().values():
            print(f"Unsupported image format for compression: {image_format}", file=sys.stderr)

        if image.mode in ('RGBA', 'LA'):
            # Assuming a white background for images with transparency
            background = Image.new('RGB', image.size, (255, 255, 255))
            background.paste(image, mask=image.split()[3])  # 3 is the index of the alpha channel
            image = background
        elif image.mode != 'RGB' and image_format == 'JPEG':
            image = image.convert('RGB')

        buffer = io.BytesIO()
        image.save(buffer, format=image_format)
        buffer.seek(0)
        compressed_image = Image.open(buffer)

        return compressed_image

    def remBg(self):
        """
        Remove the background from the image.
        :return: The image with the background removed.
        """
        removed_bg = remove(self.image, bgcolor=(255, 255, 255, 0)).convert("RGBA")

        return removed_bg

    def upscale(self, lvl):
        """
        Upscale the image using a super-resolution model.
        :param lvl: The level of upscaling (e.g., 1, 2, 4, 8).
        :return: The upscaled image.
        """

        if lvl not in [1, 2, 4, 8]:
            print("Scale factor must be a power of 2 (e.g., 1, 2, 4, 8).", file=sys.stderr)

        image_tensor = TF.to_tensor(self.image).unsqueeze(0)
        sr_model = torchsr.models.carn(pretrained=True, scale=int(lvl))

        with torch.no_grad():
            upscaled_image_tensor = sr_model(image_tensor)

        upscaled_image = TF.to_pil_image(upscaled_image_tensor.squeeze(0))

        return upscaled_image

    def colorize(self):
        """
        Colorize the image from black and white
        :return: The colorized image.
        """

        net = cv2.dnn.readNetFromCaffe(PROTOTXT, MODEL)
        pts = np.load(POINTS)

        # Load centers for ab channel quantization used for rebalancing.
        class8 = net.getLayerId("class8_ab")
        conv8 = net.getLayerId("conv8_313_rh")
        pts = pts.transpose().reshape(2, 313, 1, 1)
        net.getLayer(class8).blobs = [pts.astype("float32")]
        net.getLayer(conv8).blobs = [np.full([1, 313], 2.606, dtype="float32")]

        image = cv2.cvtColor(np.array(self.image), cv2.COLOR_RGB2BGR)
        scaled = image.astype("float32") / 255.0
        lab = cv2.cvtColor(scaled, cv2.COLOR_BGR2LAB)

        resized = cv2.resize(lab, (224, 224))
        L = cv2.split(resized)[0]
        L -= 50

        net.setInput(cv2.dnn.blobFromImage(L))
        ab = net.forward()[0, :, :, :].transpose((1, 2, 0))
        ab = cv2.resize(ab, (image.shape[1], image.shape[0]))

        L = cv2.split(lab)[0]
        colorized = np.concatenate((L[:, :, np.newaxis], ab), axis=2)

        colorized = cv2.cvtColor(colorized, cv2.COLOR_LAB2BGR)
        colorized = np.clip(colorized, 0, 1)

        colorized = (255 * colorized).astype("uint8")
        colorized = cv2.cvtColor(colorized, cv2.COLOR_BGR2RGB)
        colorized = Image.fromarray(colorized)

        return colorized
