
from connectivity.CommandParser import CommandParser
from connectivity.CommandVisitor import CommandVisitor
from connectivity.CommandExecutor import CommandExecutor
from connectivity.ImagePathVisitor import ImagePathVisitor
from gen.ImgParser import ImgParser

class Main:
    def __init__(self):
        self.running = True

    def help_command(self):
        help_str = """
        Available Commands:
        - rotate --deg=<int>: Rotate the image by specified degrees.
        - resize --w=<int> --h=<int>: Resize the image to specified width and height.
        - crop --x=<int> --y=<int> --w=<int> --h=<int>: Crop the image to specified dimensions.
        - flipX: Flip the image horizontally.
        - flipY: Flip the image vertically.
        - convert --format=<format>: Convert the image to the specified format.
        - blur --lvl=<int>: Apply a blur effect with the specified radius.
        - sharpen --lvl=<int>: Apply a sharpening effect with the specified radius.
        - threshold --lvl=<int>: Apply a threshold effect with the specified value.
        - reduceNoise: Reduce noise in the image.
        - bw: Convert the image to black and white.
        - contrast --lvl=<int>: Adjust the contrast by the specified factor.
        - brightness --lvl=<int>: Adjust the brightness by the specified factor.
        - negative: Convert the image to its negative.
        - compress: Compress the image based on its format.
        - remBg: Remove the background from the image.
        - colorize: Colorize the image.
        """
        print(help_str)

    def run(self):
        print("Enter your command (type 'imp help' for available commands)")
        while self.running:
            #take input in the same line as print statement
            user_input = input()

            command_parser = CommandParser(user_input)
            parse_tree = command_parser.parse()

            command_visitor = CommandVisitor()
            command_visitor.visit(parse_tree)
            command_results = command_visitor.get_command_results()

            image_visitor = ImagePathVisitor()
            image_visitor.visit(parse_tree)
            image_path = image_visitor.get_image_path()

            if image_path is None and command_results[0] == "help":
                self.help_command()
            else:
                image_path = image_path.split('"')[1]
                command_executor = CommandExecutor(command_results,image_path)
                command_executor.execute()


if __name__ == '__main__':
    main = Main()
    main.run()

