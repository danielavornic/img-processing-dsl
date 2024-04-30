from PIL import ImageEnhance, ImageOps

class ImgColorAdjustments:
    def bw(self, image):
        """
        Convert the image to black and white.
        :param image: The PIL image to convert to black and white.
        :return: The black and white image.
        """
        if image is None:
            raise ValueError("Image must not be None.")

        return image.convert("L")

    def contrast(self, image, lvl):
        """
        Adjust the contrast of the image.
        :param image: The PIL image to adjust the contrast of.
        :param lvl: The level of contrast to apply in percentage (100 is the original contrast).
        :return: The image with the adjusted contrast.
        """
        if lvl < 0 or lvl > 500:
            raise ValueError("Contrast level must be in the range [0, 500].")

        factor = lvl / 100
        enhancer = ImageEnhance.Contrast(image)
        return enhancer.enhance(factor)

    def brightness(self, image, lvl):
        """
        Adjust the brightness of the image.
        :param image: The PIL image to adjust the brightness of.
        :param lvl: The level of brightness to apply in percentage (100 is the original brightness).
        :return: The image with the adjusted brightness.
        """
        if lvl < 0 or lvl > 500:
            raise ValueError("Brightness level must be in the range [0, 500].")

        factor = lvl / 100
        enhancer = ImageEnhance.Brightness(image)
        return enhancer.enhance(factor)

    def negative(self, image):
        """
        Convert the image to its negative.
        :param image: The PIL image to convert to its negative.
        :return: The negative image.
        """
        image_rgb = image.convert("RGB")
        return ImageOps.invert(image_rgb)
