// Generated from MLting.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MLtingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, STRING_CONSTANT=29, Inum=30, Fnum=31, 
		Dnum=32, ID=33, WS=34;
	public static final int
		RULE_prog = 0, RULE_stmts = 1, RULE_block = 2, RULE_stmt = 3, RULE_print = 4, 
		RULE_intdcl = 5, RULE_doubledcl = 6, RULE_floatdcl = 7, RULE_numassign = 8, 
		RULE_numupdate = 9, RULE_boolassign = 10, RULE_boolupdate = 11, RULE_booldcl = 12, 
		RULE_boolval = 13, RULE_numexpr = 14, RULE_bexpr = 15, RULE_sqrt = 16, 
		RULE_power = 17, RULE_mod = 18, RULE_unaryoperator = 19, RULE_iterative = 20, 
		RULE_forstmt = 21, RULE_val = 22, RULE_id = 23, RULE_num = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "block", "stmt", "print", "intdcl", "doubledcl", "floatdcl", 
			"numassign", "numupdate", "boolassign", "boolupdate", "booldcl", "boolval", 
			"numexpr", "bexpr", "sqrt", "power", "mod", "unaryoperator", "iterative", 
			"forstmt", "val", "id", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'p'", "'int'", "'='", "'double'", "'float'", 
			"'bool'", "'true'", "'false'", "'('", "')'", "'*'", "'/'", "'+'", "'-'", 
			"'>'", "'<'", "'!'", "'AND'", "'OR'", "'sqrt'", "'**'", "'%'", "'++'", 
			"'--'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "STRING_CONSTANT", "Inum", "Fnum", "Dnum", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "MLting.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MLtingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MLtingParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			stmts();
			setState(51);
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

	public static class StmtsContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__27) | (1L << ID))) != 0)) {
				{
				setState(53);
				stmt();
				setState(54);
				stmts();
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

	public static class BlockContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			stmts();
			setState(60);
			match(T__1);
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

	public static class StmtContext extends ParserRuleContext {
		public NumassignContext numassign() {
			return getRuleContext(NumassignContext.class,0);
		}
		public BoolassignContext boolassign() {
			return getRuleContext(BoolassignContext.class,0);
		}
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public IterativeContext iterative() {
			return getRuleContext(IterativeContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__6:
			case T__7:
			case T__8:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(62);
					numassign();
					}
					break;
				case 2:
					{
					setState(63);
					boolassign();
					}
					break;
				case 3:
					{
					setState(64);
					unaryoperator();
					}
					break;
				}
				setState(67);
				match(T__2);
				}
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(69);
				iterative();
				}
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode STRING_CONSTANT() { return getToken(MLtingParser.STRING_CONSTANT, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__3);
			setState(73);
			match(STRING_CONSTANT);
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

	public static class IntdclContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumexprContext numexpr() {
			return getRuleContext(NumexprContext.class,0);
		}
		public IntdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterIntdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitIntdcl(this);
		}
	}

	public final IntdclContext intdcl() throws RecognitionException {
		IntdclContext _localctx = new IntdclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intdcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__4);
			setState(76);
			id();
			setState(77);
			match(T__5);
			setState(78);
			numexpr(0);
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

	public static class DoubledclContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumexprContext numexpr() {
			return getRuleContext(NumexprContext.class,0);
		}
		public DoubledclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubledcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterDoubledcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitDoubledcl(this);
		}
	}

	public final DoubledclContext doubledcl() throws RecognitionException {
		DoubledclContext _localctx = new DoubledclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_doubledcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__6);
			setState(81);
			id();
			setState(82);
			match(T__5);
			setState(83);
			numexpr(0);
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

	public static class FloatdclContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumexprContext numexpr() {
			return getRuleContext(NumexprContext.class,0);
		}
		public FloatdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterFloatdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitFloatdcl(this);
		}
	}

	public final FloatdclContext floatdcl() throws RecognitionException {
		FloatdclContext _localctx = new FloatdclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floatdcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__7);
			setState(86);
			id();
			setState(87);
			match(T__5);
			setState(88);
			numexpr(0);
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

	public static class NumassignContext extends ParserRuleContext {
		public IntdclContext intdcl() {
			return getRuleContext(IntdclContext.class,0);
		}
		public DoubledclContext doubledcl() {
			return getRuleContext(DoubledclContext.class,0);
		}
		public FloatdclContext floatdcl() {
			return getRuleContext(FloatdclContext.class,0);
		}
		public NumupdateContext numupdate() {
			return getRuleContext(NumupdateContext.class,0);
		}
		public NumassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterNumassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitNumassign(this);
		}
	}

	public final NumassignContext numassign() throws RecognitionException {
		NumassignContext _localctx = new NumassignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numassign);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				intdcl();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				doubledcl();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				floatdcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				numupdate();
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

	public static class NumupdateContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumexprContext numexpr() {
			return getRuleContext(NumexprContext.class,0);
		}
		public NumupdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numupdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterNumupdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitNumupdate(this);
		}
	}

	public final NumupdateContext numupdate() throws RecognitionException {
		NumupdateContext _localctx = new NumupdateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numupdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			id();
			setState(97);
			match(T__5);
			setState(98);
			numexpr(0);
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

	public static class BoolassignContext extends ParserRuleContext {
		public BooldclContext booldcl() {
			return getRuleContext(BooldclContext.class,0);
		}
		public BoolupdateContext boolupdate() {
			return getRuleContext(BoolupdateContext.class,0);
		}
		public BoolassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterBoolassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitBoolassign(this);
		}
	}

	public final BoolassignContext boolassign() throws RecognitionException {
		BoolassignContext _localctx = new BoolassignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolassign);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				booldcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				boolupdate();
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

	public static class BoolupdateContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BoolvalContext boolval() {
			return getRuleContext(BoolvalContext.class,0);
		}
		public BoolupdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolupdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterBoolupdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitBoolupdate(this);
		}
	}

	public final BoolupdateContext boolupdate() throws RecognitionException {
		BoolupdateContext _localctx = new BoolupdateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolupdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			id();
			setState(105);
			match(T__5);
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__16:
			case T__19:
			case T__22:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(106);
				bexpr(0);
				}
				break;
			case T__9:
			case T__10:
				{
				setState(107);
				boolval();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BooldclContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BoolvalContext boolval() {
			return getRuleContext(BoolvalContext.class,0);
		}
		public BooldclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booldcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterBooldcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitBooldcl(this);
		}
	}

	public final BooldclContext booldcl() throws RecognitionException {
		BooldclContext _localctx = new BooldclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_booldcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__8);
			setState(111);
			id();
			setState(112);
			match(T__5);
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__16:
			case T__19:
			case T__22:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(113);
				bexpr(0);
				}
				break;
			case T__9:
			case T__10:
				{
				setState(114);
				boolval();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BoolvalContext extends ParserRuleContext {
		public BoolvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterBoolval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitBoolval(this);
		}
	}

	public final BoolvalContext boolval() throws RecognitionException {
		BoolvalContext _localctx = new BoolvalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NumexprContext extends ParserRuleContext {
		public List<NumexprContext> numexpr() {
			return getRuleContexts(NumexprContext.class);
		}
		public NumexprContext numexpr(int i) {
			return getRuleContext(NumexprContext.class,i);
		}
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public NumexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterNumexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitNumexpr(this);
		}
	}

	public final NumexprContext numexpr() throws RecognitionException {
		return numexpr(0);
	}

	private NumexprContext numexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumexprContext _localctx = new NumexprContext(_ctx, _parentState);
		NumexprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_numexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(120);
				match(T__11);
				setState(121);
				numexpr(0);
				setState(122);
				match(T__12);
				}
				break;
			case T__22:
				{
				setState(124);
				sqrt();
				setState(125);
				numexpr(5);
				}
				break;
			case T__16:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(127);
				val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(130);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(133);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__24:
							{
							setState(131);
							mod();
							}
							break;
						case T__23:
							{
							setState(132);
							power();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(135);
						numexpr(5);
						}
						break;
					case 2:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(137);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(138);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(139);
						numexpr(4);
						}
						break;
					case 3:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(140);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(141);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(142);
						numexpr(3);
						}
						break;
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BexprContext extends ParserRuleContext {
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public NumexprContext numexpr() {
			return getRuleContext(NumexprContext.class,0);
		}
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterBexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitBexpr(this);
		}
	}

	public final BexprContext bexpr() throws RecognitionException {
		return bexpr(0);
	}

	private BexprContext bexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexprContext _localctx = new BexprContext(_ctx, _parentState);
		BexprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_bexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(149);
				match(T__19);
				setState(150);
				match(T__11);
				setState(151);
				bexpr(0);
				setState(152);
				match(T__12);
				}
				break;
			case 2:
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(154);
					match(T__19);
					}
				}

				setState(157);
				numexpr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(160);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(161);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__5) {
							{
							setState(162);
							match(T__5);
							}
						}

						setState(165);
						bexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(166);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(167);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(168);
						match(T__5);
						setState(169);
						bexpr(5);
						}
						break;
					case 3:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						bexpr(4);
						}
						break;
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SqrtContext extends ParserRuleContext {
		public SqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitSqrt(this);
		}
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__22);
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

	public static class PowerContext extends ParserRuleContext {
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__23);
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

	public static class ModContext extends ParserRuleContext {
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitMod(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__24);
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

	public static class UnaryoperatorContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterUnaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitUnaryoperator(this);
		}
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryoperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(184);
				id();
				setState(185);
				match(T__25);
				}
				break;
			case 2:
				{
				setState(187);
				id();
				setState(188);
				match(T__26);
				}
				break;
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

	public static class IterativeContext extends ParserRuleContext {
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public IterativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterIterative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitIterative(this);
		}
	}

	public final IterativeContext iterative() throws RecognitionException {
		IterativeContext _localctx = new IterativeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_iterative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			forstmt();
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

	public static class ForstmtContext extends ParserRuleContext {
		public IntdclContext intdcl() {
			return getRuleContext(IntdclContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitForstmt(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__27);
			setState(195);
			match(T__11);
			setState(196);
			intdcl();
			setState(197);
			match(T__2);
			setState(198);
			bexpr(0);
			setState(199);
			match(T__2);
			setState(200);
			unaryoperator();
			setState(201);
			match(T__12);
			setState(202);
			block();
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

	public static class ValContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_val);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				id();
				}
				break;
			case T__16:
			case Inum:
			case Fnum:
			case Dnum:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(205);
					match(T__16);
					}
				}

				setState(208);
				num();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MLtingParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ID);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode Inum() { return getToken(MLtingParser.Inum, 0); }
		public TerminalNode Fnum() { return getToken(MLtingParser.Fnum, 0); }
		public TerminalNode Dnum() { return getToken(MLtingParser.Dnum, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Inum) | (1L << Fnum) | (1L << Dnum))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return numexpr_sempred((NumexprContext)_localctx, predIndex);
		case 15:
			return bexpr_sempred((BexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean numexpr_sempred(NumexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bexpr_sempred(BexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\5\5D\n\5\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\na\n\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\5\fi\n\f\3\r\3\r\3\r\3\r\5\ro\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\5\16v\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0083\n\20\3\20\3\20\3\20\5\20\u0088\n\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u0092\n\20\f\20\16\20\u0095\13\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u009e\n\21\3\21\5\21\u00a1\n\21\3\21"+
		"\3\21\3\21\5\21\u00a6\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00b0\n\21\f\21\16\21\u00b3\13\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00c1\n\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00d1\n\30\3\30\5\30\u00d4"+
		"\n\30\3\31\3\31\3\32\3\32\3\32\2\4\36 \33\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\2\t\3\2\f\r\3\2\20\21\3\2\22\23\3\2\24\25\4\2"+
		"\b\b\26\26\3\2\27\30\3\2 \"\2\u00d9\2\64\3\2\2\2\4:\3\2\2\2\6<\3\2\2\2"+
		"\bH\3\2\2\2\nJ\3\2\2\2\fM\3\2\2\2\16R\3\2\2\2\20W\3\2\2\2\22`\3\2\2\2"+
		"\24b\3\2\2\2\26h\3\2\2\2\30j\3\2\2\2\32p\3\2\2\2\34w\3\2\2\2\36\u0082"+
		"\3\2\2\2 \u00a0\3\2\2\2\"\u00b4\3\2\2\2$\u00b6\3\2\2\2&\u00b8\3\2\2\2"+
		"(\u00c0\3\2\2\2*\u00c2\3\2\2\2,\u00c4\3\2\2\2.\u00d3\3\2\2\2\60\u00d5"+
		"\3\2\2\2\62\u00d7\3\2\2\2\64\65\5\4\3\2\65\66\7\2\2\3\66\3\3\2\2\2\67"+
		"8\5\b\5\289\5\4\3\29;\3\2\2\2:\67\3\2\2\2:;\3\2\2\2;\5\3\2\2\2<=\7\3\2"+
		"\2=>\5\4\3\2>?\7\4\2\2?\7\3\2\2\2@D\5\22\n\2AD\5\26\f\2BD\5(\25\2C@\3"+
		"\2\2\2CA\3\2\2\2CB\3\2\2\2DE\3\2\2\2EF\7\5\2\2FI\3\2\2\2GI\5*\26\2HC\3"+
		"\2\2\2HG\3\2\2\2I\t\3\2\2\2JK\7\6\2\2KL\7\37\2\2L\13\3\2\2\2MN\7\7\2\2"+
		"NO\5\60\31\2OP\7\b\2\2PQ\5\36\20\2Q\r\3\2\2\2RS\7\t\2\2ST\5\60\31\2TU"+
		"\7\b\2\2UV\5\36\20\2V\17\3\2\2\2WX\7\n\2\2XY\5\60\31\2YZ\7\b\2\2Z[\5\36"+
		"\20\2[\21\3\2\2\2\\a\5\f\7\2]a\5\16\b\2^a\5\20\t\2_a\5\24\13\2`\\\3\2"+
		"\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\23\3\2\2\2bc\5\60\31\2cd\7\b\2\2d"+
		"e\5\36\20\2e\25\3\2\2\2fi\5\32\16\2gi\5\30\r\2hf\3\2\2\2hg\3\2\2\2i\27"+
		"\3\2\2\2jk\5\60\31\2kn\7\b\2\2lo\5 \21\2mo\5\34\17\2nl\3\2\2\2nm\3\2\2"+
		"\2o\31\3\2\2\2pq\7\13\2\2qr\5\60\31\2ru\7\b\2\2sv\5 \21\2tv\5\34\17\2"+
		"us\3\2\2\2ut\3\2\2\2v\33\3\2\2\2wx\t\2\2\2x\35\3\2\2\2yz\b\20\1\2z{\7"+
		"\16\2\2{|\5\36\20\2|}\7\17\2\2}\u0083\3\2\2\2~\177\5\"\22\2\177\u0080"+
		"\5\36\20\7\u0080\u0083\3\2\2\2\u0081\u0083\5.\30\2\u0082y\3\2\2\2\u0082"+
		"~\3\2\2\2\u0082\u0081\3\2\2\2\u0083\u0093\3\2\2\2\u0084\u0087\f\6\2\2"+
		"\u0085\u0088\5&\24\2\u0086\u0088\5$\23\2\u0087\u0085\3\2\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\5\36\20\7\u008a\u0092\3\2\2\2"+
		"\u008b\u008c\f\5\2\2\u008c\u008d\t\3\2\2\u008d\u0092\5\36\20\6\u008e\u008f"+
		"\f\4\2\2\u008f\u0090\t\4\2\2\u0090\u0092\5\36\20\5\u0091\u0084\3\2\2\2"+
		"\u0091\u008b\3\2\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\37\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0097\b\21\1\2\u0097\u0098\7\26\2\2\u0098\u0099\7\16\2\2\u0099\u009a"+
		"\5 \21\2\u009a\u009b\7\17\2\2\u009b\u00a1\3\2\2\2\u009c\u009e\7\26\2\2"+
		"\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1"+
		"\5\36\20\2\u00a0\u0096\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\u00b1\3\2\2\2"+
		"\u00a2\u00a3\f\7\2\2\u00a3\u00a5\t\5\2\2\u00a4\u00a6\7\b\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00b0\5 \21\b\u00a8"+
		"\u00a9\f\6\2\2\u00a9\u00aa\t\6\2\2\u00aa\u00ab\7\b\2\2\u00ab\u00b0\5 "+
		"\21\7\u00ac\u00ad\f\5\2\2\u00ad\u00ae\t\7\2\2\u00ae\u00b0\5 \21\6\u00af"+
		"\u00a2\3\2\2\2\u00af\u00a8\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2!\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b5\7\31\2\2\u00b5#\3\2\2\2\u00b6\u00b7\7\32\2\2\u00b7"+
		"%\3\2\2\2\u00b8\u00b9\7\33\2\2\u00b9\'\3\2\2\2\u00ba\u00bb\5\60\31\2\u00bb"+
		"\u00bc\7\34\2\2\u00bc\u00c1\3\2\2\2\u00bd\u00be\5\60\31\2\u00be\u00bf"+
		"\7\35\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bd\3\2\2\2"+
		"\u00c1)\3\2\2\2\u00c2\u00c3\5,\27\2\u00c3+\3\2\2\2\u00c4\u00c5\7\36\2"+
		"\2\u00c5\u00c6\7\16\2\2\u00c6\u00c7\5\f\7\2\u00c7\u00c8\7\5\2\2\u00c8"+
		"\u00c9\5 \21\2\u00c9\u00ca\7\5\2\2\u00ca\u00cb\5(\25\2\u00cb\u00cc\7\17"+
		"\2\2\u00cc\u00cd\5\6\4\2\u00cd-\3\2\2\2\u00ce\u00d4\5\60\31\2\u00cf\u00d1"+
		"\7\23\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d4\5\62\32\2\u00d3\u00ce\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4/"+
		"\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6\61\3\2\2\2\u00d7\u00d8\t\b\2\2\u00d8"+
		"\63\3\2\2\2\25:CH`hnu\u0082\u0087\u0091\u0093\u009d\u00a0\u00a5\u00af"+
		"\u00b1\u00c0\u00d0\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}