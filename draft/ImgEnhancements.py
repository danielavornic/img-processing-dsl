from PIL import Image, ImageFilter

class ImgEnhancements:
    def blur(self, image, radius):
        return image.filter(ImageFilter.BLUR)

    def sharpen(self, image, factor):
        enhancer = ImageEnhance.Sharpness(image)
        return enhancer.enhance(factor)

    def threshold(self, image, threshold_value):
        return image.convert("1", dither=Image.NONE)

    def reduceNoise(self, image):
        # You can implement your noise reduction logic here
        return image
