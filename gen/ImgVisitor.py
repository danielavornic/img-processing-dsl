# Generated from /home/vornic/Work/img-processing-dsl/Img.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ImgParser import ImgParser
else:
    from ImgParser import ImgParser

# This class defines a complete generic visitor for a parse tree produced by ImgParser.

class ImgVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ImgParser#startCommand.
    def visitStartCommand(self, ctx:ImgParser.StartCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#start.
    def visitStart(self, ctx:ImgParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#commandSequence.
    def visitCommandSequence(self, ctx:ImgParser.CommandSequenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#image_param.
    def visitImage_param(self, ctx:ImgParser.Image_paramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#command.
    def visitCommand(self, ctx:ImgParser.CommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#help.
    def visitHelp(self, ctx:ImgParser.HelpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#crop.
    def visitCrop(self, ctx:ImgParser.CropContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#convert.
    def visitConvert(self, ctx:ImgParser.ConvertContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#rotate.
    def visitRotate(self, ctx:ImgParser.RotateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#flipX.
    def visitFlipX(self, ctx:ImgParser.FlipXContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#flipY.
    def visitFlipY(self, ctx:ImgParser.FlipYContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#bw.
    def visitBw(self, ctx:ImgParser.BwContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#resize.
    def visitResize(self, ctx:ImgParser.ResizeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#contrast.
    def visitContrast(self, ctx:ImgParser.ContrastContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#brightness.
    def visitBrightness(self, ctx:ImgParser.BrightnessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#negative.
    def visitNegative(self, ctx:ImgParser.NegativeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#colorize.
    def visitColorize(self, ctx:ImgParser.ColorizeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#blur.
    def visitBlur(self, ctx:ImgParser.BlurContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#sharpen.
    def visitSharpen(self, ctx:ImgParser.SharpenContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#compress.
    def visitCompress(self, ctx:ImgParser.CompressContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#ft.
    def visitFt(self, ctx:ImgParser.FtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#threshold.
    def visitThreshold(self, ctx:ImgParser.ThresholdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#reduceNoise.
    def visitReduceNoise(self, ctx:ImgParser.ReduceNoiseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#remBg.
    def visitRemBg(self, ctx:ImgParser.RemBgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#upscale.
    def visitUpscale(self, ctx:ImgParser.UpscaleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#imageArg.
    def visitImageArg(self, ctx:ImgParser.ImageArgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#filePath.
    def visitFilePath(self, ctx:ImgParser.FilePathContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ImgParser#folderPath.
    def visitFolderPath(self, ctx:ImgParser.FolderPathContext):
        return self.visitChildren(ctx)



del ImgParser