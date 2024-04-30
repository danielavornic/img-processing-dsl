import numbers

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
        """
        Rotate the image by the specified angle.
        """
        if not image:
            raise ValueError("Image is None.")
        if not isinstance(angle, numbers.Number):
            raise ValueError("Angle must be an integer.")

        try:
            return image.rotate(angle)
        except Exception as e:
            raise ValueError(f"Error rotating image: {e}")


    def resize(self, image, w, h):
        """
        Resize the image to the specified dimensions.
        """
        if not image:
            raise ValueError("Image is None, cannot resize.")

        if not isinstance(w, numbers.Number) or not isinstance(h, numbers.Number):
            raise TypeError("Width and height must be numeric values.")

        if w <= 0 or h <= 0:
            raise ValueError("Width and height must be positive values.")

        try:
            resized_image = image.resize((int(w), int(h)))
            return resized_image
        except Exception as e:
            raise RuntimeError(f"Error resizing image: {e}")

    def flipX(self, image):
        """
        Flip the image horizontally (left to right).
        """
        # Ensure the image is not None
        if not image:
            raise ValueError("Image is None, cannot flip horizontally.")

        try:
            return image.transpose(Image.FLIP_LEFT_RIGHT)
        except Exception as e:
            raise RuntimeError(f"Error flipping image horizontally: {e}")

    def flipY(self, image):
        """
        Flip the image vertically (top to bottom).
        """
        # Ensure the image is not None
        if not image:
            raise ValueError("Image is None, cannot flip vertically.")

        try:
            return image.transpose(Image.FLIP_TOP_BOTTOM)
        except Exception as e:
            raise RuntimeError(f"Error flipping image vertically: {e}")

    def convert(self, image, image_path, target_format):
        """
        Convert the image to the specified format and save it.

        :param image: The input image.
        :param image_path: The path of the original image.
        :param target_format: The target format for conversion.
        :raises ValueError: If the image is None or the target format is invalid.
        :raises RuntimeError: If there's an error during the conversion or saving process.
        """
        if image is None:
            raise ValueError("Image is None, cannot convert.")

        target_format = target_format.upper()


        try:
            # Apply specific conversions based on the target format
            if target_format == "JPG":
                # For "JPG", convert "RGBA" to "RGB" to avoid transparency issues
                if image.mode in ["RGBA", "P"]:
                    image = image.convert("RGB")
            elif target_format == "PNG":
                # Ensure PNG has transparency support
                if image.mode != "RGBA":
                    image = image.convert("RGBA")
            elif target_format == "GIF":
                # GIF typically uses palette-based color modes
                if image.mode != "P":
                    image = image.convert("P", dither=Image.NONE)
            elif target_format == "TIFF":
                # Default TIFF to "RGB" to maintain compatibility
                if image.mode not in ["RGB", "RGBA"]:
                    image = image.convert("RGB")

            # Generate a new filename with the target format
            new_filename = f"{image_path.split('.')[0]}_adjusted.{target_format.lower()}"

            # Save the converted image
            image.save(new_filename)
            print(f"Image saved as {new_filename}")

            return new_filename

        except Exception as e:
            raise RuntimeError(f"Error converting image: {e}")
