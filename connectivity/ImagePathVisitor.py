from gen.ImgParser import ImgParser
from gen.ImgVisitor import ImgVisitor


class ImagePathVisitor(ImgVisitor):
    def __init__(self):
        super().__init__()
        self.image_path = None
        self.folder_path = None

    def visitImage_param(self, ctx:ImgParser.Image_paramContext):
        img_param = ctx.getText().split("=")[1].split('"')[1]

        if '.' in img_param and img_param[0] != '.':
            self.image_path = img_param
            return self.image_path

        self.folder_path = img_param
        return self.folder_path

    def get_folder_path(self):
        return self.folder_path

    def get_image_path(self):
        return self.image_path