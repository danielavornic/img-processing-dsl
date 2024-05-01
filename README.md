# Domain Specific Language for Image Manipulation

This DSL for image processing allows users to manipulate images from the console using commands that cover both basic edits like resizing and cropping, and advanced tasks such as colorization and background removal. The system translates these textual commands into direct image transformations efficiently.

## Installation and Usage

To install and use the DSL for image processing, you'll first need to clone its repository from GitHub. Once cloned, simply navigate to the project directory and run the main script through your command line interface. This will activate the DSL, allowing you to start entering image processing commands directly into the console.

To get started with the DSL, after installing and running the program, you can use the `help` command as your initial guide. This command will display the list of available commands and how to use them. 

Note that the system recognizes the DSL's command if and only if it begins with the reserved word `imp`, that signifies the beginning of an instruction.

## Current Features
- **Pipelines**: allowing the appliance of multiple operations to the same image within a single input.
- **Basic Operations**: performing fundamental image editing tasks such as rotating, resizing, cropping, flipX, flipY and converting the image's format.
- **Enhancements**: performing enhancements to improve image quality, such as blurring, sharpening, thresholding and reducing the noise.
- **Color Adjustments**: adjusting the color properties like the brightness, negative contrast as well as transforming an image into black & white format.
- **Advanced Operations**: providing advanced features like background removal, image compression, upscaling and colorization.

  
## Project Status and Development
This project is currently in development. It supports a broad array of image manipulation commands for individual images. However, the batch processing feature, which would allow for multiple images to be edited at once, has not yet been implemented.
