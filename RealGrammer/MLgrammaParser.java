// Generated from MLgramma.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MLgrammaParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, Inum=45, Fnum=46, 
		Dnum=47, String=48, ID=49, WHITESPACE=50, COMMENT=51;
	public static final int
		RULE_prog = 0, RULE_prototypes = 1, RULE_function_prototype = 2, RULE_stmts = 3, 
		RULE_stmt = 4, RULE_main = 5, RULE_block = 6, RULE_parameters = 7, RULE_function = 8, 
		RULE_function_call = 9, RULE_return_ = 10, RULE_one_word_statements = 11, 
		RULE_print = 12, RULE_assignment = 13, RULE_getters = 14, RULE_iterative = 15, 
		RULE_selective = 16, RULE_exprs = 17, RULE_expr = 18, RULE_bexpr = 19, 
		RULE_matrix_setters = 20, RULE_rettype = 21, RULE_array_constructs = 22, 
		RULE_val = 23, RULE_valtype = 24, RULE_num = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "prototypes", "function_prototype", "stmts", "stmt", "main", 
			"block", "parameters", "function", "function_call", "return_", "one_word_statements", 
			"print", "assignment", "getters", "iterative", "selective", "exprs", 
			"expr", "bexpr", "matrix_setters", "rettype", "array_constructs", "val", 
			"valtype", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'prototype'", "'autograd'", "'('", "','", "')'", "';'", "'main'", 
			"'{'", "'}'", "'fun'", "'='", "'.backwards'", "'return'", "'continue'", 
			"'break'", "'print'", "'string'", "'['", "']'", "'for'", "'while'", "'if'", 
			"'elif'", "'else'", "'sqrt'", "'%'", "'**'", "'*'", "'/'", "'+'", "'-'", 
			"'++'", "'--'", "'.'", "'.T'", "'>'", "'<'", "'!'", "'.random'", "'.one'", 
			"'.zero'", "'int'", "'float'", "'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Inum", "Fnum", 
			"Dnum", "String", "ID", "WHITESPACE", "COMMENT"
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
	public String getGrammarFileName() { return "MLgramma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MLgrammaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public PrototypesContext prototypes() {
			return getRuleContext(PrototypesContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MLgrammaParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			prototypes();
			setState(53);
			stmts();
			setState(54);
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

	public static class PrototypesContext extends ParserRuleContext {
		public Function_prototypeContext function_prototype() {
			return getRuleContext(Function_prototypeContext.class,0);
		}
		public PrototypesContext prototypes() {
			return getRuleContext(PrototypesContext.class,0);
		}
		public PrototypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterPrototypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitPrototypes(this);
		}
	}

	public final PrototypesContext prototypes() throws RecognitionException {
		PrototypesContext _localctx = new PrototypesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prototypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(56);
				function_prototype();
				setState(57);
				prototypes();
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

	public static class Function_prototypeContext extends ParserRuleContext {
		public List<RettypeContext> rettype() {
			return getRuleContexts(RettypeContext.class);
		}
		public RettypeContext rettype(int i) {
			return getRuleContext(RettypeContext.class,i);
		}
		public TerminalNode ID() { return getToken(MLgrammaParser.ID, 0); }
		public Function_prototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_prototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterFunction_prototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitFunction_prototype(this);
		}
	}

	public final Function_prototypeContext function_prototype() throws RecognitionException {
		Function_prototypeContext _localctx = new Function_prototypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_prototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(62);
			rettype();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(63);
				match(T__1);
				}
			}

			setState(66);
			match(ID);
			setState(67);
			match(T__2);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) {
				{
				setState(68);
				rettype();
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(69);
					match(T__3);
					setState(70);
					rettype();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(78);
			match(T__4);
			setState(79);
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
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << ID))) != 0)) {
				{
				setState(81);
				stmt();
				setState(82);
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

	public static class StmtContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public One_word_statementsContext one_word_statements() {
			return getRuleContext(One_word_statementsContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SelectiveContext selective() {
			return getRuleContext(SelectiveContext.class,0);
		}
		public IterativeContext iterative() {
			return getRuleContext(IterativeContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__41:
			case T__42:
			case T__43:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(86);
					function_call();
					}
					break;
				case 2:
					{
					setState(87);
					return_();
					}
					break;
				case 3:
					{
					setState(88);
					assignment();
					}
					break;
				case 4:
					{
					setState(89);
					print();
					}
					break;
				case 5:
					{
					setState(90);
					one_word_statements();
					}
					break;
				}
				setState(93);
				match(T__5);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				function();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				selective();
				}
				break;
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				iterative();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				main();
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

	public static class MainContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__6);
			setState(102);
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
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__7);
			setState(105);
			stmts();
			setState(106);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
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
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public Matrix_settersContext matrix_setters() {
			return getRuleContext(Matrix_settersContext.class,0);
		}
		public TerminalNode String() { return getToken(MLgrammaParser.String, 0); }
		public GettersContext getters() {
			return getRuleContext(GettersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameters);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				bexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				matrix_setters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(String);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				getters();
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

	public static class FunctionContext extends ParserRuleContext {
		public List<RettypeContext> rettype() {
			return getRuleContexts(RettypeContext.class);
		}
		public RettypeContext rettype(int i) {
			return getRuleContext(RettypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MLgrammaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLgrammaParser.ID, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__9);
			setState(115);
			rettype();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(116);
				match(T__1);
				}
			}

			setState(119);
			match(ID);
			setState(120);
			match(T__2);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) {
				{
				setState(121);
				rettype();
				setState(122);
				match(ID);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(123);
					match(T__3);
					setState(124);
					rettype();
					setState(125);
					match(ID);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(134);
			match(T__4);
			setState(135);
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

	public static class Function_callContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MLgrammaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLgrammaParser.ID, i);
		}
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public RettypeContext rettype() {
			return getRuleContext(RettypeContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(ID);
				setState(138);
				match(T__2);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__24) | (1L << T__29) | (1L << T__30) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << Inum) | (1L << Fnum) | (1L << Dnum) | (1L << String) | (1L << ID))) != 0)) {
					{
					setState(139);
					parameters();
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(140);
						match(T__3);
						setState(141);
						parameters();
						}
						}
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(149);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) {
					{
					setState(150);
					rettype();
					}
				}

				setState(153);
				match(ID);
				setState(154);
				match(T__10);
				setState(155);
				match(ID);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(156);
					match(T__11);
					}
				}

				setState(159);
				match(T__2);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__24) | (1L << T__29) | (1L << T__30) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << Inum) | (1L << Fnum) | (1L << Dnum) | (1L << String) | (1L << ID))) != 0)) {
					{
					setState(160);
					parameters();
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(161);
						match(T__3);
						setState(162);
						parameters();
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(170);
				match(T__4);
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

	public static class Return_Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterReturn_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitReturn_(this);
		}
	}

	public final Return_Context return_() throws RecognitionException {
		Return_Context _localctx = new Return_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__12);
			setState(174);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class One_word_statementsContext extends ParserRuleContext {
		public One_word_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_word_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterOne_word_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitOne_word_statements(this);
		}
	}

	public final One_word_statementsContext one_word_statements() throws RecognitionException {
		One_word_statementsContext _localctx = new One_word_statementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_one_word_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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

	public static class PrintContext extends ParserRuleContext {
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__15);
			setState(179);
			match(T__2);
			setState(180);
			parameters();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(181);
				match(T__3);
				setState(182);
				parameters();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MLgrammaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLgrammaParser.ID, i);
		}
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public ValtypeContext valtype() {
			return getRuleContext(ValtypeContext.class,0);
		}
		public List<TerminalNode> Inum() { return getTokens(MLgrammaParser.Inum); }
		public TerminalNode Inum(int i) {
			return getToken(MLgrammaParser.Inum, i);
		}
		public RettypeContext rettype() {
			return getRuleContext(RettypeContext.class,0);
		}
		public Array_constructsContext array_constructs() {
			return getRuleContext(Array_constructsContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__41:
				case T__42:
				case T__43:
					{
					setState(190);
					valtype();
					}
					break;
				case T__16:
					{
					setState(191);
					match(T__16);
					}
					break;
				case ID:
					break;
				default:
					break;
				}
				setState(194);
				match(ID);
				setState(195);
				match(T__10);
				setState(196);
				bexpr(0);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(197);
					match(T__3);
					setState(198);
					match(ID);
					setState(199);
					match(T__10);
					setState(200);
					bexpr(0);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				valtype();
				setState(207);
				match(T__17);
				setState(208);
				match(Inum);
				setState(209);
				match(T__3);
				setState(210);
				match(Inum);
				setState(211);
				match(T__18);
				setState(212);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(ID);
				setState(215);
				match(T__17);
				setState(216);
				match(Inum);
				setState(217);
				match(T__3);
				setState(218);
				match(Inum);
				setState(219);
				match(T__18);
				setState(220);
				match(T__10);
				setState(221);
				bexpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				rettype();
				setState(223);
				match(T__17);
				setState(224);
				match(Inum);
				setState(225);
				match(T__18);
				setState(226);
				match(ID);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(227);
					match(T__10);
					setState(228);
					array_constructs();
					}
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

	public static class GettersContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MLgrammaParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GettersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterGetters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitGetters(this);
		}
	}

	public final GettersContext getters() throws RecognitionException {
		GettersContext _localctx = new GettersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_getters);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(ID);
				setState(234);
				match(T__17);
				setState(235);
				expr(0);
				setState(236);
				match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(ID);
				setState(239);
				match(T__17);
				setState(240);
				expr(0);
				setState(241);
				match(T__3);
				setState(242);
				expr(0);
				setState(243);
				match(T__18);
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

	public static class IterativeContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IterativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterIterative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitIterative(this);
		}
	}

	public final IterativeContext iterative() throws RecognitionException {
		IterativeContext _localctx = new IterativeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_iterative);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__19);
				setState(248);
				match(T__2);
				setState(249);
				assignment();
				setState(250);
				match(T__5);
				setState(251);
				bexpr(0);
				setState(252);
				match(T__5);
				setState(253);
				exprs();
				setState(254);
				match(T__4);
				setState(255);
				block();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(T__20);
				setState(258);
				match(T__2);
				setState(259);
				bexpr(0);
				setState(260);
				match(T__4);
				setState(261);
				block();
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

	public static class SelectiveContext extends ParserRuleContext {
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public SelectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterSelective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitSelective(this);
		}
	}

	public final SelectiveContext selective() throws RecognitionException {
		SelectiveContext _localctx = new SelectiveContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_selective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__21);
			setState(266);
			match(T__2);
			setState(267);
			bexpr(0);
			setState(268);
			match(T__4);
			setState(269);
			block();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(270);
				match(T__22);
				setState(271);
				match(T__2);
				setState(272);
				bexpr(0);
				setState(273);
				match(T__4);
				setState(274);
				block();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(281);
				match(T__23);
				setState(282);
				block();
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

	public static class ExprsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitExprs(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			expr(0);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(286);
				match(T__3);
				setState(287);
				exprs();
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MLgrammaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLgrammaParser.ID, i);
		}
		public Matrix_settersContext matrix_setters() {
			return getRuleContext(Matrix_settersContext.class,0);
		}
		public GettersContext getters() {
			return getRuleContext(GettersContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(291);
				match(T__2);
				setState(292);
				expr(0);
				setState(293);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(295);
				match(ID);
				setState(296);
				matrix_setters();
				}
				break;
			case 3:
				{
				setState(297);
				match(T__24);
				setState(298);
				expr(10);
				}
				break;
			case 4:
				{
				setState(299);
				match(ID);
				setState(300);
				match(T__33);
				setState(301);
				match(ID);
				}
				break;
			case 5:
				{
				setState(302);
				match(ID);
				setState(303);
				match(T__34);
				}
				break;
			case 6:
				{
				setState(304);
				getters();
				}
				break;
			case 7:
				{
				setState(305);
				val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(308);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(309);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(310);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(311);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(312);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(313);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(314);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(315);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(316);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(317);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(318);
						match(T__31);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(319);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(320);
						match(T__32);
						}
						break;
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public TerminalNode String() { return getToken(MLgrammaParser.String, 0); }
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterBexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitBexpr(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_bexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(327);
				match(T__37);
				setState(328);
				expr(0);
				}
				break;
			case 2:
				{
				setState(329);
				match(T__37);
				setState(330);
				match(T__2);
				setState(331);
				bexpr(0);
				setState(332);
				match(T__4);
				}
				break;
			case 3:
				{
				setState(334);
				expr(0);
				}
				break;
			case 4:
				{
				setState(335);
				match(String);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(338);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(339);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(341);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__10) {
							{
							setState(340);
							match(T__10);
							}
						}

						setState(343);
						bexpr(7);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(344);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(345);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__37) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(346);
						match(T__10);
						setState(347);
						bexpr(6);
						}
						break;
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class Matrix_settersContext extends ParserRuleContext {
		public Matrix_settersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_setters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterMatrix_setters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitMatrix_setters(this);
		}
	}

	public final Matrix_settersContext matrix_setters() throws RecognitionException {
		Matrix_settersContext _localctx = new Matrix_settersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_matrix_setters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
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

	public static class RettypeContext extends ParserRuleContext {
		public ValtypeContext valtype() {
			return getRuleContext(ValtypeContext.class,0);
		}
		public RettypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rettype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterRettype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitRettype(this);
		}
	}

	public final RettypeContext rettype() throws RecognitionException {
		RettypeContext _localctx = new RettypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rettype);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				valtype();
				setState(364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(356);
					match(T__17);
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(357);
						match(T__3);
						}
						}
						setState(362);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(363);
					match(T__18);
					}
					break;
				}
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(T__16);
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

	public static class Array_constructsContext extends ParserRuleContext {
		public List<TerminalNode> Inum() { return getTokens(MLgrammaParser.Inum); }
		public TerminalNode Inum(int i) {
			return getToken(MLgrammaParser.Inum, i);
		}
		public List<TerminalNode> Fnum() { return getTokens(MLgrammaParser.Fnum); }
		public TerminalNode Fnum(int i) {
			return getToken(MLgrammaParser.Fnum, i);
		}
		public List<TerminalNode> Dnum() { return getTokens(MLgrammaParser.Dnum); }
		public TerminalNode Dnum(int i) {
			return getToken(MLgrammaParser.Dnum, i);
		}
		public List<TerminalNode> String() { return getTokens(MLgrammaParser.String); }
		public TerminalNode String(int i) {
			return getToken(MLgrammaParser.String, i);
		}
		public Array_constructsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_constructs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterArray_constructs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitArray_constructs(this);
		}
	}

	public final Array_constructsContext array_constructs() throws RecognitionException {
		Array_constructsContext _localctx = new Array_constructsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_array_constructs);
		int _la;
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(T__17);
				setState(370);
				match(Inum);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(371);
					match(T__3);
					setState(372);
					match(Inum);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378);
				match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(T__17);
				setState(380);
				match(Fnum);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(381);
					match(T__3);
					setState(382);
					match(Fnum);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(388);
				match(T__18);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(T__17);
				setState(390);
				match(Dnum);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(391);
					match(T__3);
					setState(392);
					match(Dnum);
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398);
				match(T__18);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				match(T__17);
				setState(400);
				match(String);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(401);
					match(T__3);
					setState(402);
					match(String);
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
				match(T__18);
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

	public static class ValContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MLgrammaParser.ID, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_val);
		int _la;
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(ID);
				}
				break;
			case T__29:
			case T__30:
			case Inum:
			case Fnum:
			case Dnum:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(412);
					match(T__29);
					}
					break;
				case T__30:
				case Inum:
				case Fnum:
				case Dnum:
					{
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__30) {
						{
						setState(413);
						match(T__30);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(418);
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

	public static class ValtypeContext extends ParserRuleContext {
		public ValtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterValtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitValtype(this);
		}
	}

	public final ValtypeContext valtype() throws RecognitionException {
		ValtypeContext _localctx = new ValtypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_valtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode Inum() { return getToken(MLgrammaParser.Inum, 0); }
		public TerminalNode Fnum() { return getToken(MLgrammaParser.Fnum, 0); }
		public TerminalNode Dnum() { return getToken(MLgrammaParser.Dnum, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
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
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 19:
			return bexpr_sempred((BexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean bexpr_sempred(BexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u01ac\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4"+
		"\5\4C\n\4\3\4\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\5\4O\n\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6f\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\ts\n\t"+
		"\3\n\3\n\3\n\5\nx\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0082\n\n\f"+
		"\n\16\n\u0085\13\n\5\n\u0087\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0091\n\13\f\13\16\13\u0094\13\13\5\13\u0096\n\13\3\13\3\13\5\13"+
		"\u009a\n\13\3\13\3\13\3\13\3\13\5\13\u00a0\n\13\3\13\3\13\3\13\3\13\7"+
		"\13\u00a6\n\13\f\13\16\13\u00a9\13\13\5\13\u00ab\n\13\3\13\5\13\u00ae"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u00ba\n\16\f\16"+
		"\16\16\u00bd\13\16\3\16\3\16\3\17\3\17\5\17\u00c3\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u00cc\n\17\f\17\16\17\u00cf\13\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e8\n\17\5\17\u00ea\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f8"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u010a\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u0117\n\22\f\22\16\22\u011a\13\22\3\22\3\22\5\22"+
		"\u011e\n\22\3\23\3\23\3\23\5\23\u0123\n\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0135\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u0144\n\24\f\24\16\24\u0147\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0153\n\25\3\25\3\25\3\25\5\25\u0158\n\25\3\25\3"+
		"\25\3\25\3\25\3\25\7\25\u015f\n\25\f\25\16\25\u0162\13\25\3\26\3\26\3"+
		"\27\3\27\3\27\7\27\u0169\n\27\f\27\16\27\u016c\13\27\3\27\5\27\u016f\n"+
		"\27\3\27\5\27\u0172\n\27\3\30\3\30\3\30\3\30\7\30\u0178\n\30\f\30\16\30"+
		"\u017b\13\30\3\30\3\30\3\30\3\30\3\30\7\30\u0182\n\30\f\30\16\30\u0185"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\7\30\u018c\n\30\f\30\16\30\u018f\13\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u0196\n\30\f\30\16\30\u0199\13\30\3\30"+
		"\5\30\u019c\n\30\3\31\3\31\3\31\5\31\u01a1\n\31\5\31\u01a3\n\31\3\31\5"+
		"\31\u01a6\n\31\3\32\3\32\3\33\3\33\3\33\2\4&(\34\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\13\3\2\20\21\3\2\34\35\3\2\36\37"+
		"\3\2 !\3\2&\'\4\2\r\r((\3\2)+\3\2,.\3\2/\61\2\u01d6\2\66\3\2\2\2\4=\3"+
		"\2\2\2\6?\3\2\2\2\bV\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16j\3\2\2\2\20r\3\2"+
		"\2\2\22t\3\2\2\2\24\u00ad\3\2\2\2\26\u00af\3\2\2\2\30\u00b2\3\2\2\2\32"+
		"\u00b4\3\2\2\2\34\u00e9\3\2\2\2\36\u00f7\3\2\2\2 \u0109\3\2\2\2\"\u010b"+
		"\3\2\2\2$\u011f\3\2\2\2&\u0134\3\2\2\2(\u0152\3\2\2\2*\u0163\3\2\2\2,"+
		"\u0171\3\2\2\2.\u019b\3\2\2\2\60\u01a5\3\2\2\2\62\u01a7\3\2\2\2\64\u01a9"+
		"\3\2\2\2\66\67\5\4\3\2\678\5\b\5\289\7\2\2\39\3\3\2\2\2:;\5\6\4\2;<\5"+
		"\4\3\2<>\3\2\2\2=:\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?@\7\3\2\2@B\5,\27\2AC"+
		"\7\4\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\63\2\2EN\7\5\2\2FK\5,\27\2"+
		"GH\7\6\2\2HJ\5,\27\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2NF\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\7\2\2QR\7\b\2\2R\7\3\2\2"+
		"\2ST\5\n\6\2TU\5\b\5\2UW\3\2\2\2VS\3\2\2\2VW\3\2\2\2W\t\3\2\2\2X^\5\24"+
		"\13\2Y^\5\26\f\2Z^\5\34\17\2[^\5\32\16\2\\^\5\30\r\2]X\3\2\2\2]Y\3\2\2"+
		"\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_`\7\b\2\2`f\3\2\2\2af\5\22"+
		"\n\2bf\5\"\22\2cf\5 \21\2df\5\f\7\2e]\3\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3"+
		"\2\2\2ed\3\2\2\2f\13\3\2\2\2gh\7\t\2\2hi\5\16\b\2i\r\3\2\2\2jk\7\n\2\2"+
		"kl\5\b\5\2lm\7\13\2\2m\17\3\2\2\2ns\5(\25\2os\5*\26\2ps\7\62\2\2qs\5\36"+
		"\20\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\21\3\2\2\2tu\7\f\2\2uw"+
		"\5,\27\2vx\7\4\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\63\2\2z\u0086\7\5"+
		"\2\2{|\5,\27\2|\u0083\7\63\2\2}~\7\6\2\2~\177\5,\27\2\177\u0080\7\63\2"+
		"\2\u0080\u0082\3\2\2\2\u0081}\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"{\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\7\2\2"+
		"\u0089\u008a\5\16\b\2\u008a\23\3\2\2\2\u008b\u008c\7\63\2\2\u008c\u0095"+
		"\7\5\2\2\u008d\u0092\5\20\t\2\u008e\u008f\7\6\2\2\u008f\u0091\5\20\t\2"+
		"\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u008d\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00ae\7\7\2\2\u0098\u009a\5,"+
		"\27\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\7\63\2\2\u009c\u009d\7\r\2\2\u009d\u009f\7\63\2\2\u009e\u00a0\7"+
		"\16\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00aa\7\5\2\2\u00a2\u00a7\5\20\t\2\u00a3\u00a4\7\6\2\2\u00a4\u00a6\5"+
		"\20\t\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00a2\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\7\7\2\2\u00ad"+
		"\u008b\3\2\2\2\u00ad\u0099\3\2\2\2\u00ae\25\3\2\2\2\u00af\u00b0\7\17\2"+
		"\2\u00b0\u00b1\5&\24\2\u00b1\27\3\2\2\2\u00b2\u00b3\t\2\2\2\u00b3\31\3"+
		"\2\2\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\7\5\2\2\u00b6\u00bb\5\20\t\2\u00b7"+
		"\u00b8\7\6\2\2\u00b8\u00ba\5\20\t\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\7\7\2\2\u00bf\33\3\2\2\2\u00c0\u00c3\5\62\32"+
		"\2\u00c1\u00c3\7\23\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\63\2\2\u00c5\u00c6\7"+
		"\r\2\2\u00c6\u00cd\5(\25\2\u00c7\u00c8\7\6\2\2\u00c8\u00c9\7\63\2\2\u00c9"+
		"\u00ca\7\r\2\2\u00ca\u00cc\5(\25\2\u00cb\u00c7\3\2\2\2\u00cc\u00cf\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00ea\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\5\62\32\2\u00d1\u00d2\7\24\2\2\u00d2\u00d3"+
		"\7/\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\7/\2\2\u00d5\u00d6\7\25\2\2\u00d6"+
		"\u00d7\7\63\2\2\u00d7\u00ea\3\2\2\2\u00d8\u00d9\7\63\2\2\u00d9\u00da\7"+
		"\24\2\2\u00da\u00db\7/\2\2\u00db\u00dc\7\6\2\2\u00dc\u00dd\7/\2\2\u00dd"+
		"\u00de\7\25\2\2\u00de\u00df\7\r\2\2\u00df\u00ea\5(\25\2\u00e0\u00e1\5"+
		",\27\2\u00e1\u00e2\7\24\2\2\u00e2\u00e3\7/\2\2\u00e3\u00e4\7\25\2\2\u00e4"+
		"\u00e7\7\63\2\2\u00e5\u00e6\7\r\2\2\u00e6\u00e8\5.\30\2\u00e7\u00e5\3"+
		"\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00c2\3\2\2\2\u00e9"+
		"\u00d0\3\2\2\2\u00e9\u00d8\3\2\2\2\u00e9\u00e0\3\2\2\2\u00ea\35\3\2\2"+
		"\2\u00eb\u00ec\7\63\2\2\u00ec\u00ed\7\24\2\2\u00ed\u00ee\5&\24\2\u00ee"+
		"\u00ef\7\25\2\2\u00ef\u00f8\3\2\2\2\u00f0\u00f1\7\63\2\2\u00f1\u00f2\7"+
		"\24\2\2\u00f2\u00f3\5&\24\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5\5&\24\2\u00f5"+
		"\u00f6\7\25\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00eb\3\2\2\2\u00f7\u00f0\3"+
		"\2\2\2\u00f8\37\3\2\2\2\u00f9\u00fa\7\26\2\2\u00fa\u00fb\7\5\2\2\u00fb"+
		"\u00fc\5\34\17\2\u00fc\u00fd\7\b\2\2\u00fd\u00fe\5(\25\2\u00fe\u00ff\7"+
		"\b\2\2\u00ff\u0100\5$\23\2\u0100\u0101\7\7\2\2\u0101\u0102\5\16\b\2\u0102"+
		"\u010a\3\2\2\2\u0103\u0104\7\27\2\2\u0104\u0105\7\5\2\2\u0105\u0106\5"+
		"(\25\2\u0106\u0107\7\7\2\2\u0107\u0108\5\16\b\2\u0108\u010a\3\2\2\2\u0109"+
		"\u00f9\3\2\2\2\u0109\u0103\3\2\2\2\u010a!\3\2\2\2\u010b\u010c\7\30\2\2"+
		"\u010c\u010d\7\5\2\2\u010d\u010e\5(\25\2\u010e\u010f\7\7\2\2\u010f\u0118"+
		"\5\16\b\2\u0110\u0111\7\31\2\2\u0111\u0112\7\5\2\2\u0112\u0113\5(\25\2"+
		"\u0113\u0114\7\7\2\2\u0114\u0115\5\16\b\2\u0115\u0117\3\2\2\2\u0116\u0110"+
		"\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011d\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\32\2\2\u011c\u011e\5"+
		"\16\b\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e#\3\2\2\2\u011f\u0122"+
		"\5&\24\2\u0120\u0121\7\6\2\2\u0121\u0123\5$\23\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123%\3\2\2\2\u0124\u0125\b\24\1\2\u0125\u0126\7\5\2\2"+
		"\u0126\u0127\5&\24\2\u0127\u0128\7\7\2\2\u0128\u0135\3\2\2\2\u0129\u012a"+
		"\7\63\2\2\u012a\u0135\5*\26\2\u012b\u012c\7\33\2\2\u012c\u0135\5&\24\f"+
		"\u012d\u012e\7\63\2\2\u012e\u012f\7$\2\2\u012f\u0135\7\63\2\2\u0130\u0131"+
		"\7\63\2\2\u0131\u0135\7%\2\2\u0132\u0135\5\36\20\2\u0133\u0135\5\60\31"+
		"\2\u0134\u0124\3\2\2\2\u0134\u0129\3\2\2\2\u0134\u012b\3\2\2\2\u0134\u012d"+
		"\3\2\2\2\u0134\u0130\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135"+
		"\u0145\3\2\2\2\u0136\u0137\f\13\2\2\u0137\u0138\t\3\2\2\u0138\u0144\5"+
		"&\24\f\u0139\u013a\f\n\2\2\u013a\u013b\t\4\2\2\u013b\u0144\5&\24\13\u013c"+
		"\u013d\f\t\2\2\u013d\u013e\t\5\2\2\u013e\u0144\5&\24\n\u013f\u0140\f\b"+
		"\2\2\u0140\u0144\7\"\2\2\u0141\u0142\f\7\2\2\u0142\u0144\7#\2\2\u0143"+
		"\u0136\3\2\2\2\u0143\u0139\3\2\2\2\u0143\u013c\3\2\2\2\u0143\u013f\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\'\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\b\25\1"+
		"\2\u0149\u014a\7(\2\2\u014a\u0153\5&\24\2\u014b\u014c\7(\2\2\u014c\u014d"+
		"\7\5\2\2\u014d\u014e\5(\25\2\u014e\u014f\7\7\2\2\u014f\u0153\3\2\2\2\u0150"+
		"\u0153\5&\24\2\u0151\u0153\7\62\2\2\u0152\u0148\3\2\2\2\u0152\u014b\3"+
		"\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0160\3\2\2\2\u0154"+
		"\u0155\f\b\2\2\u0155\u0157\t\6\2\2\u0156\u0158\7\r\2\2\u0157\u0156\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015f\5(\25\t\u015a"+
		"\u015b\f\7\2\2\u015b\u015c\t\7\2\2\u015c\u015d\7\r\2\2\u015d\u015f\5("+
		"\25\b\u015e\u0154\3\2\2\2\u015e\u015a\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161)\3\2\2\2\u0162\u0160\3\2\2\2"+
		"\u0163\u0164\t\b\2\2\u0164+\3\2\2\2\u0165\u016e\5\62\32\2\u0166\u016a"+
		"\7\24\2\2\u0167\u0169\7\6\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2"+
		"\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016d\u016f\7\25\2\2\u016e\u0166\3\2\2\2\u016e\u016f\3\2\2\2"+
		"\u016f\u0172\3\2\2\2\u0170\u0172\7\23\2\2\u0171\u0165\3\2\2\2\u0171\u0170"+
		"\3\2\2\2\u0172-\3\2\2\2\u0173\u0174\7\24\2\2\u0174\u0179\7/\2\2\u0175"+
		"\u0176\7\6\2\2\u0176\u0178\7/\2\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u019c\7\25\2\2\u017d\u017e\7\24\2\2\u017e\u0183\7"+
		"\60\2\2\u017f\u0180\7\6\2\2\u0180\u0182\7\60\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0186\u019c\7\25\2\2\u0187\u0188\7\24\2\2\u0188"+
		"\u018d\7\61\2\2\u0189\u018a\7\6\2\2\u018a\u018c\7\61\2\2\u018b\u0189\3"+
		"\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u019c\7\25\2\2\u0191\u0192\7"+
		"\24\2\2\u0192\u0197\7\62\2\2\u0193\u0194\7\6\2\2\u0194\u0196\7\62\2\2"+
		"\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c\7\25\2\2"+
		"\u019b\u0173\3\2\2\2\u019b\u017d\3\2\2\2\u019b\u0187\3\2\2\2\u019b\u0191"+
		"\3\2\2\2\u019c/\3\2\2\2\u019d\u01a6\7\63\2\2\u019e\u01a3\7 \2\2\u019f"+
		"\u01a1\7!\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2"+
		"\2\2\u01a2\u019e\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a6\5\64\33\2\u01a5\u019d\3\2\2\2\u01a5\u01a2\3\2\2\2\u01a6\61\3\2"+
		"\2\2\u01a7\u01a8\t\t\2\2\u01a8\63\3\2\2\2\u01a9\u01aa\t\n\2\2\u01aa\65"+
		"\3\2\2\2\60=BKNV]erw\u0083\u0086\u0092\u0095\u0099\u009f\u00a7\u00aa\u00ad"+
		"\u00bb\u00c2\u00cd\u00e7\u00e9\u00f7\u0109\u0118\u011d\u0122\u0134\u0143"+
		"\u0145\u0152\u0157\u015e\u0160\u016a\u016e\u0171\u0179\u0183\u018d\u0197"+
		"\u019b\u01a0\u01a2\u01a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}