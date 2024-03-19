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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ASSIGN=17, 
		DOT=18, COMMA=19, APOS=20, SEMICOLON=21, OPEN_PARAN=22, CLOSED_PARAN=23, 
		FOLDER=24, OPEN=25, NUMBER=26, MINUS=27, ID=28, IMAGE_TYPE=29, WHITESPACE=30, 
		COMMAND_RESULT=31, PIPE=32, IMG=33, FORMAT=34, DEGREES=35, LEVEL=36, X=37, 
		Y=38, W=39, H=40;
	public static final int
		RULE_start = 0, RULE_commandSequence = 1, RULE_command = 2, RULE_crop = 3, 
		RULE_convert = 4, RULE_rotate = 5, RULE_flipX = 6, RULE_flipY = 7, RULE_bw = 8, 
		RULE_resize = 9, RULE_contrast = 10, RULE_brightness = 11, RULE_negative = 12, 
		RULE_colorize = 13, RULE_blur = 14, RULE_sharpen = 15, RULE_compress = 16, 
		RULE_ft = 17, RULE_threshold = 18, RULE_imageArg = 19, RULE_filePath = 20, 
		RULE_folderPath = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "commandSequence", "command", "crop", "convert", "rotate", "flipX", 
			"flipY", "bw", "resize", "contrast", "brightness", "negative", "colorize", 
			"blur", "sharpen", "compress", "ft", "threshold", "imageArg", "filePath", 
			"folderPath"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'crop'", "'convert'", "'rotate'", "'flipX'", "'flipY'", "'bw'", 
			"'resize'", "'contrast'", "'brightness'", "'negative'", "'colorize'", 
			"'blur'", "'sharpen'", "'compress'", "'ft'", "'threshold'", "'='", "'.'", 
			"','", "'\"'", "';'", "'('", "')'", "'[]'", "'open'", null, "'-'", null, 
			null, null, null, "'->'", "'--img='", "'--format='", "'--deg='", "'--lvl='", 
			"'--x='", "'--y='", "'--w='", "'--h='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ASSIGN", "DOT", "COMMA", "APOS", "SEMICOLON", 
			"OPEN_PARAN", "CLOSED_PARAN", "FOLDER", "OPEN", "NUMBER", "MINUS", "ID", 
			"IMAGE_TYPE", "WHITESPACE", "COMMAND_RESULT", "PIPE", "IMG", "FORMAT", 
			"DEGREES", "LEVEL", "X", "Y", "W", "H"
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
	public static class StartContext extends ParserRuleContext {
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
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			commandSequence();
			setState(45);
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
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(ImgParser.PIPE, 0); }
		public CommandSequenceContext commandSequence() {
			return getRuleContext(CommandSequenceContext.class,0);
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
		enterRule(_localctx, 2, RULE_commandSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			command();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(48);
				match(PIPE);
				setState(49);
				commandSequence();
				}
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
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				crop();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				convert();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				rotate();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				flipX();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				flipY();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				bw();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				resize();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				contrast();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 9);
				{
				setState(60);
				brightness();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 10);
				{
				setState(61);
				negative();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 11);
				{
				setState(62);
				colorize();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 12);
				{
				setState(63);
				blur();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 13);
				{
				setState(64);
				sharpen();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 14);
				{
				setState(65);
				compress();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 15);
				{
				setState(66);
				ft();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 16);
				{
				setState(67);
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_crop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__0);
			setState(71);
			match(IMG);
			setState(72);
			imageArg();
			setState(73);
			match(X);
			setState(74);
			match(NUMBER);
			setState(75);
			match(Y);
			setState(76);
			match(NUMBER);
			setState(77);
			match(W);
			setState(78);
			match(NUMBER);
			setState(79);
			match(H);
			setState(80);
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_convert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__1);
			setState(83);
			match(IMG);
			setState(84);
			imageArg();
			setState(85);
			match(FORMAT);
			setState(86);
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_rotate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__2);
			setState(89);
			match(IMG);
			setState(90);
			imageArg();
			setState(91);
			match(DEGREES);
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
	public static class FlipXContext extends ParserRuleContext {
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_flipX);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__3);
			setState(95);
			match(IMG);
			setState(96);
			imageArg();
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_flipY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__4);
			setState(99);
			match(IMG);
			setState(100);
			imageArg();
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_bw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__5);
			setState(103);
			match(IMG);
			setState(104);
			imageArg();
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_resize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__6);
			setState(107);
			match(IMG);
			setState(108);
			imageArg();
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_contrast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__7);
			setState(115);
			match(IMG);
			setState(116);
			imageArg();
			setState(117);
			match(LEVEL);
			setState(118);
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_brightness);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__8);
			setState(121);
			match(IMG);
			setState(122);
			imageArg();
			setState(123);
			match(LEVEL);
			setState(124);
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_negative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__9);
			setState(127);
			match(IMG);
			setState(128);
			imageArg();
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_colorize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__10);
			setState(131);
			match(IMG);
			setState(132);
			imageArg();
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_blur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__11);
			setState(135);
			match(IMG);
			setState(136);
			imageArg();
			setState(137);
			match(LEVEL);
			setState(138);
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_sharpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__12);
			setState(141);
			match(IMG);
			setState(142);
			imageArg();
			setState(143);
			match(LEVEL);
			setState(144);
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_compress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__13);
			setState(147);
			match(IMG);
			setState(148);
			imageArg();
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_ft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__14);
			setState(151);
			match(IMG);
			setState(152);
			imageArg();
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
		public TerminalNode IMG() { return getToken(ImgParser.IMG, 0); }
		public ImageArgContext imageArg() {
			return getRuleContext(ImageArgContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_threshold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__15);
			setState(155);
			match(IMG);
			setState(156);
			imageArg();
			setState(157);
			match(LEVEL);
			setState(158);
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
		public TerminalNode COMMAND_RESULT() { return getToken(ImgParser.COMMAND_RESULT, 0); }
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
		enterRule(_localctx, 38, RULE_imageArg);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				filePath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				folderPath();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(COMMAND_RESULT);
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
		enterRule(_localctx, 40, RULE_filePath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(APOS);
			setState(166);
			match(ID);
			{
			setState(167);
			match(DOT);
			setState(168);
			match(IMAGE_TYPE);
			}
			setState(170);
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
		enterRule(_localctx, 42, RULE_folderPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(APOS);
			setState(173);
			match(ID);
			setState(174);
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
		"\u0004\u0001(\u00b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002E\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00a4\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*\u0000\u0000\u00ac\u0000,\u0001\u0000\u0000\u0000\u0002"+
		"/\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000\u0000\u0006F\u0001"+
		"\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000\nX\u0001\u0000\u0000\u0000"+
		"\f^\u0001\u0000\u0000\u0000\u000eb\u0001\u0000\u0000\u0000\u0010f\u0001"+
		"\u0000\u0000\u0000\u0012j\u0001\u0000\u0000\u0000\u0014r\u0001\u0000\u0000"+
		"\u0000\u0016x\u0001\u0000\u0000\u0000\u0018~\u0001\u0000\u0000\u0000\u001a"+
		"\u0082\u0001\u0000\u0000\u0000\u001c\u0086\u0001\u0000\u0000\u0000\u001e"+
		"\u008c\u0001\u0000\u0000\u0000 \u0092\u0001\u0000\u0000\u0000\"\u0096"+
		"\u0001\u0000\u0000\u0000$\u009a\u0001\u0000\u0000\u0000&\u00a3\u0001\u0000"+
		"\u0000\u0000(\u00a5\u0001\u0000\u0000\u0000*\u00ac\u0001\u0000\u0000\u0000"+
		",-\u0003\u0002\u0001\u0000-.\u0005\u0000\u0000\u0001.\u0001\u0001\u0000"+
		"\u0000\u0000/2\u0003\u0004\u0002\u000001\u0005 \u0000\u000013\u0003\u0002"+
		"\u0001\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0003"+
		"\u0001\u0000\u0000\u00004E\u0003\u0006\u0003\u00005E\u0003\b\u0004\u0000"+
		"6E\u0003\n\u0005\u00007E\u0003\f\u0006\u00008E\u0003\u000e\u0007\u0000"+
		"9E\u0003\u0010\b\u0000:E\u0003\u0012\t\u0000;E\u0003\u0014\n\u0000<E\u0003"+
		"\u0016\u000b\u0000=E\u0003\u0018\f\u0000>E\u0003\u001a\r\u0000?E\u0003"+
		"\u001c\u000e\u0000@E\u0003\u001e\u000f\u0000AE\u0003 \u0010\u0000BE\u0003"+
		"\"\u0011\u0000CE\u0003$\u0012\u0000D4\u0001\u0000\u0000\u0000D5\u0001"+
		"\u0000\u0000\u0000D6\u0001\u0000\u0000\u0000D7\u0001\u0000\u0000\u0000"+
		"D8\u0001\u0000\u0000\u0000D9\u0001\u0000\u0000\u0000D:\u0001\u0000\u0000"+
		"\u0000D;\u0001\u0000\u0000\u0000D<\u0001\u0000\u0000\u0000D=\u0001\u0000"+
		"\u0000\u0000D>\u0001\u0000\u0000\u0000D?\u0001\u0000\u0000\u0000D@\u0001"+
		"\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"DC\u0001\u0000\u0000\u0000E\u0005\u0001\u0000\u0000\u0000FG\u0005\u0001"+
		"\u0000\u0000GH\u0005!\u0000\u0000HI\u0003&\u0013\u0000IJ\u0005%\u0000"+
		"\u0000JK\u0005\u001a\u0000\u0000KL\u0005&\u0000\u0000LM\u0005\u001a\u0000"+
		"\u0000MN\u0005\'\u0000\u0000NO\u0005\u001a\u0000\u0000OP\u0005(\u0000"+
		"\u0000PQ\u0005\u001a\u0000\u0000Q\u0007\u0001\u0000\u0000\u0000RS\u0005"+
		"\u0002\u0000\u0000ST\u0005!\u0000\u0000TU\u0003&\u0013\u0000UV\u0005\""+
		"\u0000\u0000VW\u0005\u001d\u0000\u0000W\t\u0001\u0000\u0000\u0000XY\u0005"+
		"\u0003\u0000\u0000YZ\u0005!\u0000\u0000Z[\u0003&\u0013\u0000[\\\u0005"+
		"#\u0000\u0000\\]\u0005\u001a\u0000\u0000]\u000b\u0001\u0000\u0000\u0000"+
		"^_\u0005\u0004\u0000\u0000_`\u0005!\u0000\u0000`a\u0003&\u0013\u0000a"+
		"\r\u0001\u0000\u0000\u0000bc\u0005\u0005\u0000\u0000cd\u0005!\u0000\u0000"+
		"de\u0003&\u0013\u0000e\u000f\u0001\u0000\u0000\u0000fg\u0005\u0006\u0000"+
		"\u0000gh\u0005!\u0000\u0000hi\u0003&\u0013\u0000i\u0011\u0001\u0000\u0000"+
		"\u0000jk\u0005\u0007\u0000\u0000kl\u0005!\u0000\u0000lm\u0003&\u0013\u0000"+
		"mn\u0005\'\u0000\u0000no\u0005\u001a\u0000\u0000op\u0005(\u0000\u0000"+
		"pq\u0005\u001a\u0000\u0000q\u0013\u0001\u0000\u0000\u0000rs\u0005\b\u0000"+
		"\u0000st\u0005!\u0000\u0000tu\u0003&\u0013\u0000uv\u0005$\u0000\u0000"+
		"vw\u0005\u001a\u0000\u0000w\u0015\u0001\u0000\u0000\u0000xy\u0005\t\u0000"+
		"\u0000yz\u0005!\u0000\u0000z{\u0003&\u0013\u0000{|\u0005$\u0000\u0000"+
		"|}\u0005\u001a\u0000\u0000}\u0017\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"\n\u0000\u0000\u007f\u0080\u0005!\u0000\u0000\u0080\u0081\u0003&\u0013"+
		"\u0000\u0081\u0019\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u000b\u0000"+
		"\u0000\u0083\u0084\u0005!\u0000\u0000\u0084\u0085\u0003&\u0013\u0000\u0085"+
		"\u001b\u0001\u0000\u0000\u0000\u0086\u0087\u0005\f\u0000\u0000\u0087\u0088"+
		"\u0005!\u0000\u0000\u0088\u0089\u0003&\u0013\u0000\u0089\u008a\u0005$"+
		"\u0000\u0000\u008a\u008b\u0005\u001a\u0000\u0000\u008b\u001d\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\r\u0000\u0000\u008d\u008e\u0005!\u0000"+
		"\u0000\u008e\u008f\u0003&\u0013\u0000\u008f\u0090\u0005$\u0000\u0000\u0090"+
		"\u0091\u0005\u001a\u0000\u0000\u0091\u001f\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005\u000e\u0000\u0000\u0093\u0094\u0005!\u0000\u0000\u0094\u0095"+
		"\u0003&\u0013\u0000\u0095!\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u000f"+
		"\u0000\u0000\u0097\u0098\u0005!\u0000\u0000\u0098\u0099\u0003&\u0013\u0000"+
		"\u0099#\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0010\u0000\u0000\u009b"+
		"\u009c\u0005!\u0000\u0000\u009c\u009d\u0003&\u0013\u0000\u009d\u009e\u0005"+
		"$\u0000\u0000\u009e\u009f\u0005\u001a\u0000\u0000\u009f%\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a4\u0003(\u0014\u0000\u00a1\u00a4\u0003*\u0015\u0000\u00a2"+
		"\u00a4\u0005\u001f\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\'\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0014\u0000\u0000\u00a6\u00a7"+
		"\u0005\u001c\u0000\u0000\u00a7\u00a8\u0005\u0012\u0000\u0000\u00a8\u00a9"+
		"\u0005\u001d\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0014\u0000\u0000\u00ab)\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0014\u0000\u0000\u00ad\u00ae\u0005\u001c\u0000\u0000\u00ae\u00af\u0005"+
		"\u0014\u0000\u0000\u00af+\u0001\u0000\u0000\u0000\u00032D\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}