# Generated from D:/UTM/4_th_semester/DSL/img-processing-dsl/Img.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,42,173,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,1,0,1,0,1,1,1,1,1,1,
        3,1,56,8,1,1,1,1,1,1,2,1,2,1,2,5,2,63,8,2,10,2,12,2,66,9,2,1,3,1,
        3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,
        4,1,4,1,4,1,4,3,4,89,8,4,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,
        1,6,1,6,1,7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,1,9,1,9,1,10,1,10,1,11,1,
        11,1,12,1,12,1,12,1,12,1,12,1,12,1,13,1,13,1,13,1,13,1,14,1,14,1,
        14,1,14,1,15,1,15,1,16,1,16,1,17,1,17,1,17,1,17,1,18,1,18,1,18,1,
        18,1,19,1,19,1,20,1,20,1,21,1,21,1,21,1,21,1,22,1,22,3,22,153,8,
        22,1,23,1,23,1,23,1,23,1,23,1,23,1,24,1,24,1,24,1,24,1,24,4,24,166,
        8,24,11,24,12,24,167,1,24,1,24,1,24,1,24,0,0,25,0,2,4,6,8,10,12,
        14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,0,0,167,0,
        50,1,0,0,0,2,52,1,0,0,0,4,59,1,0,0,0,6,67,1,0,0,0,8,88,1,0,0,0,10,
        90,1,0,0,0,12,92,1,0,0,0,14,102,1,0,0,0,16,106,1,0,0,0,18,110,1,
        0,0,0,20,112,1,0,0,0,22,114,1,0,0,0,24,116,1,0,0,0,26,122,1,0,0,
        0,28,126,1,0,0,0,30,130,1,0,0,0,32,132,1,0,0,0,34,134,1,0,0,0,36,
        138,1,0,0,0,38,142,1,0,0,0,40,144,1,0,0,0,42,146,1,0,0,0,44,152,
        1,0,0,0,46,154,1,0,0,0,48,160,1,0,0,0,50,51,5,1,0,0,51,1,1,0,0,0,
        52,55,3,0,0,0,53,56,3,4,2,0,54,56,3,10,5,0,55,53,1,0,0,0,55,54,1,
        0,0,0,56,57,1,0,0,0,57,58,5,0,0,1,58,3,1,0,0,0,59,64,3,6,3,0,60,
        61,5,34,0,0,61,63,3,8,4,0,62,60,1,0,0,0,63,66,1,0,0,0,64,62,1,0,
        0,0,64,65,1,0,0,0,65,5,1,0,0,0,66,64,1,0,0,0,67,68,5,35,0,0,68,69,
        3,44,22,0,69,70,3,8,4,0,70,7,1,0,0,0,71,89,1,0,0,0,72,89,3,12,6,
        0,73,89,3,14,7,0,74,89,3,16,8,0,75,89,3,18,9,0,76,89,3,20,10,0,77,
        89,3,22,11,0,78,89,3,24,12,0,79,89,3,26,13,0,80,89,3,28,14,0,81,
        89,3,30,15,0,82,89,3,32,16,0,83,89,3,34,17,0,84,89,3,36,18,0,85,
        89,3,38,19,0,86,89,3,40,20,0,87,89,3,42,21,0,88,71,1,0,0,0,88,72,
        1,0,0,0,88,73,1,0,0,0,88,74,1,0,0,0,88,75,1,0,0,0,88,76,1,0,0,0,
        88,77,1,0,0,0,88,78,1,0,0,0,88,79,1,0,0,0,88,80,1,0,0,0,88,81,1,
        0,0,0,88,82,1,0,0,0,88,83,1,0,0,0,88,84,1,0,0,0,88,85,1,0,0,0,88,
        86,1,0,0,0,88,87,1,0,0,0,89,9,1,0,0,0,90,91,5,2,0,0,91,11,1,0,0,
        0,92,93,5,3,0,0,93,94,5,39,0,0,94,95,5,26,0,0,95,96,5,40,0,0,96,
        97,5,26,0,0,97,98,5,41,0,0,98,99,5,26,0,0,99,100,5,42,0,0,100,101,
        5,26,0,0,101,13,1,0,0,0,102,103,5,4,0,0,103,104,5,36,0,0,104,105,
        5,28,0,0,105,15,1,0,0,0,106,107,5,5,0,0,107,108,5,37,0,0,108,109,
        5,26,0,0,109,17,1,0,0,0,110,111,5,6,0,0,111,19,1,0,0,0,112,113,5,
        7,0,0,113,21,1,0,0,0,114,115,5,8,0,0,115,23,1,0,0,0,116,117,5,9,
        0,0,117,118,5,41,0,0,118,119,5,26,0,0,119,120,5,42,0,0,120,121,5,
        26,0,0,121,25,1,0,0,0,122,123,5,10,0,0,123,124,5,38,0,0,124,125,
        5,26,0,0,125,27,1,0,0,0,126,127,5,11,0,0,127,128,5,38,0,0,128,129,
        5,26,0,0,129,29,1,0,0,0,130,131,5,12,0,0,131,31,1,0,0,0,132,133,
        5,13,0,0,133,33,1,0,0,0,134,135,5,14,0,0,135,136,5,38,0,0,136,137,
        5,26,0,0,137,35,1,0,0,0,138,139,5,15,0,0,139,140,5,38,0,0,140,141,
        5,26,0,0,141,37,1,0,0,0,142,143,5,16,0,0,143,39,1,0,0,0,144,145,
        5,17,0,0,145,41,1,0,0,0,146,147,5,18,0,0,147,148,5,38,0,0,148,149,
        5,26,0,0,149,43,1,0,0,0,150,153,3,46,23,0,151,153,3,48,24,0,152,
        150,1,0,0,0,152,151,1,0,0,0,153,45,1,0,0,0,154,155,5,22,0,0,155,
        156,5,29,0,0,156,157,5,20,0,0,157,158,5,28,0,0,158,159,5,22,0,0,
        159,47,1,0,0,0,160,161,5,22,0,0,161,162,5,32,0,0,162,165,5,31,0,
        0,163,164,5,29,0,0,164,166,5,31,0,0,165,163,1,0,0,0,166,167,1,0,
        0,0,167,165,1,0,0,0,167,168,1,0,0,0,168,169,1,0,0,0,169,170,5,29,
        0,0,170,171,5,22,0,0,171,49,1,0,0,0,5,55,64,88,152,167
    ]

class ImgParser ( Parser ):

    grammarFileName = "Img.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'imp'", "'help'", "'crop'", "'convert'", 
                     "'rotate'", "'flipX'", "'flipY'", "'bw'", "'resize'", 
                     "'contrast'", "'brightness'", "'negative'", "'colorize'", 
                     "'blur'", "'sharpen'", "'compress'", "'ft'", "'threshold'", 
                     "'='", "'.'", "','", "'\"'", "'('", "')'", "'open'", 
                     "<INVALID>", "'-'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'\\'", "<INVALID>", "<INVALID>", "'->'", "'--img='", 
                     "'--format='", "'--deg='", "'--lvl='", "'--x='", "'--y='", 
                     "'--w='", "'--h='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "ASSIGN", "DOT", 
                      "COMMA", "APOS", "OPEN_PARAN", "CLOSED_PARAN", "OPEN", 
                      "NUMBER", "MINUS", "IMAGE_TYPE", "ID", "WHITESPACE", 
                      "BACKSLASH", "DISK", "COMMAND_RESULT", "PIPE", "IMG", 
                      "FORMAT", "DEGREES", "LEVEL", "X", "Y", "W", "H" ]

    RULE_startCommand = 0
    RULE_start = 1
    RULE_commandSequence = 2
    RULE_image_param = 3
    RULE_command = 4
    RULE_help = 5
    RULE_crop = 6
    RULE_convert = 7
    RULE_rotate = 8
    RULE_flipX = 9
    RULE_flipY = 10
    RULE_bw = 11
    RULE_resize = 12
    RULE_contrast = 13
    RULE_brightness = 14
    RULE_negative = 15
    RULE_colorize = 16
    RULE_blur = 17
    RULE_sharpen = 18
    RULE_compress = 19
    RULE_ft = 20
    RULE_threshold = 21
    RULE_imageArg = 22
    RULE_filePath = 23
    RULE_folderPath = 24

    ruleNames =  [ "startCommand", "start", "commandSequence", "image_param", 
                   "command", "help", "crop", "convert", "rotate", "flipX", 
                   "flipY", "bw", "resize", "contrast", "brightness", "negative", 
                   "colorize", "blur", "sharpen", "compress", "ft", "threshold", 
                   "imageArg", "filePath", "folderPath" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    ASSIGN=19
    DOT=20
    COMMA=21
    APOS=22
    OPEN_PARAN=23
    CLOSED_PARAN=24
    OPEN=25
    NUMBER=26
    MINUS=27
    IMAGE_TYPE=28
    ID=29
    WHITESPACE=30
    BACKSLASH=31
    DISK=32
    COMMAND_RESULT=33
    PIPE=34
    IMG=35
    FORMAT=36
    DEGREES=37
    LEVEL=38
    X=39
    Y=40
    W=41
    H=42

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartCommandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ImgParser.RULE_startCommand

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStartCommand" ):
                listener.enterStartCommand(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStartCommand" ):
                listener.exitStartCommand(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStartCommand" ):
                return visitor.visitStartCommand(self)
            else:
                return visitor.visitChildren(self)




    def startCommand(self):

        localctx = ImgParser.StartCommandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_startCommand)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 50
            self.match(ImgParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def startCommand(self):
            return self.getTypedRuleContext(ImgParser.StartCommandContext,0)


        def EOF(self):
            return self.getToken(ImgParser.EOF, 0)

        def commandSequence(self):
            return self.getTypedRuleContext(ImgParser.CommandSequenceContext,0)


        def help_(self):
            return self.getTypedRuleContext(ImgParser.HelpContext,0)


        def getRuleIndex(self):
            return ImgParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStart" ):
                return visitor.visitStart(self)
            else:
                return visitor.visitChildren(self)




    def start(self):

        localctx = ImgParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_start)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 52
            self.startCommand()
            self.state = 55
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [35]:
                self.state = 53
                self.commandSequence()
                pass
            elif token in [2]:
                self.state = 54
                self.help_()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 57
            self.match(ImgParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommandSequenceContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def image_param(self):
            return self.getTypedRuleContext(ImgParser.Image_paramContext,0)


        def PIPE(self, i:int=None):
            if i is None:
                return self.getTokens(ImgParser.PIPE)
            else:
                return self.getToken(ImgParser.PIPE, i)

        def command(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ImgParser.CommandContext)
            else:
                return self.getTypedRuleContext(ImgParser.CommandContext,i)


        def getRuleIndex(self):
            return ImgParser.RULE_commandSequence

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCommandSequence" ):
                listener.enterCommandSequence(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCommandSequence" ):
                listener.exitCommandSequence(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCommandSequence" ):
                return visitor.visitCommandSequence(self)
            else:
                return visitor.visitChildren(self)




    def commandSequence(self):

        localctx = ImgParser.CommandSequenceContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_commandSequence)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 59
            self.image_param()
            self.state = 64
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==34:
                self.state = 60
                self.match(ImgParser.PIPE)
                self.state = 61
                self.command()
                self.state = 66
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Image_paramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IMG(self):
            return self.getToken(ImgParser.IMG, 0)

        def imageArg(self):
            return self.getTypedRuleContext(ImgParser.ImageArgContext,0)


        def command(self):
            return self.getTypedRuleContext(ImgParser.CommandContext,0)


        def getRuleIndex(self):
            return ImgParser.RULE_image_param

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterImage_param" ):
                listener.enterImage_param(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitImage_param" ):
                listener.exitImage_param(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitImage_param" ):
                return visitor.visitImage_param(self)
            else:
                return visitor.visitChildren(self)




    def image_param(self):

        localctx = ImgParser.Image_paramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_image_param)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 67
            self.match(ImgParser.IMG)
            self.state = 68
            self.imageArg()
            self.state = 69
            self.command()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommandContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def crop(self):
            return self.getTypedRuleContext(ImgParser.CropContext,0)


        def convert(self):
            return self.getTypedRuleContext(ImgParser.ConvertContext,0)


        def rotate(self):
            return self.getTypedRuleContext(ImgParser.RotateContext,0)


        def flipX(self):
            return self.getTypedRuleContext(ImgParser.FlipXContext,0)


        def flipY(self):
            return self.getTypedRuleContext(ImgParser.FlipYContext,0)


        def bw(self):
            return self.getTypedRuleContext(ImgParser.BwContext,0)


        def resize(self):
            return self.getTypedRuleContext(ImgParser.ResizeContext,0)


        def contrast(self):
            return self.getTypedRuleContext(ImgParser.ContrastContext,0)


        def brightness(self):
            return self.getTypedRuleContext(ImgParser.BrightnessContext,0)


        def negative(self):
            return self.getTypedRuleContext(ImgParser.NegativeContext,0)


        def colorize(self):
            return self.getTypedRuleContext(ImgParser.ColorizeContext,0)


        def blur(self):
            return self.getTypedRuleContext(ImgParser.BlurContext,0)


        def sharpen(self):
            return self.getTypedRuleContext(ImgParser.SharpenContext,0)


        def compress(self):
            return self.getTypedRuleContext(ImgParser.CompressContext,0)


        def ft(self):
            return self.getTypedRuleContext(ImgParser.FtContext,0)


        def threshold(self):
            return self.getTypedRuleContext(ImgParser.ThresholdContext,0)


        def getRuleIndex(self):
            return ImgParser.RULE_command

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCommand" ):
                listener.enterCommand(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCommand" ):
                listener.exitCommand(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCommand" ):
                return visitor.visitCommand(self)
            else:
                return visitor.visitChildren(self)




    def command(self):

        localctx = ImgParser.CommandContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_command)
        try:
            self.state = 88
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [-1, 34]:
                self.enterOuterAlt(localctx, 1)

                pass
            elif token in [3]:
                self.enterOuterAlt(localctx, 2)
                self.state = 72
                self.crop()
                pass
            elif token in [4]:
                self.enterOuterAlt(localctx, 3)
                self.state = 73
                self.convert()
                pass
            elif token in [5]:
                self.enterOuterAlt(localctx, 4)
                self.state = 74
                self.rotate()
                pass
            elif token in [6]:
                self.enterOuterAlt(localctx, 5)
                self.state = 75
                self.flipX()
                pass
            elif token in [7]:
                self.enterOuterAlt(localctx, 6)
                self.state = 76
                self.flipY()
                pass
            elif token in [8]:
                self.enterOuterAlt(localctx, 7)
                self.state = 77
                self.bw()
                pass
            elif token in [9]:
                self.enterOuterAlt(localctx, 8)
                self.state = 78
                self.resize()
                pass
            elif token in [10]:
                self.enterOuterAlt(localctx, 9)
                self.state = 79
                self.contrast()
                pass
            elif token in [11]:
                self.enterOuterAlt(localctx, 10)
                self.state = 80
                self.brightness()
                pass
            elif token in [12]:
                self.enterOuterAlt(localctx, 11)
                self.state = 81
                self.negative()
                pass
            elif token in [13]:
                self.enterOuterAlt(localctx, 12)
                self.state = 82
                self.colorize()
                pass
            elif token in [14]:
                self.enterOuterAlt(localctx, 13)
                self.state = 83
                self.blur()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 14)
                self.state = 84
                self.sharpen()
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 15)
                self.state = 85
                self.compress()
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 16)
                self.state = 86
                self.ft()
                pass
            elif token in [18]:
                self.enterOuterAlt(localctx, 17)
                self.state = 87
                self.threshold()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class HelpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ImgParser.RULE_help

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHelp" ):
                listener.enterHelp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHelp" ):
                listener.exitHelp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitHelp" ):
                return visitor.visitHelp(self)
            else:
                return visitor.visitChildren(self)




    def help_(self):

        localctx = ImgParser.HelpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_help)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self.match(ImgParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CropContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def X(self):
            return self.getToken(ImgParser.X, 0)

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(ImgParser.NUMBER)
            else:
                return self.getToken(ImgParser.NUMBER, i)

        def Y(self):
            return self.getToken(ImgParser.Y, 0)

        def W(self):
            return self.getToken(ImgParser.W, 0)

        def H(self):
            return self.getToken(ImgParser.H, 0)

        def getRuleIndex(self):
            return ImgParser.RULE_crop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCrop" ):
                listener.enterCrop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCrop" ):
                listener.exitCrop(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCrop" ):
                return visitor.visitCrop(self)
            else:
                return visitor.visitChildren(self)




    def crop(self):

        localctx = ImgParser.CropContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_crop)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 92
            self.match(ImgParser.T__2)
            self.state = 93
            self.match(ImgParser.X)
            self.state = 94
            self.match(ImgParser.NUMBER)
            self.state = 95
            self.match(ImgParser.Y)
            self.state = 96
            self.match(ImgParser.NUMBER)
            self.state = 97
            self.match(ImgParser.W)
            self.state = 98
            self.match(ImgParser.NUMBER)
            self.state = 99
            self.match(ImgParser.H)
            self.state = 100
            self.match(ImgParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConvertContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FORMAT(self):
            return self.getToken(ImgParser.FORMAT, 0)

        def IMAGE_TYPE(self):
            return self.getToken(ImgParser.IMAGE_TYPE, 0)

        def getRuleIndex(self):
            return ImgParser.RULE_convert

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConvert" ):
                listener.enterConvert(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConvert" ):
                listener.exitConvert(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConvert" ):
                return visitor.visitConvert(self)
            else:
                return visitor.visitChildren(self)




    def convert(self):

        localctx = ImgParser.ConvertContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_convert)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 102
            self.match(ImgParser.T__3)
            self.state = 103
            self.match(ImgParser.FORMAT)
            self.state = 104
            self.match(ImgParser.IMAGE_TYPE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RotateContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DEGREES(self):
            return self.getToken(ImgParser.DEGREES, 0)

        def NUMBER(self):
            return self.getToken(ImgParser.NUMBER, 0)

        def getRuleIndex(self):
            return ImgParser.RULE_rotate

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRotate" ):
                listener.enterRotate(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRotate" ):
                listener.exitRotate(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRotate" ):
                return visitor.visitRotate(self)
            else:
                return visitor.visitChildren(self)




    def rotate(self):

        localctx = ImgParser.RotateContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_rotate)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 106
            self.match(ImgParser.T__4)
            self.state = 107
            self.match(ImgParser.DEGREES)
            self.state = 108
            self.match(ImgParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FlipXContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ImgParser.RULE_flipX

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFlipX" ):
                listener.enterFlipX(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFlipX" ):
                listener.exitFlipX(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFlipX" ):
                return visitor.visitFlipX(self)
            else:
                return visitor.visitChildren(self)




    def flipX(self):

        localctx = ImgParser.FlipXContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_flipX)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 110
            self.match(ImgParser.T__5)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FlipYContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ImgParser.RULE_flipY

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFlipY" ):
                listener.enterFlipY(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFlipY" ):
                listener.exitFlipY(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFlipY" ):
                return visitor.visitFlipY(self)
            else:
                return visitor.visitChildren(self)




    def flipY(self):

        localctx = ImgParser.FlipYContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_flipY)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 112
            self.match(ImgParser.T__6)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BwContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ImgParser.RULE_bw

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBw" ):
                listener.enterBw(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBw" ):
                listener.exitBw(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBw" ):
                return visitor.visitBw(self)
            else:
                return visitor.visitChildren(self)




    def bw(self):

        localctx = ImgParser.BwContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_bw)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 114
            self.match(ImgParser.T__7)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ResizeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def W(self):
            return self.getToken(ImgParser.W, 0)

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(ImgParser.NUMBER)
            else:
                return self.getToken(ImgParser.NUMBER, i)

        def H(self):
            return self.getToken(ImgParser.H, 0)

        def getRuleIndex(self):
            return ImgParser.RULE_resize

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterResize" ):
                listener.enterResize(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitResize" ):
                listener.exitResize(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitResize" ):
                return visitor.visitResize(self)
            else:
                return visitor.visitChildren(self)




    def resize(self):

        localctx = ImgParser.ResizeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_resize)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 116
            self.match(ImgParser.T__8)
            self.state = 117
            self.match(ImgParser.W)
            self.state = 118
            self.match(ImgParser.NUMBER)
            self.state = 119
            self.match(ImgParser.H)
            self.state = 120
            self.match(ImgParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ContrastContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LEVEL(self):
            return self.getToken(ImgParser.LEVEL, 0)

        def NUMBER(self):
            return self.getToken(ImgParser.NUMBER, 0)

        def getRuleIndex(self):
            return ImgParser.RULE_contrast

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterContrast" ):
                listener.enterContrast(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitContrast" ):
                listener.exitContrast(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitContrast" ):
                return visitor.visitContrast(self)
            else:
                return visitor.visitChildren(self)




    def contrast(self):

        localctx = ImgParser.ContrastContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_contrast)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 122
            self.match(ImgParser.T__9)
            self.state = 123
            self.match(ImgParser.LEVEL)
            self.state = 124
            self.match(ImgParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BrightnessContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LEVEL(self):
            return self.getToken(ImgParser.LEVEL, 0)

        def NUMBER(self):
            return self.getToken(ImgParser.NUMBER, 0)

        def getRuleIndex(self):
            return ImgParser.RULE_brightness

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBrightness" ):
                listener.enterBrightness(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBrightness" ):
                listener.exitBrightness(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBrightness" ):
                return visitor.visitBrightness(self)
            else:
                return visitor.visitChildren(self)




    def brightness(self):

        localctx = ImgParser.BrightnessContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_brightness)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 126
            self.match(ImgParser.T__10)
            self.state = 127
            self.match(ImgParser.LEVEL)
            self.state = 128
            self.match(ImgParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NegativeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ImgParser.RULE_negative

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNegative" ):
                listener.enterNegative(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNegative" ):
                listener.exitNegative(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNegative" ):
                return visitor.visitNegative(self)
            else:
                return visitor.visitChildren(self)




    def negative(self):

        localctx = ImgParser.NegativeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_negative)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 130
            self.match(ImgParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ColorizeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ImgParser.RULE_colorize

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterColorize" ):
                listener.enterColorize(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitColorize" ):
                listener.exitColorize(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitColorize" ):
                return visitor.visitColorize(self)
            else:
                return visitor.visitChildren(self)




    def colorize(self):

        localctx = ImgParser.ColorizeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_colorize)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 132
            self.match(ImgParser.T__12)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlurContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LEVEL(self):
            return self.getToken(ImgParser.LEVEL, 0)

        def NUMBER(self):
            return self.getToken(ImgParser.NUMBER, 0)

        def getRuleIndex(self):
            return ImgParser.RULE_blur

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlur" ):
                listener.enterBlur(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlur" ):
                listener.exitBlur(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBlur" ):
                return visitor.visitBlur(self)
            else:
                return visitor.visitChildren(self)




    def blur(self):

        localctx = ImgParser.BlurContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_blur)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 134
            self.match(ImgParser.T__13)
            self.state = 135
            self.match(ImgParser.LEVEL)
            self.state = 136
            self.match(ImgParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SharpenContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LEVEL(self):
            return self.getToken(ImgParser.LEVEL, 0)

        def NUMBER(self):
            return self.getToken(ImgParser.NUMBER, 0)

        def getRuleIndex(self):
            return ImgParser.RULE_sharpen

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSharpen" ):
                listener.enterSharpen(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSharpen" ):
                listener.exitSharpen(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSharpen" ):
                return visitor.visitSharpen(self)
            else:
                return visitor.visitChildren(self)




    def sharpen(self):

        localctx = ImgParser.SharpenContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_sharpen)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 138
            self.match(ImgParser.T__14)
            self.state = 139
            self.match(ImgParser.LEVEL)
            self.state = 140
            self.match(ImgParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CompressContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ImgParser.RULE_compress

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCompress" ):
                listener.enterCompress(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCompress" ):
                listener.exitCompress(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCompress" ):
                return visitor.visitCompress(self)
            else:
                return visitor.visitChildren(self)




    def compress(self):

        localctx = ImgParser.CompressContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_compress)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 142
            self.match(ImgParser.T__15)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ImgParser.RULE_ft

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFt" ):
                listener.enterFt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFt" ):
                listener.exitFt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFt" ):
                return visitor.visitFt(self)
            else:
                return visitor.visitChildren(self)




    def ft(self):

        localctx = ImgParser.FtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_ft)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 144
            self.match(ImgParser.T__16)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ThresholdContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LEVEL(self):
            return self.getToken(ImgParser.LEVEL, 0)

        def NUMBER(self):
            return self.getToken(ImgParser.NUMBER, 0)

        def getRuleIndex(self):
            return ImgParser.RULE_threshold

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterThreshold" ):
                listener.enterThreshold(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitThreshold" ):
                listener.exitThreshold(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitThreshold" ):
                return visitor.visitThreshold(self)
            else:
                return visitor.visitChildren(self)




    def threshold(self):

        localctx = ImgParser.ThresholdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_threshold)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 146
            self.match(ImgParser.T__17)
            self.state = 147
            self.match(ImgParser.LEVEL)
            self.state = 148
            self.match(ImgParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ImageArgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def filePath(self):
            return self.getTypedRuleContext(ImgParser.FilePathContext,0)


        def folderPath(self):
            return self.getTypedRuleContext(ImgParser.FolderPathContext,0)


        def getRuleIndex(self):
            return ImgParser.RULE_imageArg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterImageArg" ):
                listener.enterImageArg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitImageArg" ):
                listener.exitImageArg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitImageArg" ):
                return visitor.visitImageArg(self)
            else:
                return visitor.visitChildren(self)




    def imageArg(self):

        localctx = ImgParser.ImageArgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_imageArg)
        try:
            self.state = 152
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 150
                self.filePath()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 151
                self.folderPath()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FilePathContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def APOS(self, i:int=None):
            if i is None:
                return self.getTokens(ImgParser.APOS)
            else:
                return self.getToken(ImgParser.APOS, i)

        def ID(self):
            return self.getToken(ImgParser.ID, 0)

        def DOT(self):
            return self.getToken(ImgParser.DOT, 0)

        def IMAGE_TYPE(self):
            return self.getToken(ImgParser.IMAGE_TYPE, 0)

        def getRuleIndex(self):
            return ImgParser.RULE_filePath

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFilePath" ):
                listener.enterFilePath(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFilePath" ):
                listener.exitFilePath(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFilePath" ):
                return visitor.visitFilePath(self)
            else:
                return visitor.visitChildren(self)




    def filePath(self):

        localctx = ImgParser.FilePathContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_filePath)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 154
            self.match(ImgParser.APOS)
            self.state = 155
            self.match(ImgParser.ID)
            self.state = 156
            self.match(ImgParser.DOT)
            self.state = 157
            self.match(ImgParser.IMAGE_TYPE)
            self.state = 158
            self.match(ImgParser.APOS)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FolderPathContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def APOS(self, i:int=None):
            if i is None:
                return self.getTokens(ImgParser.APOS)
            else:
                return self.getToken(ImgParser.APOS, i)

        def DISK(self):
            return self.getToken(ImgParser.DISK, 0)

        def BACKSLASH(self, i:int=None):
            if i is None:
                return self.getTokens(ImgParser.BACKSLASH)
            else:
                return self.getToken(ImgParser.BACKSLASH, i)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ImgParser.ID)
            else:
                return self.getToken(ImgParser.ID, i)

        def getRuleIndex(self):
            return ImgParser.RULE_folderPath

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFolderPath" ):
                listener.enterFolderPath(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFolderPath" ):
                listener.exitFolderPath(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFolderPath" ):
                return visitor.visitFolderPath(self)
            else:
                return visitor.visitChildren(self)




    def folderPath(self):

        localctx = ImgParser.FolderPathContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_folderPath)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 160
            self.match(ImgParser.APOS)
            self.state = 161
            self.match(ImgParser.DISK)
            self.state = 162
            self.match(ImgParser.BACKSLASH)
            self.state = 165 
            self._errHandler.sync(self)
            _alt = 1
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt == 1:
                    self.state = 163
                    self.match(ImgParser.ID)
                    self.state = 164
                    self.match(ImgParser.BACKSLASH)

                else:
                    raise NoViableAltException(self)
                self.state = 167 
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

            self.state = 169
            self.match(ImgParser.ID)
            self.state = 170
            self.match(ImgParser.APOS)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





