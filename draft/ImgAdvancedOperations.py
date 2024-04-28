from PIL import Image
from rembg import remove
import random
import os


def generate_random_img_name(img_format):
    return "img" + str(random.randint(0, 1000)) + "." + img_format


class ImgAdvancedOperations:
    def compress(self, image):
        """
        Compress the image using lossless compression.
        :param image: The PIL image to compress.
        :return: The compressed image.
        """
        img_format = image.format
        output_path = generate_random_img_name(img_format)

        image.save(output_path, format=img_format, optimize=True, quality=95)
        image = Image.open(output_path)
        os.remove(output_path)

        return image

    def remBg(self, image):
        """
        Remove the background from the image.
        :param image: The PIL image to remove the background from.
        :return: The image with the background removed.
        """
        removed_bg = remove(image)
        removed_bg = removed_bg.convert("RGB")

        output_path = generate_random_img_name(image.format)
        removed_bg.save(output_path)

        image = Image.open(output_path)
        os.remove(output_path)

        return image

    def upscale(self, image, scale_factor):
        """
        Upscale the image using a super-resolution model.
        :param image: The PIL image to upscale.
        :param scale_factor: The scale factor to upscale the image by.
        :return: The upscaled image.
        """
        # TODO: Implement super-resolution upscaling
        return image

    def colorize(self, image):
        """
        Colorize the image from black and white
        :param image: The PIL image to colorize.
        :return: The colorized image.
        """
        # TODO: Implement colorization
        return image