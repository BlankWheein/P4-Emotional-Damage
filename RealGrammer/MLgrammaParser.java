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
		String=47, ID=48, WHITESPACE=49;
	public static final int
		RULE_prog = 0, RULE_prototypes = 1, RULE_function_prototype = 2, RULE_stmts = 3, 
		RULE_stmt = 4, RULE_iterative_stmts = 5, RULE_main = 6, RULE_block = 7, 
		RULE_iterative_block = 8, RULE_parameters = 9, RULE_function = 10, RULE_function_call = 11, 
		RULE_return_ = 12, RULE_one_word_statements = 13, RULE_print = 14, RULE_assignment = 15, 
		RULE_getters = 16, RULE_iterative = 17, RULE_selective = 18, RULE_exprs = 19, 
		RULE_expr = 20, RULE_bexpr = 21, RULE_martix_pre_stuff = 22, RULE_rettype = 23, 
		RULE_array_constructs = 24, RULE_val = 25, RULE_valtype = 26, RULE_num = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "prototypes", "function_prototype", "stmts", "stmt", "iterative_stmts", 
			"main", "block", "iterative_block", "parameters", "function", "function_call", 
			"return_", "one_word_statements", "print", "assignment", "getters", "iterative", 
			"selective", "exprs", "expr", "bexpr", "martix_pre_stuff", "rettype", 
			"array_constructs", "val", "valtype", "num"
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
			"String", "ID", "WHITESPACE"
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
			setState(56);
			prototypes();
			setState(57);
			stmts();
			setState(58);
			main();
			setState(59);
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
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(61);
				function_prototype();
				setState(62);
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
			setState(66);
			match(T__0);
			setState(67);
			rettype();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(68);
				match(T__1);
				}
			}

			setState(71);
			match(ID);
			setState(72);
			match(T__2);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) {
				{
				setState(73);
				rettype();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(74);
					match(T__3);
					setState(75);
					rettype();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(83);
			match(T__4);
			setState(84);
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID))) != 0)) {
				{
				setState(86);
				stmt();
				setState(87);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__14:
			case T__15:
			case T__40:
			case T__41:
			case T__42:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(91);
					function_call();
					}
					break;
				case 2:
					{
					setState(92);
					return_();
					}
					break;
				case 3:
					{
					setState(93);
					assignment();
					}
					break;
				case 4:
					{
					setState(94);
					print();
					}
					break;
				}
				setState(97);
				match(T__5);
				}
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				function();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				selective();
				}
				break;
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
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

	public static class Iterative_stmtsContext extends ParserRuleContext {
		public Iterative_stmtsContext iterative_stmts() {
			return getRuleContext(Iterative_stmtsContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public One_word_statementsContext one_word_statements() {
			return getRuleContext(One_word_statementsContext.class,0);
		}
		public Iterative_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterative_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterIterative_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitIterative_stmts(this);
		}
	}

	public final Iterative_stmtsContext iterative_stmts() throws RecognitionException {
		Iterative_stmtsContext _localctx = new Iterative_stmtsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_iterative_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID))) != 0)) {
				{
				setState(108);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
				case T__11:
				case T__14:
				case T__15:
				case T__18:
				case T__19:
				case T__20:
				case T__40:
				case T__41:
				case T__42:
				case ID:
					{
					setState(104);
					stmt();
					}
					break;
				case T__12:
				case T__13:
					{
					setState(105);
					one_word_statements();
					setState(106);
					match(T__5);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(110);
				iterative_stmts();
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
		enterRule(_localctx, 12, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__6);
			setState(115);
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
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__7);
			setState(118);
			stmts();
			setState(119);
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

	public static class Iterative_blockContext extends ParserRuleContext {
		public Iterative_stmtsContext iterative_stmts() {
			return getRuleContext(Iterative_stmtsContext.class,0);
		}
		public Iterative_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterative_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterIterative_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitIterative_block(this);
		}
	}

	public final Iterative_blockContext iterative_block() throws RecognitionException {
		Iterative_blockContext _localctx = new Iterative_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_iterative_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__7);
			setState(122);
			iterative_stmts();
			setState(123);
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
		public Martix_pre_stuffContext martix_pre_stuff() {
			return getRuleContext(Martix_pre_stuffContext.class,0);
		}
		public TerminalNode String() { return getToken(MLgrammaParser.String, 0); }
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
		enterRule(_localctx, 18, RULE_parameters);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__23:
			case T__28:
			case T__29:
			case T__35:
			case Inum:
			case Fnum:
			case Dnum:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				bexpr(0);
				}
				break;
			case T__36:
			case T__37:
			case T__38:
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				martix_pre_stuff();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(String);
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
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__9);
			setState(131);
			rettype();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(132);
				match(T__1);
				}
			}

			setState(135);
			match(ID);
			setState(136);
			match(T__2);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) {
				{
				setState(137);
				rettype();
				setState(138);
				match(ID);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(139);
					match(T__3);
					setState(140);
					rettype();
					setState(141);
					match(ID);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(150);
			match(T__4);
			setState(151);
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
		enterRule(_localctx, 22, RULE_function_call);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(ID);
				setState(154);
				match(T__2);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << Inum) | (1L << Fnum) | (1L << Dnum) | (1L << String) | (1L << ID))) != 0)) {
					{
					setState(155);
					parameters();
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(156);
						match(T__3);
						setState(157);
						parameters();
						}
						}
						setState(162);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(165);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) {
					{
					setState(166);
					rettype();
					}
				}

				setState(169);
				match(ID);
				setState(170);
				match(T__10);
				setState(171);
				match(ID);
				setState(172);
				match(T__2);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << Inum) | (1L << Fnum) | (1L << Dnum) | (1L << String) | (1L << ID))) != 0)) {
					{
					setState(173);
					parameters();
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(174);
						match(T__3);
						setState(175);
						parameters();
						}
						}
						setState(180);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(183);
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
		enterRule(_localctx, 24, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__11);
			setState(187);
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
		enterRule(_localctx, 26, RULE_one_word_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		enterRule(_localctx, 28, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__14);
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(192);
				match(T__2);
				}
				break;
			}
			setState(195);
			parameters();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(196);
				match(T__3);
				setState(197);
				parameters();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(203);
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
		enterRule(_localctx, 30, RULE_assignment);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) {
					{
					setState(206);
					valtype();
					}
				}

				setState(209);
				match(ID);
				setState(210);
				match(T__10);
				setState(211);
				expr(0);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(212);
					match(T__3);
					setState(213);
					match(ID);
					setState(214);
					match(T__10);
					setState(215);
					expr(0);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__15);
				setState(222);
				match(ID);
				setState(223);
				match(T__10);
				setState(224);
				match(String);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(225);
					match(T__3);
					setState(226);
					match(ID);
					setState(227);
					match(T__10);
					setState(228);
					match(String);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				valtype();
				setState(235);
				match(T__16);
				setState(236);
				match(Inum);
				setState(237);
				match(T__3);
				setState(238);
				match(Inum);
				setState(239);
				match(T__17);
				setState(240);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(ID);
				setState(243);
				match(T__16);
				setState(244);
				match(Inum);
				setState(245);
				match(T__3);
				setState(246);
				match(Inum);
				setState(247);
				match(T__17);
				setState(248);
				match(T__10);
				setState(249);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				rettype();
				setState(251);
				match(T__16);
				setState(252);
				match(Inum);
				setState(253);
				match(T__17);
				setState(254);
				match(ID);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(255);
					match(T__10);
					setState(256);
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
		enterRule(_localctx, 32, RULE_getters);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(ID);
				setState(262);
				match(T__16);
				setState(263);
				expr(0);
				setState(264);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(ID);
				setState(267);
				match(T__16);
				setState(268);
				expr(0);
				setState(269);
				match(T__3);
				setState(270);
				expr(0);
				setState(271);
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
		public Iterative_blockContext iterative_block() {
			return getRuleContext(Iterative_blockContext.class,0);
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
		enterRule(_localctx, 34, RULE_iterative);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(T__18);
				setState(276);
				match(T__2);
				setState(277);
				assignment();
				setState(278);
				match(T__5);
				setState(279);
				bexpr(0);
				setState(280);
				match(T__5);
				setState(281);
				exprs();
				setState(282);
				match(T__4);
				setState(283);
				iterative_block();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(T__19);
				setState(286);
				match(T__2);
				setState(287);
				bexpr(0);
				setState(288);
				match(T__4);
				setState(289);
				iterative_block();
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
		enterRule(_localctx, 36, RULE_selective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__20);
			setState(294);
			match(T__2);
			setState(295);
			bexpr(0);
			setState(296);
			match(T__4);
			setState(297);
			block();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(298);
				match(T__21);
				setState(299);
				match(T__2);
				setState(300);
				bexpr(0);
				setState(301);
				match(T__4);
				setState(302);
				block();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(309);
				match(T__22);
				setState(310);
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
		enterRule(_localctx, 38, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			expr(0);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(314);
				match(T__3);
				setState(315);
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
		public Martix_pre_stuffContext martix_pre_stuff() {
			return getRuleContext(Martix_pre_stuffContext.class,0);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(319);
				match(T__2);
				setState(320);
				expr(0);
				setState(321);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(323);
				match(ID);
				setState(324);
				martix_pre_stuff();
				}
				break;
			case 3:
				{
				setState(325);
				match(T__23);
				setState(326);
				expr(9);
				}
				break;
			case 4:
				{
				setState(327);
				match(ID);
				setState(328);
				match(T__32);
				setState(329);
				match(ID);
				}
				break;
			case 5:
				{
				setState(330);
				getters();
				}
				break;
			case 6:
				{
				setState(331);
				val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(349);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(347);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(334);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(335);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(336);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(337);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(338);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(339);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(340);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(341);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(342);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(343);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(344);
						match(T__30);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(345);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(346);
						match(T__31);
						}
						break;
					}
					} 
				}
				setState(351);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_bexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(353);
				match(T__35);
				setState(354);
				expr(0);
				}
				break;
			case 2:
				{
				setState(355);
				match(T__35);
				setState(356);
				match(T__2);
				setState(357);
				bexpr(0);
				setState(358);
				match(T__4);
				}
				break;
			case 3:
				{
				setState(360);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(373);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(363);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(364);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(366);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__10) {
							{
							setState(365);
							match(T__10);
							}
						}

						setState(368);
						bexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(369);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(370);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__35) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(371);
						match(T__10);
						setState(372);
						bexpr(5);
						}
						break;
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class Martix_pre_stuffContext extends ParserRuleContext {
		public Martix_pre_stuffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_martix_pre_stuff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterMartix_pre_stuff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitMartix_pre_stuff(this);
		}
	}

	public final Martix_pre_stuffContext martix_pre_stuff() throws RecognitionException {
		Martix_pre_stuffContext _localctx = new Martix_pre_stuffContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_martix_pre_stuff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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
		enterRule(_localctx, 46, RULE_rettype);
		int _la;
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
			case T__41:
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				valtype();
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(381);
					match(T__16);
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(382);
						match(T__3);
						}
						}
						setState(387);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(388);
					match(T__17);
					}
					break;
				}
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
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
		enterRule(_localctx, 48, RULE_array_constructs);
		int _la;
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(T__16);
				setState(395);
				match(Inum);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(396);
					match(T__3);
					setState(397);
					match(Inum);
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(T__16);
				setState(405);
				match(Fnum);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(406);
					match(T__3);
					setState(407);
					match(Fnum);
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(413);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				match(T__16);
				setState(415);
				match(Dnum);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(416);
					match(T__3);
					setState(417);
					match(Dnum);
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423);
				match(T__17);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				match(T__16);
				setState(425);
				match(String);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(426);
					match(T__3);
					setState(427);
					match(String);
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(433);
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
		enterRule(_localctx, 50, RULE_val);
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
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
				setState(441);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
					{
					setState(437);
					match(T__28);
					}
					break;
				case T__29:
				case Inum:
				case Fnum:
				case Dnum:
					{
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__29) {
						{
						setState(438);
						match(T__29);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(443);
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
		enterRule(_localctx, 52, RULE_valtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
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
		enterRule(_localctx, 54, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
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
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 21:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u01c5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\5\3C\n\3\3\4\3\4\3\4\5\4H\n\4\3\4\3\4\3\4\3\4\3\4\7\4O\n\4\f\4\16\4"+
		"R\13\4\5\4T\n\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\3\6\5\6"+
		"b\n\6\3\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\3\7\5\7o\n\7\3\7\3\7\5"+
		"\7s\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13"+
		"\u0083\n\13\3\f\3\f\3\f\5\f\u0088\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u0092\n\f\f\f\16\f\u0095\13\f\5\f\u0097\n\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00a1\n\r\f\r\16\r\u00a4\13\r\5\r\u00a6\n\r\3\r\3\r\5\r"+
		"\u00aa\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b3\n\r\f\r\16\r\u00b6\13"+
		"\r\5\r\u00b8\n\r\3\r\5\r\u00bb\n\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\5\20\u00c4\n\20\3\20\3\20\3\20\7\20\u00c9\n\20\f\20\16\20\u00cc\13\20"+
		"\3\20\5\20\u00cf\n\20\3\21\5\21\u00d2\n\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\7\21\u00db\n\21\f\21\16\21\u00de\13\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u00e8\n\21\f\21\16\21\u00eb\13\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0104\n\21\5\21\u0106\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0114\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0126\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0133\n\24\f\24\16\24\u0136\13\24\3\24\3\24\5\24\u013a"+
		"\n\24\3\25\3\25\3\25\5\25\u013f\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u014f\n\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u015e\n\26\f\26\16"+
		"\26\u0161\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u016c"+
		"\n\27\3\27\3\27\3\27\5\27\u0171\n\27\3\27\3\27\3\27\3\27\3\27\7\27\u0178"+
		"\n\27\f\27\16\27\u017b\13\27\3\30\3\30\3\31\3\31\3\31\7\31\u0182\n\31"+
		"\f\31\16\31\u0185\13\31\3\31\5\31\u0188\n\31\3\31\5\31\u018b\n\31\3\32"+
		"\3\32\3\32\3\32\7\32\u0191\n\32\f\32\16\32\u0194\13\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u019b\n\32\f\32\16\32\u019e\13\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u01a5\n\32\f\32\16\32\u01a8\13\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u01af\n\32\f\32\16\32\u01b2\13\32\3\32\5\32\u01b5\n\32\3\33\3\33"+
		"\3\33\5\33\u01ba\n\33\5\33\u01bc\n\33\3\33\5\33\u01bf\n\33\3\34\3\34\3"+
		"\35\3\35\3\35\2\4*,\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668\2\13\3\2\17\20\3\2\33\34\3\2\35\36\3\2\37 \3\2$%\4\2\r"+
		"\r&&\3\2\'*\3\2+-\3\2.\60\2\u01ec\2:\3\2\2\2\4B\3\2\2\2\6D\3\2\2\2\b["+
		"\3\2\2\2\nh\3\2\2\2\fr\3\2\2\2\16t\3\2\2\2\20w\3\2\2\2\22{\3\2\2\2\24"+
		"\u0082\3\2\2\2\26\u0084\3\2\2\2\30\u00ba\3\2\2\2\32\u00bc\3\2\2\2\34\u00bf"+
		"\3\2\2\2\36\u00c1\3\2\2\2 \u0105\3\2\2\2\"\u0113\3\2\2\2$\u0125\3\2\2"+
		"\2&\u0127\3\2\2\2(\u013b\3\2\2\2*\u014e\3\2\2\2,\u016b\3\2\2\2.\u017c"+
		"\3\2\2\2\60\u018a\3\2\2\2\62\u01b4\3\2\2\2\64\u01be\3\2\2\2\66\u01c0\3"+
		"\2\2\28\u01c2\3\2\2\2:;\5\4\3\2;<\5\b\5\2<=\5\16\b\2=>\7\2\2\3>\3\3\2"+
		"\2\2?@\5\6\4\2@A\5\4\3\2AC\3\2\2\2B?\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DE\7"+
		"\3\2\2EG\5\60\31\2FH\7\4\2\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\62\2\2"+
		"JS\7\5\2\2KP\5\60\31\2LM\7\6\2\2MO\5\60\31\2NL\3\2\2\2OR\3\2\2\2PN\3\2"+
		"\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SK\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\7"+
		"\2\2VW\7\b\2\2W\7\3\2\2\2XY\5\n\6\2YZ\5\b\5\2Z\\\3\2\2\2[X\3\2\2\2[\\"+
		"\3\2\2\2\\\t\3\2\2\2]b\5\30\r\2^b\5\32\16\2_b\5 \21\2`b\5\36\20\2a]\3"+
		"\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2cd\7\b\2\2di\3\2\2\2ei\5"+
		"\26\f\2fi\5&\24\2gi\5$\23\2ha\3\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\13"+
		"\3\2\2\2jo\5\n\6\2kl\5\34\17\2lm\7\b\2\2mo\3\2\2\2nj\3\2\2\2nk\3\2\2\2"+
		"op\3\2\2\2pq\5\f\7\2qs\3\2\2\2rn\3\2\2\2rs\3\2\2\2s\r\3\2\2\2tu\7\t\2"+
		"\2uv\5\20\t\2v\17\3\2\2\2wx\7\n\2\2xy\5\b\5\2yz\7\13\2\2z\21\3\2\2\2{"+
		"|\7\n\2\2|}\5\f\7\2}~\7\13\2\2~\23\3\2\2\2\177\u0083\5,\27\2\u0080\u0083"+
		"\5.\30\2\u0081\u0083\7\61\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\25\3\2\2\2\u0084\u0085\7\f\2\2\u0085\u0087\5\60\31"+
		"\2\u0086\u0088\7\4\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\7\62\2\2\u008a\u0096\7\5\2\2\u008b\u008c\5\60\31"+
		"\2\u008c\u0093\7\62\2\2\u008d\u008e\7\6\2\2\u008e\u008f\5\60\31\2\u008f"+
		"\u0090\7\62\2\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0092\u0095\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u008b\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\7\7\2\2\u0099\u009a\5\20\t\2\u009a\27\3\2\2\2\u009b\u009c"+
		"\7\62\2\2\u009c\u00a5\7\5\2\2\u009d\u00a2\5\24\13\2\u009e\u009f\7\6\2"+
		"\2\u009f\u00a1\5\24\13\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00bb\7\7\2\2\u00a8\u00aa\5\60\31\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\62\2\2\u00ac\u00ad\7\r\2\2\u00ad"+
		"\u00ae\7\62\2\2\u00ae\u00b7\7\5\2\2\u00af\u00b4\5\24\13\2\u00b0\u00b1"+
		"\7\6\2\2\u00b1\u00b3\5\24\13\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\7\7\2\2\u00ba\u009b\3\2\2\2\u00ba\u00a9\3\2\2\2\u00bb\31\3\2\2"+
		"\2\u00bc\u00bd\7\16\2\2\u00bd\u00be\5*\26\2\u00be\33\3\2\2\2\u00bf\u00c0"+
		"\t\2\2\2\u00c0\35\3\2\2\2\u00c1\u00c3\7\21\2\2\u00c2\u00c4\7\5\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00ca\5\24"+
		"\13\2\u00c6\u00c7\7\6\2\2\u00c7\u00c9\5\24\13\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\7\7\2\2\u00ce\u00cd\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\37\3\2\2\2\u00d0\u00d2\5\66\34\2\u00d1\u00d0\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\62\2\2\u00d4"+
		"\u00d5\7\r\2\2\u00d5\u00dc\5*\26\2\u00d6\u00d7\7\6\2\2\u00d7\u00d8\7\62"+
		"\2\2\u00d8\u00d9\7\r\2\2\u00d9\u00db\5*\26\2\u00da\u00d6\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u0106\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\22\2\2\u00e0\u00e1\7\62\2\2\u00e1"+
		"\u00e2\7\r\2\2\u00e2\u00e9\7\61\2\2\u00e3\u00e4\7\6\2\2\u00e4\u00e5\7"+
		"\62\2\2\u00e5\u00e6\7\r\2\2\u00e6\u00e8\7\61\2\2\u00e7\u00e3\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u0106\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\5\66\34\2\u00ed\u00ee\7\23\2\2\u00ee"+
		"\u00ef\7.\2\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1\7.\2\2\u00f1\u00f2\7\24"+
		"\2\2\u00f2\u00f3\7\62\2\2\u00f3\u0106\3\2\2\2\u00f4\u00f5\7\62\2\2\u00f5"+
		"\u00f6\7\23\2\2\u00f6\u00f7\7.\2\2\u00f7\u00f8\7\6\2\2\u00f8\u00f9\7."+
		"\2\2\u00f9\u00fa\7\24\2\2\u00fa\u00fb\7\r\2\2\u00fb\u0106\5*\26\2\u00fc"+
		"\u00fd\5\60\31\2\u00fd\u00fe\7\23\2\2\u00fe\u00ff\7.\2\2\u00ff\u0100\7"+
		"\24\2\2\u0100\u0103\7\62\2\2\u0101\u0102\7\r\2\2\u0102\u0104\5\62\32\2"+
		"\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u00d1"+
		"\3\2\2\2\u0105\u00df\3\2\2\2\u0105\u00ec\3\2\2\2\u0105\u00f4\3\2\2\2\u0105"+
		"\u00fc\3\2\2\2\u0106!\3\2\2\2\u0107\u0108\7\62\2\2\u0108\u0109\7\23\2"+
		"\2\u0109\u010a\5*\26\2\u010a\u010b\7\24\2\2\u010b\u0114\3\2\2\2\u010c"+
		"\u010d\7\62\2\2\u010d\u010e\7\23\2\2\u010e\u010f\5*\26\2\u010f\u0110\7"+
		"\6\2\2\u0110\u0111\5*\26\2\u0111\u0112\7\24\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0107\3\2\2\2\u0113\u010c\3\2\2\2\u0114#\3\2\2\2\u0115\u0116\7\25\2\2"+
		"\u0116\u0117\7\5\2\2\u0117\u0118\5 \21\2\u0118\u0119\7\b\2\2\u0119\u011a"+
		"\5,\27\2\u011a\u011b\7\b\2\2\u011b\u011c\5(\25\2\u011c\u011d\7\7\2\2\u011d"+
		"\u011e\5\22\n\2\u011e\u0126\3\2\2\2\u011f\u0120\7\26\2\2\u0120\u0121\7"+
		"\5\2\2\u0121\u0122\5,\27\2\u0122\u0123\7\7\2\2\u0123\u0124\5\22\n\2\u0124"+
		"\u0126\3\2\2\2\u0125\u0115\3\2\2\2\u0125\u011f\3\2\2\2\u0126%\3\2\2\2"+
		"\u0127\u0128\7\27\2\2\u0128\u0129\7\5\2\2\u0129\u012a\5,\27\2\u012a\u012b"+
		"\7\7\2\2\u012b\u0134\5\20\t\2\u012c\u012d\7\30\2\2\u012d\u012e\7\5\2\2"+
		"\u012e\u012f\5,\27\2\u012f\u0130\7\7\2\2\u0130\u0131\5\20\t\2\u0131\u0133"+
		"\3\2\2\2\u0132\u012c\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0139\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7\31"+
		"\2\2\u0138\u013a\5\20\t\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\'\3\2\2\2\u013b\u013e\5*\26\2\u013c\u013d\7\6\2\2\u013d\u013f\5(\25\2"+
		"\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f)\3\2\2\2\u0140\u0141\b"+
		"\26\1\2\u0141\u0142\7\5\2\2\u0142\u0143\5*\26\2\u0143\u0144\7\7\2\2\u0144"+
		"\u014f\3\2\2\2\u0145\u0146\7\62\2\2\u0146\u014f\5.\30\2\u0147\u0148\7"+
		"\32\2\2\u0148\u014f\5*\26\13\u0149\u014a\7\62\2\2\u014a\u014b\7#\2\2\u014b"+
		"\u014f\7\62\2\2\u014c\u014f\5\"\22\2\u014d\u014f\5\64\33\2\u014e\u0140"+
		"\3\2\2\2\u014e\u0145\3\2\2\2\u014e\u0147\3\2\2\2\u014e\u0149\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u015f\3\2\2\2\u0150\u0151\f\n"+
		"\2\2\u0151\u0152\t\3\2\2\u0152\u015e\5*\26\13\u0153\u0154\f\t\2\2\u0154"+
		"\u0155\t\4\2\2\u0155\u015e\5*\26\n\u0156\u0157\f\b\2\2\u0157\u0158\t\5"+
		"\2\2\u0158\u015e\5*\26\t\u0159\u015a\f\7\2\2\u015a\u015e\7!\2\2\u015b"+
		"\u015c\f\6\2\2\u015c\u015e\7\"\2\2\u015d\u0150\3\2\2\2\u015d\u0153\3\2"+
		"\2\2\u015d\u0156\3\2\2\2\u015d\u0159\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160+\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0162\u0163\b\27\1\2\u0163\u0164\7&\2\2\u0164\u016c"+
		"\5*\26\2\u0165\u0166\7&\2\2\u0166\u0167\7\5\2\2\u0167\u0168\5,\27\2\u0168"+
		"\u0169\7\7\2\2\u0169\u016c\3\2\2\2\u016a\u016c\5*\26\2\u016b\u0162\3\2"+
		"\2\2\u016b\u0165\3\2\2\2\u016b\u016a\3\2\2\2\u016c\u0179\3\2\2\2\u016d"+
		"\u016e\f\7\2\2\u016e\u0170\t\6\2\2\u016f\u0171\7\r\2\2\u0170\u016f\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0178\5,\27\b\u0173"+
		"\u0174\f\6\2\2\u0174\u0175\t\7\2\2\u0175\u0176\7\r\2\2\u0176\u0178\5,"+
		"\27\7\u0177\u016d\3\2\2\2\u0177\u0173\3\2\2\2\u0178\u017b\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a-\3\2\2\2\u017b\u0179\3\2\2\2"+
		"\u017c\u017d\t\b\2\2\u017d/\3\2\2\2\u017e\u0187\5\66\34\2\u017f\u0183"+
		"\7\23\2\2\u0180\u0182\7\6\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2"+
		"\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0186\u0188\7\24\2\2\u0187\u017f\3\2\2\2\u0187\u0188\3\2\2\2"+
		"\u0188\u018b\3\2\2\2\u0189\u018b\7\22\2\2\u018a\u017e\3\2\2\2\u018a\u0189"+
		"\3\2\2\2\u018b\61\3\2\2\2\u018c\u018d\7\23\2\2\u018d\u0192\7.\2\2\u018e"+
		"\u018f\7\6\2\2\u018f\u0191\7.\2\2\u0190\u018e\3\2\2\2\u0191\u0194\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u01b5\7\24\2\2\u0196\u0197\7\23\2\2\u0197\u019c\7"+
		"/\2\2\u0198\u0199\7\6\2\2\u0199\u019b\7/\2\2\u019a\u0198\3\2\2\2\u019b"+
		"\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2"+
		"\2\2\u019e\u019c\3\2\2\2\u019f\u01b5\7\24\2\2\u01a0\u01a1\7\23\2\2\u01a1"+
		"\u01a6\7\60\2\2\u01a2\u01a3\7\6\2\2\u01a3\u01a5\7\60\2\2\u01a4\u01a2\3"+
		"\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01b5\7\24\2\2\u01aa\u01ab\7"+
		"\23\2\2\u01ab\u01b0\7\61\2\2\u01ac\u01ad\7\6\2\2\u01ad\u01af\7\61\2\2"+
		"\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\7\24\2\2"+
		"\u01b4\u018c\3\2\2\2\u01b4\u0196\3\2\2\2\u01b4\u01a0\3\2\2\2\u01b4\u01aa"+
		"\3\2\2\2\u01b5\63\3\2\2\2\u01b6\u01bf\7\62\2\2\u01b7\u01bc\7\37\2\2\u01b8"+
		"\u01ba\7 \2\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2"+
		"\2\2\u01bb\u01b7\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01bf\58\35\2\u01be\u01b6\3\2\2\2\u01be\u01bb\3\2\2\2\u01bf\65\3\2\2"+
		"\2\u01c0\u01c1\t\t\2\2\u01c1\67\3\2\2\2\u01c2\u01c3\t\n\2\2\u01c39\3\2"+
		"\2\2\64BGPS[ahnr\u0082\u0087\u0093\u0096\u00a2\u00a5\u00a9\u00b4\u00b7"+
		"\u00ba\u00c3\u00ca\u00ce\u00d1\u00dc\u00e9\u0103\u0105\u0113\u0125\u0134"+
		"\u0139\u013e\u014e\u015d\u015f\u016b\u0170\u0177\u0179\u0183\u0187\u018a"+
		"\u0192\u019c\u01a6\u01b0\u01b4\u01b9\u01bb\u01be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}