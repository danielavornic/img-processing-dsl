grammar Img;

// Lexer rules
startCommand: 'imp';
ASSIGN: '=';
DOT: '.';
COMMA: ',';
APOS: '"';
OPEN_PARAN: '(';
CLOSED_PARAN: ')';
OPEN: 'open';
NUMBER: MINUS? DIGIT+;
MINUS: '-';
IMAGE_TYPE: 'png' | 'jpg' | 'bmp' | 'jpeg' | 'tiff' | 'webp';
ID: (ALPHA | DIGIT | '_'|'-') (ALPHA | DIGIT | '_'|'-')*;
WHITESPACE: [ \t\r\n]+ -> skip;
BACKSLASH: '\\';
DISK: ID ':';
FORWARD_SLASH: '/';

fragment ALPHA: [a-zA-Z];
fragment DIGIT: [0-9];
// Parser rules
start: startCommand (commandSequence|help) EOF;
commandSequence: image_param (PIPE command)*;
image_param: IMG imageArg command;
command:
    | crop
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
    | threshold
    | reduceNoise
    | remBg
    | cmyk
    | rgb
    | sepia
    | upscale;
        // enhance?

help: 'help';
crop: 'crop' X NUMBER Y NUMBER W NUMBER H NUMBER;
convert: 'convert' FORMAT IMAGE_TYPE;
rotate: 'rotate' DEGREES NUMBER;
flipX: 'flipX';
flipY: 'flipY';
bw: 'bw';
resize: 'resize' W NUMBER H NUMBER;
contrast: 'contrast' LEVEL NUMBER;
brightness: 'brightness' LEVEL NUMBER;
negative: 'negative' ;
colorize: 'colorize' ;
blur: 'blur'  LEVEL NUMBER;
sharpen: 'sharpen'  LEVEL NUMBER;
compress: 'compress' ;
ft: 'ft' ;
threshold: 'threshold'  LEVEL NUMBER;
reduceNoise: 'reduceNoise';
remBg: 'remBg';
cmyk: 'cmyk';
rgb: 'rgb';
sepia: 'sepia';
upscale: 'upscale' LEVEL NUMBER;

imageArg: filePath | folderPath;

filePath:
    APOS
    ( (DOT)? (FORWARD_SLASH | BACKSLASH)? (ID | DIGIT | FORWARD_SLASH | BACKSLASH)*
    | DISK (BACKSLASH (ID | DIGIT)*)* )
    DOT IMAGE_TYPE
    APOS;
folderPath:
    APOS
    ( (DOT)? (FORWARD_SLASH | BACKSLASH)? (ID | DIGIT | FORWARD_SLASH | BACKSLASH)*
    | DISK (BACKSLASH (ID | DIGIT)*)* )
    APOS;
COMMAND_RESULT: ID;

// Tokens specific to commands
PIPE: '->';
IMG: '--img=';
FORMAT: '--format=';
DEGREES: '--deg=';
LEVEL: '--lvl=';
X: '--x=';
Y: '--y=';
W: '--w=';
H: '--h=';
