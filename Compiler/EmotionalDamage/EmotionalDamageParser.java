// Generated from EmotionalDamage.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EmotionalDamageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, STRING_CONSTANT=50, Inum=51, Fnum=52, 
		Dnum=53, ID=54, WS=55;
	public static final int
		RULE_prog = 0, RULE_stmts = 1, RULE_block = 2, RULE_stmt = 3, RULE_print = 4, 
		RULE_println = 5, RULE_returnstmt = 6, RULE_func = 7, RULE_gradfunc = 8, 
		RULE_rettype = 9, RULE_parameters = 10, RULE_parameter = 11, RULE_matrixparameter = 12, 
		RULE_arrparameter = 13, RULE_intdcl = 14, RULE_floatdcl = 15, RULE_intarrdcl = 16, 
		RULE_floatarrdcl = 17, RULE_arrupdate = 18, RULE_arrassign = 19, RULE_matrixassign = 20, 
		RULE_intmatrixdcl = 21, RULE_floatmatrixdcl = 22, RULE_matrixupdate = 23, 
		RULE_matrixarrexpr = 24, RULE_arrexpr = 25, RULE_matrixtranspose = 26, 
		RULE_matrixinverse = 27, RULE_numassign = 28, RULE_numupdate = 29, RULE_boolassign = 30, 
		RULE_boolupdate = 31, RULE_booldcl = 32, RULE_boolval = 33, RULE_selective = 34, 
		RULE_ifstmt = 35, RULE_elifstmt = 36, RULE_elsestmt = 37, RULE_iterative = 38, 
		RULE_forstmt = 39, RULE_whilestmt = 40, RULE_random = 41, RULE_numexpr = 42, 
		RULE_bexpr = 43, RULE_sqrt = 44, RULE_power = 45, RULE_mod = 46, RULE_unaryoperator = 47, 
		RULE_val = 48, RULE_funccall = 49, RULE_gradfunccall = 50, RULE_id = 51, 
		RULE_num = 52, RULE_numtypes = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "block", "stmt", "print", "println", "returnstmt", "func", 
			"gradfunc", "rettype", "parameters", "parameter", "matrixparameter", 
			"arrparameter", "intdcl", "floatdcl", "intarrdcl", "floatarrdcl", "arrupdate", 
			"arrassign", "matrixassign", "intmatrixdcl", "floatmatrixdcl", "matrixupdate", 
			"matrixarrexpr", "arrexpr", "matrixtranspose", "matrixinverse", "numassign", 
			"numupdate", "boolassign", "boolupdate", "booldcl", "boolval", "selective", 
			"ifstmt", "elifstmt", "elsestmt", "iterative", "forstmt", "whilestmt", 
			"random", "numexpr", "bexpr", "sqrt", "power", "mod", "unaryoperator", 
			"val", "funccall", "gradfunccall", "id", "num", "numtypes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'print'", "'('", "')'", "'println'", "'return'", 
			"'autograd'", "'string'", "'void'", "'['", "']'", "','", "'int'", "'='", 
			"'float'", "'*'", "'.'", "'+'", "'-'", "'toMatrix'", "'toArray'", "'T'", 
			"'~'", "'bool'", "'true'", "'false'", "'if'", "'elif'", "'else'", "'for'", 
			"'while'", "'rand'", "'/'", "'>'", "'<'", "'!'", "'AND'", "'OR'", "'sqrt'", 
			"'**'", "'%'", "'++'", "'--'", "'.row'", "'.col'", "'.len'", "'.backwards'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING_CONSTANT", "Inum", "Fnum", "Dnum", "ID", "WS"
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
	public String getGrammarFileName() { return "EmotionalDamage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EmotionalDamageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EmotionalDamageParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			stmts();
			setState(109);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			stmt();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__14) | (1L << T__16) | (1L << T__25) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << ID))) != 0)) {
				{
				setState(112);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__0);
			setState(116);
			stmts();
			setState(117);
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
		public MatrixassignContext matrixassign() {
			return getRuleContext(MatrixassignContext.class,0);
		}
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
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public GradfunccallContext gradfunccall() {
			return getRuleContext(GradfunccallContext.class,0);
		}
		public ReturnstmtContext returnstmt() {
			return getRuleContext(ReturnstmtContext.class,0);
		}
		public IterativeContext iterative() {
			return getRuleContext(IterativeContext.class,0);
		}
		public SelectiveContext selective() {
			return getRuleContext(SelectiveContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public GradfuncContext gradfunc() {
			return getRuleContext(GradfuncContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(119);
					matrixassign();
					}
					break;
				case 2:
					{
					setState(120);
					numassign();
					}
					break;
				case 3:
					{
					setState(121);
					boolassign();
					}
					break;
				case 4:
					{
					setState(122);
					arrassign();
					}
					break;
				case 5:
					{
					setState(123);
					unaryoperator();
					}
					break;
				case 6:
					{
					setState(124);
					print();
					}
					break;
				case 7:
					{
					setState(125);
					println();
					}
					break;
				case 8:
					{
					setState(126);
					funccall();
					}
					break;
				case 9:
					{
					setState(127);
					gradfunccall();
					}
					break;
				case 10:
					{
					setState(128);
					returnstmt();
					}
					break;
				}
				setState(131);
				match(T__2);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__31:
				case T__32:
					{
					setState(133);
					iterative();
					}
					break;
				case T__28:
					{
					setState(134);
					selective();
					}
					break;
				case T__9:
				case T__10:
				case T__14:
				case T__16:
					{
					setState(135);
					func();
					}
					break;
				case T__8:
					{
					setState(136);
					gradfunc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode STRING_CONSTANT() { return getToken(EmotionalDamageParser.STRING_CONSTANT, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__3);
			setState(142);
			match(T__4);
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_CONSTANT:
				{
				setState(143);
				match(STRING_CONSTANT);
				}
				break;
			case T__4:
			case T__20:
			case T__33:
			case T__37:
			case T__40:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(144);
				bexpr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(147);
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode STRING_CONSTANT() { return getToken(EmotionalDamageParser.STRING_CONSTANT, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__6);
			setState(150);
			match(T__4);
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_CONSTANT:
				{
				setState(151);
				match(STRING_CONSTANT);
				}
				break;
			case T__4:
			case T__20:
			case T__33:
			case T__37:
			case T__40:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(152);
				bexpr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(155);
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

	public static class ReturnstmtContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitReturnstmt(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__7);
			setState(158);
			val();
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

	public static class FuncContext extends ParserRuleContext {
		public RettypeContext rettype() {
			return getRuleContext(RettypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			rettype();
			setState(161);
			id();
			setState(162);
			match(T__4);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__16))) != 0)) {
				{
				setState(163);
				parameters();
				}
			}

			setState(166);
			match(T__5);
			setState(167);
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

	public static class GradfuncContext extends ParserRuleContext {
		public RettypeContext rettype() {
			return getRuleContext(RettypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public GradfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gradfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterGradfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitGradfunc(this);
		}
	}

	public final GradfuncContext gradfunc() throws RecognitionException {
		GradfuncContext _localctx = new GradfuncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_gradfunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__8);
			setState(170);
			rettype();
			setState(171);
			id();
			setState(172);
			match(T__4);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__16))) != 0)) {
				{
				setState(173);
				parameters();
				}
			}

			setState(176);
			match(T__5);
			setState(177);
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

	public static class RettypeContext extends ParserRuleContext {
		public NumtypesContext numtypes() {
			return getRuleContext(NumtypesContext.class,0);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public RettypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rettype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterRettype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitRettype(this);
		}
	}

	public final RettypeContext rettype() throws RecognitionException {
		RettypeContext _localctx = new RettypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rettype);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				numtypes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				numtypes();
				setState(183);
				match(T__11);
				setState(184);
				val();
				setState(185);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				numtypes();
				setState(188);
				match(T__11);
				setState(189);
				val();
				setState(190);
				match(T__13);
				setState(191);
				val();
				setState(192);
				match(T__12);
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

	public static class ParametersContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			parameter();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(197);
				match(T__13);
				setState(198);
				parameters();
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

	public static class ParameterContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumtypesContext numtypes() {
			return getRuleContext(NumtypesContext.class,0);
		}
		public MatrixparameterContext matrixparameter() {
			return getRuleContext(MatrixparameterContext.class,0);
		}
		public ArrparameterContext arrparameter() {
			return getRuleContext(ArrparameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(201);
				numtypes();
				}
				break;
			case 2:
				{
				setState(202);
				match(T__9);
				}
				break;
			case 3:
				{
				setState(203);
				matrixparameter();
				}
				break;
			case 4:
				{
				setState(204);
				arrparameter();
				}
				break;
			}
			setState(207);
			id();
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

	public static class MatrixparameterContext extends ParserRuleContext {
		public NumtypesContext numtypes() {
			return getRuleContext(NumtypesContext.class,0);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public MatrixparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterMatrixparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitMatrixparameter(this);
		}
	}

	public final MatrixparameterContext matrixparameter() throws RecognitionException {
		MatrixparameterContext _localctx = new MatrixparameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_matrixparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			numtypes();
			setState(210);
			match(T__11);
			{
			setState(211);
			val();
			}
			setState(212);
			match(T__13);
			{
			setState(213);
			val();
			}
			setState(214);
			match(T__12);
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

	public static class ArrparameterContext extends ParserRuleContext {
		public NumtypesContext numtypes() {
			return getRuleContext(NumtypesContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ArrparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterArrparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitArrparameter(this);
		}
	}

	public final ArrparameterContext arrparameter() throws RecognitionException {
		ArrparameterContext _localctx = new ArrparameterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			numtypes();
			setState(217);
			match(T__11);
			{
			setState(218);
			val();
			}
			setState(219);
			match(T__12);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterIntdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitIntdcl(this);
		}
	}

	public final IntdclContext intdcl() throws RecognitionException {
		IntdclContext _localctx = new IntdclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_intdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__14);
			setState(222);
			id();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(223);
				match(T__15);
				setState(224);
				numexpr(0);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterFloatdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitFloatdcl(this);
		}
	}

	public final FloatdclContext floatdcl() throws RecognitionException {
		FloatdclContext _localctx = new FloatdclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_floatdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__16);
			setState(228);
			id();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(229);
				match(T__15);
				setState(230);
				numexpr(0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterIntarrdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitIntarrdcl(this);
		}
	}

	public final IntarrdclContext intarrdcl() throws RecognitionException {
		IntarrdclContext _localctx = new IntarrdclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_intarrdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__14);
			setState(234);
			match(T__11);
			setState(235);
			val();
			setState(236);
			match(T__12);
			setState(237);
			id();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(238);
				match(T__15);
				setState(239);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterFloatarrdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitFloatarrdcl(this);
		}
	}

	public final FloatarrdclContext floatarrdcl() throws RecognitionException {
		FloatarrdclContext _localctx = new FloatarrdclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_floatarrdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__16);
			setState(243);
			match(T__11);
			setState(244);
			val();
			setState(245);
			match(T__12);
			setState(246);
			id();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(247);
				match(T__15);
				setState(248);
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
		public NumexprContext numexpr() {
			return getRuleContext(NumexprContext.class,0);
		}
		public ArrexprContext arrexpr() {
			return getRuleContext(ArrexprContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ArrupdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrupdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterArrupdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitArrupdate(this);
		}
	}

	public final ArrupdateContext arrupdate() throws RecognitionException {
		ArrupdateContext _localctx = new ArrupdateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrupdate);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(251);
				id();
				setState(252);
				match(T__15);
				setState(255);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case T__20:
				case T__33:
				case T__40:
				case Inum:
				case Fnum:
				case Dnum:
				case ID:
					{
					setState(253);
					numexpr(0);
					}
					break;
				case T__22:
					{
					setState(254);
					arrexpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				id();
				setState(258);
				match(T__11);
				setState(259);
				val();
				setState(260);
				match(T__12);
				setState(261);
				match(T__15);
				setState(262);
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
		public ArrupdateContext arrupdate() {
			return getRuleContext(ArrupdateContext.class,0);
		}
		public ArrassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterArrassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitArrassign(this);
		}
	}

	public final ArrassignContext arrassign() throws RecognitionException {
		ArrassignContext _localctx = new ArrassignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrassign);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				intarrdcl();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				floatarrdcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
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

	public static class MatrixassignContext extends ParserRuleContext {
		public IntmatrixdclContext intmatrixdcl() {
			return getRuleContext(IntmatrixdclContext.class,0);
		}
		public FloatmatrixdclContext floatmatrixdcl() {
			return getRuleContext(FloatmatrixdclContext.class,0);
		}
		public MatrixupdateContext matrixupdate() {
			return getRuleContext(MatrixupdateContext.class,0);
		}
		public MatrixassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixassign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterMatrixassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitMatrixassign(this);
		}
	}

	public final MatrixassignContext matrixassign() throws RecognitionException {
		MatrixassignContext _localctx = new MatrixassignContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_matrixassign);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				intmatrixdcl();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				floatmatrixdcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				matrixupdate();
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

	public static class IntmatrixdclContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MatrixarrexprContext matrixarrexpr() {
			return getRuleContext(MatrixarrexprContext.class,0);
		}
		public NumexprContext numexpr() {
			return getRuleContext(NumexprContext.class,0);
		}
		public IntmatrixdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intmatrixdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterIntmatrixdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitIntmatrixdcl(this);
		}
	}

	public final IntmatrixdclContext intmatrixdcl() throws RecognitionException {
		IntmatrixdclContext _localctx = new IntmatrixdclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_intmatrixdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__14);
			setState(277);
			match(T__11);
			setState(278);
			val();
			setState(279);
			match(T__13);
			setState(280);
			val();
			setState(281);
			match(T__12);
			setState(282);
			id();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(283);
				match(T__15);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(284);
					matrixarrexpr();
					}
					break;
				case 2:
					{
					setState(285);
					numexpr(0);
					}
					break;
				}
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

	public static class FloatmatrixdclContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MatrixarrexprContext matrixarrexpr() {
			return getRuleContext(MatrixarrexprContext.class,0);
		}
		public NumexprContext numexpr() {
			return getRuleContext(NumexprContext.class,0);
		}
		public FloatmatrixdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatmatrixdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterFloatmatrixdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitFloatmatrixdcl(this);
		}
	}

	public final FloatmatrixdclContext floatmatrixdcl() throws RecognitionException {
		FloatmatrixdclContext _localctx = new FloatmatrixdclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_floatmatrixdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__16);
			setState(291);
			match(T__11);
			setState(292);
			val();
			setState(293);
			match(T__13);
			setState(294);
			val();
			setState(295);
			match(T__12);
			setState(296);
			id();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(297);
				match(T__15);
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(298);
					matrixarrexpr();
					}
					break;
				case 2:
					{
					setState(299);
					numexpr(0);
					}
					break;
				}
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

	public static class MatrixupdateContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumexprContext numexpr() {
			return getRuleContext(NumexprContext.class,0);
		}
		public MatrixarrexprContext matrixarrexpr() {
			return getRuleContext(MatrixarrexprContext.class,0);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public MatrixupdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixupdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterMatrixupdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitMatrixupdate(this);
		}
	}

	public final MatrixupdateContext matrixupdate() throws RecognitionException {
		MatrixupdateContext _localctx = new MatrixupdateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_matrixupdate);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(304);
				id();
				setState(305);
				match(T__15);
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(306);
					numexpr(0);
					}
					break;
				case 2:
					{
					setState(307);
					matrixarrexpr();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				id();
				setState(311);
				match(T__11);
				setState(312);
				val();
				setState(313);
				match(T__13);
				setState(314);
				val();
				setState(315);
				match(T__12);
				setState(316);
				match(T__15);
				setState(317);
				numexpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				id();
				setState(320);
				match(T__11);
				setState(321);
				val();
				setState(322);
				match(T__13);
				setState(323);
				match(T__17);
				setState(324);
				match(T__12);
				setState(325);
				match(T__15);
				setState(326);
				numexpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				id();
				setState(329);
				match(T__11);
				setState(330);
				match(T__17);
				setState(331);
				match(T__13);
				setState(332);
				val();
				setState(333);
				match(T__12);
				setState(334);
				match(T__15);
				setState(335);
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

	public static class MatrixarrexprContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public MatrixtransposeContext matrixtranspose() {
			return getRuleContext(MatrixtransposeContext.class,0);
		}
		public MatrixinverseContext matrixinverse() {
			return getRuleContext(MatrixinverseContext.class,0);
		}
		public MatrixarrexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixarrexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterMatrixarrexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitMatrixarrexpr(this);
		}
	}

	public final MatrixarrexprContext matrixarrexpr() throws RecognitionException {
		MatrixarrexprContext _localctx = new MatrixarrexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_matrixarrexpr);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				id();
				setState(340);
				match(T__18);
				setState(341);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				id();
				setState(344);
				match(T__17);
				setState(345);
				val();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				id();
				setState(348);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(349);
				val();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				matrixtranspose();
				setState(352);
				match(T__4);
				setState(353);
				id();
				setState(354);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				matrixinverse();
				setState(357);
				match(T__4);
				setState(358);
				id();
				setState(359);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(361);
				match(T__21);
				setState(362);
				match(T__4);
				setState(363);
				id();
				setState(364);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(366);
				val();
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

	public static class ArrexprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArrexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterArrexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitArrexpr(this);
		}
	}

	public final ArrexprContext arrexpr() throws RecognitionException {
		ArrexprContext _localctx = new ArrexprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__22);
			setState(370);
			match(T__4);
			setState(371);
			id();
			setState(372);
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

	public static class MatrixtransposeContext extends ParserRuleContext {
		public MatrixtransposeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixtranspose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterMatrixtranspose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitMatrixtranspose(this);
		}
	}

	public final MatrixtransposeContext matrixtranspose() throws RecognitionException {
		MatrixtransposeContext _localctx = new MatrixtransposeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_matrixtranspose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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

	public static class MatrixinverseContext extends ParserRuleContext {
		public MatrixinverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixinverse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterMatrixinverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitMatrixinverse(this);
		}
	}

	public final MatrixinverseContext matrixinverse() throws RecognitionException {
		MatrixinverseContext _localctx = new MatrixinverseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_matrixinverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
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

	public static class NumassignContext extends ParserRuleContext {
		public IntdclContext intdcl() {
			return getRuleContext(IntdclContext.class,0);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterNumassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitNumassign(this);
		}
	}

	public final NumassignContext numassign() throws RecognitionException {
		NumassignContext _localctx = new NumassignContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_numassign);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				intdcl();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				floatdcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterNumupdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitNumupdate(this);
		}
	}

	public final NumupdateContext numupdate() throws RecognitionException {
		NumupdateContext _localctx = new NumupdateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_numupdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			id();
			setState(384);
			match(T__15);
			setState(385);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterBoolassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitBoolassign(this);
		}
	}

	public final BoolassignContext boolassign() throws RecognitionException {
		BoolassignContext _localctx = new BoolassignContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_boolassign);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				booldcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterBoolupdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitBoolupdate(this);
		}
	}

	public final BoolupdateContext boolupdate() throws RecognitionException {
		BoolupdateContext _localctx = new BoolupdateContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_boolupdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			id();
			setState(392);
			match(T__15);
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__20:
			case T__33:
			case T__37:
			case T__40:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(393);
				bexpr(0);
				}
				break;
			case T__26:
			case T__27:
				{
				setState(394);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterBooldcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitBooldcl(this);
		}
	}

	public final BooldclContext booldcl() throws RecognitionException {
		BooldclContext _localctx = new BooldclContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_booldcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__25);
			setState(398);
			id();
			setState(399);
			match(T__15);
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__20:
			case T__33:
			case T__37:
			case T__40:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(400);
				bexpr(0);
				}
				break;
			case T__26:
			case T__27:
				{
				setState(401);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterBoolval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitBoolval(this);
		}
	}

	public final BoolvalContext boolval() throws RecognitionException {
		BoolvalContext _localctx = new BoolvalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_boolval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterSelective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitSelective(this);
		}
	}

	public final SelectiveContext selective() throws RecognitionException {
		SelectiveContext _localctx = new SelectiveContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			ifstmt();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(407);
				elifstmt();
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(413);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__28);
			setState(417);
			match(T__4);
			setState(418);
			bexpr(0);
			setState(419);
			match(T__5);
			setState(420);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterElifstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitElifstmt(this);
		}
	}

	public final ElifstmtContext elifstmt() throws RecognitionException {
		ElifstmtContext _localctx = new ElifstmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__29);
			setState(423);
			match(T__4);
			setState(424);
			bexpr(0);
			setState(425);
			match(T__5);
			setState(426);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterElsestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitElsestmt(this);
		}
	}

	public final ElsestmtContext elsestmt() throws RecognitionException {
		ElsestmtContext _localctx = new ElsestmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elsestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(T__30);
			setState(429);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterIterative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitIterative(this);
		}
	}

	public final IterativeContext iterative() throws RecognitionException {
		IterativeContext _localctx = new IterativeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_iterative);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				forstmt();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
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
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IntdclContext intdcl() {
			return getRuleContext(IntdclContext.class,0);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitForstmt(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__31);
			setState(436);
			match(T__4);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(437);
				intdcl();
				}
			}

			setState(440);
			match(T__2);
			setState(441);
			bexpr(0);
			setState(442);
			match(T__2);
			setState(443);
			unaryoperator();
			setState(444);
			match(T__5);
			setState(445);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitWhilestmt(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__32);
			setState(448);
			match(T__4);
			setState(449);
			bexpr(0);
			setState(450);
			match(T__5);
			setState(451);
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

	public static class RandomContext extends ParserRuleContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public RandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_random; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterRandom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitRandom(this);
		}
	}

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_random);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__33);
			setState(454);
			match(T__4);
			setState(455);
			val();
			setState(456);
			match(T__13);
			setState(457);
			val();
			setState(458);
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
		public RandomContext random() {
			return getRuleContext(RandomContext.class,0);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterNumexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitNumexpr(this);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_numexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(461);
				match(T__4);
				setState(462);
				numexpr(0);
				setState(463);
				match(T__5);
				}
				break;
			case T__40:
				{
				setState(465);
				sqrt();
				setState(466);
				numexpr(6);
				}
				break;
			case T__33:
				{
				setState(468);
				random();
				}
				break;
			case T__20:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(469);
				val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(485);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(472);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(475);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__42:
							{
							setState(473);
							mod();
							}
							break;
						case T__41:
							{
							setState(474);
							power();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(477);
						numexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(479);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(480);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(481);
						numexpr(5);
						}
						break;
					case 3:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(482);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(483);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(484);
						numexpr(4);
						}
						break;
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterBexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitBexpr(this);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_bexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(491);
				match(T__37);
				setState(492);
				match(T__4);
				setState(493);
				bexpr(0);
				setState(494);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(496);
					match(T__37);
					}
				}

				setState(499);
				numexpr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(515);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(502);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(503);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(505);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__15) {
							{
							setState(504);
							match(T__15);
							}
						}

						setState(507);
						bexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(508);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(509);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__37) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(510);
						match(T__15);
						setState(511);
						bexpr(5);
						}
						break;
					case 3:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(512);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(513);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(514);
						bexpr(4);
						}
						break;
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitSqrt(this);
		}
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(T__40);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(T__41);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitMod(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(T__42);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterUnaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitUnaryoperator(this);
		}
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unaryoperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(526);
				id();
				setState(527);
				match(T__43);
				}
				break;
			case 2:
				{
				setState(529);
				id();
				setState(530);
				match(T__44);
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
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public GradfunccallContext gradfunccall() {
			return getRuleContext(GradfunccallContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_val);
		int _la;
		try {
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(535);
					match(T__20);
					}
				}

				setState(538);
				num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				id();
				setState(540);
				match(T__11);
				setState(541);
				val();
				setState(542);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(544);
				id();
				setState(545);
				match(T__11);
				setState(546);
				val();
				setState(547);
				match(T__13);
				setState(548);
				val();
				setState(549);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(551);
				id();
				setState(552);
				match(T__45);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(554);
				id();
				setState(555);
				match(T__46);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(557);
				id();
				setState(558);
				match(T__47);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(560);
				funccall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(561);
				gradfunccall();
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

	public static class FunccallContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitFunccall(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			id();
			setState(565);
			match(T__4);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(566);
				id();
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(567);
					match(T__13);
					setState(568);
					id();
					}
					}
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(576);
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

	public static class GradfunccallContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public GradfunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gradfunccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterGradfunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitGradfunccall(this);
		}
	}

	public final GradfunccallContext gradfunccall() throws RecognitionException {
		GradfunccallContext _localctx = new GradfunccallContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_gradfunccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			id();
			setState(579);
			match(T__4);
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(580);
				id();
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(581);
					match(T__13);
					setState(582);
					id();
					}
					}
					setState(587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(590);
			match(T__5);
			setState(591);
			match(T__48);
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
		public TerminalNode ID() { return getToken(EmotionalDamageParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
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
		public TerminalNode Inum() { return getToken(EmotionalDamageParser.Inum, 0); }
		public TerminalNode Fnum() { return getToken(EmotionalDamageParser.Fnum, 0); }
		public TerminalNode Dnum() { return getToken(EmotionalDamageParser.Dnum, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
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

	public static class NumtypesContext extends ParserRuleContext {
		public NumtypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numtypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterNumtypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitNumtypes(this);
		}
	}

	public final NumtypesContext numtypes() throws RecognitionException {
		NumtypesContext _localctx = new NumtypesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_numtypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__16) ) {
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
		case 42:
			return numexpr_sempred((NumexprContext)_localctx, predIndex);
		case 43:
			return bexpr_sempred((BexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean numexpr_sempred(NumexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u025a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\3\3\3\5\3t\n\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0084\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u008c\n\5\5\5\u008e\n\5\3\6\3\6\3\6\3\6\5\6\u0094"+
		"\n\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u009c\n\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\5\t\u00a7\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00b1\n\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00c5\n\13\3\f\3\f\3\f\5\f\u00ca\n\f\3\r\3\r\3\r"+
		"\3\r\5\r\u00d0\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00e4\n\20\3\21\3\21\3\21\3\21"+
		"\5\21\u00ea\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f3\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00fc\n\23\3\24\3\24\3\24\3\24"+
		"\5\24\u0102\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010b\n\24\3"+
		"\25\3\25\3\25\5\25\u0110\n\25\3\26\3\26\3\26\5\26\u0115\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0121\n\27\5\27\u0123\n"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u012f\n\30"+
		"\5\30\u0131\n\30\3\31\3\31\3\31\3\31\5\31\u0137\n\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0154\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0172\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\5\36\u0180\n\36\3\37\3\37\3\37\3\37\3 \3 \5 \u0188\n \3!\3!\3!\3!\5!"+
		"\u018e\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0195\n\"\3#\3#\3$\3$\7$\u019b\n$\f"+
		"$\16$\u019e\13$\3$\5$\u01a1\n$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3(\3(\5(\u01b4\n(\3)\3)\3)\5)\u01b9\n)\3)\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5"+
		",\u01d9\n,\3,\3,\3,\5,\u01de\n,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u01e8\n,\f"+
		",\16,\u01eb\13,\3-\3-\3-\3-\3-\3-\3-\5-\u01f4\n-\3-\5-\u01f7\n-\3-\3-"+
		"\3-\5-\u01fc\n-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0206\n-\f-\16-\u0209\13-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0217\n\61\3\62"+
		"\3\62\5\62\u021b\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u0235\n\62\3\63\3\63\3\63\3\63\3\63\7\63\u023c\n\63\f\63\16\63\u023f"+
		"\13\63\5\63\u0241\n\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\7\64\u024a\n"+
		"\64\f\64\16\64\u024d\13\64\5\64\u024f\n\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\3\67\2\4VX8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\n\3\2\26\27\3\2\35"+
		"\36\4\2\24\24%%\3\2&\'\4\2\22\22((\3\2)*\3\2\65\67\4\2\21\21\23\23\2\u0279"+
		"\2n\3\2\2\2\4q\3\2\2\2\6u\3\2\2\2\b\u008d\3\2\2\2\n\u008f\3\2\2\2\f\u0097"+
		"\3\2\2\2\16\u009f\3\2\2\2\20\u00a2\3\2\2\2\22\u00ab\3\2\2\2\24\u00c4\3"+
		"\2\2\2\26\u00c6\3\2\2\2\30\u00cf\3\2\2\2\32\u00d3\3\2\2\2\34\u00da\3\2"+
		"\2\2\36\u00df\3\2\2\2 \u00e5\3\2\2\2\"\u00eb\3\2\2\2$\u00f4\3\2\2\2&\u010a"+
		"\3\2\2\2(\u010f\3\2\2\2*\u0114\3\2\2\2,\u0116\3\2\2\2.\u0124\3\2\2\2\60"+
		"\u0153\3\2\2\2\62\u0171\3\2\2\2\64\u0173\3\2\2\2\66\u0178\3\2\2\28\u017a"+
		"\3\2\2\2:\u017f\3\2\2\2<\u0181\3\2\2\2>\u0187\3\2\2\2@\u0189\3\2\2\2B"+
		"\u018f\3\2\2\2D\u0196\3\2\2\2F\u0198\3\2\2\2H\u01a2\3\2\2\2J\u01a8\3\2"+
		"\2\2L\u01ae\3\2\2\2N\u01b3\3\2\2\2P\u01b5\3\2\2\2R\u01c1\3\2\2\2T\u01c7"+
		"\3\2\2\2V\u01d8\3\2\2\2X\u01f6\3\2\2\2Z\u020a\3\2\2\2\\\u020c\3\2\2\2"+
		"^\u020e\3\2\2\2`\u0216\3\2\2\2b\u0234\3\2\2\2d\u0236\3\2\2\2f\u0244\3"+
		"\2\2\2h\u0253\3\2\2\2j\u0255\3\2\2\2l\u0257\3\2\2\2no\5\4\3\2op\7\2\2"+
		"\3p\3\3\2\2\2qs\5\b\5\2rt\5\4\3\2sr\3\2\2\2st\3\2\2\2t\5\3\2\2\2uv\7\3"+
		"\2\2vw\5\4\3\2wx\7\4\2\2x\7\3\2\2\2y\u0084\5*\26\2z\u0084\5:\36\2{\u0084"+
		"\5> \2|\u0084\5(\25\2}\u0084\5`\61\2~\u0084\5\n\6\2\177\u0084\5\f\7\2"+
		"\u0080\u0084\5d\63\2\u0081\u0084\5f\64\2\u0082\u0084\5\16\b\2\u0083y\3"+
		"\2\2\2\u0083z\3\2\2\2\u0083{\3\2\2\2\u0083|\3\2\2\2\u0083}\3\2\2\2\u0083"+
		"~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\5\2\2\u0086\u008e\3\2"+
		"\2\2\u0087\u008c\5N(\2\u0088\u008c\5F$\2\u0089\u008c\5\20\t\2\u008a\u008c"+
		"\5\22\n\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0083\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008e\t\3\2\2\2\u008f\u0090\7\6\2\2\u0090\u0093\7\7\2\2\u0091"+
		"\u0094\7\64\2\2\u0092\u0094\5X-\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\b\2\2\u0096\13\3\2\2\2\u0097\u0098"+
		"\7\t\2\2\u0098\u009b\7\7\2\2\u0099\u009c\7\64\2\2\u009a\u009c\5X-\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\b"+
		"\2\2\u009e\r\3\2\2\2\u009f\u00a0\7\n\2\2\u00a0\u00a1\5b\62\2\u00a1\17"+
		"\3\2\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\5h\65\2\u00a4\u00a6\7\7\2\2"+
		"\u00a5\u00a7\5\26\f\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\5\6\4\2\u00aa\21\3\2\2\2\u00ab"+
		"\u00ac\7\13\2\2\u00ac\u00ad\5\24\13\2\u00ad\u00ae\5h\65\2\u00ae\u00b0"+
		"\7\7\2\2\u00af\u00b1\5\26\f\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\b\2\2\u00b3\u00b4\5\6\4\2\u00b4\23"+
		"\3\2\2\2\u00b5\u00c5\5l\67\2\u00b6\u00c5\7\f\2\2\u00b7\u00c5\7\r\2\2\u00b8"+
		"\u00b9\5l\67\2\u00b9\u00ba\7\16\2\2\u00ba\u00bb\5b\62\2\u00bb\u00bc\7"+
		"\17\2\2\u00bc\u00c5\3\2\2\2\u00bd\u00be\5l\67\2\u00be\u00bf\7\16\2\2\u00bf"+
		"\u00c0\5b\62\2\u00c0\u00c1\7\20\2\2\u00c1\u00c2\5b\62\2\u00c2\u00c3\7"+
		"\17\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b5\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4"+
		"\u00b7\3\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c5\25\3\2\2"+
		"\2\u00c6\u00c9\5\30\r\2\u00c7\u00c8\7\20\2\2\u00c8\u00ca\5\26\f\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\27\3\2\2\2\u00cb\u00d0\5l\67"+
		"\2\u00cc\u00d0\7\f\2\2\u00cd\u00d0\5\32\16\2\u00ce\u00d0\5\34\17\2\u00cf"+
		"\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\5h\65\2\u00d2\31\3\2\2\2\u00d3\u00d4"+
		"\5l\67\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6\5b\62\2\u00d6\u00d7\7\20\2\2"+
		"\u00d7\u00d8\5b\62\2\u00d8\u00d9\7\17\2\2\u00d9\33\3\2\2\2\u00da\u00db"+
		"\5l\67\2\u00db\u00dc\7\16\2\2\u00dc\u00dd\5b\62\2\u00dd\u00de\7\17\2\2"+
		"\u00de\35\3\2\2\2\u00df\u00e0\7\21\2\2\u00e0\u00e3\5h\65\2\u00e1\u00e2"+
		"\7\22\2\2\u00e2\u00e4\5V,\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\37\3\2\2\2\u00e5\u00e6\7\23\2\2\u00e6\u00e9\5h\65\2\u00e7\u00e8\7\22"+
		"\2\2\u00e8\u00ea\5V,\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea!"+
		"\3\2\2\2\u00eb\u00ec\7\21\2\2\u00ec\u00ed\7\16\2\2\u00ed\u00ee\5b\62\2"+
		"\u00ee\u00ef\7\17\2\2\u00ef\u00f2\5h\65\2\u00f0\u00f1\7\22\2\2\u00f1\u00f3"+
		"\5b\62\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3#\3\2\2\2\u00f4"+
		"\u00f5\7\23\2\2\u00f5\u00f6\7\16\2\2\u00f6\u00f7\5b\62\2\u00f7\u00f8\7"+
		"\17\2\2\u00f8\u00fb\5h\65\2\u00f9\u00fa\7\22\2\2\u00fa\u00fc\5b\62\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc%\3\2\2\2\u00fd\u00fe\5h\65\2"+
		"\u00fe\u0101\7\22\2\2\u00ff\u0102\5V,\2\u0100\u0102\5\64\33\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u010b\3\2\2\2\u0103\u0104\5h\65\2\u0104"+
		"\u0105\7\16\2\2\u0105\u0106\5b\62\2\u0106\u0107\7\17\2\2\u0107\u0108\7"+
		"\22\2\2\u0108\u0109\5V,\2\u0109\u010b\3\2\2\2\u010a\u00fd\3\2\2\2\u010a"+
		"\u0103\3\2\2\2\u010b\'\3\2\2\2\u010c\u0110\5\"\22\2\u010d\u0110\5$\23"+
		"\2\u010e\u0110\5&\24\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e"+
		"\3\2\2\2\u0110)\3\2\2\2\u0111\u0115\5,\27\2\u0112\u0115\5.\30\2\u0113"+
		"\u0115\5\60\31\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3"+
		"\2\2\2\u0115+\3\2\2\2\u0116\u0117\7\21\2\2\u0117\u0118\7\16\2\2\u0118"+
		"\u0119\5b\62\2\u0119\u011a\7\20\2\2\u011a\u011b\5b\62\2\u011b\u011c\7"+
		"\17\2\2\u011c\u0122\5h\65\2\u011d\u0120\7\22\2\2\u011e\u0121\5\62\32\2"+
		"\u011f\u0121\5V,\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\u0123"+
		"\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u0123\3\2\2\2\u0123-\3\2\2\2\u0124"+
		"\u0125\7\23\2\2\u0125\u0126\7\16\2\2\u0126\u0127\5b\62\2\u0127\u0128\7"+
		"\20\2\2\u0128\u0129\5b\62\2\u0129\u012a\7\17\2\2\u012a\u0130\5h\65\2\u012b"+
		"\u012e\7\22\2\2\u012c\u012f\5\62\32\2\u012d\u012f\5V,\2\u012e\u012c\3"+
		"\2\2\2\u012e\u012d\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012b\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131/\3\2\2\2\u0132\u0133\5h\65\2\u0133\u0136\7\22\2\2"+
		"\u0134\u0137\5V,\2\u0135\u0137\5\62\32\2\u0136\u0134\3\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0137\u0154\3\2\2\2\u0138\u0139\5h\65\2\u0139\u013a\7\16\2\2"+
		"\u013a\u013b\5b\62\2\u013b\u013c\7\20\2\2\u013c\u013d\5b\62\2\u013d\u013e"+
		"\7\17\2\2\u013e\u013f\7\22\2\2\u013f\u0140\5V,\2\u0140\u0154\3\2\2\2\u0141"+
		"\u0142\5h\65\2\u0142\u0143\7\16\2\2\u0143\u0144\5b\62\2\u0144\u0145\7"+
		"\20\2\2\u0145\u0146\7\24\2\2\u0146\u0147\7\17\2\2\u0147\u0148\7\22\2\2"+
		"\u0148\u0149\5V,\2\u0149\u0154\3\2\2\2\u014a\u014b\5h\65\2\u014b\u014c"+
		"\7\16\2\2\u014c\u014d\7\24\2\2\u014d\u014e\7\20\2\2\u014e\u014f\5b\62"+
		"\2\u014f\u0150\7\17\2\2\u0150\u0151\7\22\2\2\u0151\u0152\5V,\2\u0152\u0154"+
		"\3\2\2\2\u0153\u0132\3\2\2\2\u0153\u0138\3\2\2\2\u0153\u0141\3\2\2\2\u0153"+
		"\u014a\3\2\2\2\u0154\61\3\2\2\2\u0155\u0156\5h\65\2\u0156\u0157\7\25\2"+
		"\2\u0157\u0158\5h\65\2\u0158\u0172\3\2\2\2\u0159\u015a\5h\65\2\u015a\u015b"+
		"\7\24\2\2\u015b\u015c\5b\62\2\u015c\u0172\3\2\2\2\u015d\u015e\5h\65\2"+
		"\u015e\u015f\t\2\2\2\u015f\u0160\5b\62\2\u0160\u0172\3\2\2\2\u0161\u0162"+
		"\5\66\34\2\u0162\u0163\7\7\2\2\u0163\u0164\5h\65\2\u0164\u0165\7\b\2\2"+
		"\u0165\u0172\3\2\2\2\u0166\u0167\58\35\2\u0167\u0168\7\7\2\2\u0168\u0169"+
		"\5h\65\2\u0169\u016a\7\b\2\2\u016a\u0172\3\2\2\2\u016b\u016c\7\30\2\2"+
		"\u016c\u016d\7\7\2\2\u016d\u016e\5h\65\2\u016e\u016f\7\b\2\2\u016f\u0172"+
		"\3\2\2\2\u0170\u0172\5b\62\2\u0171\u0155\3\2\2\2\u0171\u0159\3\2\2\2\u0171"+
		"\u015d\3\2\2\2\u0171\u0161\3\2\2\2\u0171\u0166\3\2\2\2\u0171\u016b\3\2"+
		"\2\2\u0171\u0170\3\2\2\2\u0172\63\3\2\2\2\u0173\u0174\7\31\2\2\u0174\u0175"+
		"\7\7\2\2\u0175\u0176\5h\65\2\u0176\u0177\7\b\2\2\u0177\65\3\2\2\2\u0178"+
		"\u0179\7\32\2\2\u0179\67\3\2\2\2\u017a\u017b\7\33\2\2\u017b9\3\2\2\2\u017c"+
		"\u0180\5\36\20\2\u017d\u0180\5 \21\2\u017e\u0180\5<\37\2\u017f\u017c\3"+
		"\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180;\3\2\2\2\u0181\u0182"+
		"\5h\65\2\u0182\u0183\7\22\2\2\u0183\u0184\5V,\2\u0184=\3\2\2\2\u0185\u0188"+
		"\5B\"\2\u0186\u0188\5@!\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"?\3\2\2\2\u0189\u018a\5h\65\2\u018a\u018d\7\22\2\2\u018b\u018e\5X-\2\u018c"+
		"\u018e\5D#\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018eA\3\2\2\2\u018f"+
		"\u0190\7\34\2\2\u0190\u0191\5h\65\2\u0191\u0194\7\22\2\2\u0192\u0195\5"+
		"X-\2\u0193\u0195\5D#\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195C"+
		"\3\2\2\2\u0196\u0197\t\3\2\2\u0197E\3\2\2\2\u0198\u019c\5H%\2\u0199\u019b"+
		"\5J&\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a1\5L"+
		"\'\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1G\3\2\2\2\u01a2\u01a3"+
		"\7\37\2\2\u01a3\u01a4\7\7\2\2\u01a4\u01a5\5X-\2\u01a5\u01a6\7\b\2\2\u01a6"+
		"\u01a7\5\6\4\2\u01a7I\3\2\2\2\u01a8\u01a9\7 \2\2\u01a9\u01aa\7\7\2\2\u01aa"+
		"\u01ab\5X-\2\u01ab\u01ac\7\b\2\2\u01ac\u01ad\5\6\4\2\u01adK\3\2\2\2\u01ae"+
		"\u01af\7!\2\2\u01af\u01b0\5\6\4\2\u01b0M\3\2\2\2\u01b1\u01b4\5P)\2\u01b2"+
		"\u01b4\5R*\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4O\3\2\2\2\u01b5"+
		"\u01b6\7\"\2\2\u01b6\u01b8\7\7\2\2\u01b7\u01b9\5\36\20\2\u01b8\u01b7\3"+
		"\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\7\5\2\2\u01bb"+
		"\u01bc\5X-\2\u01bc\u01bd\7\5\2\2\u01bd\u01be\5`\61\2\u01be\u01bf\7\b\2"+
		"\2\u01bf\u01c0\5\6\4\2\u01c0Q\3\2\2\2\u01c1\u01c2\7#\2\2\u01c2\u01c3\7"+
		"\7\2\2\u01c3\u01c4\5X-\2\u01c4\u01c5\7\b\2\2\u01c5\u01c6\5\6\4\2\u01c6"+
		"S\3\2\2\2\u01c7\u01c8\7$\2\2\u01c8\u01c9\7\7\2\2\u01c9\u01ca\5b\62\2\u01ca"+
		"\u01cb\7\20\2\2\u01cb\u01cc\5b\62\2\u01cc\u01cd\7\b\2\2\u01cdU\3\2\2\2"+
		"\u01ce\u01cf\b,\1\2\u01cf\u01d0\7\7\2\2\u01d0\u01d1\5V,\2\u01d1\u01d2"+
		"\7\b\2\2\u01d2\u01d9\3\2\2\2\u01d3\u01d4\5Z.\2\u01d4\u01d5\5V,\b\u01d5"+
		"\u01d9\3\2\2\2\u01d6\u01d9\5T+\2\u01d7\u01d9\5b\62\2\u01d8\u01ce\3\2\2"+
		"\2\u01d8\u01d3\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01e9"+
		"\3\2\2\2\u01da\u01dd\f\7\2\2\u01db\u01de\5^\60\2\u01dc\u01de\5\\/\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\5V"+
		",\b\u01e0\u01e8\3\2\2\2\u01e1\u01e2\f\6\2\2\u01e2\u01e3\t\4\2\2\u01e3"+
		"\u01e8\5V,\7\u01e4\u01e5\f\5\2\2\u01e5\u01e6\t\2\2\2\u01e6\u01e8\5V,\6"+
		"\u01e7\u01da\3\2\2\2\u01e7\u01e1\3\2\2\2\u01e7\u01e4\3\2\2\2\u01e8\u01eb"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01eaW\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01ec\u01ed\b-\1\2\u01ed\u01ee\7(\2\2\u01ee\u01ef\7\7\2"+
		"\2\u01ef\u01f0\5X-\2\u01f0\u01f1\7\b\2\2\u01f1\u01f7\3\2\2\2\u01f2\u01f4"+
		"\7(\2\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f7\5V,\2\u01f6\u01ec\3\2\2\2\u01f6\u01f3\3\2\2\2\u01f7\u0207\3\2\2"+
		"\2\u01f8\u01f9\f\7\2\2\u01f9\u01fb\t\5\2\2\u01fa\u01fc\7\22\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0206\5X"+
		"-\b\u01fe\u01ff\f\6\2\2\u01ff\u0200\t\6\2\2\u0200\u0201\7\22\2\2\u0201"+
		"\u0206\5X-\7\u0202\u0203\f\5\2\2\u0203\u0204\t\7\2\2\u0204\u0206\5X-\6"+
		"\u0205\u01f8\3\2\2\2\u0205\u01fe\3\2\2\2\u0205\u0202\3\2\2\2\u0206\u0209"+
		"\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208Y\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u020a\u020b\7+\2\2\u020b[\3\2\2\2\u020c\u020d\7,\2\2\u020d"+
		"]\3\2\2\2\u020e\u020f\7-\2\2\u020f_\3\2\2\2\u0210\u0211\5h\65\2\u0211"+
		"\u0212\7.\2\2\u0212\u0217\3\2\2\2\u0213\u0214\5h\65\2\u0214\u0215\7/\2"+
		"\2\u0215\u0217\3\2\2\2\u0216\u0210\3\2\2\2\u0216\u0213\3\2\2\2\u0217a"+
		"\3\2\2\2\u0218\u0235\5h\65\2\u0219\u021b\7\27\2\2\u021a\u0219\3\2\2\2"+
		"\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u0235\5j\66\2\u021d\u021e"+
		"\5h\65\2\u021e\u021f\7\16\2\2\u021f\u0220\5b\62\2\u0220\u0221\7\17\2\2"+
		"\u0221\u0235\3\2\2\2\u0222\u0223\5h\65\2\u0223\u0224\7\16\2\2\u0224\u0225"+
		"\5b\62\2\u0225\u0226\7\20\2\2\u0226\u0227\5b\62\2\u0227\u0228\7\17\2\2"+
		"\u0228\u0235\3\2\2\2\u0229\u022a\5h\65\2\u022a\u022b\7\60\2\2\u022b\u0235"+
		"\3\2\2\2\u022c\u022d\5h\65\2\u022d\u022e\7\61\2\2\u022e\u0235\3\2\2\2"+
		"\u022f\u0230\5h\65\2\u0230\u0231\7\62\2\2\u0231\u0235\3\2\2\2\u0232\u0235"+
		"\5d\63\2\u0233\u0235\5f\64\2\u0234\u0218\3\2\2\2\u0234\u021a\3\2\2\2\u0234"+
		"\u021d\3\2\2\2\u0234\u0222\3\2\2\2\u0234\u0229\3\2\2\2\u0234\u022c\3\2"+
		"\2\2\u0234\u022f\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235"+
		"c\3\2\2\2\u0236\u0237\5h\65\2\u0237\u0240\7\7\2\2\u0238\u023d\5h\65\2"+
		"\u0239\u023a\7\20\2\2\u023a\u023c\5h\65\2\u023b\u0239\3\2\2\2\u023c\u023f"+
		"\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0241\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0238\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2"+
		"\2\2\u0242\u0243\7\b\2\2\u0243e\3\2\2\2\u0244\u0245\5h\65\2\u0245\u024e"+
		"\7\7\2\2\u0246\u024b\5h\65\2\u0247\u0248\7\20\2\2\u0248\u024a\5h\65\2"+
		"\u0249\u0247\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c"+
		"\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0246\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\7\b\2\2\u0251\u0252\7\63"+
		"\2\2\u0252g\3\2\2\2\u0253\u0254\78\2\2\u0254i\3\2\2\2\u0255\u0256\t\b"+
		"\2\2\u0256k\3\2\2\2\u0257\u0258\t\t\2\2\u0258m\3\2\2\2\64s\u0083\u008b"+
		"\u008d\u0093\u009b\u00a6\u00b0\u00c4\u00c9\u00cf\u00e3\u00e9\u00f2\u00fb"+
		"\u0101\u010a\u010f\u0114\u0120\u0122\u012e\u0130\u0136\u0153\u0171\u017f"+
		"\u0187\u018d\u0194\u019c\u01a0\u01b3\u01b8\u01d8\u01dd\u01e7\u01e9\u01f3"+
		"\u01f6\u01fb\u0205\u0207\u0216\u021a\u0234\u023d\u0240\u024b\u024e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}