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
		RULE_assignment = 5, RULE_function = 6, RULE_selective = 7, RULE_iterative = 8, 
		RULE_parameters = 9, RULE_exprs = 10, RULE_expr = 11, RULE_bexpr = 12, 
		RULE_main = 13, RULE_print = 14, RULE_val = 15, RULE_valtype = 16, RULE_return_ = 17, 
		RULE_matrix_assignment = 18, RULE_martix_math = 19, RULE_martix_pre_stuff = 20, 
		RULE_rettype = 21, RULE_array_constructs = 22, RULE_array_statements = 23, 
		RULE_num = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "block", "stmt", "function_call", "assignment", "function", 
			"selective", "iterative", "parameters", "exprs", "expr", "bexpr", "main", 
			"print", "val", "valtype", "return_", "matrix_assignment", "martix_math", 
			"martix_pre_stuff", "rettype", "array_constructs", "array_statements", 
			"num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'('", "','", "')'", "'='", "'string'", "'fun'", 
			"'auto'", "'if'", "'elif'", "'else'", "'for'", "'sqrt'", "'%'", "'**'", 
			"'*'", "'/'", "'+'", "'-'", "'++'", "'--'", "'['", "']'", "'>'", "'<'", 
			"'!'", "'main'", "'print'", "'int'", "'float'", "'double'", "'return'", 
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << ID))) != 0)) {
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
		public Array_statementsContext array_statements() {
			return getRuleContext(Array_statementsContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
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
			case T__29:
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
					array_statements();
					}
					break;
				case 3:
					{
					setState(65);
					assignment();
					}
					break;
				case 4:
					{
					setState(66);
					return_();
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
			case T__13:
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << Inum) | (1L << Fnum) | (1L << Dnum) | (1L << String) | (1L << ID))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__14) | (1L << T__19) | (1L << T__20) | (1L << T__27) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << Inum) | (1L << Fnum) | (1L << Dnum) | (1L << String) | (1L << ID))) != 0)) {
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
		public TerminalNode ID() { return getToken(MLgrammaParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValtypeContext valtype() {
			return getRuleContext(ValtypeContext.class,0);
		}
		public TerminalNode String() { return getToken(MLgrammaParser.String, 0); }
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
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) {
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
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__7);
				setState(118);
				match(ID);
				setState(119);
				match(T__6);
				setState(120);
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
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__8);
			setState(124);
			rettype();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(125);
				match(T__9);
				}
			}

			setState(128);
			match(ID);
			setState(129);
			match(T__3);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) {
				{
				setState(130);
				rettype();
				setState(131);
				match(ID);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(132);
					match(T__4);
					setState(133);
					rettype();
					setState(134);
					match(ID);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(143);
			match(T__5);
			setState(144);
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
			setState(146);
			match(T__10);
			setState(147);
			match(T__3);
			setState(148);
			bexpr(0);
			setState(149);
			match(T__5);
			setState(150);
			block();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(151);
				match(T__11);
				setState(152);
				match(T__3);
				setState(153);
				bexpr(0);
				setState(154);
				match(T__5);
				setState(155);
				block();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(162);
				match(T__12);
				setState(163);
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
		enterRule(_localctx, 16, RULE_iterative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__13);
			setState(167);
			match(T__3);
			setState(168);
			assignment();
			setState(169);
			match(T__2);
			setState(170);
			bexpr(0);
			setState(171);
			match(T__2);
			setState(172);
			exprs();
			setState(173);
			match(T__5);
			setState(174);
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
		enterRule(_localctx, 18, RULE_parameters);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				bexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				martix_math();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				martix_pre_stuff();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
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
		enterRule(_localctx, 20, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expr(0);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(183);
				match(T__4);
				setState(184);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(188);
				match(T__3);
				setState(189);
				expr(0);
				setState(190);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(192);
				match(T__14);
				setState(193);
				expr(9);
				}
				break;
			case 3:
				{
				setState(194);
				match(ID);
				setState(195);
				match(T__23);
				setState(196);
				expr(0);
				setState(197);
				match(T__24);
				}
				break;
			case 4:
				{
				setState(199);
				match(ID);
				setState(200);
				match(T__23);
				setState(201);
				expr(0);
				setState(202);
				match(T__4);
				setState(203);
				expr(0);
				setState(204);
				match(T__24);
				}
				break;
			case 5:
				{
				setState(206);
				val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(210);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(211);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(213);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(214);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(216);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(217);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(219);
						match(T__21);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(221);
						match(T__22);
						}
						break;
					}
					} 
				}
				setState(226);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_bexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(228);
				match(T__27);
				setState(229);
				expr(0);
				}
				break;
			case 2:
				{
				setState(230);
				match(T__27);
				setState(231);
				match(T__3);
				setState(232);
				bexpr(0);
				setState(233);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(235);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(238);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(239);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__6) {
							{
							setState(240);
							match(T__6);
							}
						}

						setState(243);
						bexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(244);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(245);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(246);
						match(T__6);
						setState(247);
						bexpr(5);
						}
						break;
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 26, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__28);
			setState(254);
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
		enterRule(_localctx, 28, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__29);
			setState(257);
			parameters();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(258);
				match(T__4);
				setState(259);
				parameters();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(265);
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
		enterRule(_localctx, 30, RULE_val);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(ID);
				}
				break;
			case T__19:
			case T__20:
			case Inum:
			case Fnum:
			case Dnum:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__19:
					{
					setState(269);
					match(T__19);
					}
					break;
				case T__20:
				case Inum:
				case Fnum:
				case Dnum:
					{
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__20) {
						{
						setState(270);
						match(T__20);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(275);
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
		enterRule(_localctx, 32, RULE_valtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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

	public static class Return_Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MLgrammaParser.ID, 0); }
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
		enterRule(_localctx, 34, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__33);
			setState(281);
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
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				valtype();
				setState(284);
				match(T__23);
				setState(285);
				match(Inum);
				setState(286);
				match(T__4);
				setState(287);
				match(Inum);
				setState(288);
				match(T__24);
				setState(289);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(ID);
				setState(292);
				match(T__23);
				setState(293);
				match(Inum);
				setState(294);
				match(T__4);
				setState(295);
				match(Inum);
				setState(296);
				match(T__24);
				setState(297);
				match(T__6);
				setState(298);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(ID);
				setState(300);
				martix_pre_stuff();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				match(ID);
				setState(302);
				match(T__6);
				setState(303);
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
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(ID);
				setState(307);
				match(T__18);
				setState(308);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(ID);
				setState(310);
				match(T__19);
				setState(311);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				match(ID);
				setState(313);
				match(T__20);
				setState(314);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				match(ID);
				setState(316);
				match(T__17);
				setState(317);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				match(ID);
				setState(319);
				match(T__34);
				setState(320);
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
			setState(323);
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
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				valtype();
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(326);
					match(T__23);
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(327);
						match(T__4);
						}
						}
						setState(332);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(333);
					match(T__24);
					}
					break;
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
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
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(T__23);
				setState(340);
				match(Inum);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(341);
					match(T__4);
					setState(342);
					match(Inum);
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(T__23);
				setState(350);
				match(Fnum);
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(351);
					match(T__4);
					setState(352);
					match(Fnum);
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(358);
				match(T__24);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(T__23);
				setState(360);
				match(Dnum);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(361);
					match(T__4);
					setState(362);
					match(Dnum);
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(368);
				match(T__24);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				match(T__23);
				setState(370);
				match(String);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(371);
					match(T__4);
					setState(372);
					match(String);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378);
				match(T__24);
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
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				rettype();
				setState(382);
				match(T__23);
				setState(383);
				match(Inum);
				setState(384);
				match(T__24);
				setState(385);
				match(ID);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(386);
					match(T__6);
					setState(387);
					array_constructs();
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(ID);
				setState(391);
				match(T__23);
				setState(392);
				expr(0);
				setState(393);
				match(T__24);
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
			setState(397);
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
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0192\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\5\6[\n\6\3\6\3\6\5\6_\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\5\6m\n\6\3\6\5\6p\n\6\3\7\5\7s"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\b\3\b\3\b\5\b\u0081\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b\5\b\u0090"+
		"\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a0"+
		"\n\t\f\t\16\t\u00a3\13\t\3\t\3\t\5\t\u00a7\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00b7\n\13\3\f\3\f\3\f\5\f\u00bc"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00d2\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00e1\n\r\f\r\16\r\u00e4\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00ef\n\16\3\16\3\16\3\16\5\16\u00f4\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u00fb\n\16\f\16\16\16\u00fe\13\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\7\20\u0107\n\20\f\20\16\20\u010a\13\20\3"+
		"\20\5\20\u010d\n\20\3\21\3\21\3\21\5\21\u0112\n\21\5\21\u0114\n\21\3\21"+
		"\5\21\u0117\n\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0133\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0144\n\25\3\26\3\26\3\27\3\27\3\27\7\27"+
		"\u014b\n\27\f\27\16\27\u014e\13\27\3\27\5\27\u0151\n\27\3\27\5\27\u0154"+
		"\n\27\3\30\3\30\3\30\3\30\7\30\u015a\n\30\f\30\16\30\u015d\13\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u0164\n\30\f\30\16\30\u0167\13\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u016e\n\30\f\30\16\30\u0171\13\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u0178\n\30\f\30\16\30\u017b\13\30\3\30\5\30\u017e\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0187\n\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u018e\n\31\3\32\3\32\3\32\2\4\30\32\33\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\2\n\3\2\22\23\3\2\24\25\3\2\26\27\3"+
		"\2\34\35\4\2\t\t\36\36\3\2!#\3\2&)\3\2*,\2\u01b8\2\64\3\2\2\2\4;\3\2\2"+
		"\2\6=\3\2\2\2\bN\3\2\2\2\no\3\2\2\2\f{\3\2\2\2\16}\3\2\2\2\20\u0094\3"+
		"\2\2\2\22\u00a8\3\2\2\2\24\u00b6\3\2\2\2\26\u00b8\3\2\2\2\30\u00d1\3\2"+
		"\2\2\32\u00ee\3\2\2\2\34\u00ff\3\2\2\2\36\u0102\3\2\2\2 \u0116\3\2\2\2"+
		"\"\u0118\3\2\2\2$\u011a\3\2\2\2&\u0132\3\2\2\2(\u0143\3\2\2\2*\u0145\3"+
		"\2\2\2,\u0153\3\2\2\2.\u017d\3\2\2\2\60\u018d\3\2\2\2\62\u018f\3\2\2\2"+
		"\64\65\5\4\3\2\65\66\5\34\17\2\66\67\7\2\2\3\67\3\3\2\2\289\5\b\5\29:"+
		"\5\4\3\2:<\3\2\2\2;8\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=>\7\3\2\2>?\5\4\3\2"+
		"?@\7\4\2\2@\7\3\2\2\2AH\5\n\6\2BH\5\60\31\2CH\5\f\7\2DH\5$\23\2EH\5&\24"+
		"\2FH\5\36\20\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2"+
		"\2\2HI\3\2\2\2IJ\7\5\2\2JO\3\2\2\2KO\5\16\b\2LO\5\20\t\2MO\5\22\n\2NG"+
		"\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PQ\7.\2\2QZ\7\6\2\2R"+
		"W\5\24\13\2ST\7\7\2\2TV\5\24\13\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2X[\3\2\2\2YW\3\2\2\2ZR\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\p\7\b\2\2]_\5"+
		",\27\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7.\2\2ab\7\t\2\2bc\7.\2\2cl\7\6"+
		"\2\2di\5\24\13\2ef\7\7\2\2fh\5\24\13\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2i"+
		"j\3\2\2\2jm\3\2\2\2ki\3\2\2\2ld\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\7\b\2\2"+
		"oP\3\2\2\2o^\3\2\2\2p\13\3\2\2\2qs\5\"\22\2rq\3\2\2\2rs\3\2\2\2st\3\2"+
		"\2\2tu\7.\2\2uv\7\t\2\2v|\5\30\r\2wx\7\n\2\2xy\7.\2\2yz\7\t\2\2z|\7-\2"+
		"\2{r\3\2\2\2{w\3\2\2\2|\r\3\2\2\2}~\7\13\2\2~\u0080\5,\27\2\177\u0081"+
		"\7\f\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\7.\2\2\u0083\u008f\7\6\2\2\u0084\u0085\5,\27\2\u0085\u008c\7.\2"+
		"\2\u0086\u0087\7\7\2\2\u0087\u0088\5,\27\2\u0088\u0089\7.\2\2\u0089\u008b"+
		"\3\2\2\2\u008a\u0086\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0084\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\b\2\2\u0092"+
		"\u0093\5\6\4\2\u0093\17\3\2\2\2\u0094\u0095\7\r\2\2\u0095\u0096\7\6\2"+
		"\2\u0096\u0097\5\32\16\2\u0097\u0098\7\b\2\2\u0098\u00a1\5\6\4\2\u0099"+
		"\u009a\7\16\2\2\u009a\u009b\7\6\2\2\u009b\u009c\5\32\16\2\u009c\u009d"+
		"\7\b\2\2\u009d\u009e\5\6\4\2\u009e\u00a0\3\2\2\2\u009f\u0099\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\17\2\2\u00a5\u00a7\5\6\4\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\21\3\2\2\2\u00a8\u00a9\7\20\2"+
		"\2\u00a9\u00aa\7\6\2\2\u00aa\u00ab\5\f\7\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad"+
		"\5\32\16\2\u00ad\u00ae\7\5\2\2\u00ae\u00af\5\26\f\2\u00af\u00b0\7\b\2"+
		"\2\u00b0\u00b1\5\6\4\2\u00b1\23\3\2\2\2\u00b2\u00b7\5\32\16\2\u00b3\u00b7"+
		"\5(\25\2\u00b4\u00b7\5*\26\2\u00b5\u00b7\7-\2\2\u00b6\u00b2\3\2\2\2\u00b6"+
		"\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\25\3\2\2"+
		"\2\u00b8\u00bb\5\30\r\2\u00b9\u00ba\7\7\2\2\u00ba\u00bc\5\26\f\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\27\3\2\2\2\u00bd\u00be\b\r\1"+
		"\2\u00be\u00bf\7\6\2\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1\7\b\2\2\u00c1"+
		"\u00d2\3\2\2\2\u00c2\u00c3\7\21\2\2\u00c3\u00d2\5\30\r\13\u00c4\u00c5"+
		"\7.\2\2\u00c5\u00c6\7\32\2\2\u00c6\u00c7\5\30\r\2\u00c7\u00c8\7\33\2\2"+
		"\u00c8\u00d2\3\2\2\2\u00c9\u00ca\7.\2\2\u00ca\u00cb\7\32\2\2\u00cb\u00cc"+
		"\5\30\r\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce\5\30\r\2\u00ce\u00cf\7\33\2"+
		"\2\u00cf\u00d2\3\2\2\2\u00d0\u00d2\5 \21\2\u00d1\u00bd\3\2\2\2\u00d1\u00c2"+
		"\3\2\2\2\u00d1\u00c4\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00e2\3\2\2\2\u00d3\u00d4\f\n\2\2\u00d4\u00d5\t\2\2\2\u00d5\u00e1\5\30"+
		"\r\13\u00d6\u00d7\f\t\2\2\u00d7\u00d8\t\3\2\2\u00d8\u00e1\5\30\r\n\u00d9"+
		"\u00da\f\b\2\2\u00da\u00db\t\4\2\2\u00db\u00e1\5\30\r\t\u00dc\u00dd\f"+
		"\7\2\2\u00dd\u00e1\7\30\2\2\u00de\u00df\f\6\2\2\u00df\u00e1\7\31\2\2\u00e0"+
		"\u00d3\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00dc\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\31\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\b\16\1"+
		"\2\u00e6\u00e7\7\36\2\2\u00e7\u00ef\5\30\r\2\u00e8\u00e9\7\36\2\2\u00e9"+
		"\u00ea\7\6\2\2\u00ea\u00eb\5\32\16\2\u00eb\u00ec\7\b\2\2\u00ec\u00ef\3"+
		"\2\2\2\u00ed\u00ef\5\30\r\2\u00ee\u00e5\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00fc\3\2\2\2\u00f0\u00f1\f\7\2\2\u00f1\u00f3\t\5"+
		"\2\2\u00f2\u00f4\7\t\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00fb\5\32\16\b\u00f6\u00f7\f\6\2\2\u00f7\u00f8\t"+
		"\6\2\2\u00f8\u00f9\7\t\2\2\u00f9\u00fb\5\32\16\7\u00fa\u00f0\3\2\2\2\u00fa"+
		"\u00f6\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\33\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\37\2\2\u0100\u0101"+
		"\5\6\4\2\u0101\35\3\2\2\2\u0102\u0103\7 \2\2\u0103\u0108\5\24\13\2\u0104"+
		"\u0105\7\7\2\2\u0105\u0107\5\24\13\2\u0106\u0104\3\2\2\2\u0107\u010a\3"+
		"\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010b\u010d\7\60\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3"+
		"\2\2\2\u010d\37\3\2\2\2\u010e\u0117\7.\2\2\u010f\u0114\7\26\2\2\u0110"+
		"\u0112\7\27\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3"+
		"\2\2\2\u0113\u010f\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0117\5\62\32\2\u0116\u010e\3\2\2\2\u0116\u0113\3\2\2\2\u0117!\3\2\2"+
		"\2\u0118\u0119\t\7\2\2\u0119#\3\2\2\2\u011a\u011b\7$\2\2\u011b\u011c\7"+
		".\2\2\u011c%\3\2\2\2\u011d\u011e\5\"\22\2\u011e\u011f\7\32\2\2\u011f\u0120"+
		"\7*\2\2\u0120\u0121\7\7\2\2\u0121\u0122\7*\2\2\u0122\u0123\7\33\2\2\u0123"+
		"\u0124\7.\2\2\u0124\u0133\3\2\2\2\u0125\u0126\7.\2\2\u0126\u0127\7\32"+
		"\2\2\u0127\u0128\7*\2\2\u0128\u0129\7\7\2\2\u0129\u012a\7*\2\2\u012a\u012b"+
		"\7\33\2\2\u012b\u012c\7\t\2\2\u012c\u0133\5\30\r\2\u012d\u012e\7.\2\2"+
		"\u012e\u0133\5*\26\2\u012f\u0130\7.\2\2\u0130\u0131\7\t\2\2\u0131\u0133"+
		"\5(\25\2\u0132\u011d\3\2\2\2\u0132\u0125\3\2\2\2\u0132\u012d\3\2\2\2\u0132"+
		"\u012f\3\2\2\2\u0133\'\3\2\2\2\u0134\u0135\7.\2\2\u0135\u0136\7\25\2\2"+
		"\u0136\u0144\7.\2\2\u0137\u0138\7.\2\2\u0138\u0139\7\26\2\2\u0139\u0144"+
		"\7.\2\2\u013a\u013b\7.\2\2\u013b\u013c\7\27\2\2\u013c\u0144\7.\2\2\u013d"+
		"\u013e\7.\2\2\u013e\u013f\7\24\2\2\u013f\u0144\5\30\r\2\u0140\u0141\7"+
		".\2\2\u0141\u0142\7%\2\2\u0142\u0144\7.\2\2\u0143\u0134\3\2\2\2\u0143"+
		"\u0137\3\2\2\2\u0143\u013a\3\2\2\2\u0143\u013d\3\2\2\2\u0143\u0140\3\2"+
		"\2\2\u0144)\3\2\2\2\u0145\u0146\t\b\2\2\u0146+\3\2\2\2\u0147\u0150\5\""+
		"\22\2\u0148\u014c\7\32\2\2\u0149\u014b\7\7\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014f\u0151\7\33\2\2\u0150\u0148\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0154\7\n\2\2\u0153\u0147\3\2"+
		"\2\2\u0153\u0152\3\2\2\2\u0154-\3\2\2\2\u0155\u0156\7\32\2\2\u0156\u015b"+
		"\7*\2\2\u0157\u0158\7\7\2\2\u0158\u015a\7*\2\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015e\u017e\7\33\2\2\u015f\u0160\7\32\2\2\u0160"+
		"\u0165\7+\2\2\u0161\u0162\7\7\2\2\u0162\u0164\7+\2\2\u0163\u0161\3\2\2"+
		"\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u017e\7\33\2\2\u0169\u016a\7\32\2\2"+
		"\u016a\u016f\7,\2\2\u016b\u016c\7\7\2\2\u016c\u016e\7,\2\2\u016d\u016b"+
		"\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u017e\7\33\2\2\u0173\u0174\7"+
		"\32\2\2\u0174\u0179\7-\2\2\u0175\u0176\7\7\2\2\u0176\u0178\7-\2\2\u0177"+
		"\u0175\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e\7\33\2\2\u017d"+
		"\u0155\3\2\2\2\u017d\u015f\3\2\2\2\u017d\u0169\3\2\2\2\u017d\u0173\3\2"+
		"\2\2\u017e/\3\2\2\2\u017f\u0180\5,\27\2\u0180\u0181\7\32\2\2\u0181\u0182"+
		"\7*\2\2\u0182\u0183\7\33\2\2\u0183\u0186\7.\2\2\u0184\u0185\7\t\2\2\u0185"+
		"\u0187\5.\30\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018e\3\2"+
		"\2\2\u0188\u0189\7.\2\2\u0189\u018a\7\32\2\2\u018a\u018b\5\30\r\2\u018b"+
		"\u018c\7\33\2\2\u018c\u018e\3\2\2\2\u018d\u017f\3\2\2\2\u018d\u0188\3"+
		"\2\2\2\u018e\61\3\2\2\2\u018f\u0190\t\t\2\2\u0190\63\3\2\2\2,;GNWZ^il"+
		"or{\u0080\u008c\u008f\u00a1\u00a6\u00b6\u00bb\u00d1\u00e0\u00e2\u00ee"+
		"\u00f3\u00fa\u00fc\u0108\u010c\u0111\u0113\u0116\u0132\u0143\u014c\u0150"+
		"\u0153\u015b\u0165\u016f\u0179\u017d\u0186\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}