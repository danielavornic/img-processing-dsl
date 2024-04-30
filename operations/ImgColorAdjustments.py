from PIL import ImageEnhance, ImageOps


class ImgColorAdjustments:
    def __init__(self, image):
        self.image = image

    def bw(self):
        """
        Convert the image to black and white.
        :return: The black and white image.
        """
        return self.image.convert("L")

    def contrast(self, lvl):
        """
        Adjust the contrast of the image.
        :param lvl: The level of contrast to apply in percentage (100 is the original contrast).
        :return: The image with the adjusted contrast.
        """
        if lvl < 0 or lvl > 500:
            raise ValueError("Contrast level must be in the range [0, 500].")

        factor = lvl / 100
        enhancer = ImageEnhance.Contrast(self.image)
        return enhancer.enhance(factor)

    def brightness(self, lvl):
        """
        Adjust the brightness of the image.
        :param lvl: The level of brightness to apply in percentage (100 is the original brightness).
        :return: The image with the adjusted brightness.
        """
        if lvl < 0 or lvl > 500:
            raise ValueError("Brightness level must be in the range [0, 500].")

        factor = lvl / 100
        enhancer = ImageEnhance.Brightness(self.image)
        return enhancer.enhance(factor)

    def negative(self):
        """
        Convert the image to its negative.
        :return: The negative image.
        """
        image_rgb = self.image.convert("RGB")
        return ImageOps.invert(image_rgb)
