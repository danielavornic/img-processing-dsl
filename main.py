
from connectivity.CommandParser import CommandParser
from connectivity.CommandVisitor import CommandVisitor
from connectivity.CommandExecutor import CommandExecutor
from connectivity.ImagePathVisitor import ImagePathVisitor
from operations.ImgHelperOperations import ImgHelperOperations


class Main:
    def __init__(self):
        self.running = True
        self.helper = ImgHelperOperations()

    def run(self):
        print("Enter your command (type 'imp help' for available commands)")

        # For testing purposes, run the program until the user types 'q'
        while self.running:
            user_input = input()

            if user_input == "q":
                self.running = False
                break

            command_parser = CommandParser(user_input)
            parse_tree = command_parser.parse()

            command_visitor = CommandVisitor()
            command_visitor.visit(parse_tree)
            command_results = command_visitor.get_command_results()

            image_visitor = ImagePathVisitor()
            image_visitor.visit(parse_tree)
            image_path = image_visitor.get_image_path()
            folder_path = image_visitor.get_folder_path()
            is_folder = folder_path is not None

            path = None
            if image_path is not None:
                path = image_path
            elif is_folder:
                path = folder_path

            if path is None and command_results[0] == "help":
                self.helper.print_help()
            else:
                command_executor = CommandExecutor(command_results, path, is_folder=is_folder)
                command_executor.execute()


if __name__ == '__main__':
    main = Main()
    main.run()

