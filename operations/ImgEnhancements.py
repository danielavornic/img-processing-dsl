import numpy as np
from PIL import Image, ImageFilter, ImageEnhance, ImageOps
import cv2


class ImgEnhancements:
    def __init__(self, image):
        self.image = image

    def blur(self, lvl):
        """
        Blurs the image using a Gaussian blur.
        :param lvl: The blur level.
        :return: The blurred PIL image.
        """
        return self.image.filter(ImageFilter.GaussianBlur(radius=lvl))

    def sharpen(self, lvl):
        """
        Sharpens the image
        :param lvl: The sharpness factor.
        :return: The sharpened PIL image.
        """
        if lvl < 0 or lvl > 10:
            raise ValueError("Sharpness level must be between 0 and 10.")

        enhancer = ImageEnhance.Sharpness(self.image)
        sharpened_image = enhancer.enhance(lvl)
        return sharpened_image

    def threshold(self, lvl):
        """
        Converts the image to a binary image. All pixels with a value above the level are set to 255, all others to 0.
        :param lvl: The threshold level.
        :return: The thresholded PIL image.
        """
        gray_image = ImageOps.grayscale(self.image)
        return gray_image.point(lambda x: 255 if x > lvl else 0, '1')

    def reduceNoise(self):
        """
        Reduces noise from the image. Works with a color image.
        :return: The denoised PIL image.
        """
        cv2_image = np.array(self.image)
        cv2_image = cv2.cvtColor(cv2_image, cv2.COLOR_RGB2BGR)
        cv2_image = cv2.fastNlMeansDenoisingColored(cv2_image, None, 10, 10, 7, 21)

        return Image.fromarray(cv2.cvtColor(cv2_image, cv2.COLOR_BGR2RGB))
