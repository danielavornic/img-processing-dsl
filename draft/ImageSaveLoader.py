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
        if image:
            try:
                new_filename = os.path.splitext(filename)[0] + "_adjusted" + os.path.splitext(filename)[1]
                image.save(new_filename)
                print(f"Image saved as {new_filename}")
            except Exception as e:
                print(f"Error saving image: {e}")
        else:
            print("Image is None, cannot save.")

    def set_path(self, new_path):
        """
        Update the path to a new value.
        """
        self.path = new_path
        print(f"Path updated to {self.path}")
