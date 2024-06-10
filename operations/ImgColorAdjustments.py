from PIL import ImageEnhance, ImageOps

from operations.ImgHelperOperations import print_error


class ImgColorAdjustments:
    def __init__(self, image):
        self.image = image

    def bw(self):
        """
        Convert the image to black and white.
        :return: The black and white image.
        """
        try:
            return self.image.convert("L")
        except Exception as e:
            print_error(f"Error converting image to black and white: {e}", self.image)

    def contrast(self, lvl):
        """
        Adjust the contrast of the image.
        :param lvl: The level of contrast to apply in percentage (100 is the original contrast).
        :return: The image with the adjusted contrast.
        """
        if lvl < 0 or lvl > 500:
            print_error("Contrast level must be in the range [0, 500].", self.image)
            return None

        try:
            factor = lvl / 100
            enhancer = ImageEnhance.Contrast(self.image)
            return enhancer.enhance(factor)
        except Exception as e:
            print_error(f"Error adjusting contrast: {e}", self.image)

    def brightness(self, lvl):
        """
        Adjust the brightness of the image.
        :param lvl: The level of brightness to apply in percentage (100 is the original brightness).
        :return: The image with the adjusted brightness.
        """
        if lvl < 0 or lvl > 500:
            print_error("Brightness level must be in the range [0, 500].", self.image)
            return None

        try:
            factor = lvl / 100
            enhancer = ImageEnhance.Brightness(self.image)
            return enhancer.enhance(factor)
        except Exception as e:
            print_error(f"Error adjusting brightness: {e}", self.image)

    def negative(self):
        """
        Convert the image to its negative.
        :return: The negative image.
        """
        try:
            image_rgb = self.image.convert("RGB")
            return ImageOps.invert(image_rgb)
        except Exception as e:
            print_error(f"Error converting image to negative: {e}", self.image)

    def cmyk(self):
        """
        Convert the image to CMYK.
        :return: The CMYK image.
        """
        try:
            return self.image.convert("CMYK")
        except Exception as e:
            print_error(f"Error converting image to CMYK: {e}", self.image)

    def rgb(self):
        """
        Convert the image to RGB.
        :return: The RGB image.
        """
        try:
            return self.image.convert("RGB")
        except Exception as e:
            print_error(f"Error converting image to RGB: {e}", self.image)

    def sepia(self):
        """
        Convert the image to sepia.
        :return: The sepia image.
        """
        try:
            self.image = self.image.convert("RGB")
            width, height = self.image.size
            pixels = self.image.load()

            for py in range(height):
                for px in range(width):
                    r, g, b = self.image.getpixel((px, py))

                    tr = int(0.393 * r + 0.769 * g + 0.189 * b)
                    tg = int(0.349 * r + 0.686 * g + 0.168 * b)
                    tb = int(0.272 * r + 0.534 * g + 0.131 * b)

                    if tr > 255:
                        tr = 255

                    if tg > 255:
                        tg = 255

                    if tb > 255:
                        tb = 255

                    pixels[px, py] = (tr, tg, tb)

            return self.image
        except Exception as e:
            print_error(f"Error applying sepia filter: {e}", self.image)
