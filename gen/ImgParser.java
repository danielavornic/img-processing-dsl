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
		T__9=10, ASSIGN=11, DOT=12, COMMA=13, APOS=14, SEMICOLON=15, OPEN_PARAN=16, 
		CLOSED_PARAN=17, FOLDER=18, OPEN=19, NUMBER=20, MINUS=21, ID=22, IMAGE_TYPE=23, 
		WHITESPACE=24, IMG=25, FORMAT=26, DEGREES=27, LEVEL=28, X=29, Y=30, W=31, 
		H=32;
	public static final int
		RULE_start = 0, RULE_commandSequence = 1, RULE_command = 2, RULE_crop = 3, 
		RULE_convert = 4, RULE_rotate = 5, RULE_flipX = 6, RULE_flipY = 7, RULE_bw = 8, 
		RULE_resize = 9, RULE_contrast = 10, RULE_brightness = 11, RULE_negative = 12, 
		RULE_imageArg = 13, RULE_filePath = 14, RULE_folderPath = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "commandSequence", "command", "crop", "convert", "rotate", "flipX", 
			"flipY", "bw", "resize", "contrast", "brightness", "negative", "imageArg", 
			"filePath", "folderPath"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'crop'", "'convert'", "'rotate'", "'flipX'", "'flipY'", "'bw'", 
			"'resize'", "'contrast'", "'brightness'", "'negative'", "'='", "'.'", 
			"','", "'\"'", "';'", "'('", "')'", "'[]'", "'open'", null, "'-'", null, 
			null, null, "'--img='", "'--format='", "'--degrees='", "'--level='", 
			"'--x='", "'--y='", "'--w='", "'--h='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ASSIGN", 
			"DOT", "COMMA", "APOS", "SEMICOLON", "OPEN_PARAN", "CLOSED_PARAN", "FOLDER", 
			"OPEN", "NUMBER", "MINUS", "ID", "IMAGE_TYPE", "WHITESPACE", "IMG", "FORMAT", 
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
			setState(32);
			commandSequence();
			setState(33);
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
		public TerminalNode SEMICOLON() { return getToken(ImgParser.SEMICOLON, 0); }
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
			setState(35);
			command();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(36);
				match(SEMICOLON);
				setState(37);
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				crop();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				convert();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				rotate();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				flipX();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				flipY();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				bw();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				resize();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				contrast();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 9);
				{
				setState(48);
				brightness();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 10);
				{
				setState(49);
				negative();
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
			setState(52);
			match(T__0);
			setState(53);
			match(IMG);
			setState(54);
			imageArg();
			setState(55);
			match(X);
			setState(56);
			match(NUMBER);
			setState(57);
			match(Y);
			setState(58);
			match(NUMBER);
			setState(59);
			match(W);
			setState(60);
			match(NUMBER);
			setState(61);
			match(H);
			setState(62);
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
			setState(64);
			match(T__1);
			setState(65);
			match(IMG);
			setState(66);
			imageArg();
			setState(67);
			match(FORMAT);
			setState(68);
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
			setState(70);
			match(T__2);
			setState(71);
			match(IMG);
			setState(72);
			imageArg();
			setState(73);
			match(DEGREES);
			setState(74);
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
			setState(76);
			match(T__3);
			setState(77);
			match(IMG);
			setState(78);
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
			setState(80);
			match(T__4);
			setState(81);
			match(IMG);
			setState(82);
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
			setState(84);
			match(T__5);
			setState(85);
			match(IMG);
			setState(86);
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
			setState(88);
			match(T__6);
			setState(89);
			match(IMG);
			setState(90);
			imageArg();
			setState(91);
			match(W);
			setState(92);
			match(NUMBER);
			setState(93);
			match(H);
			setState(94);
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
			setState(96);
			match(T__7);
			setState(97);
			match(IMG);
			setState(98);
			imageArg();
			setState(99);
			match(LEVEL);
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
			setState(102);
			match(T__8);
			setState(103);
			match(IMG);
			setState(104);
			imageArg();
			setState(105);
			match(LEVEL);
			setState(106);
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
			setState(108);
			match(T__9);
			setState(109);
			match(IMG);
			setState(110);
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
		enterRule(_localctx, 26, RULE_imageArg);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				filePath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
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
		enterRule(_localctx, 28, RULE_filePath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(APOS);
			setState(117);
			match(ID);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(118);
				match(DOT);
				setState(119);
				match(IMAGE_TYPE);
				}
			}

			setState(122);
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
		enterRule(_localctx, 30, RULE_folderPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(APOS);
			setState(125);
			match(ID);
			setState(126);
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
		"\u0004\u0001 \u0081\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\'\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00023\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0003\rs\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000ey\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e\u0000\u0000|\u0000 \u0001\u0000\u0000\u0000\u0002#\u0001"+
		"\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000"+
		"\u0000\b@\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000\fL\u0001"+
		"\u0000\u0000\u0000\u000eP\u0001\u0000\u0000\u0000\u0010T\u0001\u0000\u0000"+
		"\u0000\u0012X\u0001\u0000\u0000\u0000\u0014`\u0001\u0000\u0000\u0000\u0016"+
		"f\u0001\u0000\u0000\u0000\u0018l\u0001\u0000\u0000\u0000\u001ar\u0001"+
		"\u0000\u0000\u0000\u001ct\u0001\u0000\u0000\u0000\u001e|\u0001\u0000\u0000"+
		"\u0000 !\u0003\u0002\u0001\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001"+
		"\u0000\u0000\u0000#&\u0003\u0004\u0002\u0000$%\u0005\u000f\u0000\u0000"+
		"%\'\u0003\u0002\u0001\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\'\u0003\u0001\u0000\u0000\u0000(3\u0003\u0006\u0003\u0000)3\u0003"+
		"\b\u0004\u0000*3\u0003\n\u0005\u0000+3\u0003\f\u0006\u0000,3\u0003\u000e"+
		"\u0007\u0000-3\u0003\u0010\b\u0000.3\u0003\u0012\t\u0000/3\u0003\u0014"+
		"\n\u000003\u0003\u0016\u000b\u000013\u0003\u0018\f\u00002(\u0001\u0000"+
		"\u0000\u00002)\u0001\u0000\u0000\u00002*\u0001\u0000\u0000\u00002+\u0001"+
		"\u0000\u0000\u00002,\u0001\u0000\u0000\u00002-\u0001\u0000\u0000\u0000"+
		"2.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000021\u0001\u0000\u0000\u00003\u0005\u0001\u0000\u0000\u000045\u0005"+
		"\u0001\u0000\u000056\u0005\u0019\u0000\u000067\u0003\u001a\r\u000078\u0005"+
		"\u001d\u0000\u000089\u0005\u0014\u0000\u00009:\u0005\u001e\u0000\u0000"+
		":;\u0005\u0014\u0000\u0000;<\u0005\u001f\u0000\u0000<=\u0005\u0014\u0000"+
		"\u0000=>\u0005 \u0000\u0000>?\u0005\u0014\u0000\u0000?\u0007\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0002\u0000\u0000AB\u0005\u0019\u0000\u0000BC\u0003"+
		"\u001a\r\u0000CD\u0005\u001a\u0000\u0000DE\u0005\u0017\u0000\u0000E\t"+
		"\u0001\u0000\u0000\u0000FG\u0005\u0003\u0000\u0000GH\u0005\u0019\u0000"+
		"\u0000HI\u0003\u001a\r\u0000IJ\u0005\u001b\u0000\u0000JK\u0005\u0014\u0000"+
		"\u0000K\u000b\u0001\u0000\u0000\u0000LM\u0005\u0004\u0000\u0000MN\u0005"+
		"\u0019\u0000\u0000NO\u0003\u001a\r\u0000O\r\u0001\u0000\u0000\u0000PQ"+
		"\u0005\u0005\u0000\u0000QR\u0005\u0019\u0000\u0000RS\u0003\u001a\r\u0000"+
		"S\u000f\u0001\u0000\u0000\u0000TU\u0005\u0006\u0000\u0000UV\u0005\u0019"+
		"\u0000\u0000VW\u0003\u001a\r\u0000W\u0011\u0001\u0000\u0000\u0000XY\u0005"+
		"\u0007\u0000\u0000YZ\u0005\u0019\u0000\u0000Z[\u0003\u001a\r\u0000[\\"+
		"\u0005\u001f\u0000\u0000\\]\u0005\u0014\u0000\u0000]^\u0005 \u0000\u0000"+
		"^_\u0005\u0014\u0000\u0000_\u0013\u0001\u0000\u0000\u0000`a\u0005\b\u0000"+
		"\u0000ab\u0005\u0019\u0000\u0000bc\u0003\u001a\r\u0000cd\u0005\u001c\u0000"+
		"\u0000de\u0005\u0014\u0000\u0000e\u0015\u0001\u0000\u0000\u0000fg\u0005"+
		"\t\u0000\u0000gh\u0005\u0019\u0000\u0000hi\u0003\u001a\r\u0000ij\u0005"+
		"\u001c\u0000\u0000jk\u0005\u0014\u0000\u0000k\u0017\u0001\u0000\u0000"+
		"\u0000lm\u0005\n\u0000\u0000mn\u0005\u0019\u0000\u0000no\u0003\u001a\r"+
		"\u0000o\u0019\u0001\u0000\u0000\u0000ps\u0003\u001c\u000e\u0000qs\u0003"+
		"\u001e\u000f\u0000rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"s\u001b\u0001\u0000\u0000\u0000tu\u0005\u000e\u0000\u0000ux\u0005\u0016"+
		"\u0000\u0000vw\u0005\f\u0000\u0000wy\u0005\u0017\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005"+
		"\u000e\u0000\u0000{\u001d\u0001\u0000\u0000\u0000|}\u0005\u000e\u0000"+
		"\u0000}~\u0005\u0016\u0000\u0000~\u007f\u0005\u000e\u0000\u0000\u007f"+
		"\u001f\u0001\u0000\u0000\u0000\u0004&2rx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}