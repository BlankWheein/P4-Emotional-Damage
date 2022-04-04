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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, STRING_CONSTANT=51, 
		Inum=52, Fnum=53, Dnum=54, ID=55, WS=56;
	public static final int
		RULE_prog = 0, RULE_stmts = 1, RULE_block = 2, RULE_stmt = 3, RULE_print = 4, 
		RULE_returnstmt = 5, RULE_func = 6, RULE_gradfunc = 7, RULE_rettype = 8, 
		RULE_parameters = 9, RULE_parameter = 10, RULE_matrixparameter = 11, RULE_intdcl = 12, 
		RULE_doubledcl = 13, RULE_floatdcl = 14, RULE_intarrdcl = 15, RULE_doublearrdcl = 16, 
		RULE_floatarrdcl = 17, RULE_arrupdate = 18, RULE_arrassign = 19, RULE_matrixassign = 20, 
		RULE_intmatrixdcl = 21, RULE_doublematrixdcl = 22, RULE_floatmatrixdcl = 23, 
		RULE_matrixupdate = 24, RULE_matrixarrexpr = 25, RULE_arrexpr = 26, RULE_matrixtranspose = 27, 
		RULE_matrixinverse = 28, RULE_numassign = 29, RULE_numupdate = 30, RULE_boolassign = 31, 
		RULE_boolupdate = 32, RULE_booldcl = 33, RULE_boolval = 34, RULE_selective = 35, 
		RULE_ifstmt = 36, RULE_elifstmt = 37, RULE_elsestmt = 38, RULE_iterative = 39, 
		RULE_forstmt = 40, RULE_whilestmt = 41, RULE_random = 42, RULE_numexpr = 43, 
		RULE_bexpr = 44, RULE_sqrt = 45, RULE_power = 46, RULE_mod = 47, RULE_unaryoperator = 48, 
		RULE_val = 49, RULE_funccall = 50, RULE_gradfunccall = 51, RULE_id = 52, 
		RULE_num = 53, RULE_numtypes = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "block", "stmt", "print", "returnstmt", "func", "gradfunc", 
			"rettype", "parameters", "parameter", "matrixparameter", "intdcl", "doubledcl", 
			"floatdcl", "intarrdcl", "doublearrdcl", "floatarrdcl", "arrupdate", 
			"arrassign", "matrixassign", "intmatrixdcl", "doublematrixdcl", "floatmatrixdcl", 
			"matrixupdate", "matrixarrexpr", "arrexpr", "matrixtranspose", "matrixinverse", 
			"numassign", "numupdate", "boolassign", "boolupdate", "booldcl", "boolval", 
			"selective", "ifstmt", "elifstmt", "elsestmt", "iterative", "forstmt", 
			"whilestmt", "random", "numexpr", "bexpr", "sqrt", "power", "mod", "unaryoperator", 
			"val", "funccall", "gradfunccall", "id", "num", "numtypes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'print'", "'('", "')'", "'return'", "'func'", 
			"'autograd'", "'string'", "'void'", "'['", "']'", "','", "'int'", "'='", 
			"'double'", "'float'", "'*'", "'.'", "'+'", "'-'", "'toMatrix'", "'toArray'", 
			"'T'", "'~'", "'bool'", "'true'", "'false'", "'if'", "'elif'", "'else'", 
			"'for'", "'while'", "'rand'", "'/'", "'>'", "'<'", "'!'", "'AND'", "'OR'", 
			"'sqrt'", "'**'", "'%'", "'++'", "'--'", "'.row'", "'.col'", "'.len'", 
			"'.backwards'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING_CONSTANT", "Inum", "Fnum", "Dnum", "ID", "WS"
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
			setState(110);
			stmts();
			setState(111);
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
			setState(113);
			stmt();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__26) | (1L << T__29) | (1L << T__32) | (1L << T__33) | (1L << ID))) != 0)) {
				{
				setState(114);
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
			setState(117);
			match(T__0);
			setState(118);
			stmts();
			setState(119);
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
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__6:
			case T__14:
			case T__16:
			case T__17:
			case T__26:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(121);
					matrixassign();
					}
					break;
				case 2:
					{
					setState(122);
					numassign();
					}
					break;
				case 3:
					{
					setState(123);
					boolassign();
					}
					break;
				case 4:
					{
					setState(124);
					arrassign();
					}
					break;
				case 5:
					{
					setState(125);
					unaryoperator();
					}
					break;
				case 6:
					{
					setState(126);
					print();
					}
					break;
				case 7:
					{
					setState(127);
					funccall();
					}
					break;
				case 8:
					{
					setState(128);
					gradfunccall();
					}
					break;
				case 9:
					{
					setState(129);
					returnstmt();
					}
					break;
				}
				setState(132);
				match(T__2);
				}
				}
				break;
			case T__7:
			case T__8:
			case T__29:
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__32:
				case T__33:
					{
					setState(134);
					iterative();
					}
					break;
				case T__29:
					{
					setState(135);
					selective();
					}
					break;
				case T__7:
					{
					setState(136);
					func();
					}
					break;
				case T__8:
					{
					setState(137);
					gradfunc();
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
			setState(142);
			match(T__3);
			setState(143);
			match(T__4);
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_CONSTANT:
				{
				setState(144);
				match(STRING_CONSTANT);
				}
				break;
			case T__4:
			case T__21:
			case T__34:
			case T__38:
			case T__41:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(145);
				bexpr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(148);
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
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterReturnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitReturnstmt(this);
		}
	}

	public final ReturnstmtContext returnstmt() throws RecognitionException {
		ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__6);
			setState(151);
			bexpr(0);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__7);
			setState(154);
			rettype();
			setState(155);
			id();
			setState(156);
			match(T__4);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__16) | (1L << T__17))) != 0)) {
				{
				setState(157);
				parameters();
				}
			}

			setState(160);
			match(T__5);
			setState(161);
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
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public GradfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gradfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterGradfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitGradfunc(this);
		}
	}

	public final GradfuncContext gradfunc() throws RecognitionException {
		GradfuncContext _localctx = new GradfuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_gradfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__8);
			setState(164);
			func();
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
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public RettypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rettype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterRettype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitRettype(this);
		}
	}

	public final RettypeContext rettype() throws RecognitionException {
		RettypeContext _localctx = new RettypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rettype);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				numtypes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				numtypes();
				setState(170);
				match(T__11);
				setState(171);
				num();
				setState(172);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				numtypes();
				setState(175);
				match(T__11);
				setState(176);
				num();
				setState(177);
				match(T__13);
				setState(178);
				num();
				setState(179);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			parameter();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(184);
				match(T__13);
				setState(185);
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
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(188);
				numtypes();
				}
				break;
			case 2:
				{
				setState(189);
				match(T__9);
				}
				break;
			case 3:
				{
				setState(190);
				matrixparameter();
				}
				break;
			}
			setState(193);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterMatrixparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitMatrixparameter(this);
		}
	}

	public final MatrixparameterContext matrixparameter() throws RecognitionException {
		MatrixparameterContext _localctx = new MatrixparameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matrixparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			numtypes();
			setState(196);
			match(T__11);
			{
			setState(197);
			val();
			}
			setState(198);
			match(T__13);
			{
			setState(199);
			val();
			}
			setState(200);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterIntdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitIntdcl(this);
		}
	}

	public final IntdclContext intdcl() throws RecognitionException {
		IntdclContext _localctx = new IntdclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_intdcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__14);
			setState(203);
			id();
			setState(204);
			match(T__15);
			setState(205);
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
		enterRule(_localctx, 26, RULE_doubledcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__16);
			setState(208);
			id();
			setState(209);
			match(T__15);
			setState(210);
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
		enterRule(_localctx, 28, RULE_floatdcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__17);
			setState(213);
			id();
			setState(214);
			match(T__15);
			setState(215);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterIntarrdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitIntarrdcl(this);
		}
	}

	public final IntarrdclContext intarrdcl() throws RecognitionException {
		IntarrdclContext _localctx = new IntarrdclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_intarrdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__14);
			setState(218);
			match(T__11);
			setState(219);
			val();
			setState(220);
			match(T__12);
			setState(221);
			id();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(222);
				match(T__15);
				setState(223);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterDoublearrdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitDoublearrdcl(this);
		}
	}

	public final DoublearrdclContext doublearrdcl() throws RecognitionException {
		DoublearrdclContext _localctx = new DoublearrdclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_doublearrdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__16);
			setState(227);
			match(T__11);
			setState(228);
			val();
			setState(229);
			match(T__12);
			setState(230);
			id();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(231);
				match(T__15);
				setState(232);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterFloatarrdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitFloatarrdcl(this);
		}
	}

	public final FloatarrdclContext floatarrdcl() throws RecognitionException {
		FloatarrdclContext _localctx = new FloatarrdclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_floatarrdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__17);
			setState(236);
			match(T__11);
			setState(237);
			val();
			setState(238);
			match(T__12);
			setState(239);
			id();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(240);
				match(T__15);
				setState(241);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterArrupdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitArrupdate(this);
		}
	}

	public final ArrupdateContext arrupdate() throws RecognitionException {
		ArrupdateContext _localctx = new ArrupdateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrupdate);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(244);
				id();
				setState(245);
				match(T__15);
				setState(248);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case T__21:
				case T__34:
				case T__41:
				case Inum:
				case Fnum:
				case Dnum:
				case ID:
					{
					setState(246);
					numexpr(0);
					}
					break;
				case T__23:
					{
					setState(247);
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
				setState(250);
				id();
				setState(251);
				match(T__11);
				setState(252);
				val();
				setState(253);
				match(T__12);
				setState(254);
				match(T__15);
				setState(255);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterArrassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitArrassign(this);
		}
	}

	public final ArrassignContext arrassign() throws RecognitionException {
		ArrassignContext _localctx = new ArrassignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrassign);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				intarrdcl();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				floatarrdcl();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				doublearrdcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
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
		public DoublematrixdclContext doublematrixdcl() {
			return getRuleContext(DoublematrixdclContext.class,0);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterMatrixassign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitMatrixassign(this);
		}
	}

	public final MatrixassignContext matrixassign() throws RecognitionException {
		MatrixassignContext _localctx = new MatrixassignContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_matrixassign);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				intmatrixdcl();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				floatmatrixdcl();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				doublematrixdcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
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
		public IntmatrixdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intmatrixdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterIntmatrixdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitIntmatrixdcl(this);
		}
	}

	public final IntmatrixdclContext intmatrixdcl() throws RecognitionException {
		IntmatrixdclContext _localctx = new IntmatrixdclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_intmatrixdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__14);
			setState(272);
			match(T__11);
			setState(273);
			val();
			setState(274);
			match(T__13);
			setState(275);
			val();
			setState(276);
			match(T__12);
			setState(277);
			id();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(278);
				match(T__15);
				setState(279);
				matrixarrexpr();
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

	public static class DoublematrixdclContext extends ParserRuleContext {
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
		public DoublematrixdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doublematrixdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterDoublematrixdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitDoublematrixdcl(this);
		}
	}

	public final DoublematrixdclContext doublematrixdcl() throws RecognitionException {
		DoublematrixdclContext _localctx = new DoublematrixdclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_doublematrixdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__16);
			setState(283);
			match(T__11);
			setState(284);
			val();
			setState(285);
			match(T__13);
			setState(286);
			val();
			setState(287);
			match(T__12);
			setState(288);
			id();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(289);
				match(T__15);
				setState(290);
				matrixarrexpr();
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
		public FloatmatrixdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatmatrixdcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterFloatmatrixdcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitFloatmatrixdcl(this);
		}
	}

	public final FloatmatrixdclContext floatmatrixdcl() throws RecognitionException {
		FloatmatrixdclContext _localctx = new FloatmatrixdclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_floatmatrixdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__17);
			setState(294);
			match(T__11);
			setState(295);
			val();
			setState(296);
			match(T__13);
			setState(297);
			val();
			setState(298);
			match(T__12);
			setState(299);
			id();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(300);
				match(T__15);
				setState(301);
				matrixarrexpr();
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterMatrixupdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitMatrixupdate(this);
		}
	}

	public final MatrixupdateContext matrixupdate() throws RecognitionException {
		MatrixupdateContext _localctx = new MatrixupdateContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_matrixupdate);
		try {
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
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
				match(T__18);
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
				match(T__18);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterMatrixarrexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitMatrixarrexpr(this);
		}
	}

	public final MatrixarrexprContext matrixarrexpr() throws RecognitionException {
		MatrixarrexprContext _localctx = new MatrixarrexprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_matrixarrexpr);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				id();
				setState(340);
				match(T__19);
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
				match(T__18);
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
				if ( !(_la==T__20 || _la==T__21) ) {
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
				match(T__22);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterArrexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitArrexpr(this);
		}
	}

	public final ArrexprContext arrexpr() throws RecognitionException {
		ArrexprContext _localctx = new ArrexprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__23);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterMatrixtranspose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitMatrixtranspose(this);
		}
	}

	public final MatrixtransposeContext matrixtranspose() throws RecognitionException {
		MatrixtransposeContext _localctx = new MatrixtransposeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_matrixtranspose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
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

	public static class MatrixinverseContext extends ParserRuleContext {
		public MatrixinverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixinverse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterMatrixinverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitMatrixinverse(this);
		}
	}

	public final MatrixinverseContext matrixinverse() throws RecognitionException {
		MatrixinverseContext _localctx = new MatrixinverseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_matrixinverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(T__25);
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
		enterRule(_localctx, 58, RULE_numassign);
		try {
			setState(382);
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
				doubledcl();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				floatdcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
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
		enterRule(_localctx, 60, RULE_numupdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			id();
			setState(385);
			match(T__15);
			setState(386);
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
		enterRule(_localctx, 62, RULE_boolassign);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				booldcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
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
		enterRule(_localctx, 64, RULE_boolupdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			id();
			setState(393);
			match(T__15);
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__21:
			case T__34:
			case T__38:
			case T__41:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(394);
				bexpr(0);
				}
				break;
			case T__27:
			case T__28:
				{
				setState(395);
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
		enterRule(_localctx, 66, RULE_booldcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(T__26);
			setState(399);
			id();
			setState(400);
			match(T__15);
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__21:
			case T__34:
			case T__38:
			case T__41:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(401);
				bexpr(0);
				}
				break;
			case T__27:
			case T__28:
				{
				setState(402);
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
		enterRule(_localctx, 68, RULE_boolval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterSelective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitSelective(this);
		}
	}

	public final SelectiveContext selective() throws RecognitionException {
		SelectiveContext _localctx = new SelectiveContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_selective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			ifstmt();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(408);
				elifstmt();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(414);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__29);
			setState(418);
			match(T__4);
			setState(419);
			bexpr(0);
			setState(420);
			match(T__5);
			setState(421);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterElifstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitElifstmt(this);
		}
	}

	public final ElifstmtContext elifstmt() throws RecognitionException {
		ElifstmtContext _localctx = new ElifstmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__30);
			setState(424);
			match(T__4);
			setState(425);
			bexpr(0);
			setState(426);
			match(T__5);
			setState(427);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterElsestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitElsestmt(this);
		}
	}

	public final ElsestmtContext elsestmt() throws RecognitionException {
		ElsestmtContext _localctx = new ElsestmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_elsestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__31);
			setState(430);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterIterative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitIterative(this);
		}
	}

	public final IterativeContext iterative() throws RecognitionException {
		IterativeContext _localctx = new IterativeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_iterative);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				forstmt();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
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
		enterRule(_localctx, 80, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(T__32);
			setState(437);
			match(T__4);
			setState(438);
			intdcl();
			setState(439);
			match(T__2);
			setState(440);
			bexpr(0);
			setState(441);
			match(T__2);
			setState(442);
			unaryoperator();
			setState(443);
			match(T__5);
			setState(444);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterWhilestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitWhilestmt(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(T__33);
			setState(447);
			match(T__4);
			setState(448);
			bexpr(0);
			setState(449);
			match(T__5);
			setState(450);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterRandom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitRandom(this);
		}
	}

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_random);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__34);
			setState(453);
			match(T__4);
			setState(454);
			val();
			setState(455);
			match(T__13);
			setState(456);
			val();
			setState(457);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_numexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(460);
				match(T__4);
				setState(461);
				numexpr(0);
				setState(462);
				match(T__5);
				}
				break;
			case T__41:
				{
				setState(464);
				sqrt();
				setState(465);
				numexpr(6);
				}
				break;
			case T__34:
				{
				setState(467);
				random();
				}
				break;
			case T__21:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(468);
				val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(484);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(471);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(474);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__43:
							{
							setState(472);
							mod();
							}
							break;
						case T__42:
							{
							setState(473);
							power();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(476);
						numexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(478);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(479);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__35) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(480);
						numexpr(5);
						}
						break;
					case 3:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(481);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(482);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(483);
						numexpr(4);
						}
						break;
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_bexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(490);
				match(T__38);
				setState(491);
				match(T__4);
				setState(492);
				bexpr(0);
				setState(493);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(495);
					match(T__38);
					}
				}

				setState(498);
				numexpr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(514);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(501);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(502);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__37) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(504);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__15) {
							{
							setState(503);
							match(T__15);
							}
						}

						setState(506);
						bexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(507);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(508);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__38) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(509);
						match(T__15);
						setState(510);
						bexpr(5);
						}
						break;
					case 3:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(511);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(512);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(513);
						bexpr(4);
						}
						break;
					}
					} 
				}
				setState(518);
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
		enterRule(_localctx, 90, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
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
		enterRule(_localctx, 92, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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
		enterRule(_localctx, 94, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(T__43);
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
		enterRule(_localctx, 96, RULE_unaryoperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(525);
				id();
				setState(526);
				match(T__44);
				}
				break;
			case 2:
				{
				setState(528);
				id();
				setState(529);
				match(T__45);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_val);
		int _la;
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(534);
					match(T__21);
					}
				}

				setState(537);
				num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				id();
				setState(539);
				match(T__11);
				setState(540);
				val();
				setState(541);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				id();
				setState(544);
				match(T__11);
				setState(545);
				val();
				setState(546);
				match(T__13);
				setState(547);
				val();
				setState(548);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(550);
				id();
				setState(551);
				match(T__46);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(553);
				id();
				setState(554);
				match(T__47);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(556);
				id();
				setState(557);
				match(T__48);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(559);
				funccall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(560);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitFunccall(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			id();
			setState(564);
			match(T__4);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(565);
				id();
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(566);
					match(T__13);
					setState(567);
					id();
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(575);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterGradfunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitGradfunccall(this);
		}
	}

	public final GradfunccallContext gradfunccall() throws RecognitionException {
		GradfunccallContext _localctx = new GradfunccallContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_gradfunccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			id();
			setState(578);
			match(T__4);
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(579);
				id();
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(580);
					match(T__13);
					setState(581);
					id();
					}
					}
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(589);
			match(T__5);
			setState(590);
			match(T__49);
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
		enterRule(_localctx, 104, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
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
		enterRule(_localctx, 106, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
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
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).enterNumtypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLtingListener ) ((MLtingListener)listener).exitNumtypes(this);
		}
	}

	public final NumtypesContext numtypes() throws RecognitionException {
		NumtypesContext _localctx = new NumtypesContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_numtypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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
		case 43:
			return numexpr_sempred((NumexprContext)_localctx, predIndex);
		case 44:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0259\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\3\3\3\5\3v\n\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0085\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u008d\n\5\5\5\u008f\n\5\3\6\3\6\3\6\3\6\5\6\u0095"+
		"\n\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u00a1\n\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00b8\n\n\3\13\3\13\3\13\5\13\u00bd\n\13\3\f\3\f\3\f\5\f\u00c2"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00e3\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ec"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f5\n\23\3\24\3\24\3\24"+
		"\3\24\5\24\u00fb\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0104\n"+
		"\24\3\25\3\25\3\25\3\25\5\25\u010a\n\25\3\26\3\26\3\26\3\26\5\26\u0110"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u011b\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0126\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0131\n\31\3\32\3\32\3\32\3\32\5\32"+
		"\u0137\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0154\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0172\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0181\n\37\3 \3 \3 \3 \3!\3!\5!\u0189"+
		"\n!\3\"\3\"\3\"\3\"\5\"\u018f\n\"\3#\3#\3#\3#\3#\5#\u0196\n#\3$\3$\3%"+
		"\3%\7%\u019c\n%\f%\16%\u019f\13%\3%\5%\u01a2\n%\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\5)\u01b5\n)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\5-\u01d8\n-\3-\3-\3-\5-\u01dd\n-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u01e7"+
		"\n-\f-\16-\u01ea\13-\3.\3.\3.\3.\3.\3.\3.\5.\u01f3\n.\3.\5.\u01f6\n.\3"+
		".\3.\3.\5.\u01fb\n.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0205\n.\f.\16.\u0208\13"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0216\n"+
		"\62\3\63\3\63\5\63\u021a\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\5\63\u0234\n\63\3\64\3\64\3\64\3\64\3\64\7\64\u023b\n\64\f"+
		"\64\16\64\u023e\13\64\5\64\u0240\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\65\7\65\u0249\n\65\f\65\16\65\u024c\13\65\5\65\u024e\n\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\38\38\38\2\4XZ9\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\n\3\2\27"+
		"\30\3\2\36\37\4\2\25\25&&\3\2\'(\4\2\22\22))\3\2*+\3\2\668\4\2\21\21\23"+
		"\24\2\u0273\2p\3\2\2\2\4s\3\2\2\2\6w\3\2\2\2\b\u008e\3\2\2\2\n\u0090\3"+
		"\2\2\2\f\u0098\3\2\2\2\16\u009b\3\2\2\2\20\u00a5\3\2\2\2\22\u00b7\3\2"+
		"\2\2\24\u00b9\3\2\2\2\26\u00c1\3\2\2\2\30\u00c5\3\2\2\2\32\u00cc\3\2\2"+
		"\2\34\u00d1\3\2\2\2\36\u00d6\3\2\2\2 \u00db\3\2\2\2\"\u00e4\3\2\2\2$\u00ed"+
		"\3\2\2\2&\u0103\3\2\2\2(\u0109\3\2\2\2*\u010f\3\2\2\2,\u0111\3\2\2\2."+
		"\u011c\3\2\2\2\60\u0127\3\2\2\2\62\u0153\3\2\2\2\64\u0171\3\2\2\2\66\u0173"+
		"\3\2\2\28\u0178\3\2\2\2:\u017a\3\2\2\2<\u0180\3\2\2\2>\u0182\3\2\2\2@"+
		"\u0188\3\2\2\2B\u018a\3\2\2\2D\u0190\3\2\2\2F\u0197\3\2\2\2H\u0199\3\2"+
		"\2\2J\u01a3\3\2\2\2L\u01a9\3\2\2\2N\u01af\3\2\2\2P\u01b4\3\2\2\2R\u01b6"+
		"\3\2\2\2T\u01c0\3\2\2\2V\u01c6\3\2\2\2X\u01d7\3\2\2\2Z\u01f5\3\2\2\2\\"+
		"\u0209\3\2\2\2^\u020b\3\2\2\2`\u020d\3\2\2\2b\u0215\3\2\2\2d\u0233\3\2"+
		"\2\2f\u0235\3\2\2\2h\u0243\3\2\2\2j\u0252\3\2\2\2l\u0254\3\2\2\2n\u0256"+
		"\3\2\2\2pq\5\4\3\2qr\7\2\2\3r\3\3\2\2\2su\5\b\5\2tv\5\4\3\2ut\3\2\2\2"+
		"uv\3\2\2\2v\5\3\2\2\2wx\7\3\2\2xy\5\4\3\2yz\7\4\2\2z\7\3\2\2\2{\u0085"+
		"\5*\26\2|\u0085\5<\37\2}\u0085\5@!\2~\u0085\5(\25\2\177\u0085\5b\62\2"+
		"\u0080\u0085\5\n\6\2\u0081\u0085\5f\64\2\u0082\u0085\5h\65\2\u0083\u0085"+
		"\5\f\7\2\u0084{\3\2\2\2\u0084|\3\2\2\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0084"+
		"\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2"+
		"\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\5\2\2\u0087\u008f"+
		"\3\2\2\2\u0088\u008d\5P)\2\u0089\u008d\5H%\2\u008a\u008d\5\16\b\2\u008b"+
		"\u008d\5\20\t\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008b\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0084\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\t\3\2\2\2\u0090\u0091\7\6\2\2\u0091\u0094\7\7\2\2"+
		"\u0092\u0095\7\65\2\2\u0093\u0095\5Z.\2\u0094\u0092\3\2\2\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7\b\2\2\u0097\13\3\2\2\2\u0098"+
		"\u0099\7\t\2\2\u0099\u009a\5Z.\2\u009a\r\3\2\2\2\u009b\u009c\7\n\2\2\u009c"+
		"\u009d\5\22\n\2\u009d\u009e\5j\66\2\u009e\u00a0\7\7\2\2\u009f\u00a1\5"+
		"\24\13\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\7\b\2\2\u00a3\u00a4\5\6\4\2\u00a4\17\3\2\2\2\u00a5\u00a6\7\13\2"+
		"\2\u00a6\u00a7\5\16\b\2\u00a7\21\3\2\2\2\u00a8\u00b8\5n8\2\u00a9\u00b8"+
		"\7\f\2\2\u00aa\u00b8\7\r\2\2\u00ab\u00ac\5n8\2\u00ac\u00ad\7\16\2\2\u00ad"+
		"\u00ae\5l\67\2\u00ae\u00af\7\17\2\2\u00af\u00b8\3\2\2\2\u00b0\u00b1\5"+
		"n8\2\u00b1\u00b2\7\16\2\2\u00b2\u00b3\5l\67\2\u00b3\u00b4\7\20\2\2\u00b4"+
		"\u00b5\5l\67\2\u00b5\u00b6\7\17\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00a8\3"+
		"\2\2\2\u00b7\u00a9\3\2\2\2\u00b7\u00aa\3\2\2\2\u00b7\u00ab\3\2\2\2\u00b7"+
		"\u00b0\3\2\2\2\u00b8\23\3\2\2\2\u00b9\u00bc\5\26\f\2\u00ba\u00bb\7\20"+
		"\2\2\u00bb\u00bd\5\24\13\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\25\3\2\2\2\u00be\u00c2\5n8\2\u00bf\u00c2\7\f\2\2\u00c0\u00c2\5\30\r\2"+
		"\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c4\5j\66\2\u00c4\27\3\2\2\2\u00c5\u00c6\5n8\2\u00c6"+
		"\u00c7\7\16\2\2\u00c7\u00c8\5d\63\2\u00c8\u00c9\7\20\2\2\u00c9\u00ca\5"+
		"d\63\2\u00ca\u00cb\7\17\2\2\u00cb\31\3\2\2\2\u00cc\u00cd\7\21\2\2\u00cd"+
		"\u00ce\5j\66\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\5X-\2\u00d0\33\3\2\2\2"+
		"\u00d1\u00d2\7\23\2\2\u00d2\u00d3\5j\66\2\u00d3\u00d4\7\22\2\2\u00d4\u00d5"+
		"\5X-\2\u00d5\35\3\2\2\2\u00d6\u00d7\7\24\2\2\u00d7\u00d8\5j\66\2\u00d8"+
		"\u00d9\7\22\2\2\u00d9\u00da\5X-\2\u00da\37\3\2\2\2\u00db\u00dc\7\21\2"+
		"\2\u00dc\u00dd\7\16\2\2\u00dd\u00de\5d\63\2\u00de\u00df\7\17\2\2\u00df"+
		"\u00e2\5j\66\2\u00e0\u00e1\7\22\2\2\u00e1\u00e3\5d\63\2\u00e2\u00e0\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3!\3\2\2\2\u00e4\u00e5\7\23\2\2\u00e5\u00e6"+
		"\7\16\2\2\u00e6\u00e7\5d\63\2\u00e7\u00e8\7\17\2\2\u00e8\u00eb\5j\66\2"+
		"\u00e9\u00ea\7\22\2\2\u00ea\u00ec\5d\63\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec#\3\2\2\2\u00ed\u00ee\7\24\2\2\u00ee\u00ef\7\16\2\2\u00ef"+
		"\u00f0\5d\63\2\u00f0\u00f1\7\17\2\2\u00f1\u00f4\5j\66\2\u00f2\u00f3\7"+
		"\22\2\2\u00f3\u00f5\5d\63\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"%\3\2\2\2\u00f6\u00f7\5j\66\2\u00f7\u00fa\7\22\2\2\u00f8\u00fb\5X-\2\u00f9"+
		"\u00fb\5\66\34\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u0104\3"+
		"\2\2\2\u00fc\u00fd\5j\66\2\u00fd\u00fe\7\16\2\2\u00fe\u00ff\5d\63\2\u00ff"+
		"\u0100\7\17\2\2\u0100\u0101\7\22\2\2\u0101\u0102\5X-\2\u0102\u0104\3\2"+
		"\2\2\u0103\u00f6\3\2\2\2\u0103\u00fc\3\2\2\2\u0104\'\3\2\2\2\u0105\u010a"+
		"\5 \21\2\u0106\u010a\5$\23\2\u0107\u010a\5\"\22\2\u0108\u010a\5&\24\2"+
		"\u0109\u0105\3\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108"+
		"\3\2\2\2\u010a)\3\2\2\2\u010b\u0110\5,\27\2\u010c\u0110\5\60\31\2\u010d"+
		"\u0110\5.\30\2\u010e\u0110\5\62\32\2\u010f\u010b\3\2\2\2\u010f\u010c\3"+
		"\2\2\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110+\3\2\2\2\u0111\u0112"+
		"\7\21\2\2\u0112\u0113\7\16\2\2\u0113\u0114\5d\63\2\u0114\u0115\7\20\2"+
		"\2\u0115\u0116\5d\63\2\u0116\u0117\7\17\2\2\u0117\u011a\5j\66\2\u0118"+
		"\u0119\7\22\2\2\u0119\u011b\5\64\33\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b-\3\2\2\2\u011c\u011d\7\23\2\2\u011d\u011e\7\16\2\2\u011e"+
		"\u011f\5d\63\2\u011f\u0120\7\20\2\2\u0120\u0121\5d\63\2\u0121\u0122\7"+
		"\17\2\2\u0122\u0125\5j\66\2\u0123\u0124\7\22\2\2\u0124\u0126\5\64\33\2"+
		"\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126/\3\2\2\2\u0127\u0128\7"+
		"\24\2\2\u0128\u0129\7\16\2\2\u0129\u012a\5d\63\2\u012a\u012b\7\20\2\2"+
		"\u012b\u012c\5d\63\2\u012c\u012d\7\17\2\2\u012d\u0130\5j\66\2\u012e\u012f"+
		"\7\22\2\2\u012f\u0131\5\64\33\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2"+
		"\2\u0131\61\3\2\2\2\u0132\u0133\5j\66\2\u0133\u0136\7\22\2\2\u0134\u0137"+
		"\5X-\2\u0135\u0137\5\64\33\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u0154\3\2\2\2\u0138\u0139\5j\66\2\u0139\u013a\7\16\2\2\u013a\u013b\5"+
		"d\63\2\u013b\u013c\7\20\2\2\u013c\u013d\5d\63\2\u013d\u013e\7\17\2\2\u013e"+
		"\u013f\7\22\2\2\u013f\u0140\5X-\2\u0140\u0154\3\2\2\2\u0141\u0142\5j\66"+
		"\2\u0142\u0143\7\16\2\2\u0143\u0144\5d\63\2\u0144\u0145\7\20\2\2\u0145"+
		"\u0146\7\25\2\2\u0146\u0147\7\17\2\2\u0147\u0148\7\22\2\2\u0148\u0149"+
		"\5X-\2\u0149\u0154\3\2\2\2\u014a\u014b\5j\66\2\u014b\u014c\7\16\2\2\u014c"+
		"\u014d\7\25\2\2\u014d\u014e\7\20\2\2\u014e\u014f\5d\63\2\u014f\u0150\7"+
		"\17\2\2\u0150\u0151\7\22\2\2\u0151\u0152\5X-\2\u0152\u0154\3\2\2\2\u0153"+
		"\u0132\3\2\2\2\u0153\u0138\3\2\2\2\u0153\u0141\3\2\2\2\u0153\u014a\3\2"+
		"\2\2\u0154\63\3\2\2\2\u0155\u0156\5j\66\2\u0156\u0157\7\26\2\2\u0157\u0158"+
		"\5j\66\2\u0158\u0172\3\2\2\2\u0159\u015a\5j\66\2\u015a\u015b\7\25\2\2"+
		"\u015b\u015c\5d\63\2\u015c\u0172\3\2\2\2\u015d\u015e\5j\66\2\u015e\u015f"+
		"\t\2\2\2\u015f\u0160\5d\63\2\u0160\u0172\3\2\2\2\u0161\u0162\58\35\2\u0162"+
		"\u0163\7\7\2\2\u0163\u0164\5j\66\2\u0164\u0165\7\b\2\2\u0165\u0172\3\2"+
		"\2\2\u0166\u0167\5:\36\2\u0167\u0168\7\7\2\2\u0168\u0169\5j\66\2\u0169"+
		"\u016a\7\b\2\2\u016a\u0172\3\2\2\2\u016b\u016c\7\31\2\2\u016c\u016d\7"+
		"\7\2\2\u016d\u016e\5j\66\2\u016e\u016f\7\b\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u0172\5d\63\2\u0171\u0155\3\2\2\2\u0171\u0159\3\2\2\2\u0171\u015d\3\2"+
		"\2\2\u0171\u0161\3\2\2\2\u0171\u0166\3\2\2\2\u0171\u016b\3\2\2\2\u0171"+
		"\u0170\3\2\2\2\u0172\65\3\2\2\2\u0173\u0174\7\32\2\2\u0174\u0175\7\7\2"+
		"\2\u0175\u0176\5j\66\2\u0176\u0177\7\b\2\2\u0177\67\3\2\2\2\u0178\u0179"+
		"\7\33\2\2\u01799\3\2\2\2\u017a\u017b\7\34\2\2\u017b;\3\2\2\2\u017c\u0181"+
		"\5\32\16\2\u017d\u0181\5\34\17\2\u017e\u0181\5\36\20\2\u017f\u0181\5>"+
		" \2\u0180\u017c\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u017f\3\2\2\2\u0181=\3\2\2\2\u0182\u0183\5j\66\2\u0183\u0184\7\22\2\2"+
		"\u0184\u0185\5X-\2\u0185?\3\2\2\2\u0186\u0189\5D#\2\u0187\u0189\5B\"\2"+
		"\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189A\3\2\2\2\u018a\u018b\5"+
		"j\66\2\u018b\u018e\7\22\2\2\u018c\u018f\5Z.\2\u018d\u018f\5F$\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018fC\3\2\2\2\u0190\u0191\7\35\2\2"+
		"\u0191\u0192\5j\66\2\u0192\u0195\7\22\2\2\u0193\u0196\5Z.\2\u0194\u0196"+
		"\5F$\2\u0195\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196E\3\2\2\2\u0197\u0198"+
		"\t\3\2\2\u0198G\3\2\2\2\u0199\u019d\5J&\2\u019a\u019c\5L\'\2\u019b\u019a"+
		"\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a2\5N(\2\u01a1\u01a0\3\2\2"+
		"\2\u01a1\u01a2\3\2\2\2\u01a2I\3\2\2\2\u01a3\u01a4\7 \2\2\u01a4\u01a5\7"+
		"\7\2\2\u01a5\u01a6\5Z.\2\u01a6\u01a7\7\b\2\2\u01a7\u01a8\5\6\4\2\u01a8"+
		"K\3\2\2\2\u01a9\u01aa\7!\2\2\u01aa\u01ab\7\7\2\2\u01ab\u01ac\5Z.\2\u01ac"+
		"\u01ad\7\b\2\2\u01ad\u01ae\5\6\4\2\u01aeM\3\2\2\2\u01af\u01b0\7\"\2\2"+
		"\u01b0\u01b1\5\6\4\2\u01b1O\3\2\2\2\u01b2\u01b5\5R*\2\u01b3\u01b5\5T+"+
		"\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5Q\3\2\2\2\u01b6\u01b7"+
		"\7#\2\2\u01b7\u01b8\7\7\2\2\u01b8\u01b9\5\32\16\2\u01b9\u01ba\7\5\2\2"+
		"\u01ba\u01bb\5Z.\2\u01bb\u01bc\7\5\2\2\u01bc\u01bd\5b\62\2\u01bd\u01be"+
		"\7\b\2\2\u01be\u01bf\5\6\4\2\u01bfS\3\2\2\2\u01c0\u01c1\7$\2\2\u01c1\u01c2"+
		"\7\7\2\2\u01c2\u01c3\5Z.\2\u01c3\u01c4\7\b\2\2\u01c4\u01c5\5\6\4\2\u01c5"+
		"U\3\2\2\2\u01c6\u01c7\7%\2\2\u01c7\u01c8\7\7\2\2\u01c8\u01c9\5d\63\2\u01c9"+
		"\u01ca\7\20\2\2\u01ca\u01cb\5d\63\2\u01cb\u01cc\7\b\2\2\u01ccW\3\2\2\2"+
		"\u01cd\u01ce\b-\1\2\u01ce\u01cf\7\7\2\2\u01cf\u01d0\5X-\2\u01d0\u01d1"+
		"\7\b\2\2\u01d1\u01d8\3\2\2\2\u01d2\u01d3\5\\/\2\u01d3\u01d4\5X-\b\u01d4"+
		"\u01d8\3\2\2\2\u01d5\u01d8\5V,\2\u01d6\u01d8\5d\63\2\u01d7\u01cd\3\2\2"+
		"\2\u01d7\u01d2\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01e8"+
		"\3\2\2\2\u01d9\u01dc\f\7\2\2\u01da\u01dd\5`\61\2\u01db\u01dd\5^\60\2\u01dc"+
		"\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\5X"+
		"-\b\u01df\u01e7\3\2\2\2\u01e0\u01e1\f\6\2\2\u01e1\u01e2\t\4\2\2\u01e2"+
		"\u01e7\5X-\7\u01e3\u01e4\f\5\2\2\u01e4\u01e5\t\2\2\2\u01e5\u01e7\5X-\6"+
		"\u01e6\u01d9\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e7\u01ea"+
		"\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9Y\3\2\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01eb\u01ec\b.\1\2\u01ec\u01ed\7)\2\2\u01ed\u01ee\7\7\2"+
		"\2\u01ee\u01ef\5Z.\2\u01ef\u01f0\7\b\2\2\u01f0\u01f6\3\2\2\2\u01f1\u01f3"+
		"\7)\2\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01f6\5X-\2\u01f5\u01eb\3\2\2\2\u01f5\u01f2\3\2\2\2\u01f6\u0206\3\2\2"+
		"\2\u01f7\u01f8\f\7\2\2\u01f8\u01fa\t\5\2\2\u01f9\u01fb\7\22\2\2\u01fa"+
		"\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0205\5Z"+
		".\b\u01fd\u01fe\f\6\2\2\u01fe\u01ff\t\6\2\2\u01ff\u0200\7\22\2\2\u0200"+
		"\u0205\5Z.\7\u0201\u0202\f\5\2\2\u0202\u0203\t\7\2\2\u0203\u0205\5Z.\6"+
		"\u0204\u01f7\3\2\2\2\u0204\u01fd\3\2\2\2\u0204\u0201\3\2\2\2\u0205\u0208"+
		"\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207[\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0209\u020a\7,\2\2\u020a]\3\2\2\2\u020b\u020c\7-\2\2\u020c"+
		"_\3\2\2\2\u020d\u020e\7.\2\2\u020ea\3\2\2\2\u020f\u0210\5j\66\2\u0210"+
		"\u0211\7/\2\2\u0211\u0216\3\2\2\2\u0212\u0213\5j\66\2\u0213\u0214\7\60"+
		"\2\2\u0214\u0216\3\2\2\2\u0215\u020f\3\2\2\2\u0215\u0212\3\2\2\2\u0216"+
		"c\3\2\2\2\u0217\u0234\5j\66\2\u0218\u021a\7\30\2\2\u0219\u0218\3\2\2\2"+
		"\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0234\5l\67\2\u021c\u021d"+
		"\5j\66\2\u021d\u021e\7\16\2\2\u021e\u021f\5d\63\2\u021f\u0220\7\17\2\2"+
		"\u0220\u0234\3\2\2\2\u0221\u0222\5j\66\2\u0222\u0223\7\16\2\2\u0223\u0224"+
		"\5d\63\2\u0224\u0225\7\20\2\2\u0225\u0226\5d\63\2\u0226\u0227\7\17\2\2"+
		"\u0227\u0234\3\2\2\2\u0228\u0229\5j\66\2\u0229\u022a\7\61\2\2\u022a\u0234"+
		"\3\2\2\2\u022b\u022c\5j\66\2\u022c\u022d\7\62\2\2\u022d\u0234\3\2\2\2"+
		"\u022e\u022f\5j\66\2\u022f\u0230\7\63\2\2\u0230\u0234\3\2\2\2\u0231\u0234"+
		"\5f\64\2\u0232\u0234\5h\65\2\u0233\u0217\3\2\2\2\u0233\u0219\3\2\2\2\u0233"+
		"\u021c\3\2\2\2\u0233\u0221\3\2\2\2\u0233\u0228\3\2\2\2\u0233\u022b\3\2"+
		"\2\2\u0233\u022e\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0232\3\2\2\2\u0234"+
		"e\3\2\2\2\u0235\u0236\5j\66\2\u0236\u023f\7\7\2\2\u0237\u023c\5j\66\2"+
		"\u0238\u0239\7\20\2\2\u0239\u023b\5j\66\2\u023a\u0238\3\2\2\2\u023b\u023e"+
		"\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0240\3\2\2\2\u023e"+
		"\u023c\3\2\2\2\u023f\u0237\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2"+
		"\2\2\u0241\u0242\7\b\2\2\u0242g\3\2\2\2\u0243\u0244\5j\66\2\u0244\u024d"+
		"\7\7\2\2\u0245\u024a\5j\66\2\u0246\u0247\7\20\2\2\u0247\u0249\5j\66\2"+
		"\u0248\u0246\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b"+
		"\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u0245\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\7\b\2\2\u0250\u0251\7\64"+
		"\2\2\u0251i\3\2\2\2\u0252\u0253\79\2\2\u0253k\3\2\2\2\u0254\u0255\t\b"+
		"\2\2\u0255m\3\2\2\2\u0256\u0257\t\t\2\2\u0257o\3\2\2\2/u\u0084\u008c\u008e"+
		"\u0094\u00a0\u00b7\u00bc\u00c1\u00e2\u00eb\u00f4\u00fa\u0103\u0109\u010f"+
		"\u011a\u0125\u0130\u0136\u0153\u0171\u0180\u0188\u018e\u0195\u019d\u01a1"+
		"\u01b4\u01d7\u01dc\u01e6\u01e8\u01f2\u01f5\u01fa\u0204\u0206\u0215\u0219"+
		"\u0233\u023c\u023f\u024a\u024d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}