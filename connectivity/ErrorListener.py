from antlr4.error.ErrorListener import ErrorListener

class ErrorListener(ErrorListener):
    def __init__(self):
        super(ErrorListener, self).__init__()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        message = f"Error at position {column}: {msg}"
        raise Exception(message)
