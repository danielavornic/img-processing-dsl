import numpy as np
from PIL import Image, ImageFilter, ImageEnhance, ImageOps
import cv2

class ImgEnhancements:
    def blur(self, image, level):
        """
        Blurs the image

        """
        return image.filter(ImageFilter.GaussianBlur(radius=level))
    #
    def sharpen(self, image, sharpness_factor):
        """
        Sharpens the image
        """
        enhancer = ImageEnhance.Sharpness(image)
        sharpened_image = enhancer.enhance(sharpness_factor)
        return sharpened_image

    def threshold(self, image, level):
        """
        Converts the image to a binary image. All pixels with a value above the level are set to 255, all others to 0.
        """
        # open cv face asta, dar hz daca se poate de returnat not in pil, si cv2 citeste incorect imaginea
        gray_image = ImageOps.grayscale(image)
        return gray_image.point(lambda x: 255 if x > level else 0, '1')

    def reduceNoise(self, image):
        """
        Reduces noise from the image. Works with a color image.
        """
        cv2_image = np.array(image)
        cv2_image = cv2.cvtColor(cv2_image, cv2.COLOR_RGB2BGR)
        cv2_image = cv2.fastNlMeansDenoisingColored(cv2_image, None, 10, 10, 7, 21)

        return Image.fromarray(cv2.cvtColor(cv2_image, cv2.COLOR_BGR2RGB))


