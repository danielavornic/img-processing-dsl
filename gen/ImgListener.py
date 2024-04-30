# Generated from /home/vornic/Work/img-processing-dsl/Img.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ImgParser import ImgParser
else:
    from ImgParser import ImgParser

# This class defines a complete listener for a parse tree produced by ImgParser.
class ImgListener(ParseTreeListener):

    # Enter a parse tree produced by ImgParser#startCommand.
    def enterStartCommand(self, ctx:ImgParser.StartCommandContext):
        pass

    # Exit a parse tree produced by ImgParser#startCommand.
    def exitStartCommand(self, ctx:ImgParser.StartCommandContext):
        pass


    # Enter a parse tree produced by ImgParser#start.
    def enterStart(self, ctx:ImgParser.StartContext):
        pass

    # Exit a parse tree produced by ImgParser#start.
    def exitStart(self, ctx:ImgParser.StartContext):
        pass


    # Enter a parse tree produced by ImgParser#commandSequence.
    def enterCommandSequence(self, ctx:ImgParser.CommandSequenceContext):
        pass

    # Exit a parse tree produced by ImgParser#commandSequence.
    def exitCommandSequence(self, ctx:ImgParser.CommandSequenceContext):
        pass


    # Enter a parse tree produced by ImgParser#image_param.
    def enterImage_param(self, ctx:ImgParser.Image_paramContext):
        pass

    # Exit a parse tree produced by ImgParser#image_param.
    def exitImage_param(self, ctx:ImgParser.Image_paramContext):
        pass


    # Enter a parse tree produced by ImgParser#command.
    def enterCommand(self, ctx:ImgParser.CommandContext):
        pass

    # Exit a parse tree produced by ImgParser#command.
    def exitCommand(self, ctx:ImgParser.CommandContext):
        pass


    # Enter a parse tree produced by ImgParser#help.
    def enterHelp(self, ctx:ImgParser.HelpContext):
        pass

    # Exit a parse tree produced by ImgParser#help.
    def exitHelp(self, ctx:ImgParser.HelpContext):
        pass


    # Enter a parse tree produced by ImgParser#crop.
    def enterCrop(self, ctx:ImgParser.CropContext):
        pass

    # Exit a parse tree produced by ImgParser#crop.
    def exitCrop(self, ctx:ImgParser.CropContext):
        pass


    # Enter a parse tree produced by ImgParser#convert.
    def enterConvert(self, ctx:ImgParser.ConvertContext):
        pass

    # Exit a parse tree produced by ImgParser#convert.
    def exitConvert(self, ctx:ImgParser.ConvertContext):
        pass


    # Enter a parse tree produced by ImgParser#rotate.
    def enterRotate(self, ctx:ImgParser.RotateContext):
        pass

    # Exit a parse tree produced by ImgParser#rotate.
    def exitRotate(self, ctx:ImgParser.RotateContext):
        pass


    # Enter a parse tree produced by ImgParser#flipX.
    def enterFlipX(self, ctx:ImgParser.FlipXContext):
        pass

    # Exit a parse tree produced by ImgParser#flipX.
    def exitFlipX(self, ctx:ImgParser.FlipXContext):
        pass


    # Enter a parse tree produced by ImgParser#flipY.
    def enterFlipY(self, ctx:ImgParser.FlipYContext):
        pass

    # Exit a parse tree produced by ImgParser#flipY.
    def exitFlipY(self, ctx:ImgParser.FlipYContext):
        pass


    # Enter a parse tree produced by ImgParser#bw.
    def enterBw(self, ctx:ImgParser.BwContext):
        pass

    # Exit a parse tree produced by ImgParser#bw.
    def exitBw(self, ctx:ImgParser.BwContext):
        pass


    # Enter a parse tree produced by ImgParser#resize.
    def enterResize(self, ctx:ImgParser.ResizeContext):
        pass

    # Exit a parse tree produced by ImgParser#resize.
    def exitResize(self, ctx:ImgParser.ResizeContext):
        pass


    # Enter a parse tree produced by ImgParser#contrast.
    def enterContrast(self, ctx:ImgParser.ContrastContext):
        pass

    # Exit a parse tree produced by ImgParser#contrast.
    def exitContrast(self, ctx:ImgParser.ContrastContext):
        pass


    # Enter a parse tree produced by ImgParser#brightness.
    def enterBrightness(self, ctx:ImgParser.BrightnessContext):
        pass

    # Exit a parse tree produced by ImgParser#brightness.
    def exitBrightness(self, ctx:ImgParser.BrightnessContext):
        pass


    # Enter a parse tree produced by ImgParser#negative.
    def enterNegative(self, ctx:ImgParser.NegativeContext):
        pass

    # Exit a parse tree produced by ImgParser#negative.
    def exitNegative(self, ctx:ImgParser.NegativeContext):
        pass


    # Enter a parse tree produced by ImgParser#colorize.
    def enterColorize(self, ctx:ImgParser.ColorizeContext):
        pass

    # Exit a parse tree produced by ImgParser#colorize.
    def exitColorize(self, ctx:ImgParser.ColorizeContext):
        pass


    # Enter a parse tree produced by ImgParser#blur.
    def enterBlur(self, ctx:ImgParser.BlurContext):
        pass

    # Exit a parse tree produced by ImgParser#blur.
    def exitBlur(self, ctx:ImgParser.BlurContext):
        pass


    # Enter a parse tree produced by ImgParser#sharpen.
    def enterSharpen(self, ctx:ImgParser.SharpenContext):
        pass

    # Exit a parse tree produced by ImgParser#sharpen.
    def exitSharpen(self, ctx:ImgParser.SharpenContext):
        pass


    # Enter a parse tree produced by ImgParser#compress.
    def enterCompress(self, ctx:ImgParser.CompressContext):
        pass

    # Exit a parse tree produced by ImgParser#compress.
    def exitCompress(self, ctx:ImgParser.CompressContext):
        pass


    # Enter a parse tree produced by ImgParser#ft.
    def enterFt(self, ctx:ImgParser.FtContext):
        pass

    # Exit a parse tree produced by ImgParser#ft.
    def exitFt(self, ctx:ImgParser.FtContext):
        pass


    # Enter a parse tree produced by ImgParser#threshold.
    def enterThreshold(self, ctx:ImgParser.ThresholdContext):
        pass

    # Exit a parse tree produced by ImgParser#threshold.
    def exitThreshold(self, ctx:ImgParser.ThresholdContext):
        pass


    # Enter a parse tree produced by ImgParser#reduceNoise.
    def enterReduceNoise(self, ctx:ImgParser.ReduceNoiseContext):
        pass

    # Exit a parse tree produced by ImgParser#reduceNoise.
    def exitReduceNoise(self, ctx:ImgParser.ReduceNoiseContext):
        pass


    # Enter a parse tree produced by ImgParser#remBg.
    def enterRemBg(self, ctx:ImgParser.RemBgContext):
        pass

    # Exit a parse tree produced by ImgParser#remBg.
    def exitRemBg(self, ctx:ImgParser.RemBgContext):
        pass


    # Enter a parse tree produced by ImgParser#upscale.
    def enterUpscale(self, ctx:ImgParser.UpscaleContext):
        pass

    # Exit a parse tree produced by ImgParser#upscale.
    def exitUpscale(self, ctx:ImgParser.UpscaleContext):
        pass


    # Enter a parse tree produced by ImgParser#imageArg.
    def enterImageArg(self, ctx:ImgParser.ImageArgContext):
        pass

    # Exit a parse tree produced by ImgParser#imageArg.
    def exitImageArg(self, ctx:ImgParser.ImageArgContext):
        pass


    # Enter a parse tree produced by ImgParser#filePath.
    def enterFilePath(self, ctx:ImgParser.FilePathContext):
        pass

    # Exit a parse tree produced by ImgParser#filePath.
    def exitFilePath(self, ctx:ImgParser.FilePathContext):
        pass


    # Enter a parse tree produced by ImgParser#folderPath.
    def enterFolderPath(self, ctx:ImgParser.FolderPathContext):
        pass

    # Exit a parse tree produced by ImgParser#folderPath.
    def exitFolderPath(self, ctx:ImgParser.FolderPathContext):
        pass



del ImgParser