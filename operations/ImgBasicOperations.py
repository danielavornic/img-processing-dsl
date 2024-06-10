import numbers
import os
from PIL import Image

from operations.ImgHelperOperations import print_error, print_success


class ImgBasicOperations:
    def __init__(self, image, is_folder=False):
        self.image = image
        self.is_folder = is_folder

    def crop(self, x, y, w, h):
        """
        Crop the image to the specified dimensions.
        :param x: The x-coordinate of the top-left corner.
        :param y: The y-coordinate of the top-left corner.
        :param w: The width of the cropped image.
        :param h: The height of the cropped image.
        :return: The cropped PIL image.
        """
        image = self.image

        img_width, img_height = image.size
        x1 = min(x, img_width)
        y1 = min(y, img_height)
        x2 = min(x + w, img_width)
        y2 = min(y + h, img_height)

        if x1 >= x2 or y1 >= y2:
            print_error("Invalid cropping coordinates. Please ensure the crop area is within the image bounds.", image)
            return None

        try:
            return image.crop((x1, y1, x2, y2))
        except Exception as e:
            print_error(f"Error cropping image: {e}", image)

    def rotate(self, angle):
        """
        Rotate the image by the specified angle.
        :param angle: The angle to rotate the image by.
        :return: The rotated PIL image.
        """
        image = self.image

        if not isinstance(angle, numbers.Number):
            print_error("Angle must be a numeric value.", image)
            return None

        try:
            return image.rotate(angle)
        except Exception as e:
            print_error(f"Error rotating image: {e}", image)


    def resize(self, w, h):
        """
        Resize the image to the specified dimensions.
        :param w: The target width.
        :param h: The target height.
        :return: The resized PIL image.
        """
        image = self.image

        if not isinstance(w, numbers.Number) or not isinstance(h, numbers.Number):
            print_error("Width and height must be numeric values.", image)
            return None

        if w <= 0 or h <= 0:
            print_error("Width and height must be positive values.", image)
            return None

        try:
            resized_image = image.resize((int(w), int(h)))
            return resized_image
        except Exception as e:
            print_error(f"Error resizing image: {e}", image)

    def flipX(self):
        """
        Flip the image horizontally (left to right).
        :return: The horizontally flipped PIL image.
        """
        # Ensure the image is not None
        image = self.image

        try:
            return image.transpose(Image.FLIP_LEFT_RIGHT)
        except Exception as e:
            print_error(f"Error flipping image horizontally: {e}", image)

    def flipY(self):
        """
        Flip the image vertically (top to bottom).
        :return: The vertically flipped PIL image.
        """
        try:
            return self.image.transpose(Image.FLIP_TOP_BOTTOM)
        except Exception as e:
            print_error(f"Error flipping image vertically: {e}", self.image)

    def convert(self, image_path, target_format):
        """
        Convert the image to the specified format and save it.
        :param image_path: The path of the original image.
        :param target_format: The target format for conversion.
        :raises ValueError: If the image is None or the target format is invalid.
        :raises RuntimeError: If there's an error during the conversion or saving process.
        """
        image = self.image
        target_format = target_format.upper()

        try:
            # Apply specific conversions based on the target format
            if target_format == "JPG":
                target_format = "JPEG"
                # For "JPG", convert "RGBA" to "RGB" to avoid transparency issues
                if image.mode in ["RGBA", "P"]:
                    image = image.convert("RGB")
            elif target_format == "PNG":
                # Ensure PNG has transparency support
                if image.mode != "RGBA":
                    image = image.convert("RGBA")
            elif target_format == "TIFF":
                # Default TIFF to "RGB" to maintain compatibility
                if image.mode not in ["RGB", "RGBA"]:
                    image = image.convert("RGB")

            # Save the converted image
            self.save_converted_image(image, image_path, target_format)

        except Exception as e:
            print_error(f"Error converting image: {e}", image)

    def save_converted_image(self, image, image_path, target_format):
        """
        Save the converted image based on whether it is a folder or a single file.
        :param image: The converted PIL image.
        :param image_path: The path of the original image.
        :param target_format: The target format for saving.
        """
        try:
            # Determine the new file extension based on the format
            extension = f".{target_format.lower()}"

            if self.is_folder:
                folder, file = os.path.split(image_path)
                adjusted_folder = folder + "_adjusted"

                if not os.path.exists(adjusted_folder):
                    os.makedirs(adjusted_folder)

                new_filename = os.path.join(adjusted_folder, os.path.splitext(file)[0] + extension)
            else:
                folder, file = os.path.split(image_path)
                new_filename = os.path.join(folder, os.path.splitext(file)[0] + "_adjusted" + extension)

            # Save the image with the specified format
            image.save(new_filename, format=target_format)
            print_success(f"Image saved as {new_filename}")

        except Exception as e:
            print_error(f"Error saving image: {e}", image)