// Generated from c:\Users\noobs\Documents\Github\P4-Emotional-Damage\NewRealGrammar\MLting.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, STRING_CONSTANT=35, Inum=36, Fnum=37, Dnum=38, 
		ID=39, WS=40;
	public static final int
		RULE_prog = 0, RULE_stmts = 1, RULE_block = 2, RULE_stmt = 3, RULE_print = 4, 
		RULE_intdcl = 5, RULE_doubledcl = 6, RULE_floatdcl = 7, RULE_intarrdcl = 8, 
		RULE_doublearrdcl = 9, RULE_floatarrdcl = 10, RULE_arrupdate = 11, RULE_arrassign = 12, 
		RULE_numassign = 13, RULE_numupdate = 14, RULE_boolassign = 15, RULE_boolupdate = 16, 
		RULE_booldcl = 17, RULE_boolval = 18, RULE_selective = 19, RULE_ifstmt = 20, 
		RULE_elifstmt = 21, RULE_elsestmt = 22, RULE_iterative = 23, RULE_forstmt = 24, 
		RULE_whilestmt = 25, RULE_numexpr = 26, RULE_bexpr = 27, RULE_sqrt = 28, 
		RULE_power = 29, RULE_mod = 30, RULE_unaryoperator = 31, RULE_val = 32, 
		RULE_id = 33, RULE_num = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "block", "stmt", "print", "intdcl", "doubledcl", "floatdcl", 
			"intarrdcl", "doublearrdcl", "floatarrdcl", "arrupdate", "arrassign", 
			"numassign", "numupdate", "boolassign", "boolupdate", "booldcl", "boolval", 
			"selective", "ifstmt", "elifstmt", "elsestmt", "iterative", "forstmt", 
			"whilestmt", "numexpr", "bexpr", "sqrt", "power", "mod", "unaryoperator", 
			"val", "id", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'print'", "'('", "')'", "'int'", "'='", "'double'", 
			"'float'", "'['", "']'", "'bool'", "'true'", "'false'", "'if'", "'elif'", 
			"'else'", "'for'", "'while'", "'*'", "'/'", "'+'", "'-'", "'>'", "'<'", 
			"'!'", "'AND'", "'OR'", "'sqrt'", "'**'", "'%'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "STRING_CONSTANT", 
			"Inum", "Fnum", "Dnum", "ID", "WS"
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			stmts();
			setState(71);
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
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__26) | (1L << T__29) | (1L << Inum) | (1L << Fnum) | (1L << Dnum) | (1L << ID))) != 0)) {
				{
				setState(73);
				stmt();
				setState(74);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			stmts();
			setState(80);
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
		public ArrassignContext arrassign() {
			return getRuleContext(ArrassignContext.class,0);
		}
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IterativeContext iterative() {
			return getRuleContext(IterativeContext.class,0);
		}
		public SelectiveContext selective() {
			return getRuleContext(SelectiveContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__6:
			case T__8:
			case T__9:
			case T__12:
			case T__23:
			case T__26:
			case T__29:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(82);
					numassign();
					}
					break;
				case 2:
					{
					setState(83);
					boolassign();
					}
					break;
				case 3:
					{
					setState(84);
					arrassign();
					}
					break;
				case 4:
					{
					setState(85);
					unaryoperator();
					}
					break;
				case 5:
					{
					setState(86);
					print();
					}
					break;
				}
				setState(89);
				match(T__2);
				}
				}
				break;
			case T__15:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
				case T__19:
					{
					setState(91);
					iterative();
					}
					break;
				case T__15:
					{
					setState(92);
					selective();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__3);
				setState(98);
				match(T__4);
				setState(99);
				match(STRING_CONSTANT);
				}
				break;
			case T__4:
			case T__23:
			case T__26:
			case T__29:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				bexpr(0);
				setState(101);
				match(T__5);
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
	}

	public final IntdclContext intdcl() throws RecognitionException {
		IntdclContext _localctx = new IntdclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intdcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__6);
			setState(106);
			id();
			setState(107);
			match(T__7);
			setState(108);
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
	}

	public final DoubledclContext doubledcl() throws RecognitionException {
		DoubledclContext _localctx = new DoubledclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_doubledcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__8);
			setState(111);
			id();
			setState(112);
			match(T__7);
			setState(113);
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
	}

	public final FloatdclContext floatdcl() throws RecognitionException {
		FloatdclContext _localctx = new FloatdclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floatdcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__9);
			setState(116);
			id();
			setState(117);
			match(T__7);
			setState(118);
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

	public static class IntarrdclContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IntarrdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intarrdcl; }
	}

	public final IntarrdclContext intarrdcl() throws RecognitionException {
		IntarrdclContext _localctx = new IntarrdclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_intarrdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__6);
			setState(121);
			match(T__10);
			setState(122);
			val();
			setState(123);
			match(T__11);
			setState(124);
			id();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(125);
				match(T__7);
				setState(126);
				val();
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

	public static class DoublearrdclContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DoublearrdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doublearrdcl; }
	}

	public final DoublearrdclContext doublearrdcl() throws RecognitionException {
		DoublearrdclContext _localctx = new DoublearrdclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_doublearrdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__8);
			setState(130);
			match(T__10);
			setState(131);
			val();
			setState(132);
			match(T__11);
			setState(133);
			id();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(134);
				match(T__7);
				setState(135);
				val();
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

	public static class FloatarrdclContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FloatarrdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatarrdcl; }
	}

	public final FloatarrdclContext floatarrdcl() throws RecognitionException {
		FloatarrdclContext _localctx = new FloatarrdclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_floatarrdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__9);
			setState(139);
			match(T__10);
			setState(140);
			val();
			setState(141);
			match(T__11);
			setState(142);
			id();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(143);
				match(T__7);
				setState(144);
				val();
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

	public static class ArrupdateContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public NumexprContext numexpr() {
			return getRuleContext(NumexprContext.class,0);
		}
		public ArrupdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrupdate; }
	}

	public final ArrupdateContext arrupdate() throws RecognitionException {
		ArrupdateContext _localctx = new ArrupdateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrupdate);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				id();
				setState(148);
				match(T__7);
				setState(149);
				val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				id();
				setState(152);
				match(T__10);
				setState(153);
				val();
				setState(154);
				match(T__11);
				setState(155);
				match(T__7);
				setState(156);
				numexpr(0);
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

	public static class ArrassignContext extends ParserRuleContext {
		public IntarrdclContext intarrdcl() {
			return getRuleContext(IntarrdclContext.class,0);
		}
		public FloatarrdclContext floatarrdcl() {
			return getRuleContext(FloatarrdclContext.class,0);
		}
		public DoublearrdclContext doublearrdcl() {
			return getRuleContext(DoublearrdclContext.class,0);
		}
		public ArrupdateContext arrupdate() {
			return getRuleContext(ArrupdateContext.class,0);
		}
		public ArrassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrassign; }
	}

	public final ArrassignContext arrassign() throws RecognitionException {
		ArrassignContext _localctx = new ArrassignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrassign);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				intarrdcl();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				floatarrdcl();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				doublearrdcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				arrupdate();
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
	}

	public final NumassignContext numassign() throws RecognitionException {
		NumassignContext _localctx = new NumassignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numassign);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				intdcl();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				doubledcl();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				floatdcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
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
	}

	public final NumupdateContext numupdate() throws RecognitionException {
		NumupdateContext _localctx = new NumupdateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numupdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			id();
			setState(173);
			match(T__7);
			setState(174);
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
	}

	public final BoolassignContext boolassign() throws RecognitionException {
		BoolassignContext _localctx = new BoolassignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolassign);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				booldcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
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
	}

	public final BoolupdateContext boolupdate() throws RecognitionException {
		BoolupdateContext _localctx = new BoolupdateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolupdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			id();
			setState(181);
			match(T__7);
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__23:
			case T__26:
			case T__29:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(182);
				bexpr(0);
				}
				break;
			case T__13:
			case T__14:
				{
				setState(183);
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
	}

	public final BooldclContext booldcl() throws RecognitionException {
		BooldclContext _localctx = new BooldclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_booldcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__12);
			setState(187);
			id();
			setState(188);
			match(T__7);
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__23:
			case T__26:
			case T__29:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(189);
				bexpr(0);
				}
				break;
			case T__13:
			case T__14:
				{
				setState(190);
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
	}

	public final BoolvalContext boolval() throws RecognitionException {
		BoolvalContext _localctx = new BoolvalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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

	public static class SelectiveContext extends ParserRuleContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public List<ElifstmtContext> elifstmt() {
			return getRuleContexts(ElifstmtContext.class);
		}
		public ElifstmtContext elifstmt(int i) {
			return getRuleContext(ElifstmtContext.class,i);
		}
		public ElsestmtContext elsestmt() {
			return getRuleContext(ElsestmtContext.class,0);
		}
		public SelectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selective; }
	}

	public final SelectiveContext selective() throws RecognitionException {
		SelectiveContext _localctx = new SelectiveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_selective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			ifstmt();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(196);
				elifstmt();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(202);
				elsestmt();
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

	public static class IfstmtContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__15);
			setState(206);
			match(T__4);
			setState(207);
			bexpr(0);
			setState(208);
			match(T__5);
			setState(209);
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

	public static class ElifstmtContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifstmt; }
	}

	public final ElifstmtContext elifstmt() throws RecognitionException {
		ElifstmtContext _localctx = new ElifstmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__16);
			setState(212);
			match(T__4);
			setState(213);
			bexpr(0);
			setState(214);
			match(T__5);
			setState(215);
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

	public static class ElsestmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElsestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestmt; }
	}

	public final ElsestmtContext elsestmt() throws RecognitionException {
		ElsestmtContext _localctx = new ElsestmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elsestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__17);
			setState(218);
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

	public static class IterativeContext extends ParserRuleContext {
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public IterativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterative; }
	}

	public final IterativeContext iterative() throws RecognitionException {
		IterativeContext _localctx = new IterativeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_iterative);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				forstmt();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				whilestmt();
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
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__18);
			setState(225);
			match(T__4);
			setState(226);
			intdcl();
			setState(227);
			match(T__2);
			setState(228);
			bexpr(0);
			setState(229);
			match(T__2);
			setState(230);
			unaryoperator();
			setState(231);
			match(T__5);
			setState(232);
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

	public static class WhilestmtContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__19);
			setState(235);
			match(T__4);
			setState(236);
			bexpr(0);
			setState(237);
			match(T__5);
			setState(238);
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
	}

	public final NumexprContext numexpr() throws RecognitionException {
		return numexpr(0);
	}

	private NumexprContext numexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumexprContext _localctx = new NumexprContext(_ctx, _parentState);
		NumexprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_numexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(241);
				match(T__4);
				setState(242);
				numexpr(0);
				setState(243);
				match(T__5);
				}
				break;
			case T__29:
				{
				setState(245);
				sqrt();
				setState(246);
				numexpr(5);
				}
				break;
			case T__23:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(248);
				val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(251);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(254);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__31:
							{
							setState(252);
							mod();
							}
							break;
						case T__30:
							{
							setState(253);
							power();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(256);
						numexpr(5);
						}
						break;
					case 2:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(258);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(259);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(260);
						numexpr(4);
						}
						break;
					case 3:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(261);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(262);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(263);
						numexpr(3);
						}
						break;
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	}

	public final BexprContext bexpr() throws RecognitionException {
		return bexpr(0);
	}

	private BexprContext bexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexprContext _localctx = new BexprContext(_ctx, _parentState);
		BexprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_bexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(270);
				match(T__26);
				setState(271);
				match(T__4);
				setState(272);
				bexpr(0);
				setState(273);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(275);
					match(T__26);
					}
				}

				setState(278);
				numexpr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(281);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(282);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(284);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__7) {
							{
							setState(283);
							match(T__7);
							}
						}

						setState(286);
						bexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(287);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(288);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(289);
						match(T__7);
						setState(290);
						bexpr(5);
						}
						break;
					case 3:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(292);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(293);
						bexpr(4);
						}
						break;
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__29);
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
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__30);
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
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__31);
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
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unaryoperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(305);
				id();
				setState(306);
				match(T__32);
				}
				break;
			case 2:
				{
				setState(308);
				id();
				setState(309);
				match(T__33);
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

	public static class ValContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_val);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(314);
					match(T__23);
					}
				}

				setState(317);
				num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				id();
				setState(319);
				match(T__10);
				setState(320);
				val();
				setState(321);
				match(T__11);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MLtingParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		case 26:
			return numexpr_sempred((NumexprContext)_localctx, predIndex);
		case 27:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u014c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\5\3O\n\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\5\3\5\5\5`\n\5\5\5b\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6j\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0082\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u008b\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a1"+
		"\n\r\3\16\3\16\3\16\3\16\5\16\u00a7\n\16\3\17\3\17\3\17\3\17\5\17\u00ad"+
		"\n\17\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00b5\n\21\3\22\3\22\3\22\3\22"+
		"\5\22\u00bb\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00c2\n\23\3\24\3\24\3"+
		"\25\3\25\7\25\u00c8\n\25\f\25\16\25\u00cb\13\25\3\25\5\25\u00ce\n\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\5\31\u00e1\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u00fc\n\34\3\34\3\34\3\34\5\34\u0101\n\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u010b\n\34\f\34\16\34\u010e\13"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0117\n\35\3\35\5\35\u011a"+
		"\n\35\3\35\3\35\3\35\5\35\u011f\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\7\35\u0129\n\35\f\35\16\35\u012c\13\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3!\3!\3!\3!\5!\u013a\n!\3\"\3\"\5\"\u013e\n\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u0146\n\"\3#\3#\3$\3$\3$\2\4\668%\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\t\3\2\20\21\3\2\27\30\3"+
		"\2\31\32\3\2\33\34\4\2\n\n\35\35\3\2\36\37\3\2&(\2\u0150\2H\3\2\2\2\4"+
		"N\3\2\2\2\6P\3\2\2\2\ba\3\2\2\2\ni\3\2\2\2\fk\3\2\2\2\16p\3\2\2\2\20u"+
		"\3\2\2\2\22z\3\2\2\2\24\u0083\3\2\2\2\26\u008c\3\2\2\2\30\u00a0\3\2\2"+
		"\2\32\u00a6\3\2\2\2\34\u00ac\3\2\2\2\36\u00ae\3\2\2\2 \u00b4\3\2\2\2\""+
		"\u00b6\3\2\2\2$\u00bc\3\2\2\2&\u00c3\3\2\2\2(\u00c5\3\2\2\2*\u00cf\3\2"+
		"\2\2,\u00d5\3\2\2\2.\u00db\3\2\2\2\60\u00e0\3\2\2\2\62\u00e2\3\2\2\2\64"+
		"\u00ec\3\2\2\2\66\u00fb\3\2\2\28\u0119\3\2\2\2:\u012d\3\2\2\2<\u012f\3"+
		"\2\2\2>\u0131\3\2\2\2@\u0139\3\2\2\2B\u0145\3\2\2\2D\u0147\3\2\2\2F\u0149"+
		"\3\2\2\2HI\5\4\3\2IJ\7\2\2\3J\3\3\2\2\2KL\5\b\5\2LM\5\4\3\2MO\3\2\2\2"+
		"NK\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PQ\7\3\2\2QR\5\4\3\2RS\7\4\2\2S\7\3\2\2"+
		"\2TZ\5\34\17\2UZ\5 \21\2VZ\5\32\16\2WZ\5@!\2XZ\5\n\6\2YT\3\2\2\2YU\3\2"+
		"\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z[\3\2\2\2[\\\7\5\2\2\\b\3\2\2\2]`\5"+
		"\60\31\2^`\5(\25\2_]\3\2\2\2_^\3\2\2\2`b\3\2\2\2aY\3\2\2\2a_\3\2\2\2b"+
		"\t\3\2\2\2cd\7\6\2\2de\7\7\2\2ej\7%\2\2fg\58\35\2gh\7\b\2\2hj\3\2\2\2"+
		"ic\3\2\2\2if\3\2\2\2j\13\3\2\2\2kl\7\t\2\2lm\5D#\2mn\7\n\2\2no\5\66\34"+
		"\2o\r\3\2\2\2pq\7\13\2\2qr\5D#\2rs\7\n\2\2st\5\66\34\2t\17\3\2\2\2uv\7"+
		"\f\2\2vw\5D#\2wx\7\n\2\2xy\5\66\34\2y\21\3\2\2\2z{\7\t\2\2{|\7\r\2\2|"+
		"}\5B\"\2}~\7\16\2\2~\u0081\5D#\2\177\u0080\7\n\2\2\u0080\u0082\5B\"\2"+
		"\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\23\3\2\2\2\u0083\u0084\7"+
		"\13\2\2\u0084\u0085\7\r\2\2\u0085\u0086\5B\"\2\u0086\u0087\7\16\2\2\u0087"+
		"\u008a\5D#\2\u0088\u0089\7\n\2\2\u0089\u008b\5B\"\2\u008a\u0088\3\2\2"+
		"\2\u008a\u008b\3\2\2\2\u008b\25\3\2\2\2\u008c\u008d\7\f\2\2\u008d\u008e"+
		"\7\r\2\2\u008e\u008f\5B\"\2\u008f\u0090\7\16\2\2\u0090\u0093\5D#\2\u0091"+
		"\u0092\7\n\2\2\u0092\u0094\5B\"\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\27\3\2\2\2\u0095\u0096\5D#\2\u0096\u0097\7\n\2\2\u0097\u0098"+
		"\5B\"\2\u0098\u00a1\3\2\2\2\u0099\u009a\5D#\2\u009a\u009b\7\r\2\2\u009b"+
		"\u009c\5B\"\2\u009c\u009d\7\16\2\2\u009d\u009e\7\n\2\2\u009e\u009f\5\66"+
		"\34\2\u009f\u00a1\3\2\2\2\u00a0\u0095\3\2\2\2\u00a0\u0099\3\2\2\2\u00a1"+
		"\31\3\2\2\2\u00a2\u00a7\5\22\n\2\u00a3\u00a7\5\26\f\2\u00a4\u00a7\5\24"+
		"\13\2\u00a5\u00a7\5\30\r\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00ad\5\f\7"+
		"\2\u00a9\u00ad\5\16\b\2\u00aa\u00ad\5\20\t\2\u00ab\u00ad\5\36\20\2\u00ac"+
		"\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2"+
		"\2\2\u00ad\35\3\2\2\2\u00ae\u00af\5D#\2\u00af\u00b0\7\n\2\2\u00b0\u00b1"+
		"\5\66\34\2\u00b1\37\3\2\2\2\u00b2\u00b5\5$\23\2\u00b3\u00b5\5\"\22\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5!\3\2\2\2\u00b6\u00b7\5D#\2\u00b7"+
		"\u00ba\7\n\2\2\u00b8\u00bb\58\35\2\u00b9\u00bb\5&\24\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00b9\3\2\2\2\u00bb#\3\2\2\2\u00bc\u00bd\7\17\2\2\u00bd\u00be"+
		"\5D#\2\u00be\u00c1\7\n\2\2\u00bf\u00c2\58\35\2\u00c0\u00c2\5&\24\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2%\3\2\2\2\u00c3\u00c4\t\2\2\2"+
		"\u00c4\'\3\2\2\2\u00c5\u00c9\5*\26\2\u00c6\u00c8\5,\27\2\u00c7\u00c6\3"+
		"\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\5.\30\2\u00cd\u00cc\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce)\3\2\2\2\u00cf\u00d0\7\22\2\2\u00d0\u00d1"+
		"\7\7\2\2\u00d1\u00d2\58\35\2\u00d2\u00d3\7\b\2\2\u00d3\u00d4\5\6\4\2\u00d4"+
		"+\3\2\2\2\u00d5\u00d6\7\23\2\2\u00d6\u00d7\7\7\2\2\u00d7\u00d8\58\35\2"+
		"\u00d8\u00d9\7\b\2\2\u00d9\u00da\5\6\4\2\u00da-\3\2\2\2\u00db\u00dc\7"+
		"\24\2\2\u00dc\u00dd\5\6\4\2\u00dd/\3\2\2\2\u00de\u00e1\5\62\32\2\u00df"+
		"\u00e1\5\64\33\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\61\3\2"+
		"\2\2\u00e2\u00e3\7\25\2\2\u00e3\u00e4\7\7\2\2\u00e4\u00e5\5\f\7\2\u00e5"+
		"\u00e6\7\5\2\2\u00e6\u00e7\58\35\2\u00e7\u00e8\7\5\2\2\u00e8\u00e9\5@"+
		"!\2\u00e9\u00ea\7\b\2\2\u00ea\u00eb\5\6\4\2\u00eb\63\3\2\2\2\u00ec\u00ed"+
		"\7\26\2\2\u00ed\u00ee\7\7\2\2\u00ee\u00ef\58\35\2\u00ef\u00f0\7\b\2\2"+
		"\u00f0\u00f1\5\6\4\2\u00f1\65\3\2\2\2\u00f2\u00f3\b\34\1\2\u00f3\u00f4"+
		"\7\7\2\2\u00f4\u00f5\5\66\34\2\u00f5\u00f6\7\b\2\2\u00f6\u00fc\3\2\2\2"+
		"\u00f7\u00f8\5:\36\2\u00f8\u00f9\5\66\34\7\u00f9\u00fc\3\2\2\2\u00fa\u00fc"+
		"\5B\"\2\u00fb\u00f2\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u010c\3\2\2\2\u00fd\u0100\f\6\2\2\u00fe\u0101\5> \2\u00ff\u0101\5<\37"+
		"\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103"+
		"\5\66\34\7\u0103\u010b\3\2\2\2\u0104\u0105\f\5\2\2\u0105\u0106\t\3\2\2"+
		"\u0106\u010b\5\66\34\6\u0107\u0108\f\4\2\2\u0108\u0109\t\4\2\2\u0109\u010b"+
		"\5\66\34\5\u010a\u00fd\3\2\2\2\u010a\u0104\3\2\2\2\u010a\u0107\3\2\2\2"+
		"\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\67"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\b\35\1\2\u0110\u0111\7\35\2\2"+
		"\u0111\u0112\7\7\2\2\u0112\u0113\58\35\2\u0113\u0114\7\b\2\2\u0114\u011a"+
		"\3\2\2\2\u0115\u0117\7\35\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u011a\5\66\34\2\u0119\u010f\3\2\2\2\u0119\u0116"+
		"\3\2\2\2\u011a\u012a\3\2\2\2\u011b\u011c\f\7\2\2\u011c\u011e\t\5\2\2\u011d"+
		"\u011f\7\n\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0129\58\35\b\u0121\u0122\f\6\2\2\u0122\u0123\t\6\2\2\u0123"+
		"\u0124\7\n\2\2\u0124\u0129\58\35\7\u0125\u0126\f\5\2\2\u0126\u0127\t\7"+
		"\2\2\u0127\u0129\58\35\6\u0128\u011b\3\2\2\2\u0128\u0121\3\2\2\2\u0128"+
		"\u0125\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b9\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7 \2\2\u012e;\3\2"+
		"\2\2\u012f\u0130\7!\2\2\u0130=\3\2\2\2\u0131\u0132\7\"\2\2\u0132?\3\2"+
		"\2\2\u0133\u0134\5D#\2\u0134\u0135\7#\2\2\u0135\u013a\3\2\2\2\u0136\u0137"+
		"\5D#\2\u0137\u0138\7$\2\2\u0138\u013a\3\2\2\2\u0139\u0133\3\2\2\2\u0139"+
		"\u0136\3\2\2\2\u013aA\3\2\2\2\u013b\u0146\5D#\2\u013c\u013e\7\32\2\2\u013d"+
		"\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0146\5F"+
		"$\2\u0140\u0141\5D#\2\u0141\u0142\7\r\2\2\u0142\u0143\5B\"\2\u0143\u0144"+
		"\7\16\2\2\u0144\u0146\3\2\2\2\u0145\u013b\3\2\2\2\u0145\u013d\3\2\2\2"+
		"\u0145\u0140\3\2\2\2\u0146C\3\2\2\2\u0147\u0148\7)\2\2\u0148E\3\2\2\2"+
		"\u0149\u014a\t\b\2\2\u014aG\3\2\2\2\37NY_ai\u0081\u008a\u0093\u00a0\u00a6"+
		"\u00ac\u00b4\u00ba\u00c1\u00c9\u00cd\u00e0\u00fb\u0100\u010a\u010c\u0116"+
		"\u0119\u011e\u0128\u012a\u0139\u013d\u0145";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}