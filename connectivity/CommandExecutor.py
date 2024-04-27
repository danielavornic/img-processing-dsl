class CommandExecutor:
    def __init__(self, command_results):
        self.command_results = command_results

    def execute(self):
        for index, command_result in enumerate(self.command_results):
            command = command_result.split("--")[0].strip()
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
                print("crop")
                if is_last_command:
                    print("save")
            elif command == "flipX":
                print("flipX")
                if is_last_command:
                    print("save")

            #TODO: Add more commands here and complete with actual implementation
