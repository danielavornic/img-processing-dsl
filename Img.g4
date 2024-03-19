grammar Img;

// Lexer rules
ASSIGN: '=';
DOT: '.';
COMMA: ',';
APOS: '"';
SEMICOLON: ';';
OPEN_PARAN: '(';
CLOSED_PARAN: ')';
OPEN: 'open';
NUMBER: MINUS? DIGIT+;
MINUS: '-';
IMAGE_TYPE: 'png' | 'jpg' | 'bmp' | 'gif' | 'jpeg' | 'tiff' | 'webp';
ID: ALPHA (ALPHA | DIGIT)*;
WHITESPACE: [ \t\r\n]+ -> skip;

fragment ALPHA: [a-zA-Z];
fragment DIGIT: [0-9];
// Parser rules
start: commandSequence EOF;
commandSequence: firstCommand (PIPE command)* SEMICOLON?;
firstCommand:  IMG imageArg imageCommand;
command: imageCommand;
imageCommand:
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

imageArg: filePath | folderPath;
filePath: APOS ID DOT IMAGE_TYPE APOS;
folderPath: APOS ID APOS;
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
