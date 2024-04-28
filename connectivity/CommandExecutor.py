from draft.ImageSaveLoader import ImageSaveLoader
from draft.ImgBasicOperations import ImgBasicOperations
from draft.ImgColorAdjustments import ImgColorAdjustments
from draft.ImgAdvancedOperations import ImgAdvancedOperations


class CommandExecutor:
    def __init__(self, command_results, image_path):
        self.command_results = command_results
        self.image_path = image_path
        self.img = None

    def execute(self):
        img_basic_operations = ImgBasicOperations()
        img_color_adjustments = ImgColorAdjustments()
        img_advanced_operations = ImgAdvancedOperations()
        img_save_loader = ImageSaveLoader(self.image_path)

        self.img = img_save_loader.load()

        for index, command_result in enumerate(self.command_results):
            command = command_result.split("--")[0].strip()
            parameters = [param.split("=")[1] for param in command_result.split("--")[1:]]
            is_last_command = index == len(self.command_results) - 1

            if command == "rotate":
                print("rotate")
                if is_last_command:
                    print("save")
            elif command == "resize":
                print("resize")
                if is_last_command:
                    print("save")
            elif command == "crop":
                self.img = img_basic_operations.crop(self.img, int(parameters[0]), int(parameters[1]), int(parameters[2]), int(parameters[3]))
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "flipX":
                print("flipX")
                if is_last_command:
                    print("save")
            elif command == "convert":
                print("convert")
                if is_last_command:
                    print("save")
            # Color adjustments operations
            elif command == "bw":
                self.img = img_color_adjustments.bw(self.img)
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "contrast":
                self.img = img_color_adjustments.contrast(self.img, float(parameters[0]))
                if is_last_command:
                    img_save_loader.save(self.img, self.image_path)
            elif command == "brightness":
                self.img = img_color_adjustments.brightness(self.img, float(parameters[0]))
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

            #TODO: Add more commands here and complete with actual implementation
