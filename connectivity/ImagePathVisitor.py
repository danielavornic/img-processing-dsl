from gen.ImgParser import ImgParser
from gen.ImgVisitor import ImgVisitor


class ImagePathVisitor(ImgVisitor):
    def __init__(self):
        super().__init__()
        self.image_path = None

    def visitImage_param(self, ctx:ImgParser.Image_paramContext):
        #the param between the --img="param" is the image path
        self.image_path = ctx.getText().split("=")[1]

        return self.image_path

    def get_image_path(self):
        return self.image_path