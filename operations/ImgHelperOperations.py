help_str = """
Available Commands:
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
- compress: Compress the image based on its format.
- remBg: Remove the background from the image.
- colorize: Colorize a grayscale image.
- upscale --lvl=<int>: Upscale the image. lvl flag can be 2, 4, 8.
"""

class ImgHelperOperations:
    def __init__(self):
        pass

    def print_help(self):
        print(help_str)