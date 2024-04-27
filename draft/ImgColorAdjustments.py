from PIL import Image, ImageEnhance, ImageOps

class ImgColorAdjustments:
    def bw(self, image):
        return image.convert("L")

    def contrast(self, image, factor):
        enhancer = ImageEnhance.Contrast(image)
        return enhancer.enhance(factor)

    def brightness(self, image, factor):
        enhancer = ImageEnhance.Brightness(image)
        return enhancer.enhance(factor)

    def colorize(self, image, factor):
        enhancer = ImageEnhance.Color(image)
        return enhancer.enhance(factor)

    def negative(self, image):
        return ImageOps.invert(image)
