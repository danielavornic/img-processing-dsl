// Generated from D:/UTM/4_th_semester/DSL/img-processing-dsl/Img.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ImgParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ASSIGN=18, DOT=19, COMMA=20, APOS=21, OPEN_PARAN=22, CLOSED_PARAN=23, 
		OPEN=24, NUMBER=25, MINUS=26, IMAGE_TYPE=27, ID=28, WHITESPACE=29, COMMAND_RESULT=30, 
		PIPE=31, IMG=32, FORMAT=33, DEGREES=34, LEVEL=35, X=36, Y=37, W=38, H=39;
	public static final int
		RULE_startCommand = 0, RULE_start = 1, RULE_commandSequence = 2, RULE_image_param = 3, 
		RULE_command = 4, RULE_crop = 5, RULE_convert = 6, RULE_rotate = 7, RULE_flipX = 8, 
		RULE_flipY = 9, RULE_bw = 10, RULE_resize = 11, RULE_contrast = 12, RULE_brightness = 13, 
		RULE_negative = 14, RULE_colorize = 15, RULE_blur = 16, RULE_sharpen = 17, 
		RULE_compress = 18, RULE_ft = 19, RULE_threshold = 20, RULE_imageArg = 21, 
		RULE_filePath = 22, RULE_folderPath = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"startCommand", "start", "commandSequence", "image_param", "command", 
			"crop", "convert", "rotate", "flipX", "flipY", "bw", "resize", "contrast", 
			"brightness", "negative", "colorize", "blur", "sharpen", "compress", 
			"ft", "threshold", "imageArg", "filePath", "folderPath"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'imp'", "'crop'", "'convert'", "'rotate'", "'flipX'", "'flipY'", 
			"'bw'", "'resize'", "'contrast'", "'brightness'", "'negative'", "'colorize'", 
			"'blur'", "'sharpen'", "'compress'", "'ft'", "'threshold'", "'='", "'.'", 
			"','", "'\"'", "'('", "')'", "'open'", null, "'-'", null, null, null, 
			null, "'->'", "'--img='", "'--format='", "'--deg='", "'--lvl='", "'--x='", 
			"'--y='", "'--w='", "'--h='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ASSIGN", "DOT", "COMMA", "APOS", 
			"OPEN_PARAN", "CLOSED_PARAN", "OPEN", "NUMBER", "MINUS", "IMAGE_TYPE", 
			"ID", "WHITESPACE", "COMMAND_RESULT", "PIPE", "IMG", "FORMAT", "DEGREES", 
			"LEVEL", "X", "Y", "W", "H"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Img.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartCommandContext extends ParserRuleContext {
		public StartCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterStartCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitStartCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitStartCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartCommandContext startCommand() throws RecognitionException {
		StartCommandContext _localctx = new StartCommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public StartCommandContext startCommand() {
			return getRuleContext(StartCommandContext.class,0);
		}
		public CommandSequenceContext commandSequence() {
			return getRuleContext(CommandSequenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ImgParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			startCommand();
			setState(51);
			commandSequence();
			setState(52);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandSequenceContext extends ParserRuleContext {
		public Image_paramContext image_param() {
			return getRuleContext(Image_paramContext.class,0);
		}
		public List<TerminalNode> PIPE() { return getTokens(ImgParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(ImgParser.PIPE, i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterCommandSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitCommandSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitCommandSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandSequenceContext commandSequence() throws RecognitionException {
		CommandSequenceContext _localctx = new CommandSequenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commandSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			image_param();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(55);
				match(PIPE);
				setState(56);
				command();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Image_paramContext extends ParserRuleContext {
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Image_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterImage_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitImage_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitImage_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Image_paramContext image_param() throws RecognitionException {
		Image_paramContext _localctx = new Image_paramContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_image_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IMG);
			setState(63);
			imageArg();
			setState(64);
			command();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public CropContext crop() {
			return getRuleContext(CropContext.class,0);
		}
		public ConvertContext convert() {
			return getRuleContext(ConvertContext.class,0);
		}
		public RotateContext rotate() {
			return getRuleContext(RotateContext.class,0);
		}
		public FlipXContext flipX() {
			return getRuleContext(FlipXContext.class,0);
		}
		public FlipYContext flipY() {
			return getRuleContext(FlipYContext.class,0);
		}
		public BwContext bw() {
			return getRuleContext(BwContext.class,0);
		}
		public ResizeContext resize() {
			return getRuleContext(ResizeContext.class,0);
		}
		public ContrastContext contrast() {
			return getRuleContext(ContrastContext.class,0);
		}
		public BrightnessContext brightness() {
			return getRuleContext(BrightnessContext.class,0);
		}
		public NegativeContext negative() {
			return getRuleContext(NegativeContext.class,0);
		}
		public ColorizeContext colorize() {
			return getRuleContext(ColorizeContext.class,0);
		}
		public BlurContext blur() {
			return getRuleContext(BlurContext.class,0);
		}
		public SharpenContext sharpen() {
			return getRuleContext(SharpenContext.class,0);
		}
		public CompressContext compress() {
			return getRuleContext(CompressContext.class,0);
		}
		public FtContext ft() {
			return getRuleContext(FtContext.class,0);
		}
		public ThresholdContext threshold() {
			return getRuleContext(ThresholdContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				crop();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				convert();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				rotate();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				flipX();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				flipY();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				bw();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				resize();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				contrast();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				brightness();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				negative();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 11);
				{
				setState(76);
				colorize();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 12);
				{
				setState(77);
				blur();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 13);
				{
				setState(78);
				sharpen();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 14);
				{
				setState(79);
				compress();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 15);
				{
				setState(80);
				ft();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 16);
				{
				setState(81);
				threshold();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CropContext extends ParserRuleContext {
		public TerminalNode X() { return getToken(ImgParser.X, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ImgParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ImgParser.NUMBER, i);
		}
		public TerminalNode Y() { return getToken(ImgParser.Y, 0); }
		public TerminalNode W() { return getToken(ImgParser.W, 0); }
		public TerminalNode H() { return getToken(ImgParser.H, 0); }
		public CropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterCrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitCrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitCrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CropContext crop() throws RecognitionException {
		CropContext _localctx = new CropContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_crop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__1);
			setState(85);
			match(X);
			setState(86);
			match(NUMBER);
			setState(87);
			match(Y);
			setState(88);
			match(NUMBER);
			setState(89);
			match(W);
			setState(90);
			match(NUMBER);
			setState(91);
			match(H);
			setState(92);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConvertContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(ImgParser.FORMAT, 0); }
		public TerminalNode IMAGE_TYPE() { return getToken(ImgParser.IMAGE_TYPE, 0); }
		public ConvertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterConvert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitConvert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitConvert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConvertContext convert() throws RecognitionException {
		ConvertContext _localctx = new ConvertContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_convert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__2);
			setState(95);
			match(FORMAT);
			setState(96);
			match(IMAGE_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RotateContext extends ParserRuleContext {
		public TerminalNode DEGREES() { return getToken(ImgParser.DEGREES, 0); }
		public TerminalNode NUMBER() { return getToken(ImgParser.NUMBER, 0); }
		public RotateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterRotate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitRotate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitRotate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotateContext rotate() throws RecognitionException {
		RotateContext _localctx = new RotateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rotate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__3);
			setState(99);
			match(DEGREES);
			setState(100);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlipXContext extends ParserRuleContext {
		public FlipXContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flipX; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterFlipX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitFlipX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitFlipX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlipXContext flipX() throws RecognitionException {
		FlipXContext _localctx = new FlipXContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_flipX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FlipYContext extends ParserRuleContext {
		public FlipYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flipY; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterFlipY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitFlipY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitFlipY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlipYContext flipY() throws RecognitionException {
		FlipYContext _localctx = new FlipYContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_flipY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BwContext extends ParserRuleContext {
		public BwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterBw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitBw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitBw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BwContext bw() throws RecognitionException {
		BwContext _localctx = new BwContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResizeContext extends ParserRuleContext {
		public TerminalNode W() { return getToken(ImgParser.W, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ImgParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ImgParser.NUMBER, i);
		}
		public TerminalNode H() { return getToken(ImgParser.H, 0); }
		public ResizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterResize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitResize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitResize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResizeContext resize() throws RecognitionException {
		ResizeContext _localctx = new ResizeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_resize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__7);
			setState(109);
			match(W);
			setState(110);
			match(NUMBER);
			setState(111);
			match(H);
			setState(112);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContrastContext extends ParserRuleContext {
		public TerminalNode LEVEL() { return getToken(ImgParser.LEVEL, 0); }
		public TerminalNode NUMBER() { return getToken(ImgParser.NUMBER, 0); }
		public ContrastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contrast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterContrast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitContrast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitContrast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContrastContext contrast() throws RecognitionException {
		ContrastContext _localctx = new ContrastContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_contrast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__8);
			setState(115);
			match(LEVEL);
			setState(116);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BrightnessContext extends ParserRuleContext {
		public TerminalNode LEVEL() { return getToken(ImgParser.LEVEL, 0); }
		public TerminalNode NUMBER() { return getToken(ImgParser.NUMBER, 0); }
		public BrightnessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brightness; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterBrightness(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitBrightness(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitBrightness(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrightnessContext brightness() throws RecognitionException {
		BrightnessContext _localctx = new BrightnessContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_brightness);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__9);
			setState(119);
			match(LEVEL);
			setState(120);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegativeContext extends ParserRuleContext {
		public NegativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitNegative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegativeContext negative() throws RecognitionException {
		NegativeContext _localctx = new NegativeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_negative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorizeContext extends ParserRuleContext {
		public ColorizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterColorize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitColorize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitColorize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorizeContext colorize() throws RecognitionException {
		ColorizeContext _localctx = new ColorizeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_colorize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlurContext extends ParserRuleContext {
		public TerminalNode LEVEL() { return getToken(ImgParser.LEVEL, 0); }
		public TerminalNode NUMBER() { return getToken(ImgParser.NUMBER, 0); }
		public BlurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterBlur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitBlur(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitBlur(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlurContext blur() throws RecognitionException {
		BlurContext _localctx = new BlurContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__12);
			setState(127);
			match(LEVEL);
			setState(128);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SharpenContext extends ParserRuleContext {
		public TerminalNode LEVEL() { return getToken(ImgParser.LEVEL, 0); }
		public TerminalNode NUMBER() { return getToken(ImgParser.NUMBER, 0); }
		public SharpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterSharpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitSharpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitSharpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SharpenContext sharpen() throws RecognitionException {
		SharpenContext _localctx = new SharpenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sharpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__13);
			setState(131);
			match(LEVEL);
			setState(132);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompressContext extends ParserRuleContext {
		public CompressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterCompress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitCompress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitCompress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompressContext compress() throws RecognitionException {
		CompressContext _localctx = new CompressContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FtContext extends ParserRuleContext {
		public FtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterFt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitFt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitFt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FtContext ft() throws RecognitionException {
		FtContext _localctx = new FtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThresholdContext extends ParserRuleContext {
		public TerminalNode LEVEL() { return getToken(ImgParser.LEVEL, 0); }
		public TerminalNode NUMBER() { return getToken(ImgParser.NUMBER, 0); }
		public ThresholdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_threshold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterThreshold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitThreshold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitThreshold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThresholdContext threshold() throws RecognitionException {
		ThresholdContext _localctx = new ThresholdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_threshold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__16);
			setState(139);
			match(LEVEL);
			setState(140);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImageArgContext extends ParserRuleContext {
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public FolderPathContext folderPath() {
			return getRuleContext(FolderPathContext.class,0);
		}
		public ImageArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterImageArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitImageArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitImageArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageArgContext imageArg() throws RecognitionException {
		ImageArgContext _localctx = new ImageArgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_imageArg);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				filePath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				folderPath();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilePathContext extends ParserRuleContext {
		public List<TerminalNode> APOS() { return getTokens(ImgParser.APOS); }
		public TerminalNode APOS(int i) {
			return getToken(ImgParser.APOS, i);
		}
		public TerminalNode ID() { return getToken(ImgParser.ID, 0); }
		public TerminalNode DOT() { return getToken(ImgParser.DOT, 0); }
		public TerminalNode IMAGE_TYPE() { return getToken(ImgParser.IMAGE_TYPE, 0); }
		public FilePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterFilePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitFilePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitFilePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilePathContext filePath() throws RecognitionException {
		FilePathContext _localctx = new FilePathContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_filePath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(APOS);
			setState(147);
			match(ID);
			setState(148);
			match(DOT);
			setState(149);
			match(IMAGE_TYPE);
			setState(150);
			match(APOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FolderPathContext extends ParserRuleContext {
		public List<TerminalNode> APOS() { return getTokens(ImgParser.APOS); }
		public TerminalNode APOS(int i) {
			return getToken(ImgParser.APOS, i);
		}
		public TerminalNode ID() { return getToken(ImgParser.ID, 0); }
		public FolderPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folderPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).enterFolderPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImgListener ) ((ImgListener)listener).exitFolderPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ImgVisitor ) return ((ImgVisitor<? extends T>)visitor).visitFolderPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FolderPathContext folderPath() throws RecognitionException {
		FolderPathContext _localctx = new FolderPathContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_folderPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(APOS);
			setState(153);
			match(ID);
			setState(154);
			match(APOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u009d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004S\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u0091\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0000"+
		"\u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.\u0000\u0000\u0095\u00000\u0001\u0000\u0000"+
		"\u0000\u00022\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000\u0000\u0006"+
		">\u0001\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000\nT\u0001\u0000\u0000"+
		"\u0000\f^\u0001\u0000\u0000\u0000\u000eb\u0001\u0000\u0000\u0000\u0010"+
		"f\u0001\u0000\u0000\u0000\u0012h\u0001\u0000\u0000\u0000\u0014j\u0001"+
		"\u0000\u0000\u0000\u0016l\u0001\u0000\u0000\u0000\u0018r\u0001\u0000\u0000"+
		"\u0000\u001av\u0001\u0000\u0000\u0000\u001cz\u0001\u0000\u0000\u0000\u001e"+
		"|\u0001\u0000\u0000\u0000 ~\u0001\u0000\u0000\u0000\"\u0082\u0001\u0000"+
		"\u0000\u0000$\u0086\u0001\u0000\u0000\u0000&\u0088\u0001\u0000\u0000\u0000"+
		"(\u008a\u0001\u0000\u0000\u0000*\u0090\u0001\u0000\u0000\u0000,\u0092"+
		"\u0001\u0000\u0000\u0000.\u0098\u0001\u0000\u0000\u000001\u0005\u0001"+
		"\u0000\u00001\u0001\u0001\u0000\u0000\u000023\u0003\u0000\u0000\u0000"+
		"34\u0003\u0004\u0002\u000045\u0005\u0000\u0000\u00015\u0003\u0001\u0000"+
		"\u0000\u00006;\u0003\u0006\u0003\u000078\u0005\u001f\u0000\u00008:\u0003"+
		"\b\u0004\u000097\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>?\u0005 \u0000\u0000?@\u0003*\u0015\u0000"+
		"@A\u0003\b\u0004\u0000A\u0007\u0001\u0000\u0000\u0000BS\u0003\n\u0005"+
		"\u0000CS\u0003\f\u0006\u0000DS\u0003\u000e\u0007\u0000ES\u0003\u0010\b"+
		"\u0000FS\u0003\u0012\t\u0000GS\u0003\u0014\n\u0000HS\u0003\u0016\u000b"+
		"\u0000IS\u0003\u0018\f\u0000JS\u0003\u001a\r\u0000KS\u0003\u001c\u000e"+
		"\u0000LS\u0003\u001e\u000f\u0000MS\u0003 \u0010\u0000NS\u0003\"\u0011"+
		"\u0000OS\u0003$\u0012\u0000PS\u0003&\u0013\u0000QS\u0003(\u0014\u0000"+
		"RB\u0001\u0000\u0000\u0000RC\u0001\u0000\u0000\u0000RD\u0001\u0000\u0000"+
		"\u0000RE\u0001\u0000\u0000\u0000RF\u0001\u0000\u0000\u0000RG\u0001\u0000"+
		"\u0000\u0000RH\u0001\u0000\u0000\u0000RI\u0001\u0000\u0000\u0000RJ\u0001"+
		"\u0000\u0000\u0000RK\u0001\u0000\u0000\u0000RL\u0001\u0000\u0000\u0000"+
		"RM\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\t\u0001\u0000"+
		"\u0000\u0000TU\u0005\u0002\u0000\u0000UV\u0005$\u0000\u0000VW\u0005\u0019"+
		"\u0000\u0000WX\u0005%\u0000\u0000XY\u0005\u0019\u0000\u0000YZ\u0005&\u0000"+
		"\u0000Z[\u0005\u0019\u0000\u0000[\\\u0005\'\u0000\u0000\\]\u0005\u0019"+
		"\u0000\u0000]\u000b\u0001\u0000\u0000\u0000^_\u0005\u0003\u0000\u0000"+
		"_`\u0005!\u0000\u0000`a\u0005\u001b\u0000\u0000a\r\u0001\u0000\u0000\u0000"+
		"bc\u0005\u0004\u0000\u0000cd\u0005\"\u0000\u0000de\u0005\u0019\u0000\u0000"+
		"e\u000f\u0001\u0000\u0000\u0000fg\u0005\u0005\u0000\u0000g\u0011\u0001"+
		"\u0000\u0000\u0000hi\u0005\u0006\u0000\u0000i\u0013\u0001\u0000\u0000"+
		"\u0000jk\u0005\u0007\u0000\u0000k\u0015\u0001\u0000\u0000\u0000lm\u0005"+
		"\b\u0000\u0000mn\u0005&\u0000\u0000no\u0005\u0019\u0000\u0000op\u0005"+
		"\'\u0000\u0000pq\u0005\u0019\u0000\u0000q\u0017\u0001\u0000\u0000\u0000"+
		"rs\u0005\t\u0000\u0000st\u0005#\u0000\u0000tu\u0005\u0019\u0000\u0000"+
		"u\u0019\u0001\u0000\u0000\u0000vw\u0005\n\u0000\u0000wx\u0005#\u0000\u0000"+
		"xy\u0005\u0019\u0000\u0000y\u001b\u0001\u0000\u0000\u0000z{\u0005\u000b"+
		"\u0000\u0000{\u001d\u0001\u0000\u0000\u0000|}\u0005\f\u0000\u0000}\u001f"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005\r\u0000\u0000\u007f\u0080\u0005"+
		"#\u0000\u0000\u0080\u0081\u0005\u0019\u0000\u0000\u0081!\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005\u000e\u0000\u0000\u0083\u0084\u0005#\u0000\u0000"+
		"\u0084\u0085\u0005\u0019\u0000\u0000\u0085#\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005\u000f\u0000\u0000\u0087%\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005\u0010\u0000\u0000\u0089\'\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"\u0011\u0000\u0000\u008b\u008c\u0005#\u0000\u0000\u008c\u008d\u0005\u0019"+
		"\u0000\u0000\u008d)\u0001\u0000\u0000\u0000\u008e\u0091\u0003,\u0016\u0000"+
		"\u008f\u0091\u0003.\u0017\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0091+\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005\u0015\u0000\u0000\u0093\u0094\u0005\u001c\u0000\u0000\u0094\u0095"+
		"\u0005\u0013\u0000\u0000\u0095\u0096\u0005\u001b\u0000\u0000\u0096\u0097"+
		"\u0005\u0015\u0000\u0000\u0097-\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"\u0015\u0000\u0000\u0099\u009a\u0005\u001c\u0000\u0000\u009a\u009b\u0005"+
		"\u0015\u0000\u0000\u009b/\u0001\u0000\u0000\u0000\u0003;R\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}