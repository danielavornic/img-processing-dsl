from PIL import Image

class ImgBasicOperations:
    def crop(self, image, x, y, w, h):
        """
        Crop the image to the specified coordinates.
        """
        if image:
            img_width, img_height = image.size
            x1 = min(x, img_width)
            y1 = min(y, img_height)
            x2 = min(x + w, img_width)
            y2 = min(y + h, img_height)

            if x1 >= x2 or y1 >= y2:
                raise ValueError("Invalid cropping coordinates.")

            return image.crop((x1, y1, x2, y2))
        else:
            raise ValueError("Image is None.")

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
