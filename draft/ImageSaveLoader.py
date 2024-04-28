from PIL import Image
import os

class ImageSaveLoader:
    def __init__(self, path):
        self.path = path

    def load(self):
        """
        Load the image from the specified path.
        """
        try:
            image = Image.open(self.path)
            print(f"Image loaded from {self.path}")
            return image
        except FileNotFoundError:
            print(f"Error: File not found at {self.path}")
            return None
        except Exception as e:
            print(f"Error loading image: {e}")
            return None

    def save(self, image, filename):
        """
        Save the image with a new filename plus '_adjusted'.
        """
        try:
            base_name, extension = os.path.splitext(filename)
            adjusted_filename = f"{base_name}_adjusted{extension}"

            directory = os.path.dirname(self.path)
            new_path = os.path.join(directory, adjusted_filename)

            image.save(new_path)
            print(f"Image saved to {new_path}")

        except Exception as e:
            print(f"Error saving image: {e}")

    def set_path(self, new_path):
        """
        Update the path to a new value.
        """
        self.path = new_path
        print(f"Path updated to {self.path}")
