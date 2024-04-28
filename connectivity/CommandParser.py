from antlr4 import CommonTokenStream, InputStream
from gen.ImgLexer import ImgLexer
from gen.ImgParser import ImgParser


class CommandParser:
    def __init__(self, command_str):
        self.command_str = command_str



    def parse(self):
        input_stream = InputStream(self.command_str)
        lexer = ImgLexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        parser = ImgParser(token_stream)
        parse_tree = parser.start()


        return parse_tree
