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
		T__38=39, Inum=40, Fnum=41, Dnum=42, String=43, ID=44, WHITESPACE=45, 
		NEWLINE=46;
	public static final int
		RULE_prog = 0, RULE_stmts = 1, RULE_block = 2, RULE_stmt = 3, RULE_function_call = 4, 
		RULE_assignment = 5, RULE_function = 6, RULE_selective = 7, RULE_return_ = 8, 
		RULE_iterative = 9, RULE_parameters = 10, RULE_exprs = 11, RULE_expr = 12, 
		RULE_bexpr = 13, RULE_main = 14, RULE_print = 15, RULE_val = 16, RULE_valtype = 17, 
		RULE_matrix_assignment = 18, RULE_martix_math = 19, RULE_martix_pre_stuff = 20, 
		RULE_rettype = 21, RULE_array_constructs = 22, RULE_array_statements = 23, 
		RULE_num = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "block", "stmt", "function_call", "assignment", "function", 
			"selective", "return_", "iterative", "parameters", "exprs", "expr", "bexpr", 
			"main", "print", "val", "valtype", "matrix_assignment", "martix_math", 
			"martix_pre_stuff", "rettype", "array_constructs", "array_statements", 
			"num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'('", "','", "')'", "'='", "'string'", "'fun'", 
			"'auto'", "'if'", "'elif'", "'else'", "'return'", "'for'", "'sqrt'", 
			"'%'", "'**'", "'*'", "'/'", "'+'", "'-'", "'++'", "'--'", "'['", "']'", 
			"'>'", "'<'", "'!'", "'main'", "'print'", "'int'", "'float'", "'double'", 
			"'.'", "'.T'", "'.random'", "'.one'", "'.zero'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Inum", "Fnum", "Dnum", "String", "ID", "WHITESPACE", 
			"NEWLINE"
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
			setState(50);
			stmts();
			setState(51);
			main();
			setState(52);
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
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << ID))) != 0)) {
				{
				setState(54);
				stmt();
				setState(55);
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
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
			setState(60);
			stmts();
			setState(61);
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
		}
		public Array_statementsContext array_statements() {
			return getRuleContext(Array_statementsContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Matrix_assignmentContext matrix_assignment() {
			return getRuleContext(Matrix_assignmentContext.class,0);
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
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__13:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(63);
					function_call();
					}
					break;
				case 2:
					{
					setState(64);
					return_();
					}
					break;
				case 3:
					{
					setState(65);
					array_statements();
					}
					break;
				case 4:
					{
					setState(66);
					assignment();
					}
					break;
				case 5:
					{
					setState(67);
					matrix_assignment();
					}
					break;
				case 6:
					{
					setState(68);
					print();
					}
					break;
				}
				setState(71);
				match(T__2);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				function();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				selective();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
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
		enterRule(_localctx, 8, RULE_function_call);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(ID);
				setState(79);
				match(T__3);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__28) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << Inum) | (1L << Fnum) | (1L << Dnum) | (1L << String) | (1L << ID))) != 0)) {
					{
					setState(80);
					parameters();
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(81);
						match(T__4);
						setState(82);
						parameters();
						}
						}
						setState(87);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(90);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) {
					{
					setState(91);
					rettype();
					}
				}

				setState(94);
				match(ID);
				setState(95);
				match(T__6);
				setState(96);
				match(ID);
				setState(97);
				match(T__3);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__28) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << Inum) | (1L << Fnum) | (1L << Dnum) | (1L << String) | (1L << ID))) != 0)) {
					{
					setState(98);
					parameters();
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(99);
						match(T__4);
						setState(100);
						parameters();
						}
						}
						setState(105);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(108);
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
		enterRule(_localctx, 10, RULE_assignment);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) {
					{
					setState(111);
					valtype();
					}
				}

				setState(114);
				match(ID);
				setState(115);
				match(T__6);
				setState(116);
				expr(0);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(117);
					match(T__4);
					setState(118);
					match(ID);
					setState(119);
					match(T__6);
					setState(120);
					expr(0);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__7);
				setState(127);
				match(ID);
				setState(128);
				match(T__6);
				setState(129);
				match(String);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(130);
					match(T__4);
					setState(131);
					match(ID);
					setState(132);
					match(T__6);
					setState(133);
					match(String);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__8);
			setState(142);
			rettype();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(143);
				match(T__9);
				}
			}

			setState(146);
			match(ID);
			setState(147);
			match(T__3);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) {
				{
				setState(148);
				rettype();
				setState(149);
				match(ID);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(150);
					match(T__4);
					setState(151);
					rettype();
					setState(152);
					match(ID);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(161);
			match(T__5);
			setState(162);
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
		enterRule(_localctx, 14, RULE_selective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__10);
			setState(165);
			match(T__3);
			setState(166);
			bexpr(0);
			setState(167);
			match(T__5);
			setState(168);
			block();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(169);
				match(T__11);
				setState(170);
				match(T__3);
				setState(171);
				bexpr(0);
				setState(172);
				match(T__5);
				setState(173);
				block();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(180);
				match(T__12);
				setState(181);
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
		enterRule(_localctx, 16, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__13);
			setState(185);
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
		enterRule(_localctx, 18, RULE_iterative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__14);
			setState(188);
			match(T__3);
			setState(189);
			assignment();
			setState(190);
			match(T__2);
			setState(191);
			bexpr(0);
			setState(192);
			match(T__2);
			setState(193);
			exprs();
			setState(194);
			match(T__5);
			setState(195);
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

	public static class ParametersContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public Martix_mathContext martix_math() {
			return getRuleContext(Martix_mathContext.class,0);
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
		enterRule(_localctx, 20, RULE_parameters);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				bexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				martix_math();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				martix_pre_stuff();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(String);
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
		enterRule(_localctx, 22, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			expr(0);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(204);
				match(T__4);
				setState(205);
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
		public TerminalNode ID() { return getToken(MLgrammaParser.ID, 0); }
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(209);
				match(T__3);
				setState(210);
				expr(0);
				setState(211);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(213);
				match(T__15);
				setState(214);
				expr(9);
				}
				break;
			case 3:
				{
				setState(215);
				match(ID);
				setState(216);
				match(T__24);
				setState(217);
				expr(0);
				setState(218);
				match(T__25);
				}
				break;
			case 4:
				{
				setState(220);
				match(ID);
				setState(221);
				match(T__24);
				setState(222);
				expr(0);
				setState(223);
				match(T__4);
				setState(224);
				expr(0);
				setState(225);
				match(T__25);
				}
				break;
			case 5:
				{
				setState(227);
				val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(231);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(234);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(237);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(238);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(240);
						match(T__22);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(242);
						match(T__23);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_bexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(249);
				match(T__28);
				setState(250);
				expr(0);
				}
				break;
			case 2:
				{
				setState(251);
				match(T__28);
				setState(252);
				match(T__3);
				setState(253);
				bexpr(0);
				setState(254);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(256);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(259);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(260);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__6) {
							{
							setState(261);
							match(T__6);
							}
						}

						setState(264);
						bexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(265);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(266);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						match(T__6);
						setState(268);
						bexpr(5);
						}
						break;
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 28, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__29);
			setState(275);
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

	public static class PrintContext extends ParserRuleContext {
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(MLgrammaParser.NEWLINE, 0); }
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
		enterRule(_localctx, 30, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__30);
			setState(278);
			parameters();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(279);
				match(T__4);
				setState(280);
				parameters();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(286);
				match(NEWLINE);
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
		enterRule(_localctx, 32, RULE_val);
		int _la;
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(ID);
				}
				break;
			case T__20:
			case T__21:
			case Inum:
			case Fnum:
			case Dnum:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
					{
					setState(290);
					match(T__20);
					}
					break;
				case T__21:
				case Inum:
				case Fnum:
				case Dnum:
					{
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__21) {
						{
						setState(291);
						match(T__21);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(296);
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
		enterRule(_localctx, 34, RULE_valtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
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

	public static class Matrix_assignmentContext extends ParserRuleContext {
		public ValtypeContext valtype() {
			return getRuleContext(ValtypeContext.class,0);
		}
		public List<TerminalNode> Inum() { return getTokens(MLgrammaParser.Inum); }
		public TerminalNode Inum(int i) {
			return getToken(MLgrammaParser.Inum, i);
		}
		public TerminalNode ID() { return getToken(MLgrammaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Martix_pre_stuffContext martix_pre_stuff() {
			return getRuleContext(Martix_pre_stuffContext.class,0);
		}
		public Martix_mathContext martix_math() {
			return getRuleContext(Martix_mathContext.class,0);
		}
		public Matrix_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterMatrix_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitMatrix_assignment(this);
		}
	}

	public final Matrix_assignmentContext matrix_assignment() throws RecognitionException {
		Matrix_assignmentContext _localctx = new Matrix_assignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_matrix_assignment);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				valtype();
				setState(302);
				match(T__24);
				setState(303);
				match(Inum);
				setState(304);
				match(T__4);
				setState(305);
				match(Inum);
				setState(306);
				match(T__25);
				setState(307);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(ID);
				setState(310);
				match(T__24);
				setState(311);
				match(Inum);
				setState(312);
				match(T__4);
				setState(313);
				match(Inum);
				setState(314);
				match(T__25);
				setState(315);
				match(T__6);
				setState(316);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(ID);
				setState(318);
				martix_pre_stuff();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(ID);
				setState(320);
				match(T__6);
				setState(321);
				martix_math();
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

	public static class Martix_mathContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MLgrammaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLgrammaParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Martix_mathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_martix_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterMartix_math(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitMartix_math(this);
		}
	}

	public final Martix_mathContext martix_math() throws RecognitionException {
		Martix_mathContext _localctx = new Martix_mathContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_martix_math);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(ID);
				setState(325);
				match(T__19);
				setState(326);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(ID);
				setState(328);
				match(T__20);
				setState(329);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(ID);
				setState(331);
				match(T__21);
				setState(332);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(333);
				match(ID);
				setState(334);
				match(T__18);
				setState(335);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				match(ID);
				setState(337);
				match(T__34);
				setState(338);
				match(ID);
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
		enterRule(_localctx, 40, RULE_martix_pre_stuff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				valtype();
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(344);
					match(T__24);
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(345);
						match(T__4);
						}
						}
						setState(350);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(351);
					match(T__25);
					}
					break;
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(T__7);
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
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(T__24);
				setState(358);
				match(Inum);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(359);
					match(T__4);
					setState(360);
					match(Inum);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(T__24);
				setState(368);
				match(Fnum);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(369);
					match(T__4);
					setState(370);
					match(Fnum);
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				match(T__25);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(T__24);
				setState(378);
				match(Dnum);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(379);
					match(T__4);
					setState(380);
					match(Dnum);
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(386);
				match(T__25);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(T__24);
				setState(388);
				match(String);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(389);
					match(T__4);
					setState(390);
					match(String);
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(396);
				match(T__25);
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

	public static class Array_statementsContext extends ParserRuleContext {
		public RettypeContext rettype() {
			return getRuleContext(RettypeContext.class,0);
		}
		public TerminalNode Inum() { return getToken(MLgrammaParser.Inum, 0); }
		public TerminalNode ID() { return getToken(MLgrammaParser.ID, 0); }
		public Array_constructsContext array_constructs() {
			return getRuleContext(Array_constructsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).enterArray_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MLgrammaListener ) ((MLgrammaListener)listener).exitArray_statements(this);
		}
	}

	public final Array_statementsContext array_statements() throws RecognitionException {
		Array_statementsContext _localctx = new Array_statementsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array_statements);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__31:
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				rettype();
				setState(400);
				match(T__24);
				setState(401);
				match(Inum);
				setState(402);
				match(T__25);
				setState(403);
				match(ID);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(404);
					match(T__6);
					setState(405);
					array_constructs();
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(ID);
				setState(409);
				match(T__24);
				setState(410);
				expr(0);
				setState(411);
				match(T__25);
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
		enterRule(_localctx, 48, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u01a4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\5\6[\n\6\3\6\3\6\5\6_\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\5\6m\n\6\3\6\5\6p\n\6\3\7\5\7s"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\5\7\u008e\n\7"+
		"\3\b\3\b\3\b\5\b\u0093\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009d\n"+
		"\b\f\b\16\b\u00a0\13\b\5\b\u00a2\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\t\3\t\5\t\u00b9"+
		"\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\5\f\u00cc\n\f\3\r\3\r\3\r\5\r\u00d1\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00e7\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00f6\n\16\f\16\16\16\u00f9\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0104\n\17\3\17\3\17\3\17"+
		"\5\17\u0109\n\17\3\17\3\17\3\17\3\17\3\17\7\17\u0110\n\17\f\17\16\17\u0113"+
		"\13\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u011c\n\21\f\21\16\21\u011f"+
		"\13\21\3\21\5\21\u0122\n\21\3\22\3\22\3\22\5\22\u0127\n\22\5\22\u0129"+
		"\n\22\3\22\5\22\u012c\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0145\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0156\n\25\3\26\3\26\3\27\3\27\3\27\7\27\u015d"+
		"\n\27\f\27\16\27\u0160\13\27\3\27\5\27\u0163\n\27\3\27\5\27\u0166\n\27"+
		"\3\30\3\30\3\30\3\30\7\30\u016c\n\30\f\30\16\30\u016f\13\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u0176\n\30\f\30\16\30\u0179\13\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u0180\n\30\f\30\16\30\u0183\13\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u018a\n\30\f\30\16\30\u018d\13\30\3\30\5\30\u0190\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0199\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u01a0\n\31\3\32\3\32\3\32\2\4\32\34\33\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\2\n\3\2\23\24\3\2\25\26\3\2\27\30\3\2\35\36"+
		"\4\2\t\t\37\37\3\2\"$\3\2&)\3\2*,\2\u01cc\2\64\3\2\2\2\4;\3\2\2\2\6=\3"+
		"\2\2\2\bN\3\2\2\2\no\3\2\2\2\f\u008d\3\2\2\2\16\u008f\3\2\2\2\20\u00a6"+
		"\3\2\2\2\22\u00ba\3\2\2\2\24\u00bd\3\2\2\2\26\u00cb\3\2\2\2\30\u00cd\3"+
		"\2\2\2\32\u00e6\3\2\2\2\34\u0103\3\2\2\2\36\u0114\3\2\2\2 \u0117\3\2\2"+
		"\2\"\u012b\3\2\2\2$\u012d\3\2\2\2&\u0144\3\2\2\2(\u0155\3\2\2\2*\u0157"+
		"\3\2\2\2,\u0165\3\2\2\2.\u018f\3\2\2\2\60\u019f\3\2\2\2\62\u01a1\3\2\2"+
		"\2\64\65\5\4\3\2\65\66\5\36\20\2\66\67\7\2\2\3\67\3\3\2\2\289\5\b\5\2"+
		"9:\5\4\3\2:<\3\2\2\2;8\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=>\7\3\2\2>?\5\4\3"+
		"\2?@\7\4\2\2@\7\3\2\2\2AH\5\n\6\2BH\5\22\n\2CH\5\60\31\2DH\5\f\7\2EH\5"+
		"&\24\2FH\5 \21\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3"+
		"\2\2\2HI\3\2\2\2IJ\7\5\2\2JO\3\2\2\2KO\5\16\b\2LO\5\20\t\2MO\5\24\13\2"+
		"NG\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PQ\7.\2\2QZ\7\6\2\2"+
		"RW\5\26\f\2ST\7\7\2\2TV\5\26\f\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2"+
		"\2X[\3\2\2\2YW\3\2\2\2ZR\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\p\7\b\2\2]_\5,"+
		"\27\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7.\2\2ab\7\t\2\2bc\7.\2\2cl\7\6"+
		"\2\2di\5\26\f\2ef\7\7\2\2fh\5\26\f\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3"+
		"\2\2\2jm\3\2\2\2ki\3\2\2\2ld\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7\b\2\2oP\3"+
		"\2\2\2o^\3\2\2\2p\13\3\2\2\2qs\5$\23\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2t"+
		"u\7.\2\2uv\7\t\2\2v}\5\32\16\2wx\7\7\2\2xy\7.\2\2yz\7\t\2\2z|\5\32\16"+
		"\2{w\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u008e\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0081\7\n\2\2\u0081\u0082\7.\2\2\u0082\u0083\7\t\2\2\u0083"+
		"\u008a\7-\2\2\u0084\u0085\7\7\2\2\u0085\u0086\7.\2\2\u0086\u0087\7\t\2"+
		"\2\u0087\u0089\7-\2\2\u0088\u0084\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"r\3\2\2\2\u008d\u0080\3\2\2\2\u008e\r\3\2\2\2\u008f\u0090\7\13\2\2\u0090"+
		"\u0092\5,\27\2\u0091\u0093\7\f\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7.\2\2\u0095\u00a1\7\6\2\2\u0096"+
		"\u0097\5,\27\2\u0097\u009e\7.\2\2\u0098\u0099\7\7\2\2\u0099\u009a\5,\27"+
		"\2\u009a\u009b\7.\2\2\u009b\u009d\3\2\2\2\u009c\u0098\3\2\2\2\u009d\u00a0"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u0096\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a4\7\b\2\2\u00a4\u00a5\5\6\4\2\u00a5\17\3\2\2\2\u00a6\u00a7"+
		"\7\r\2\2\u00a7\u00a8\7\6\2\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa\7\b\2\2"+
		"\u00aa\u00b3\5\6\4\2\u00ab\u00ac\7\16\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00ae"+
		"\5\34\17\2\u00ae\u00af\7\b\2\2\u00af\u00b0\5\6\4\2\u00b0\u00b2\3\2\2\2"+
		"\u00b1\u00ab\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\17\2\2"+
		"\u00b7\u00b9\5\6\4\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\21"+
		"\3\2\2\2\u00ba\u00bb\7\20\2\2\u00bb\u00bc\5\32\16\2\u00bc\23\3\2\2\2\u00bd"+
		"\u00be\7\21\2\2\u00be\u00bf\7\6\2\2\u00bf\u00c0\5\f\7\2\u00c0\u00c1\7"+
		"\5\2\2\u00c1\u00c2\5\34\17\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\5\30\r\2"+
		"\u00c4\u00c5\7\b\2\2\u00c5\u00c6\5\6\4\2\u00c6\25\3\2\2\2\u00c7\u00cc"+
		"\5\34\17\2\u00c8\u00cc\5(\25\2\u00c9\u00cc\5*\26\2\u00ca\u00cc\7-\2\2"+
		"\u00cb\u00c7\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\27\3\2\2\2\u00cd\u00d0\5\32\16\2\u00ce\u00cf\7\7\2\2\u00cf"+
		"\u00d1\5\30\r\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\31\3\2\2"+
		"\2\u00d2\u00d3\b\16\1\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\5\32\16\2\u00d5"+
		"\u00d6\7\b\2\2\u00d6\u00e7\3\2\2\2\u00d7\u00d8\7\22\2\2\u00d8\u00e7\5"+
		"\32\16\13\u00d9\u00da\7.\2\2\u00da\u00db\7\33\2\2\u00db\u00dc\5\32\16"+
		"\2\u00dc\u00dd\7\34\2\2\u00dd\u00e7\3\2\2\2\u00de\u00df\7.\2\2\u00df\u00e0"+
		"\7\33\2\2\u00e0\u00e1\5\32\16\2\u00e1\u00e2\7\7\2\2\u00e2\u00e3\5\32\16"+
		"\2\u00e3\u00e4\7\34\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\5\"\22\2\u00e6"+
		"\u00d2\3\2\2\2\u00e6\u00d7\3\2\2\2\u00e6\u00d9\3\2\2\2\u00e6\u00de\3\2"+
		"\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00f7\3\2\2\2\u00e8\u00e9\f\n\2\2\u00e9"+
		"\u00ea\t\2\2\2\u00ea\u00f6\5\32\16\13\u00eb\u00ec\f\t\2\2\u00ec\u00ed"+
		"\t\3\2\2\u00ed\u00f6\5\32\16\n\u00ee\u00ef\f\b\2\2\u00ef\u00f0\t\4\2\2"+
		"\u00f0\u00f6\5\32\16\t\u00f1\u00f2\f\7\2\2\u00f2\u00f6\7\31\2\2\u00f3"+
		"\u00f4\f\6\2\2\u00f4\u00f6\7\32\2\2\u00f5\u00e8\3\2\2\2\u00f5\u00eb\3"+
		"\2\2\2\u00f5\u00ee\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\33\3\2\2"+
		"\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\b\17\1\2\u00fb\u00fc\7\37\2\2\u00fc"+
		"\u0104\5\32\16\2\u00fd\u00fe\7\37\2\2\u00fe\u00ff\7\6\2\2\u00ff\u0100"+
		"\5\34\17\2\u0100\u0101\7\b\2\2\u0101\u0104\3\2\2\2\u0102\u0104\5\32\16"+
		"\2\u0103\u00fa\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0111"+
		"\3\2\2\2\u0105\u0106\f\7\2\2\u0106\u0108\t\5\2\2\u0107\u0109\7\t\2\2\u0108"+
		"\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0110\5\34"+
		"\17\b\u010b\u010c\f\6\2\2\u010c\u010d\t\6\2\2\u010d\u010e\7\t\2\2\u010e"+
		"\u0110\5\34\17\7\u010f\u0105\3\2\2\2\u010f\u010b\3\2\2\2\u0110\u0113\3"+
		"\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\35\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0115\7 \2\2\u0115\u0116\5\6\4\2\u0116\37\3\2\2\2"+
		"\u0117\u0118\7!\2\2\u0118\u011d\5\26\f\2\u0119\u011a\7\7\2\2\u011a\u011c"+
		"\5\26\f\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2"+
		"\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122"+
		"\7\60\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122!\3\2\2\2\u0123"+
		"\u012c\7.\2\2\u0124\u0129\7\27\2\2\u0125\u0127\7\30\2\2\u0126\u0125\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0124\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\5\62\32\2\u012b\u0123\3"+
		"\2\2\2\u012b\u0128\3\2\2\2\u012c#\3\2\2\2\u012d\u012e\t\7\2\2\u012e%\3"+
		"\2\2\2\u012f\u0130\5$\23\2\u0130\u0131\7\33\2\2\u0131\u0132\7*\2\2\u0132"+
		"\u0133\7\7\2\2\u0133\u0134\7*\2\2\u0134\u0135\7\34\2\2\u0135\u0136\7."+
		"\2\2\u0136\u0145\3\2\2\2\u0137\u0138\7.\2\2\u0138\u0139\7\33\2\2\u0139"+
		"\u013a\7*\2\2\u013a\u013b\7\7\2\2\u013b\u013c\7*\2\2\u013c\u013d\7\34"+
		"\2\2\u013d\u013e\7\t\2\2\u013e\u0145\5\32\16\2\u013f\u0140\7.\2\2\u0140"+
		"\u0145\5*\26\2\u0141\u0142\7.\2\2\u0142\u0143\7\t\2\2\u0143\u0145\5(\25"+
		"\2\u0144\u012f\3\2\2\2\u0144\u0137\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0141"+
		"\3\2\2\2\u0145\'\3\2\2\2\u0146\u0147\7.\2\2\u0147\u0148\7\26\2\2\u0148"+
		"\u0156\7.\2\2\u0149\u014a\7.\2\2\u014a\u014b\7\27\2\2\u014b\u0156\7.\2"+
		"\2\u014c\u014d\7.\2\2\u014d\u014e\7\30\2\2\u014e\u0156\7.\2\2\u014f\u0150"+
		"\7.\2\2\u0150\u0151\7\25\2\2\u0151\u0156\5\32\16\2\u0152\u0153\7.\2\2"+
		"\u0153\u0154\7%\2\2\u0154\u0156\7.\2\2\u0155\u0146\3\2\2\2\u0155\u0149"+
		"\3\2\2\2\u0155\u014c\3\2\2\2\u0155\u014f\3\2\2\2\u0155\u0152\3\2\2\2\u0156"+
		")\3\2\2\2\u0157\u0158\t\b\2\2\u0158+\3\2\2\2\u0159\u0162\5$\23\2\u015a"+
		"\u015e\7\33\2\2\u015b\u015d\7\7\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3"+
		"\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0163\7\34\2\2\u0162\u015a\3\2\2\2\u0162\u0163\3"+
		"\2\2\2\u0163\u0166\3\2\2\2\u0164\u0166\7\n\2\2\u0165\u0159\3\2\2\2\u0165"+
		"\u0164\3\2\2\2\u0166-\3\2\2\2\u0167\u0168\7\33\2\2\u0168\u016d\7*\2\2"+
		"\u0169\u016a\7\7\2\2\u016a\u016c\7*\2\2\u016b\u0169\3\2\2\2\u016c\u016f"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0190\7\34\2\2\u0171\u0172\7\33\2\2\u0172\u0177\7"+
		"+\2\2\u0173\u0174\7\7\2\2\u0174\u0176\7+\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u017a\u0190\7\34\2\2\u017b\u017c\7\33\2\2\u017c"+
		"\u0181\7,\2\2\u017d\u017e\7\7\2\2\u017e\u0180\7,\2\2\u017f\u017d\3\2\2"+
		"\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184"+
		"\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0190\7\34\2\2\u0185\u0186\7\33\2\2"+
		"\u0186\u018b\7-\2\2\u0187\u0188\7\7\2\2\u0188\u018a\7-\2\2\u0189\u0187"+
		"\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\7\34\2\2\u018f\u0167\3"+
		"\2\2\2\u018f\u0171\3\2\2\2\u018f\u017b\3\2\2\2\u018f\u0185\3\2\2\2\u0190"+
		"/\3\2\2\2\u0191\u0192\5,\27\2\u0192\u0193\7\33\2\2\u0193\u0194\7*\2\2"+
		"\u0194\u0195\7\34\2\2\u0195\u0198\7.\2\2\u0196\u0197\7\t\2\2\u0197\u0199"+
		"\5.\30\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u01a0\3\2\2\2\u019a"+
		"\u019b\7.\2\2\u019b\u019c\7\33\2\2\u019c\u019d\5\32\16\2\u019d\u019e\7"+
		"\34\2\2\u019e\u01a0\3\2\2\2\u019f\u0191\3\2\2\2\u019f\u019a\3\2\2\2\u01a0"+
		"\61\3\2\2\2\u01a1\u01a2\t\t\2\2\u01a2\63\3\2\2\2.;GNWZ^ilor}\u008a\u008d"+
		"\u0092\u009e\u00a1\u00b3\u00b8\u00cb\u00d0\u00e6\u00f5\u00f7\u0103\u0108"+
		"\u010f\u0111\u011d\u0121\u0126\u0128\u012b\u0144\u0155\u015e\u0162\u0165"+
		"\u016d\u0177\u0181\u018b\u018f\u0198\u019f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}