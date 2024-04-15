import sys
import gen.ImgLexer as ImgLexer
import gen.ImgParser as ImgParser
from antlr4 import *

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = ImgLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ImgParser(stream)
    tree = parser.start_()

if __name__ == 'main':
    main(sys.argv)
