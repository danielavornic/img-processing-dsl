grammar Img;

// Lexer rules
ASSIGN: '=';
DOT: '.';
COMMA: ',';
APOS: '"';
SEMICOLON: ';';
OPEN_PARAN: '(';
CLOSED_PARAN: ')';
FOLDER: '[]';
OPEN: 'open';
NUMBER: MINUS? [0-9]+;
MINUS: '-';
ID: [a-zA-Z_/-]+ NUMBER*;
IMAGE_TYPE: 'png' | 'jpg' | 'bmp' | 'gif';
WHITESPACE: [ \t\r\n]+ -> skip;

// Parser rules
start: commandSequence EOF;
commandSequence: command (SEMICOLON commandSequence)?;

command:
    crop
    | convert
    | rotate
    | flipX
    | flipY
    | bw
    | resize
    | contrast
    | brightness
    | negative;

crop: 'crop' IMG imageArg X NUMBER Y NUMBER W NUMBER H NUMBER;
convert: 'convert' IMG imageArg FORMAT IMAGE_TYPE;
rotate: 'rotate' IMG imageArg DEGREES NUMBER;
flipX: 'flipX' IMG imageArg;
flipY: 'flipY' IMG imageArg;
bw: 'bw' IMG imageArg;
resize: 'resize' IMG imageArg W NUMBER H NUMBER;
contrast: 'contrast' IMG imageArg LEVEL NUMBER;
brightness: 'brightness' IMG imageArg LEVEL NUMBER;
negative: 'negative' IMG imageArg;

imageArg: filePath | folderPath;
filePath: APOS ID (DOT IMAGE_TYPE)? APOS;
folderPath: APOS ID APOS;

// Tokens specific to commands
IMG: '--img=';
FORMAT: '--format=';
DEGREES: '--degrees=';
LEVEL: '--level=';
X: '--x=';
Y: '--y=';
W: '--w=';
H: '--h=';
