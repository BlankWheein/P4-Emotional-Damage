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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, Inum=44, Fnum=45, Dnum=46, 
		String=47, ID=48, WHITESPACE=49, COMMENT=50;
	public static final int
		RULE_prog = 0, RULE_prototypes = 1, RULE_function_prototype = 2, RULE_stmts = 3, 
		RULE_stmt = 4, RULE_main = 5, RULE_block = 6, RULE_parameters = 7, RULE_function = 8, 
		RULE_function_call = 9, RULE_return_ = 10, RULE_one_word_statements = 11, 
		RULE_print = 12, RULE_assignment = 13, RULE_getters = 14, RULE_iterative = 15, 
		RULE_selective = 16, RULE_exprs = 17, RULE_expr = 18, RULE_bexpr = 19, 
		RULE_matrix_pre_stuff = 20, RULE_rettype = 21, RULE_array_constructs = 22, 
		RULE_val = 23, RULE_valtype = 24, RULE_num = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "prototypes", "function_prototype", "stmts", "stmt", "main", 
			"block", "parameters", "function", "function_call", "return_", "one_word_statements", 
			"print", "assignment", "getters", "iterative", "selective", "exprs", 
			"expr", "bexpr", "matrix_pre_stuff", "rettype", "array_constructs", "val", 
			"valtype", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'prototype'", "'auto'", "'('", "','", "')'", "';'", "'main'", 
			"'{'", "'}'", "'fun'", "'='", "'return'", "'continue'", "'break'", "'print'", 
			"'string'", "'['", "']'", "'for'", "'while'", "'if'", "'elif'", "'else'", 
			"'sqrt'", "'%'", "'**'", "'*'", "'/'", "'+'", "'-'", "'++'", "'--'", 
			"'.'", "'>'", "'<'", "'!'", "'.T'", "'.random'", "'.one'", "'.zero'", 
			"'int'", "'float'", "'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Inum", "Fnum", "Dnum", 
			"String", "ID", "WHITESPACE", "COMMENT"
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
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
			main();
			setState(55);
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
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(57);
				function_prototype();
				setState(58);
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
			setState(62);
			match(T__0);
			setState(63);
			rettype();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(64);
				match(T__1);
				}
			}

			setState(67);
			match(ID);
			setState(68);
			match(T__2);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) {
				{
				setState(69);
				rettype();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(70);
					match(T__3);
					setState(71);
					rettype();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(79);
			match(T__4);
			setState(80);
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
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID))) != 0)) {
				{
				setState(82);
				stmt();
				setState(83);
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
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__40:
			case T__41:
			case T__42:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(87);
					function_call();
					}
					break;
				case 2:
					{
					setState(88);
					return_();
					}
					break;
				case 3:
					{
					setState(89);
					assignment();
					}
					break;
				case 4:
					{
					setState(90);
					print();
					}
					break;
				case 5:
					{
					setState(91);
					one_word_statements();
					}
					break;
				}
				setState(94);
				match(T__5);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				function();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				selective();
				}
				break;
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				iterative();
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
		public Matrix_pre_stuffContext matrix_pre_stuff() {
			return getRuleContext(Matrix_pre_stuffContext.class,0);
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
				matrix_pre_stuff();
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) {
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << Inum) | (1L << Fnum) | (1L << Dnum) | (1L << String) | (1L << ID))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) {
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
				setState(156);
				match(T__2);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << Inum) | (1L << Fnum) | (1L << Dnum) | (1L << String) | (1L << ID))) != 0)) {
					{
					setState(157);
					parameters();
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(158);
						match(T__3);
						setState(159);
						parameters();
						}
						}
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(167);
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
			setState(170);
			match(T__11);
			setState(171);
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
			setState(173);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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
			setState(175);
			match(T__14);
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(176);
				match(T__2);
				}
				break;
			}
			setState(179);
			parameters();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(180);
				match(T__3);
				setState(181);
				parameters();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(187);
				match(T__4);
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MLgrammaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLgrammaParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ValtypeContext valtype() {
			return getRuleContext(ValtypeContext.class,0);
		}
		public List<TerminalNode> String() { return getTokens(MLgrammaParser.String); }
		public TerminalNode String(int i) {
			return getToken(MLgrammaParser.String, i);
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
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) {
					{
					setState(190);
					valtype();
					}
				}

				setState(193);
				match(ID);
				setState(194);
				match(T__10);
				setState(195);
				expr(0);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(196);
					match(T__3);
					setState(197);
					match(ID);
					setState(198);
					match(T__10);
					setState(199);
					expr(0);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__15);
				setState(206);
				match(ID);
				setState(207);
				match(T__10);
				setState(208);
				match(String);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(209);
					match(T__3);
					setState(210);
					match(ID);
					setState(211);
					match(T__10);
					setState(212);
					match(String);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				valtype();
				setState(219);
				match(T__16);
				setState(220);
				match(Inum);
				setState(221);
				match(T__3);
				setState(222);
				match(Inum);
				setState(223);
				match(T__17);
				setState(224);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(ID);
				setState(227);
				match(T__16);
				setState(228);
				match(Inum);
				setState(229);
				match(T__3);
				setState(230);
				match(Inum);
				setState(231);
				match(T__17);
				setState(232);
				match(T__10);
				setState(233);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				rettype();
				setState(235);
				match(T__16);
				setState(236);
				match(Inum);
				setState(237);
				match(T__17);
				setState(238);
				match(ID);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(239);
					match(T__10);
					setState(240);
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
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(ID);
				setState(246);
				match(T__16);
				setState(247);
				expr(0);
				setState(248);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(ID);
				setState(251);
				match(T__16);
				setState(252);
				expr(0);
				setState(253);
				match(T__3);
				setState(254);
				expr(0);
				setState(255);
				match(T__17);
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
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(T__18);
				setState(260);
				match(T__2);
				setState(261);
				assignment();
				setState(262);
				match(T__5);
				setState(263);
				bexpr(0);
				setState(264);
				match(T__5);
				setState(265);
				exprs();
				setState(266);
				match(T__4);
				setState(267);
				block();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(T__19);
				setState(270);
				match(T__2);
				setState(271);
				bexpr(0);
				setState(272);
				match(T__4);
				setState(273);
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
			setState(277);
			match(T__20);
			setState(278);
			match(T__2);
			setState(279);
			bexpr(0);
			setState(280);
			match(T__4);
			setState(281);
			block();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(282);
				match(T__21);
				setState(283);
				match(T__2);
				setState(284);
				bexpr(0);
				setState(285);
				match(T__4);
				setState(286);
				block();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(293);
				match(T__22);
				setState(294);
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
			setState(297);
			expr(0);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(298);
				match(T__3);
				setState(299);
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
		public Matrix_pre_stuffContext matrix_pre_stuff() {
			return getRuleContext(Matrix_pre_stuffContext.class,0);
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
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(303);
				match(T__2);
				setState(304);
				expr(0);
				setState(305);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(307);
				match(ID);
				setState(308);
				matrix_pre_stuff();
				}
				break;
			case 3:
				{
				setState(309);
				match(T__23);
				setState(310);
				expr(9);
				}
				break;
			case 4:
				{
				setState(311);
				match(ID);
				setState(312);
				match(T__32);
				setState(313);
				match(ID);
				}
				break;
			case 5:
				{
				setState(314);
				getters();
				}
				break;
			case 6:
				{
				setState(315);
				val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(319);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(322);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(325);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(326);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(328);
						match(T__30);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(330);
						match(T__31);
						}
						break;
					}
					} 
				}
				setState(335);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
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
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(337);
				match(T__35);
				setState(338);
				expr(0);
				}
				break;
			case 2:
				{
				setState(339);
				match(T__35);
				setState(340);
				match(T__2);
				setState(341);
				bexpr(0);
				setState(342);
				match(T__4);
				}
				break;
			case 3:
				{
				setState(344);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(347);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(348);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(350);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__10) {
							{
							setState(349);
							match(T__10);
							}
						}

						setState(352);
						bexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(353);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(354);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__35) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(355);
						match(T__10);
						setState(356);
						bexpr(5);
						}
						break;
					}
					} 
				}
				setState(361);
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

	public static class Matrix_pre_stuffContext extends ParserRuleContext {
		public Matrix_pre_stuffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_pre_stuff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterMatrix_pre_stuff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitMatrix_pre_stuff(this);
		}
	}

	public final Matrix_pre_stuffContext matrix_pre_stuff() throws RecognitionException {
		Matrix_pre_stuffContext _localctx = new Matrix_pre_stuffContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_matrix_pre_stuff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
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
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
			case T__41:
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				valtype();
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(365);
					match(T__16);
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(366);
						match(T__3);
						}
						}
						setState(371);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(372);
					match(T__17);
					}
					break;
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				match(T__15);
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
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(T__16);
				setState(379);
				match(Inum);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(380);
					match(T__3);
					setState(381);
					match(Inum);
					}
					}
					setState(386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(387);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(T__16);
				setState(389);
				match(Fnum);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(390);
					match(T__3);
					setState(391);
					match(Fnum);
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				match(T__16);
				setState(399);
				match(Dnum);
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(400);
					match(T__3);
					setState(401);
					match(Dnum);
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(407);
				match(T__17);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(T__16);
				setState(409);
				match(String);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(410);
					match(T__3);
					setState(411);
					match(String);
					}
					}
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(417);
				match(T__17);
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
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(ID);
				}
				break;
			case T__28:
			case T__29:
			case Inum:
			case Fnum:
			case Dnum:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
					{
					setState(421);
					match(T__28);
					}
					break;
				case T__29:
				case Inum:
				case Fnum:
				case Dnum:
					{
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__29) {
						{
						setState(422);
						match(T__29);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(427);
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
			setState(430);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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
			setState(432);
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean bexpr_sempred(BexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u01b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3?\n\3\3\4\3\4"+
		"\3\4\5\4D\n\4\3\4\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\5\4P\n\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6f\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\ts\n\t"+
		"\3\n\3\n\3\n\5\nx\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0082\n\n\f"+
		"\n\16\n\u0085\13\n\5\n\u0087\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0091\n\13\f\13\16\13\u0094\13\13\5\13\u0096\n\13\3\13\3\13\5\13"+
		"\u009a\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a3\n\13\f\13\16"+
		"\13\u00a6\13\13\5\13\u00a8\n\13\3\13\5\13\u00ab\n\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\5\16\u00b4\n\16\3\16\3\16\3\16\7\16\u00b9\n\16\f\16\16\16"+
		"\u00bc\13\16\3\16\5\16\u00bf\n\16\3\17\5\17\u00c2\n\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u00cb\n\17\f\17\16\17\u00ce\13\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d8\n\17\f\17\16\17\u00db\13\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f4\n\17\5\17\u00f6"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0104\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0116\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u0123\n\22\f\22\16\22\u0126\13\22\3\22\3\22"+
		"\5\22\u012a\n\22\3\23\3\23\3\23\5\23\u012f\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u013f\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u014e"+
		"\n\24\f\24\16\24\u0151\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u015c\n\25\3\25\3\25\3\25\5\25\u0161\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0168\n\25\f\25\16\25\u016b\13\25\3\26\3\26\3\27\3\27\3\27"+
		"\7\27\u0172\n\27\f\27\16\27\u0175\13\27\3\27\5\27\u0178\n\27\3\27\5\27"+
		"\u017b\n\27\3\30\3\30\3\30\3\30\7\30\u0181\n\30\f\30\16\30\u0184\13\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u018b\n\30\f\30\16\30\u018e\13\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u0195\n\30\f\30\16\30\u0198\13\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u019f\n\30\f\30\16\30\u01a2\13\30\3\30\5\30\u01a5"+
		"\n\30\3\31\3\31\3\31\5\31\u01aa\n\31\5\31\u01ac\n\31\3\31\5\31\u01af\n"+
		"\31\3\32\3\32\3\33\3\33\3\33\2\4&(\34\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\2\13\3\2\17\20\3\2\33\34\3\2\35\36\3\2\37 \3"+
		"\2$%\4\2\r\r&&\3\2\'*\3\2+-\3\2.\60\2\u01de\2\66\3\2\2\2\4>\3\2\2\2\6"+
		"@\3\2\2\2\bW\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16j\3\2\2\2\20r\3\2\2\2\22"+
		"t\3\2\2\2\24\u00aa\3\2\2\2\26\u00ac\3\2\2\2\30\u00af\3\2\2\2\32\u00b1"+
		"\3\2\2\2\34\u00f5\3\2\2\2\36\u0103\3\2\2\2 \u0115\3\2\2\2\"\u0117\3\2"+
		"\2\2$\u012b\3\2\2\2&\u013e\3\2\2\2(\u015b\3\2\2\2*\u016c\3\2\2\2,\u017a"+
		"\3\2\2\2.\u01a4\3\2\2\2\60\u01ae\3\2\2\2\62\u01b0\3\2\2\2\64\u01b2\3\2"+
		"\2\2\66\67\5\4\3\2\678\5\b\5\289\5\f\7\29:\7\2\2\3:\3\3\2\2\2;<\5\6\4"+
		"\2<=\5\4\3\2=?\3\2\2\2>;\3\2\2\2>?\3\2\2\2?\5\3\2\2\2@A\7\3\2\2AC\5,\27"+
		"\2BD\7\4\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\62\2\2FO\7\5\2\2GL\5,\27"+
		"\2HI\7\6\2\2IK\5,\27\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2"+
		"\2NL\3\2\2\2OG\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\7\2\2RS\7\b\2\2S\7\3\2"+
		"\2\2TU\5\n\6\2UV\5\b\5\2VX\3\2\2\2WT\3\2\2\2WX\3\2\2\2X\t\3\2\2\2Y_\5"+
		"\24\13\2Z_\5\26\f\2[_\5\34\17\2\\_\5\32\16\2]_\5\30\r\2^Y\3\2\2\2^Z\3"+
		"\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_`\3\2\2\2`a\7\b\2\2af\3\2\2\2bf"+
		"\5\22\n\2cf\5\"\22\2df\5 \21\2e^\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2"+
		"f\13\3\2\2\2gh\7\t\2\2hi\5\16\b\2i\r\3\2\2\2jk\7\n\2\2kl\5\b\5\2lm\7\13"+
		"\2\2m\17\3\2\2\2ns\5(\25\2os\5*\26\2ps\7\61\2\2qs\5\36\20\2rn\3\2\2\2"+
		"ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\21\3\2\2\2tu\7\f\2\2uw\5,\27\2vx\7\4\2"+
		"\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\62\2\2z\u0086\7\5\2\2{|\5,\27\2|"+
		"\u0083\7\62\2\2}~\7\6\2\2~\177\5,\27\2\177\u0080\7\62\2\2\u0080\u0082"+
		"\3\2\2\2\u0081}\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086{\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\7\2\2\u0089\u008a"+
		"\5\16\b\2\u008a\23\3\2\2\2\u008b\u008c\7\62\2\2\u008c\u0095\7\5\2\2\u008d"+
		"\u0092\5\20\t\2\u008e\u008f\7\6\2\2\u008f\u0091\5\20\t\2\u0090\u008e\3"+
		"\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u00ab\7\7\2\2\u0098\u009a\5,\27\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\62"+
		"\2\2\u009c\u009d\7\r\2\2\u009d\u009e\7\62\2\2\u009e\u00a7\7\5\2\2\u009f"+
		"\u00a4\5\20\t\2\u00a0\u00a1\7\6\2\2\u00a1\u00a3\5\20\t\2\u00a2\u00a0\3"+
		"\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\7\7\2\2\u00aa\u008b\3\2\2\2\u00aa"+
		"\u0099\3\2\2\2\u00ab\25\3\2\2\2\u00ac\u00ad\7\16\2\2\u00ad\u00ae\5&\24"+
		"\2\u00ae\27\3\2\2\2\u00af\u00b0\t\2\2\2\u00b0\31\3\2\2\2\u00b1\u00b3\7"+
		"\21\2\2\u00b2\u00b4\7\5\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00ba\5\20\t\2\u00b6\u00b7\7\6\2\2\u00b7\u00b9\5"+
		"\20\t\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00bf\7\7"+
		"\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\33\3\2\2\2\u00c0\u00c2"+
		"\5\62\32\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c3\u00c4\7\62\2\2\u00c4\u00c5\7\r\2\2\u00c5\u00cc\5&\24\2\u00c6\u00c7"+
		"\7\6\2\2\u00c7\u00c8\7\62\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00cb\5&\24\2"+
		"\u00ca\u00c6\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00f6\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\22\2\2"+
		"\u00d0\u00d1\7\62\2\2\u00d1\u00d2\7\r\2\2\u00d2\u00d9\7\61\2\2\u00d3\u00d4"+
		"\7\6\2\2\u00d4\u00d5\7\62\2\2\u00d5\u00d6\7\r\2\2\u00d6\u00d8\7\61\2\2"+
		"\u00d7\u00d3\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00f6\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\5\62\32\2"+
		"\u00dd\u00de\7\23\2\2\u00de\u00df\7.\2\2\u00df\u00e0\7\6\2\2\u00e0\u00e1"+
		"\7.\2\2\u00e1\u00e2\7\24\2\2\u00e2\u00e3\7\62\2\2\u00e3\u00f6\3\2\2\2"+
		"\u00e4\u00e5\7\62\2\2\u00e5\u00e6\7\23\2\2\u00e6\u00e7\7.\2\2\u00e7\u00e8"+
		"\7\6\2\2\u00e8\u00e9\7.\2\2\u00e9\u00ea\7\24\2\2\u00ea\u00eb\7\r\2\2\u00eb"+
		"\u00f6\5&\24\2\u00ec\u00ed\5,\27\2\u00ed\u00ee\7\23\2\2\u00ee\u00ef\7"+
		".\2\2\u00ef\u00f0\7\24\2\2\u00f0\u00f3\7\62\2\2\u00f1\u00f2\7\r\2\2\u00f2"+
		"\u00f4\5.\30\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00c1\3\2\2\2\u00f5\u00cf\3\2\2\2\u00f5\u00dc\3\2\2\2\u00f5"+
		"\u00e4\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f6\35\3\2\2\2\u00f7\u00f8\7\62\2"+
		"\2\u00f8\u00f9\7\23\2\2\u00f9\u00fa\5&\24\2\u00fa\u00fb\7\24\2\2\u00fb"+
		"\u0104\3\2\2\2\u00fc\u00fd\7\62\2\2\u00fd\u00fe\7\23\2\2\u00fe\u00ff\5"+
		"&\24\2\u00ff\u0100\7\6\2\2\u0100\u0101\5&\24\2\u0101\u0102\7\24\2\2\u0102"+
		"\u0104\3\2\2\2\u0103\u00f7\3\2\2\2\u0103\u00fc\3\2\2\2\u0104\37\3\2\2"+
		"\2\u0105\u0106\7\25\2\2\u0106\u0107\7\5\2\2\u0107\u0108\5\34\17\2\u0108"+
		"\u0109\7\b\2\2\u0109\u010a\5(\25\2\u010a\u010b\7\b\2\2\u010b\u010c\5$"+
		"\23\2\u010c\u010d\7\7\2\2\u010d\u010e\5\16\b\2\u010e\u0116\3\2\2\2\u010f"+
		"\u0110\7\26\2\2\u0110\u0111\7\5\2\2\u0111\u0112\5(\25\2\u0112\u0113\7"+
		"\7\2\2\u0113\u0114\5\16\b\2\u0114\u0116\3\2\2\2\u0115\u0105\3\2\2\2\u0115"+
		"\u010f\3\2\2\2\u0116!\3\2\2\2\u0117\u0118\7\27\2\2\u0118\u0119\7\5\2\2"+
		"\u0119\u011a\5(\25\2\u011a\u011b\7\7\2\2\u011b\u0124\5\16\b\2\u011c\u011d"+
		"\7\30\2\2\u011d\u011e\7\5\2\2\u011e\u011f\5(\25\2\u011f\u0120\7\7\2\2"+
		"\u0120\u0121\5\16\b\2\u0121\u0123\3\2\2\2\u0122\u011c\3\2\2\2\u0123\u0126"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0129\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0127\u0128\7\31\2\2\u0128\u012a\5\16\b\2\u0129\u0127\3"+
		"\2\2\2\u0129\u012a\3\2\2\2\u012a#\3\2\2\2\u012b\u012e\5&\24\2\u012c\u012d"+
		"\7\6\2\2\u012d\u012f\5$\23\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"%\3\2\2\2\u0130\u0131\b\24\1\2\u0131\u0132\7\5\2\2\u0132\u0133\5&\24\2"+
		"\u0133\u0134\7\7\2\2\u0134\u013f\3\2\2\2\u0135\u0136\7\62\2\2\u0136\u013f"+
		"\5*\26\2\u0137\u0138\7\32\2\2\u0138\u013f\5&\24\13\u0139\u013a\7\62\2"+
		"\2\u013a\u013b\7#\2\2\u013b\u013f\7\62\2\2\u013c\u013f\5\36\20\2\u013d"+
		"\u013f\5\60\31\2\u013e\u0130\3\2\2\2\u013e\u0135\3\2\2\2\u013e\u0137\3"+
		"\2\2\2\u013e\u0139\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f"+
		"\u014f\3\2\2\2\u0140\u0141\f\n\2\2\u0141\u0142\t\3\2\2\u0142\u014e\5&"+
		"\24\13\u0143\u0144\f\t\2\2\u0144\u0145\t\4\2\2\u0145\u014e\5&\24\n\u0146"+
		"\u0147\f\b\2\2\u0147\u0148\t\5\2\2\u0148\u014e\5&\24\t\u0149\u014a\f\7"+
		"\2\2\u014a\u014e\7!\2\2\u014b\u014c\f\6\2\2\u014c\u014e\7\"\2\2\u014d"+
		"\u0140\3\2\2\2\u014d\u0143\3\2\2\2\u014d\u0146\3\2\2\2\u014d\u0149\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\'\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\b\25\1"+
		"\2\u0153\u0154\7&\2\2\u0154\u015c\5&\24\2\u0155\u0156\7&\2\2\u0156\u0157"+
		"\7\5\2\2\u0157\u0158\5(\25\2\u0158\u0159\7\7\2\2\u0159\u015c\3\2\2\2\u015a"+
		"\u015c\5&\24\2\u015b\u0152\3\2\2\2\u015b\u0155\3\2\2\2\u015b\u015a\3\2"+
		"\2\2\u015c\u0169\3\2\2\2\u015d\u015e\f\7\2\2\u015e\u0160\t\6\2\2\u015f"+
		"\u0161\7\r\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0168\5(\25\b\u0163\u0164\f\6\2\2\u0164\u0165\t\7\2\2\u0165"+
		"\u0166\7\r\2\2\u0166\u0168\5(\25\7\u0167\u015d\3\2\2\2\u0167\u0163\3\2"+
		"\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		")\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\t\b\2\2\u016d+\3\2\2\2\u016e"+
		"\u0177\5\62\32\2\u016f\u0173\7\23\2\2\u0170\u0172\7\6\2\2\u0171\u0170"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\7\24\2\2\u0177\u016f\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u017b\7\22\2\2\u017a"+
		"\u016e\3\2\2\2\u017a\u0179\3\2\2\2\u017b-\3\2\2\2\u017c\u017d\7\23\2\2"+
		"\u017d\u0182\7.\2\2\u017e\u017f\7\6\2\2\u017f\u0181\7.\2\2\u0180\u017e"+
		"\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u01a5\7\24\2\2\u0186\u0187\7"+
		"\23\2\2\u0187\u018c\7/\2\2\u0188\u0189\7\6\2\2\u0189\u018b\7/\2\2\u018a"+
		"\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u01a5\7\24\2\2\u0190"+
		"\u0191\7\23\2\2\u0191\u0196\7\60\2\2\u0192\u0193\7\6\2\2\u0193\u0195\7"+
		"\60\2\2\u0194\u0192\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u01a5\7\24"+
		"\2\2\u019a\u019b\7\23\2\2\u019b\u01a0\7\61\2\2\u019c\u019d\7\6\2\2\u019d"+
		"\u019f\7\61\2\2\u019e\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3"+
		"\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a5\7\24\2\2\u01a4\u017c\3\2\2\2\u01a4\u0186\3\2\2\2\u01a4\u0190\3"+
		"\2\2\2\u01a4\u019a\3\2\2\2\u01a5/\3\2\2\2\u01a6\u01af\7\62\2\2\u01a7\u01ac"+
		"\7\37\2\2\u01a8\u01aa\7 \2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01af\5\64\33\2\u01ae\u01a6\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af"+
		"\61\3\2\2\2\u01b0\u01b1\t\t\2\2\u01b1\63\3\2\2\2\u01b2\u01b3\t\n\2\2\u01b3"+
		"\65\3\2\2\2\62>CLOW^erw\u0083\u0086\u0092\u0095\u0099\u00a4\u00a7\u00aa"+
		"\u00b3\u00ba\u00be\u00c1\u00cc\u00d9\u00f3\u00f5\u0103\u0115\u0124\u0129"+
		"\u012e\u013e\u014d\u014f\u015b\u0160\u0167\u0169\u0173\u0177\u017a\u0182"+
		"\u018c\u0196\u01a0\u01a4\u01a9\u01ab\u01ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}