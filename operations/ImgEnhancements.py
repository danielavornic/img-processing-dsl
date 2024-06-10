import numpy as np
from PIL import Image, ImageFilter, ImageEnhance, ImageOps
import cv2

from operations.ImgHelperOperations import print_error


class ImgEnhancements:
    def __init__(self, image):
        self.image = image

    def blur(self, lvl):
        """
        Blurs the image using a Gaussian blur.
        :param lvl: The blur level.
        :return: The blurred PIL image.
        """
        if lvl < 0:
            print_error("Blur level must be greater than 0.", self.image)
            return None

        try:
            return self.image.filter(ImageFilter.GaussianBlur(radius=lvl))
        except Exception as e:
            print_error(f"Error blurring image: {e}", self.image)

    def sharpen(self, lvl):
        """
        Sharpens the image
        :param lvl: The sharpness factor.
        :return: The sharpened PIL image.
        """
        if lvl < 0 or lvl > 10:
            print_error("Sharpness level must be between 0 and 10.", self.image)
            return None

        try:
            enhancer = ImageEnhance.Sharpness(self.image)
            sharpened_image = enhancer.enhance(lvl)
            return sharpened_image
        except Exception as e:
            print_error(f"Error sharpening image: {e}", self.image)

    def threshold(self, lvl):
        """
        Converts the image to a binary image. All pixels with a value above the level are set to 255, all others to 0.
        :param lvl: The threshold level.
        :return: The thresholded PIL image.
        """

        if lvl < 0 or lvl > 255:
            print_error("Threshold level must be between 0 and 255.", self.image)
            return None

        try:
            gray_image = ImageOps.grayscale(self.image)
            return gray_image.point(lambda x: 255 if x > lvl else 0, '1')
        except Exception as e:
            print_error(f"Error thresholding image: {e}", self.image)

    def reduceNoise(self):
        """
        Reduces noise from the image. Works with a color image.
        :return: The denoised PIL image.
        """
        try:
            cv2_image = np.array(self.image)
            cv2_image = cv2.cvtColor(cv2_image, cv2.COLOR_RGB2BGR)
            cv2_image = cv2.fastNlMeansDenoisingColored(cv2_image, None, 10, 10, 7, 21)
            if cv2_image is None:
                print_error("Error reducing noise.", self.image)
                return None

            return Image.fromarray(cv2.cvtColor(cv2_image, cv2.COLOR_BGR2RGB))
        except Exception as e:
            print_error(f"Error reducing noise: {e}", self.image)
