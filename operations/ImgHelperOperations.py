from termcolor import colored
import os

def print_error(msg, image=None):
    if image:
        basename = os.path.basename(image.filename)
        print(colored(f"{basename}: {msg}", "red", force_color='True'))
    else:
        print(colored(msg, "red", force_color='True'))


def print_success(msg, image=None):
    if image:
        basename = os.path.basename(image.filename)
        print(colored(f"{basename}: {msg}", "green", force_color='True'))
    else:
        print(colored(msg, "green", force_color='True'))

def print_help():
    help_str = """Available Commands:
- rotate --deg=<int>: Rotate the image by specified degrees.
- resize --w=<int> --h=<int>: Resize the image to specified width and height in pixels.
- crop --x=<int> --y=<int> --w=<int> --h=<int>: Crop the image to specified dimensions in pixels.
- flipX: Flip the image horizontally.
- flipY: Flip the image vertically.
- convert --format=<format>: Convert the image to the specified format not in double quotes (png, jpg, jpeg, webp, tiff).
- blur --lvl=<int>: Apply a blur effect with the specified radius.
- sharpen --lvl=<int>: Apply a sharpening effect with the specified radius.
- threshold --lvl=<int>: Apply a threshold effect with the specified value.
- reduceNoise: Reduce noise in the image.
- bw: Convert the image to black and white.
- contrast --lvl=<int>: Adjust the contrast by the specified factor. 100 is the default.
- brightness --lvl=<int>: Adjust the brightness by the specified factor. 100 is the default.
- negative: Convert the image to its negative.
- cmyk: Convert the image to CMYK color profile.
- rbg: Convert the image to RGB color profile.
- sepia: Apply a sepia effect to the image.
- compress: Compress the image based on its format.
- remBg: Remove the background from the image.
- colorize: Colorize a grayscale image.
- upscale --lvl=<int>: Upscale the image. lvl flag can be 2, 4, 8. (Batch processing not supported)"""
    print(colored(help_str, "cyan", force_color='True'))
