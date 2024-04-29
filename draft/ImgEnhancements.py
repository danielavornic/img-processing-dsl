from PIL import Image, ImageFilter, ImageEnhance
import cv2

class ImgEnhancements:
    def blur(self, image, radius):
        """
        Applies a blur effect with a specified radius to the image.
        Radius must be >= 0
        """
        if radius < 0:
            raise ValueError("radius must be >= 0")

        return image.filter(ImageFilter.BoxBlur(radius))
    #
    def sharpen(self, image):
        """
        Sharpens the image
        """
        enhancer = image.filter(ImageFilter.SHARPEN)
        return enhancer

    def threshold(self, image):
        """
        Applies a threshold filter to the image.
        This generally results in a bilevel image at the end, where the image is composed of black and white pixels.
        """
        # open cv face asta, dar hz daca se poate de returnat not in pil, si cv2 citeste incorect imaginea
        img = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
        ret, thresh = cv2.threshold(img, 127, 255, cv2.THRESH_BINARY_INV)
        return thresh

    def reduceNoise(self, image):
        """
        Reduces noise from the image. Works with a color image.
        The command is 'reducenoise'
        """
        image = cv2.fastNlMeansDenoisingColored(image, None, 10, 10, 7, 21)
        return image