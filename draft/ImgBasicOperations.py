from PIL import Image

class ImgBasicOperations:
    def crop(self, image, box):
        return image.crop(box)

    def rotate(self, image, angle):
        return image.rotate(angle)

    def resize(self, image, size):
        return image.resize(size)

    def flipX(self, image):
        return image.transpose(Image.FLIP_LEFT_RIGHT)

    def flipY(self, image):
        return image.transpose(Image.FLIP_TOP_BOTTOM)

    def convert(self, image, mode):
        return image.convert(mode)
