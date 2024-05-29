import sys
import os

from operations.ImageSaveLoader import ImageSaveLoader
from operations.ImgBasicOperations import ImgBasicOperations
from operations.ImgColorAdjustments import ImgColorAdjustments
from operations.ImgAdvancedOperations import ImgAdvancedOperations
from operations.ImgEnhancements import ImgEnhancements


class CommandExecutor:
    def __init__(self, command_results, path, is_folder=False):
        self.command_results = command_results
        self.path = path
        self.is_folder = is_folder
        self.image_format = None
        self.img = None
        self.img_basic_operations = None
        self.img_enhancements = None
        self.img_color_adjustments = None
        self.img_advanced_operations = None

        if not is_folder:
            self.image_format = path.split(".")[-1]

    def update_img_operations(self):
        self.img_basic_operations = ImgBasicOperations(self.img, is_folder=self.is_folder)
        self.img_enhancements = ImgEnhancements(self.img)
        self.img_color_adjustments = ImgColorAdjustments(self.img)
        self.img_advanced_operations = ImgAdvancedOperations(self.img)

    def execute(self):
        if self.is_folder:
            self.execute_folder()
        else:
            self.execute_single_image()

    def execute_single_image(self):
        img_save_loader = ImageSaveLoader(self.path)
        self.img = img_save_loader.load()

        if not self.img:
            print("Image is None.", file=sys.stderr)

        self.update_img_operations()
        self.process_commands(img_save_loader)

    def execute_folder(self):
        image_files = []
        for root, dirs, files in os.walk(self.path):
            for file in files:
                if (file.endswith(".png") or file.endswith(".jpg") or file.endswith(".jpeg") or
                        file.endswith(".webp") or file.endswith(".bmp")):
                    image_files.append(os.path.join(root, file))

        adjusted_folder = self.path + "_adjusted"
        if not os.path.exists(adjusted_folder):
            os.makedirs(adjusted_folder)

        for image_file in image_files:
            self.image_format = image_file.split(".")[-1]
            self.path = os.path.join(self.path, image_file)
            img_save_loader = ImageSaveLoader(image_file, is_folder=True)
            self.img = img_save_loader.load()

            if not self.img:
                print(f"Image {image_file} is None.", file=sys.stderr)
                continue

            self.update_img_operations()
            img_save_loader.set_path(os.path.join(adjusted_folder, image_file))
            self.process_commands(img_save_loader)

    def process_commands(self, img_save_loader):
        if any("convert" in command for command in self.command_results):
            convert_command = [command for command in self.command_results if "convert" in command][0]
            self.command_results.remove(convert_command)
            self.command_results.append(convert_command)

        for index, command_result in enumerate(self.command_results):
            command = command_result.split("--")[0].strip()
            parameters = [param.split("=")[1]
                          for param in command_result.split("--")[1:]]
            is_last_command = index == len(self.command_results) - 1

            # Basic operations
            if command == "rotate":
                self.img = self.img_basic_operations.rotate(int(parameters[0]))
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "resize":
                self.img = self.img_basic_operations.resize(int(parameters[0]), int(parameters[1]))
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "crop":
                self.img = self.img_basic_operations.crop(int(parameters[0]), int(parameters[1]), int(parameters[2]), int(parameters[3]))
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "flipX":
                self.img = self.img_basic_operations.flipX()
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "flipY":
                self.img = self.img_basic_operations.flipY()
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "convert":
                self.img = self.img_basic_operations.convert(self.path, parameters[0])
                self.update_img_operations()
            # Enhancements
            elif command == "blur":
                self.img = self.img_enhancements.blur(int(parameters[0]))
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "sharpen":
                self.img = self.img_enhancements.sharpen(int(parameters[0]))
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "threshold":
                self.img = self.img_enhancements.threshold(int(parameters[0]))
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "reduceNoise":
                self.img = self.img_enhancements.reduceNoise()
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            # Color adjustments
            elif command == "bw":
                self.img = self.img_color_adjustments.bw()
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "contrast":
                self.img = self.img_color_adjustments.contrast(float(parameters[0]))
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "brightness":
                self.img = self.img_color_adjustments.brightness(float(parameters[0]))
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "negative":
                self.img = self.img_color_adjustments.negative()
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            # Advanced operations
            elif command == "compress":
                self.img = self.img_advanced_operations.compress(self.image_format)
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "remBg":
                self.img = self.img_advanced_operations.remBg()
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "upscale":
                self.img = self.img_advanced_operations.upscale(float(parameters[0]))
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)
            elif command == "colorize":
                self.img = self.img_advanced_operations.colorize()
                self.update_img_operations()
                if is_last_command:
                    img_save_loader.save(self.img, self.path)