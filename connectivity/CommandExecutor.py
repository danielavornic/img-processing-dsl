from draft.ImageSaveLoader import ImageSaveLoader
from draft.ImgBasicOperations import ImgBasicOperations
from draft.ImgColorAdjustments import ImgColorAdjustments
from draft.ImgAdvancedOperations import ImgAdvancedOperations
from draft.ImgEnhancements import ImgEnhancements


class CommandExecutor:
    def __init__(self, command_results, image_path):
        self.command_results = command_results
        self.image_path = image_path
        self.img = None

    def execute(self):
        img_basic_operations = ImgBasicOperations()
        img_enhancements = ImgEnhancements()
        img_color_adjustments = ImgColorAdjustments()
        img_advanced_operations = ImgAdvancedOperations()
        img_save_loader = ImageSaveLoader(self.image_path)
        self.img = img_save_loader.load()

        if any("convert" in command for command in self.command_results):
            convert_command = [command for command in self.command_results if "convert" in command][0]
            self.command_results.remove(convert_command)
            self.command_results.append(convert_command)

        for index, command_result in enumerate(self.command_results):
            command = command_result.split("--")[0].strip()
            parameters = [param.split("=")[1]
                          for param in command_result.split("--")[1:]]
            is_last_command = index == len(self.command_results) - 1

            if command == "rotate":
                self.img = img_basic_operations.rotate(self.img, int(parameters[0]))
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "resize":
                self.img = img_basic_operations.resize(self.img, int(parameters[0]), int(parameters[1]))
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "crop":
                self.img = img_basic_operations.crop(self.img, int(parameters[0]), int(parameters[1]), int(parameters[2]), int(parameters[3]))
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "flipX":
                self.img = img_basic_operations.flipX(self.img)
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "flipY":
                self.img = img_basic_operations.flipY(self.img)
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "convert":
                self.img = img_basic_operations.convert(self.img,self.image_path, parameters[0])
            elif command == "blur":
                self.img = img_enhancements.blur(self.img, int(parameters[0]))
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "sharpen":
                self.img = img_enhancements.sharpen(self.img, int(parameters[0]))
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "threshold":
                self.img = img_enhancements.threshold(self.img, int(parameters[0]))
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "reduceNoise":
                self.img = img_enhancements.reduceNoise(self.img)
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "bw":
                self.img = img_color_adjustments.bw(self.img)
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "contrast":
                self.img = img_color_adjustments.contrast(
                    self.img, float(parameters[0]))
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "brightness":
                self.img = img_color_adjustments.brightness(
                    self.img, float(parameters[0]))
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "negative":
                self.img = img_color_adjustments.negative(self.img)
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            # Advanced operations
            elif command == "compress":
                self.img = img_advanced_operations.compress(self.img)
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "remBg":
                self.img = img_advanced_operations.remBg(self.img)
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "upscale":
                self.img = img_advanced_operations.upscale(
                    self.img, float(parameters[0]))
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "colorize":
                self.img = img_advanced_operations.colorize(self.img)
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)