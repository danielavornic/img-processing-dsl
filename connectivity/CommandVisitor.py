from gen.ImgParser import ImgParser
from gen.ImgVisitor import ImgVisitor

class CommandVisitor(ImgVisitor):
    def __init__(self):
        self.command_results = []

    def get_command_results(self):
        return self.command_results

    def visitCommand(self, ctx:ImgParser.CommandContext):
        command = ctx.getText()
        self.command_results.append(command)

    def visitHelp(self, ctx:ImgParser.HelpContext):
        command = "help"
        self.command_results.append(command)

    def visitCrop(self, ctx:ImgParser.CropContext):
        command = "crop"
        self.command_results.append(command)

    def visitConvert(self, ctx:ImgParser.ConvertContext):
        command = "convert"
        self.command_results.append(command)

    def visitRotate(self, ctx:ImgParser.RotateContext):
        command = "rotate"
        self.command_results.append(command)

    def visitFlipX(self, ctx:ImgParser.FlipXContext):
        command = "flipX"
        self.command_results.append(command)

    def visitFlipY(self, ctx:ImgParser.FlipYContext):
        command = "flipY"
        self.command_results.append(command)

    def visitBw(self, ctx:ImgParser.BwContext):
        command = "bw"
        self.command_results.append(command)

    def visitBlur(self, ctx:ImgParser.BlurContext):
        command = "blur"
        self.command_results.append(command)

    def visitSharpen(self, ctx:ImgParser.SharpenContext):
        command = "sharpen"
        self.command_results.append(command)

    def visitThreshold(self, ctx:ImgParser.ThresholdContext):
        command = "threshold"
        self.command_results.append(command)

    def visitReduceNoise(self, ctx:ImgParser.ReduceNoiseContext):
        command = "reducenoise"
        self.command_results.append(command)

    def visitContrast(self, ctx:ImgParser.ContrastContext):
        command = "contrast"
        self.command_results.append(command)

    def visitBrightness(self, ctx:ImgParser.BrightnessContext):
        command = "brightness"
        self.command_results.append(command)

    def visitNegative(self, ctx:ImgParser.NegativeContext):
        command = "negative"
        self.command_results.append(command)

    def visitCompression(self, ctx:ImgParser.CompressContext):
        command = "compress"
        self.command_results.append(command)

    def visitRemBg(self, ctx:ImgParser.RemBgContext):
        command = "remBg"
        self.command_results.append(command)

    def visitUpscale(self, ctx:ImgParser.UpscaleContext):
        command = "upscale"
        self.command_results.append(command)

    def visitColorize(self, ctx:ImgParser.ColorizeContext):
        command = "colorize"
        self.command_results.append(command)

    def visitCmyk(self, ctx:ImgParser.CmykContext):
        command = "cmyk"
        self.command_results.append(command)

    def visitRgb(self, ctx:ImgParser.RgbContext):
        command = "rgb"
        self.command_results.append(command)

    def visitSepia(self, ctx:ImgParser.SepiaContext):
        command = "sepia"
        self.command_results.append(command)
