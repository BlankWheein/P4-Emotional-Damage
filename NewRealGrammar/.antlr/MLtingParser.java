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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, STRING_CONSTANT=50, Inum=51, Fnum=52, 
		Dnum=53, ID=54, WS=55;
	public static final int
		RULE_prog = 0, RULE_stmts = 1, RULE_block = 2, RULE_stmt = 3, RULE_print = 4, 
		RULE_func = 5, RULE_gradfunc = 6, RULE_rettype = 7, RULE_parameters = 8, 
		RULE_parameter = 9, RULE_matrixparameter = 10, RULE_intdcl = 11, RULE_doubledcl = 12, 
		RULE_floatdcl = 13, RULE_intarrdcl = 14, RULE_doublearrdcl = 15, RULE_floatarrdcl = 16, 
		RULE_arrupdate = 17, RULE_arrassign = 18, RULE_matrixassign = 19, RULE_intmatrixdcl = 20, 
		RULE_doublematrixdcl = 21, RULE_floatmatrixdcl = 22, RULE_matrixupdate = 23, 
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
			"prog", "stmts", "block", "stmt", "print", "func", "gradfunc", "rettype", 
			"parameters", "parameter", "matrixparameter", "intdcl", "doubledcl", 
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
			null, "'{'", "'}'", "';'", "'print'", "'('", "')'", "'func'", "'autograd'", 
			"'string'", "'void'", "'['", "']'", "','", "'int'", "'='", "'double'", 
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
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__20) | (1L << T__25) | (1L << T__28) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__40) | (1L << Inum) | (1L << Fnum) | (1L << Dnum) | (1L << ID))) != 0)) {
				{
				setState(111);
				stmt();
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__0);
			setState(117);
			stmts();
			setState(118);
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
		public MatrixassignContext matrixassign() {
			return getRuleContext(MatrixassignContext.class,0);
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
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__13:
			case T__15:
			case T__16:
			case T__20:
			case T__25:
			case T__33:
			case T__37:
			case T__40:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(120);
					numassign();
					}
					break;
				case 2:
					{
					setState(121);
					boolassign();
					}
					break;
				case 3:
					{
					setState(122);
					arrassign();
					}
					break;
				case 4:
					{
					setState(123);
					matrixassign();
					}
					break;
				case 5:
					{
					setState(124);
					unaryoperator();
					}
					break;
				case 6:
					{
					setState(125);
					print();
					}
					break;
				case 7:
					{
					setState(126);
					funccall();
					}
					break;
				case 8:
					{
					setState(127);
					gradfunccall();
					}
					break;
				}
				setState(130);
				match(T__2);
				}
				}
				break;
			case T__6:
			case T__7:
			case T__28:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__31:
				case T__32:
					{
					setState(132);
					iterative();
					}
					break;
				case T__28:
					{
					setState(133);
					selective();
					}
					break;
				case T__6:
					{
					setState(134);
					func();
					}
					break;
				case T__7:
					{
					setState(135);
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
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__3);
				setState(141);
				match(T__4);
				setState(142);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				bexpr(0);
				setState(144);
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

	public static class FuncContext extends ParserRuleContext {
		public RettypeContext rettype() {
			return getRuleContext(RettypeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__6);
			setState(149);
			rettype();
			setState(150);
			id();
			setState(151);
			match(T__4);
			setState(152);
			parameters();
			setState(153);
			match(T__5);
			setState(154);
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
	}

	public final GradfuncContext gradfunc() throws RecognitionException {
		GradfuncContext _localctx = new GradfuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_gradfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__7);
			setState(157);
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
	}

	public final RettypeContext rettype() throws RecognitionException {
		RettypeContext _localctx = new RettypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rettype);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				numtypes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				numtypes();
				setState(163);
				match(T__10);
				setState(164);
				num();
				setState(165);
				match(T__11);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				numtypes();
				setState(168);
				match(T__10);
				setState(169);
				num();
				setState(170);
				match(T__12);
				setState(171);
				num();
				setState(172);
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
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			parameter();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(177);
				match(T__12);
				setState(178);
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
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(181);
				numtypes();
				}
				break;
			case 2:
				{
				setState(182);
				match(T__8);
				}
				break;
			case 3:
				{
				setState(183);
				matrixparameter();
				}
				break;
			}
			setState(186);
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
	}

	public final MatrixparameterContext matrixparameter() throws RecognitionException {
		MatrixparameterContext _localctx = new MatrixparameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_matrixparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			numtypes();
			setState(189);
			match(T__10);
			{
			setState(190);
			val();
			}
			setState(191);
			match(T__12);
			{
			setState(192);
			val();
			}
			setState(193);
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
		enterRule(_localctx, 22, RULE_intdcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__13);
			setState(196);
			id();
			setState(197);
			match(T__14);
			setState(198);
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
		enterRule(_localctx, 24, RULE_doubledcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__15);
			setState(201);
			id();
			setState(202);
			match(T__14);
			setState(203);
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
		enterRule(_localctx, 26, RULE_floatdcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__16);
			setState(206);
			id();
			setState(207);
			match(T__14);
			setState(208);
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
		enterRule(_localctx, 28, RULE_intarrdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__13);
			setState(211);
			match(T__10);
			setState(212);
			val();
			setState(213);
			match(T__11);
			setState(214);
			id();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(215);
				match(T__14);
				setState(216);
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
		enterRule(_localctx, 30, RULE_doublearrdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__15);
			setState(220);
			match(T__10);
			setState(221);
			val();
			setState(222);
			match(T__11);
			setState(223);
			id();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(224);
				match(T__14);
				setState(225);
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
		enterRule(_localctx, 32, RULE_floatarrdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__16);
			setState(229);
			match(T__10);
			setState(230);
			val();
			setState(231);
			match(T__11);
			setState(232);
			id();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(233);
				match(T__14);
				setState(234);
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
	}

	public final ArrupdateContext arrupdate() throws RecognitionException {
		ArrupdateContext _localctx = new ArrupdateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrupdate);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(237);
				id();
				setState(238);
				match(T__14);
				setState(241);
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
					setState(239);
					numexpr(0);
					}
					break;
				case T__22:
					{
					setState(240);
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
				setState(243);
				id();
				setState(244);
				match(T__10);
				setState(245);
				val();
				setState(246);
				match(T__11);
				setState(247);
				match(T__14);
				setState(248);
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
		enterRule(_localctx, 36, RULE_arrassign);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				intarrdcl();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				floatarrdcl();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				doublearrdcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
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
	}

	public final MatrixassignContext matrixassign() throws RecognitionException {
		MatrixassignContext _localctx = new MatrixassignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_matrixassign);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				intmatrixdcl();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				floatmatrixdcl();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				doublematrixdcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
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
		public IntmatrixdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intmatrixdcl; }
	}

	public final IntmatrixdclContext intmatrixdcl() throws RecognitionException {
		IntmatrixdclContext _localctx = new IntmatrixdclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_intmatrixdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__13);
			setState(265);
			match(T__10);
			setState(266);
			val();
			setState(267);
			match(T__12);
			setState(268);
			val();
			setState(269);
			match(T__11);
			setState(270);
			id();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(271);
				match(T__14);
				setState(272);
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
		public DoublematrixdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doublematrixdcl; }
	}

	public final DoublematrixdclContext doublematrixdcl() throws RecognitionException {
		DoublematrixdclContext _localctx = new DoublematrixdclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_doublematrixdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__15);
			setState(276);
			match(T__10);
			setState(277);
			val();
			setState(278);
			match(T__12);
			setState(279);
			val();
			setState(280);
			match(T__11);
			setState(281);
			id();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(282);
				match(T__14);
				setState(283);
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
		public FloatmatrixdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatmatrixdcl; }
	}

	public final FloatmatrixdclContext floatmatrixdcl() throws RecognitionException {
		FloatmatrixdclContext _localctx = new FloatmatrixdclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_floatmatrixdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__16);
			setState(287);
			match(T__10);
			setState(288);
			val();
			setState(289);
			match(T__12);
			setState(290);
			val();
			setState(291);
			match(T__11);
			setState(292);
			id();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(293);
				match(T__14);
				setState(294);
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
	}

	public final MatrixupdateContext matrixupdate() throws RecognitionException {
		MatrixupdateContext _localctx = new MatrixupdateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_matrixupdate);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(297);
				id();
				setState(298);
				match(T__14);
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(299);
					numexpr(0);
					}
					break;
				case 2:
					{
					setState(300);
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
				setState(303);
				id();
				setState(304);
				match(T__10);
				setState(305);
				val();
				setState(306);
				match(T__12);
				setState(307);
				val();
				setState(308);
				match(T__11);
				setState(309);
				match(T__14);
				setState(310);
				numexpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				id();
				setState(313);
				match(T__10);
				setState(314);
				val();
				setState(315);
				match(T__12);
				setState(316);
				match(T__17);
				setState(317);
				match(T__11);
				setState(318);
				match(T__14);
				setState(319);
				numexpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				id();
				setState(322);
				match(T__10);
				setState(323);
				match(T__17);
				setState(324);
				match(T__12);
				setState(325);
				val();
				setState(326);
				match(T__11);
				setState(327);
				match(T__14);
				setState(328);
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
	}

	public final MatrixarrexprContext matrixarrexpr() throws RecognitionException {
		MatrixarrexprContext _localctx = new MatrixarrexprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_matrixarrexpr);
		int _la;
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				id();
				setState(333);
				match(T__18);
				setState(334);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				id();
				setState(337);
				match(T__17);
				setState(338);
				val();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				id();
				setState(341);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(342);
				val();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				matrixtranspose();
				setState(345);
				match(T__4);
				setState(346);
				id();
				setState(347);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(349);
				matrixinverse();
				setState(350);
				match(T__4);
				setState(351);
				id();
				setState(352);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
				match(T__21);
				setState(355);
				match(T__4);
				setState(356);
				id();
				setState(357);
				match(T__5);
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
	}

	public final ArrexprContext arrexpr() throws RecognitionException {
		ArrexprContext _localctx = new ArrexprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrexpr);
		try {
			enterOuterAlt(_localctx, 1);
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
	}

	public final MatrixtransposeContext matrixtranspose() throws RecognitionException {
		MatrixtransposeContext _localctx = new MatrixtransposeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_matrixtranspose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
	}

	public final MatrixinverseContext matrixinverse() throws RecognitionException {
		MatrixinverseContext _localctx = new MatrixinverseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_matrixinverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
		enterRule(_localctx, 56, RULE_numassign);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				intdcl();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				doubledcl();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				floatdcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
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
		enterRule(_localctx, 58, RULE_numupdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			id();
			setState(377);
			match(T__14);
			setState(378);
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
		enterRule(_localctx, 60, RULE_boolassign);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				booldcl();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
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
		enterRule(_localctx, 62, RULE_boolupdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			id();
			setState(385);
			match(T__14);
			setState(388);
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
				setState(386);
				bexpr(0);
				}
				break;
			case T__26:
			case T__27:
				{
				setState(387);
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
		enterRule(_localctx, 64, RULE_booldcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__25);
			setState(391);
			id();
			setState(392);
			match(T__14);
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

	public static class BoolvalContext extends ParserRuleContext {
		public BoolvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolval; }
	}

	public final BoolvalContext boolval() throws RecognitionException {
		BoolvalContext _localctx = new BoolvalContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_boolval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
	}

	public final SelectiveContext selective() throws RecognitionException {
		SelectiveContext _localctx = new SelectiveContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			ifstmt();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(400);
				elifstmt();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(406);
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
		enterRule(_localctx, 70, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__28);
			setState(410);
			match(T__4);
			setState(411);
			bexpr(0);
			setState(412);
			match(T__5);
			setState(413);
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
		enterRule(_localctx, 72, RULE_elifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(T__29);
			setState(416);
			match(T__4);
			setState(417);
			bexpr(0);
			setState(418);
			match(T__5);
			setState(419);
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
		enterRule(_localctx, 74, RULE_elsestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(T__30);
			setState(422);
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
		enterRule(_localctx, 76, RULE_iterative);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				forstmt();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
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
		enterRule(_localctx, 78, RULE_forstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(T__31);
			setState(429);
			match(T__4);
			setState(430);
			intdcl();
			setState(431);
			match(T__2);
			setState(432);
			bexpr(0);
			setState(433);
			match(T__2);
			setState(434);
			unaryoperator();
			setState(435);
			match(T__5);
			setState(436);
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
		enterRule(_localctx, 80, RULE_whilestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(T__32);
			setState(439);
			match(T__4);
			setState(440);
			bexpr(0);
			setState(441);
			match(T__5);
			setState(442);
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
	}

	public final RandomContext random() throws RecognitionException {
		RandomContext _localctx = new RandomContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_random);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(T__33);
			setState(445);
			match(T__4);
			setState(446);
			val();
			setState(447);
			match(T__12);
			setState(448);
			val();
			setState(449);
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
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(452);
				match(T__4);
				setState(453);
				numexpr(0);
				setState(454);
				match(T__5);
				}
				break;
			case T__40:
				{
				setState(456);
				sqrt();
				setState(457);
				numexpr(6);
				}
				break;
			case T__33:
				{
				setState(459);
				random();
				}
				break;
			case T__20:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				{
				setState(460);
				val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(476);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(463);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(466);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__42:
							{
							setState(464);
							mod();
							}
							break;
						case T__41:
							{
							setState(465);
							power();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(468);
						numexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(470);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(471);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(472);
						numexpr(5);
						}
						break;
					case 3:
						{
						_localctx = new NumexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_numexpr);
						setState(473);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(474);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(475);
						numexpr(4);
						}
						break;
					}
					} 
				}
				setState(480);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_bexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(482);
				match(T__37);
				setState(483);
				match(T__4);
				setState(484);
				bexpr(0);
				setState(485);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(487);
					match(T__37);
					}
				}

				setState(490);
				numexpr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(506);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(493);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(494);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(496);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__14) {
							{
							setState(495);
							match(T__14);
							}
						}

						setState(498);
						bexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(499);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(500);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__37) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(501);
						match(T__14);
						setState(502);
						bexpr(5);
						}
						break;
					case 3:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(503);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(504);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(505);
						bexpr(4);
						}
						break;
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 88, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
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
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
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
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
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
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_unaryoperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(517);
				id();
				setState(518);
				match(T__43);
				}
				break;
			case 2:
				{
				setState(520);
				id();
				setState(521);
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
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_val);
		int _la;
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(526);
					match(T__20);
					}
				}

				setState(529);
				num();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				id();
				setState(531);
				match(T__10);
				setState(532);
				val();
				setState(533);
				match(T__11);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				id();
				setState(536);
				match(T__10);
				setState(537);
				val();
				setState(538);
				match(T__12);
				setState(539);
				val();
				setState(540);
				match(T__11);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(542);
				id();
				setState(543);
				match(T__45);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(545);
				id();
				setState(546);
				match(T__46);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(548);
				id();
				setState(549);
				match(T__47);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(551);
				funccall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(552);
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
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			id();
			setState(556);
			match(T__4);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(557);
				id();
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(558);
					match(T__12);
					setState(559);
					id();
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(567);
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
	}

	public final GradfunccallContext gradfunccall() throws RecognitionException {
		GradfunccallContext _localctx = new GradfunccallContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_gradfunccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			id();
			setState(570);
			match(T__4);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(571);
				id();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(572);
					match(T__12);
					setState(573);
					id();
					}
					}
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(581);
			match(T__5);
			setState(582);
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
		public TerminalNode ID() { return getToken(MLtingParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
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
		enterRule(_localctx, 104, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
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
	}

	public final NumtypesContext numtypes() throws RecognitionException {
		NumtypesContext _localctx = new NumtypesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_numtypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0251\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\3\3\3\3\3\5\3u\n\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0083\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5\u008b\n\5\5\5\u008d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0095"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b1\n\t\3\n\3\n\3\n\5\n\u00b6"+
		"\n\n\3\13\3\13\3\13\5\13\u00bb\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00dc\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00e5\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00ee\n\22\3\23\3\23\3\23\3\23\5\23\u00f4\n\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u00fd\n\23\3\24\3\24\3\24\3\24\5\24\u0103\n\24"+
		"\3\25\3\25\3\25\3\25\5\25\u0109\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0114\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u011f\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u012a"+
		"\n\30\3\31\3\31\3\31\3\31\5\31\u0130\n\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u014d\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u016a\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0179\n\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \5 \u0181\n \3!\3!\3!\3!\5!\u0187\n!\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u018e\n\"\3#\3#\3$\3$\7$\u0194\n$\f$\16$\u0197\13$\3"+
		"$\5$\u019a\n$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\5"+
		"(\u01ad\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01d0\n,\3,\3,\3,\5,\u01d5"+
		"\n,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u01df\n,\f,\16,\u01e2\13,\3-\3-\3-\3-\3"+
		"-\3-\3-\5-\u01eb\n-\3-\5-\u01ee\n-\3-\3-\3-\5-\u01f3\n-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\7-\u01fd\n-\f-\16-\u0200\13-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u020e\n\61\3\62\3\62\5\62\u0212\n\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u022c\n\62\3\63\3\63"+
		"\3\63\3\63\3\63\7\63\u0233\n\63\f\63\16\63\u0236\13\63\5\63\u0238\n\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\7\64\u0241\n\64\f\64\16\64\u0244\13"+
		"\64\5\64\u0246\n\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67"+
		"\2\4VX8\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\n\3\2\26\27\3\2\35\36\4\2\24\24%%\3\2&\'"+
		"\4\2\21\21((\3\2)*\3\2\65\67\4\2\20\20\22\23\2\u0269\2n\3\2\2\2\4t\3\2"+
		"\2\2\6v\3\2\2\2\b\u008c\3\2\2\2\n\u0094\3\2\2\2\f\u0096\3\2\2\2\16\u009e"+
		"\3\2\2\2\20\u00b0\3\2\2\2\22\u00b2\3\2\2\2\24\u00ba\3\2\2\2\26\u00be\3"+
		"\2\2\2\30\u00c5\3\2\2\2\32\u00ca\3\2\2\2\34\u00cf\3\2\2\2\36\u00d4\3\2"+
		"\2\2 \u00dd\3\2\2\2\"\u00e6\3\2\2\2$\u00fc\3\2\2\2&\u0102\3\2\2\2(\u0108"+
		"\3\2\2\2*\u010a\3\2\2\2,\u0115\3\2\2\2.\u0120\3\2\2\2\60\u014c\3\2\2\2"+
		"\62\u0169\3\2\2\2\64\u016b\3\2\2\2\66\u0170\3\2\2\28\u0172\3\2\2\2:\u0178"+
		"\3\2\2\2<\u017a\3\2\2\2>\u0180\3\2\2\2@\u0182\3\2\2\2B\u0188\3\2\2\2D"+
		"\u018f\3\2\2\2F\u0191\3\2\2\2H\u019b\3\2\2\2J\u01a1\3\2\2\2L\u01a7\3\2"+
		"\2\2N\u01ac\3\2\2\2P\u01ae\3\2\2\2R\u01b8\3\2\2\2T\u01be\3\2\2\2V\u01cf"+
		"\3\2\2\2X\u01ed\3\2\2\2Z\u0201\3\2\2\2\\\u0203\3\2\2\2^\u0205\3\2\2\2"+
		"`\u020d\3\2\2\2b\u022b\3\2\2\2d\u022d\3\2\2\2f\u023b\3\2\2\2h\u024a\3"+
		"\2\2\2j\u024c\3\2\2\2l\u024e\3\2\2\2no\5\4\3\2op\7\2\2\3p\3\3\2\2\2qr"+
		"\5\b\5\2rs\5\4\3\2su\3\2\2\2tq\3\2\2\2tu\3\2\2\2u\5\3\2\2\2vw\7\3\2\2"+
		"wx\5\4\3\2xy\7\4\2\2y\7\3\2\2\2z\u0083\5:\36\2{\u0083\5> \2|\u0083\5&"+
		"\24\2}\u0083\5(\25\2~\u0083\5`\61\2\177\u0083\5\n\6\2\u0080\u0083\5d\63"+
		"\2\u0081\u0083\5f\64\2\u0082z\3\2\2\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082"+
		"}\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\5\2\2\u0085\u008d\3\2\2\2\u0086"+
		"\u008b\5N(\2\u0087\u008b\5F$\2\u0088\u008b\5\f\7\2\u0089\u008b\5\16\b"+
		"\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\t\3\2\2\2\u008e\u008f\7\6\2\2\u008f\u0090\7\7\2\2\u0090\u0095\7\64\2"+
		"\2\u0091\u0092\5X-\2\u0092\u0093\7\b\2\2\u0093\u0095\3\2\2\2\u0094\u008e"+
		"\3\2\2\2\u0094\u0091\3\2\2\2\u0095\13\3\2\2\2\u0096\u0097\7\t\2\2\u0097"+
		"\u0098\5\20\t\2\u0098\u0099\5h\65\2\u0099\u009a\7\7\2\2\u009a\u009b\5"+
		"\22\n\2\u009b\u009c\7\b\2\2\u009c\u009d\5\6\4\2\u009d\r\3\2\2\2\u009e"+
		"\u009f\7\n\2\2\u009f\u00a0\5\f\7\2\u00a0\17\3\2\2\2\u00a1\u00b1\5l\67"+
		"\2\u00a2\u00b1\7\13\2\2\u00a3\u00b1\7\f\2\2\u00a4\u00a5\5l\67\2\u00a5"+
		"\u00a6\7\r\2\2\u00a6\u00a7\5j\66\2\u00a7\u00a8\7\16\2\2\u00a8\u00b1\3"+
		"\2\2\2\u00a9\u00aa\5l\67\2\u00aa\u00ab\7\r\2\2\u00ab\u00ac\5j\66\2\u00ac"+
		"\u00ad\7\17\2\2\u00ad\u00ae\5j\66\2\u00ae\u00af\7\16\2\2\u00af\u00b1\3"+
		"\2\2\2\u00b0\u00a1\3\2\2\2\u00b0\u00a2\3\2\2\2\u00b0\u00a3\3\2\2\2\u00b0"+
		"\u00a4\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b5\5\24\13"+
		"\2\u00b3\u00b4\7\17\2\2\u00b4\u00b6\5\22\n\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\23\3\2\2\2\u00b7\u00bb\5l\67\2\u00b8\u00bb\7\13\2"+
		"\2\u00b9\u00bb\5\26\f\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\5h\65\2\u00bd\25\3\2\2"+
		"\2\u00be\u00bf\5l\67\2\u00bf\u00c0\7\r\2\2\u00c0\u00c1\5b\62\2\u00c1\u00c2"+
		"\7\17\2\2\u00c2\u00c3\5b\62\2\u00c3\u00c4\7\16\2\2\u00c4\27\3\2\2\2\u00c5"+
		"\u00c6\7\20\2\2\u00c6\u00c7\5h\65\2\u00c7\u00c8\7\21\2\2\u00c8\u00c9\5"+
		"V,\2\u00c9\31\3\2\2\2\u00ca\u00cb\7\22\2\2\u00cb\u00cc\5h\65\2\u00cc\u00cd"+
		"\7\21\2\2\u00cd\u00ce\5V,\2\u00ce\33\3\2\2\2\u00cf\u00d0\7\23\2\2\u00d0"+
		"\u00d1\5h\65\2\u00d1\u00d2\7\21\2\2\u00d2\u00d3\5V,\2\u00d3\35\3\2\2\2"+
		"\u00d4\u00d5\7\20\2\2\u00d5\u00d6\7\r\2\2\u00d6\u00d7\5b\62\2\u00d7\u00d8"+
		"\7\16\2\2\u00d8\u00db\5h\65\2\u00d9\u00da\7\21\2\2\u00da\u00dc\5b\62\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\37\3\2\2\2\u00dd\u00de"+
		"\7\22\2\2\u00de\u00df\7\r\2\2\u00df\u00e0\5b\62\2\u00e0\u00e1\7\16\2\2"+
		"\u00e1\u00e4\5h\65\2\u00e2\u00e3\7\21\2\2\u00e3\u00e5\5b\62\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5!\3\2\2\2\u00e6\u00e7\7\23\2\2\u00e7"+
		"\u00e8\7\r\2\2\u00e8\u00e9\5b\62\2\u00e9\u00ea\7\16\2\2\u00ea\u00ed\5"+
		"h\65\2\u00eb\u00ec\7\21\2\2\u00ec\u00ee\5b\62\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee#\3\2\2\2\u00ef\u00f0\5h\65\2\u00f0\u00f3\7\21\2\2"+
		"\u00f1\u00f4\5V,\2\u00f2\u00f4\5\64\33\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\u00fd\3\2\2\2\u00f5\u00f6\5h\65\2\u00f6\u00f7\7\r\2\2\u00f7"+
		"\u00f8\5b\62\2\u00f8\u00f9\7\16\2\2\u00f9\u00fa\7\21\2\2\u00fa\u00fb\5"+
		"V,\2\u00fb\u00fd\3\2\2\2\u00fc\u00ef\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fd"+
		"%\3\2\2\2\u00fe\u0103\5\36\20\2\u00ff\u0103\5\"\22\2\u0100\u0103\5 \21"+
		"\2\u0101\u0103\5$\23\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0101\3\2\2\2\u0103\'\3\2\2\2\u0104\u0109\5*\26\2\u0105"+
		"\u0109\5.\30\2\u0106\u0109\5,\27\2\u0107\u0109\5\60\31\2\u0108\u0104\3"+
		"\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		")\3\2\2\2\u010a\u010b\7\20\2\2\u010b\u010c\7\r\2\2\u010c\u010d\5b\62\2"+
		"\u010d\u010e\7\17\2\2\u010e\u010f\5b\62\2\u010f\u0110\7\16\2\2\u0110\u0113"+
		"\5h\65\2\u0111\u0112\7\21\2\2\u0112\u0114\5b\62\2\u0113\u0111\3\2\2\2"+
		"\u0113\u0114\3\2\2\2\u0114+\3\2\2\2\u0115\u0116\7\22\2\2\u0116\u0117\7"+
		"\r\2\2\u0117\u0118\5b\62\2\u0118\u0119\7\17\2\2\u0119\u011a\5b\62\2\u011a"+
		"\u011b\7\16\2\2\u011b\u011e\5h\65\2\u011c\u011d\7\21\2\2\u011d\u011f\5"+
		"b\62\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f-\3\2\2\2\u0120\u0121"+
		"\7\23\2\2\u0121\u0122\7\r\2\2\u0122\u0123\5b\62\2\u0123\u0124\7\17\2\2"+
		"\u0124\u0125\5b\62\2\u0125\u0126\7\16\2\2\u0126\u0129\5h\65\2\u0127\u0128"+
		"\7\21\2\2\u0128\u012a\5b\62\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2"+
		"\u012a/\3\2\2\2\u012b\u012c\5h\65\2\u012c\u012f\7\21\2\2\u012d\u0130\5"+
		"V,\2\u012e\u0130\5\62\32\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u014d\3\2\2\2\u0131\u0132\5h\65\2\u0132\u0133\7\r\2\2\u0133\u0134\5b"+
		"\62\2\u0134\u0135\7\17\2\2\u0135\u0136\5b\62\2\u0136\u0137\7\16\2\2\u0137"+
		"\u0138\7\21\2\2\u0138\u0139\5V,\2\u0139\u014d\3\2\2\2\u013a\u013b\5h\65"+
		"\2\u013b\u013c\7\r\2\2\u013c\u013d\5b\62\2\u013d\u013e\7\17\2\2\u013e"+
		"\u013f\7\24\2\2\u013f\u0140\7\16\2\2\u0140\u0141\7\21\2\2\u0141\u0142"+
		"\5V,\2\u0142\u014d\3\2\2\2\u0143\u0144\5h\65\2\u0144\u0145\7\r\2\2\u0145"+
		"\u0146\7\24\2\2\u0146\u0147\7\17\2\2\u0147\u0148\5b\62\2\u0148\u0149\7"+
		"\16\2\2\u0149\u014a\7\21\2\2\u014a\u014b\5V,\2\u014b\u014d\3\2\2\2\u014c"+
		"\u012b\3\2\2\2\u014c\u0131\3\2\2\2\u014c\u013a\3\2\2\2\u014c\u0143\3\2"+
		"\2\2\u014d\61\3\2\2\2\u014e\u014f\5h\65\2\u014f\u0150\7\25\2\2\u0150\u0151"+
		"\5h\65\2\u0151\u016a\3\2\2\2\u0152\u0153\5h\65\2\u0153\u0154\7\24\2\2"+
		"\u0154\u0155\5b\62\2\u0155\u016a\3\2\2\2\u0156\u0157\5h\65\2\u0157\u0158"+
		"\t\2\2\2\u0158\u0159\5b\62\2\u0159\u016a\3\2\2\2\u015a\u015b\5\66\34\2"+
		"\u015b\u015c\7\7\2\2\u015c\u015d\5h\65\2\u015d\u015e\7\b\2\2\u015e\u016a"+
		"\3\2\2\2\u015f\u0160\58\35\2\u0160\u0161\7\7\2\2\u0161\u0162\5h\65\2\u0162"+
		"\u0163\7\b\2\2\u0163\u016a\3\2\2\2\u0164\u0165\7\30\2\2\u0165\u0166\7"+
		"\7\2\2\u0166\u0167\5h\65\2\u0167\u0168\7\b\2\2\u0168\u016a\3\2\2\2\u0169"+
		"\u014e\3\2\2\2\u0169\u0152\3\2\2\2\u0169\u0156\3\2\2\2\u0169\u015a\3\2"+
		"\2\2\u0169\u015f\3\2\2\2\u0169\u0164\3\2\2\2\u016a\63\3\2\2\2\u016b\u016c"+
		"\7\31\2\2\u016c\u016d\7\7\2\2\u016d\u016e\5h\65\2\u016e\u016f\7\b\2\2"+
		"\u016f\65\3\2\2\2\u0170\u0171\7\32\2\2\u0171\67\3\2\2\2\u0172\u0173\7"+
		"\33\2\2\u01739\3\2\2\2\u0174\u0179\5\30\r\2\u0175\u0179\5\32\16\2\u0176"+
		"\u0179\5\34\17\2\u0177\u0179\5<\37\2\u0178\u0174\3\2\2\2\u0178\u0175\3"+
		"\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179;\3\2\2\2\u017a\u017b"+
		"\5h\65\2\u017b\u017c\7\21\2\2\u017c\u017d\5V,\2\u017d=\3\2\2\2\u017e\u0181"+
		"\5B\"\2\u017f\u0181\5@!\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181"+
		"?\3\2\2\2\u0182\u0183\5h\65\2\u0183\u0186\7\21\2\2\u0184\u0187\5X-\2\u0185"+
		"\u0187\5D#\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187A\3\2\2\2\u0188"+
		"\u0189\7\34\2\2\u0189\u018a\5h\65\2\u018a\u018d\7\21\2\2\u018b\u018e\5"+
		"X-\2\u018c\u018e\5D#\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018eC"+
		"\3\2\2\2\u018f\u0190\t\3\2\2\u0190E\3\2\2\2\u0191\u0195\5H%\2\u0192\u0194"+
		"\5J&\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019a\5L"+
		"\'\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019aG\3\2\2\2\u019b\u019c"+
		"\7\37\2\2\u019c\u019d\7\7\2\2\u019d\u019e\5X-\2\u019e\u019f\7\b\2\2\u019f"+
		"\u01a0\5\6\4\2\u01a0I\3\2\2\2\u01a1\u01a2\7 \2\2\u01a2\u01a3\7\7\2\2\u01a3"+
		"\u01a4\5X-\2\u01a4\u01a5\7\b\2\2\u01a5\u01a6\5\6\4\2\u01a6K\3\2\2\2\u01a7"+
		"\u01a8\7!\2\2\u01a8\u01a9\5\6\4\2\u01a9M\3\2\2\2\u01aa\u01ad\5P)\2\u01ab"+
		"\u01ad\5R*\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01adO\3\2\2\2\u01ae"+
		"\u01af\7\"\2\2\u01af\u01b0\7\7\2\2\u01b0\u01b1\5\30\r\2\u01b1\u01b2\7"+
		"\5\2\2\u01b2\u01b3\5X-\2\u01b3\u01b4\7\5\2\2\u01b4\u01b5\5`\61\2\u01b5"+
		"\u01b6\7\b\2\2\u01b6\u01b7\5\6\4\2\u01b7Q\3\2\2\2\u01b8\u01b9\7#\2\2\u01b9"+
		"\u01ba\7\7\2\2\u01ba\u01bb\5X-\2\u01bb\u01bc\7\b\2\2\u01bc\u01bd\5\6\4"+
		"\2\u01bdS\3\2\2\2\u01be\u01bf\7$\2\2\u01bf\u01c0\7\7\2\2\u01c0\u01c1\5"+
		"b\62\2\u01c1\u01c2\7\17\2\2\u01c2\u01c3\5b\62\2\u01c3\u01c4\7\b\2\2\u01c4"+
		"U\3\2\2\2\u01c5\u01c6\b,\1\2\u01c6\u01c7\7\7\2\2\u01c7\u01c8\5V,\2\u01c8"+
		"\u01c9\7\b\2\2\u01c9\u01d0\3\2\2\2\u01ca\u01cb\5Z.\2\u01cb\u01cc\5V,\b"+
		"\u01cc\u01d0\3\2\2\2\u01cd\u01d0\5T+\2\u01ce\u01d0\5b\62\2\u01cf\u01c5"+
		"\3\2\2\2\u01cf\u01ca\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0"+
		"\u01e0\3\2\2\2\u01d1\u01d4\f\7\2\2\u01d2\u01d5\5^\60\2\u01d3\u01d5\5\\"+
		"/\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d7\5V,\b\u01d7\u01df\3\2\2\2\u01d8\u01d9\f\6\2\2\u01d9\u01da\t\4\2"+
		"\2\u01da\u01df\5V,\7\u01db\u01dc\f\5\2\2\u01dc\u01dd\t\2\2\2\u01dd\u01df"+
		"\5V,\6\u01de\u01d1\3\2\2\2\u01de\u01d8\3\2\2\2\u01de\u01db\3\2\2\2\u01df"+
		"\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1W\3\2\2\2"+
		"\u01e2\u01e0\3\2\2\2\u01e3\u01e4\b-\1\2\u01e4\u01e5\7(\2\2\u01e5\u01e6"+
		"\7\7\2\2\u01e6\u01e7\5X-\2\u01e7\u01e8\7\b\2\2\u01e8\u01ee\3\2\2\2\u01e9"+
		"\u01eb\7(\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ee\5V,\2\u01ed\u01e3\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ee\u01fe"+
		"\3\2\2\2\u01ef\u01f0\f\7\2\2\u01f0\u01f2\t\5\2\2\u01f1\u01f3\7\21\2\2"+
		"\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01fd"+
		"\5X-\b\u01f5\u01f6\f\6\2\2\u01f6\u01f7\t\6\2\2\u01f7\u01f8\7\21\2\2\u01f8"+
		"\u01fd\5X-\7\u01f9\u01fa\f\5\2\2\u01fa\u01fb\t\7\2\2\u01fb\u01fd\5X-\6"+
		"\u01fc\u01ef\3\2\2\2\u01fc\u01f5\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fd\u0200"+
		"\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ffY\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0201\u0202\7+\2\2\u0202[\3\2\2\2\u0203\u0204\7,\2\2\u0204"+
		"]\3\2\2\2\u0205\u0206\7-\2\2\u0206_\3\2\2\2\u0207\u0208\5h\65\2\u0208"+
		"\u0209\7.\2\2\u0209\u020e\3\2\2\2\u020a\u020b\5h\65\2\u020b\u020c\7/\2"+
		"\2\u020c\u020e\3\2\2\2\u020d\u0207\3\2\2\2\u020d\u020a\3\2\2\2\u020ea"+
		"\3\2\2\2\u020f\u022c\5h\65\2\u0210\u0212\7\27\2\2\u0211\u0210\3\2\2\2"+
		"\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u022c\5j\66\2\u0214\u0215"+
		"\5h\65\2\u0215\u0216\7\r\2\2\u0216\u0217\5b\62\2\u0217\u0218\7\16\2\2"+
		"\u0218\u022c\3\2\2\2\u0219\u021a\5h\65\2\u021a\u021b\7\r\2\2\u021b\u021c"+
		"\5b\62\2\u021c\u021d\7\17\2\2\u021d\u021e\5b\62\2\u021e\u021f\7\16\2\2"+
		"\u021f\u022c\3\2\2\2\u0220\u0221\5h\65\2\u0221\u0222\7\60\2\2\u0222\u022c"+
		"\3\2\2\2\u0223\u0224\5h\65\2\u0224\u0225\7\61\2\2\u0225\u022c\3\2\2\2"+
		"\u0226\u0227\5h\65\2\u0227\u0228\7\62\2\2\u0228\u022c\3\2\2\2\u0229\u022c"+
		"\5d\63\2\u022a\u022c\5f\64\2\u022b\u020f\3\2\2\2\u022b\u0211\3\2\2\2\u022b"+
		"\u0214\3\2\2\2\u022b\u0219\3\2\2\2\u022b\u0220\3\2\2\2\u022b\u0223\3\2"+
		"\2\2\u022b\u0226\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022a\3\2\2\2\u022c"+
		"c\3\2\2\2\u022d\u022e\5h\65\2\u022e\u0237\7\7\2\2\u022f\u0234\5h\65\2"+
		"\u0230\u0231\7\17\2\2\u0231\u0233\5h\65\2\u0232\u0230\3\2\2\2\u0233\u0236"+
		"\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0238\3\2\2\2\u0236"+
		"\u0234\3\2\2\2\u0237\u022f\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239\u023a\7\b\2\2\u023ae\3\2\2\2\u023b\u023c\5h\65\2\u023c\u0245"+
		"\7\7\2\2\u023d\u0242\5h\65\2\u023e\u023f\7\17\2\2\u023f\u0241\5h\65\2"+
		"\u0240\u023e\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243"+
		"\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u023d\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\7\b\2\2\u0248\u0249\7\63"+
		"\2\2\u0249g\3\2\2\2\u024a\u024b\78\2\2\u024bi\3\2\2\2\u024c\u024d\t\b"+
		"\2\2\u024dk\3\2\2\2\u024e\u024f\t\t\2\2\u024fm\3\2\2\2.t\u0082\u008a\u008c"+
		"\u0094\u00b0\u00b5\u00ba\u00db\u00e4\u00ed\u00f3\u00fc\u0102\u0108\u0113"+
		"\u011e\u0129\u012f\u014c\u0169\u0178\u0180\u0186\u018d\u0195\u0199\u01ac"+
		"\u01cf\u01d4\u01de\u01e0\u01ea\u01ed\u01f2\u01fc\u01fe\u020d\u0211\u022b"+
		"\u0234\u0237\u0242\u0245";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}