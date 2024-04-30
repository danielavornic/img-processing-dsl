from connectivity.CommandParser import CommandParser
from connectivity.CommandVisitor import CommandVisitor
from connectivity.CommandExecutor import CommandExecutor
from connectivity.ImagePathVisitor import ImagePathVisitor


def main():
    user_input = 'imp --img="/home/vornic/Work/img-processing-dsl/test_img/kittens.jpg" flipX -> contrast --lvl=150 -> bw -> remBg'

    # Parse the user input
    command_parser = CommandParser(user_input)
    parse_tree = command_parser.parse()

    # Get the image path
    image_visitor = ImagePathVisitor()
    image_visitor.visit(parse_tree)
    image_path = image_visitor.get_image_path()
    image_path = image_path.split('"')[1]

    # Visit the parse tree
    command_visitor = CommandVisitor()
    command_visitor.visit(parse_tree)

    # Execute the commands
    command_results = command_visitor.get_command_results()
    command_executor = CommandExecutor(command_results, image_path)
    command_executor.execute()


if __name__ == "__main__":
    main()