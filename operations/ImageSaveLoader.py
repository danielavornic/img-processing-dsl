import os
import sys
from termcolor import colored
from PIL import Image

from operations.ImgHelperOperations import print_error, print_success


class ImageSaveLoader:
    def __init__(self, path, is_folder=False):
        self.path = path
        self.is_folder = is_folder

    def load(self):
        """
        Load the image from the specified path.
        """
        try:
            image = Image.open(self.path)
            return image
        except FileNotFoundError:
            print_error(f"Error: File not found at {self.path}")
        except Exception as e:
            print_error(f"Error loading image at {self.path}: {e}")

    def save(self, image, filename, format=None):
        # Save the image with a new filename plus '_adjusted'
        if image:
            try:
                if format:
                    extension = f".{format.lower()}"
                else:
                    extension = os.path.splitext(filename)[1]

                if self.is_folder:
                    folder, file = os.path.split(filename)
                    adjusted_folder = folder + "_adjusted"

                    if not os.path.exists(adjusted_folder):
                        os.makedirs(adjusted_folder)

                    new_filename = os.path.join(adjusted_folder, file)

                    image.save(new_filename, format=format.upper() if format else None)
                    print_success(f"Image saved as {new_filename}")
                else:
                    folder, file = os.path.split(filename)
                    new_filename = os.path.join(folder, file.split(".")[0] + "_adjusted" + extension)
                    image.save(new_filename, format=format.upper() if format else None)
                    print_success(f"Image saved as {new_filename}")
            except Exception as e:
                print_error(f"Error saving image at {filename}: {e}")

    def set_path(self, new_path):
        """
        Update the path to a new value.
        """
        self.path = new_path