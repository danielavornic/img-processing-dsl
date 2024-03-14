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
NUMBER: MINUS? DIGIT+;
MINUS: '-';
ID: ALPHA (ALPHA | DIGIT)*;
IMAGE_TYPE: 'png' | 'jpg' | 'bmp' | 'gif';
WHITESPACE: [ \t\r\n]+ -> skip;

fragment ALPHA: [a-zA-Z];
fragment DIGIT: [0-9];
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
    | negative
    | colorize
    | blur
    | sharpen
    | compress
    | ft
    | threshold;

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
colorize: 'colorize' IMG imageArg;
blur: 'blur' IMG imageArg LEVEL NUMBER;
sharpen: 'sharpen' IMG imageArg LEVEL NUMBER;
compress: 'compress' IMG imageArg;
ft: 'ft' IMG imageArg;
threshold: 'threshold' IMG imageArg LEVEL NUMBER;

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
