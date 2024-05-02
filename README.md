# Domain Specific Language for Image Manipulation

This DSL for image processing allows users to manipulate images from the console using commands that cover both basic edits like resizing and cropping, and advanced tasks such as colorization and background removal. The system translates these textual commands into direct image transformations efficiently.

## Installation and Usage

To install and use the DSL for image processing, you'll first need to clone its repository from GitHub.You can do this by running the following command in your terminal:

```bash
git clone https://github.com/danielavornic/img-processing-dsl
```

Once cloned, install the required dependencies by running the following command:

```bash
pip install -r requirements.txt
``` 

After installing the dependencies, simply navigate to the project directory and run the main script through your command line interface. This will activate the DSL, allowing you to start entering image processing commands directly into the console.

To get started, you can use the `help` command as your initial guide. This command will display the list of available commands and how to use them. 

```bash
Available Commands:
- rotate --deg=<int>: Rotate the image by specified degrees.
- resize --w=<int> --h=<int>: Resize the image to specified width and height in pixels.
- crop --x=<int> --y=<int> --w=<int> --h=<int>: Crop the image to specified dimensions in pixels.
- flipX: Flip the image horizontally.
- flipY: Flip the image vertically.
- convert --format=<format>: Convert the image to the specified format (png, jpg, jpeg, webp, tiff).
- blur --lvl=<int>: Apply a blur effect with the specified radius.
- sharpen --lvl=<int>: Apply a sharpening effect with the specified radius.
- threshold --lvl=<int>: Apply a threshold effect with the specified value.
- reduceNoise: Reduce noise in the image.
- bw: Convert the image to black and white.
- contrast --lvl=<int>: Adjust the contrast by the specified factor. 100 is default.
- brightness --lvl=<int>: Adjust the brightness by the specified factor. 100 is default.
- negative: Convert the image to its negative.
- compress: Compress the image based on its format.
- remBg: Remove the background from the image.
- colorize: Colorize a grayscale image.
- upscale --lvl<int>: Upscale the image. lvl flag is can be 2, 4, 8.
```
Note that the system recognizes the DSL's command if and only if it begins with the reserved word `imp`, that signifies the beginning of an instruction, followed by the `--img` flag, which specifies the path to the image. 

## Current Features
- **Pipelines**: allowing the appliance of multiple operations to the same image within a single input.
- **Basic Operations**: performing fundamental image editing tasks such as rotating, resizing, cropping, flipX, flipY and converting the image's format.
- **Enhancements**: performing enhancements to improve image quality, such as blurring, sharpening, thresholding and reducing the noise.
- **Color Adjustments**: adjusting the color properties like the brightness, negative contrast as well as transforming an image into black & white format.
- **Advanced Operations**: providing advanced features like background removal, image compression, upscaling and colorization.

  
## Project Status and Development
This project is currently in development. It supports a broad array of image manipulation commands for individual images. However, the batch processing feature, which would allow for multiple images to be edited at once, has not yet been implemented.
