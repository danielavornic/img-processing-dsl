from antlr4 import CommonTokenStream, InputStream

from connectivity.ErrorListener import ErrorListener
from gen.ImgLexer import ImgLexer
from gen.ImgParser import ImgParser


class CommandParser:
    def __init__(self, command_str):
        self.command_str = command_str

    def parse(self):
        try:
            input_stream = InputStream(self.command_str)
            lexer = ImgLexer(input_stream)
            token_stream = CommonTokenStream(lexer)

            parser = ImgParser(token_stream)
            parser.removeErrorListeners()
            parser.addErrorListener(ErrorListener())

            parse_tree = parser.start()
            return parse_tree, None
        except Exception as e:
            return None, str(e)