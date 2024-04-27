from connectivity.CommandParser import CommandParser
from connectivity.CommandVisitor import CommandVisitor
from connectivity.CommandExecutor import CommandExecutor
from gen.ImgParser import ImgParser

# Get user input dynamically
user_input = input("Enter your image processing command: ")

# Parse the user input
command_parser = CommandParser(user_input)
parse_tree = command_parser.parse()

# Visit the parse tree
command_visitor = CommandVisitor()
command_visitor.visit(parse_tree)
print()
# # Execute the commands
command_results = command_visitor.get_command_results()
print(command_results)
command_executor = CommandExecutor(command_results)
command_executor.execute()
#

#imp --img="image.png" rotate --deg=90 -> convert --format=png