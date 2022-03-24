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
		T__38=39, T__39=40, Inum=41, Fnum=42, Dnum=43, String=44, ID=45, WHITESPACE=46, 
		NEWLINE=47;
	public static final int
		RULE_prog = 0, RULE_stmts = 1, RULE_block = 2, RULE_prototypes = 3, RULE_stmt = 4, 
		RULE_function_call = 5, RULE_assignment = 6, RULE_function = 7, RULE_function_prototype = 8, 
		RULE_selective = 9, RULE_return_ = 10, RULE_iterative = 11, RULE_parameters = 12, 
		RULE_exprs = 13, RULE_expr = 14, RULE_bexpr = 15, RULE_main = 16, RULE_print = 17, 
		RULE_val = 18, RULE_valtype = 19, RULE_matrix_assignment = 20, RULE_martix_math = 21, 
		RULE_martix_pre_stuff = 22, RULE_rettype = 23, RULE_array_constructs = 24, 
		RULE_array_statements = 25, RULE_num = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "block", "prototypes", "stmt", "function_call", "assignment", 
			"function", "function_prototype", "selective", "return_", "iterative", 
			"parameters", "exprs", "expr", "bexpr", "main", "print", "val", "valtype", 
			"matrix_assignment", "martix_math", "martix_pre_stuff", "rettype", "array_constructs", 
			"array_statements", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'('", "','", "')'", "'='", "'string'", "'fun'", 
			"'auto'", "'prototype'", "'if'", "'elif'", "'else'", "'return'", "'for'", 
			"'sqrt'", "'%'", "'**'", "'*'", "'/'", "'+'", "'-'", "'++'", "'--'", 
			"'['", "']'", "'>'", "'<'", "'!'", "'main'", "'print'", "'int'", "'float'", 
			"'double'", "'.'", "'.T'", "'.random'", "'.one'", "'.zero'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "Inum", "Fnum", "Dnum", "String", "ID", 
			"WHITESPACE", "NEWLINE"
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
			setState(54);
			prototypes();
			setState(55);
			stmts();
			setState(56);
			main();
			setState(57);
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << ID))) != 0)) {
				{
				setState(59);
				stmt();
				setState(60);
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
			setState(64);
			match(T__0);
			setState(65);
			stmts();
			setState(66);
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
		enterRule(_localctx, 6, RULE_prototypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(68);
				function_prototype();
				setState(69);
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
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__14:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(73);
					function_call();
					}
					break;
				case 2:
					{
					setState(74);
					return_();
					}
					break;
				case 3:
					{
					setState(75);
					array_statements();
					}
					break;
				case 4:
					{
					setState(76);
					assignment();
					}
					break;
				case 5:
					{
					setState(77);
					matrix_assignment();
					}
					break;
				case 6:
					{
					setState(78);
					print();
					}
					break;
				}
				setState(81);
				match(T__2);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				function();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				selective();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
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
		enterRule(_localctx, 10, RULE_function_call);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(ID);
				setState(89);
				match(T__3);
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(90);
					parameters();
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(91);
						match(T__4);
						setState(92);
						parameters();
						}
						}
						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(100);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
					{
					setState(101);
					rettype();
					}
				}

				setState(104);
				match(ID);
				setState(105);
				match(T__6);
				setState(106);
				match(ID);
				setState(107);
				match(T__3);
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(108);
					parameters();
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(109);
						match(T__4);
						setState(110);
						parameters();
						}
						}
						setState(115);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(118);
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
		enterRule(_localctx, 12, RULE_assignment);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
					{
					setState(121);
					valtype();
					}
				}

				setState(124);
				match(ID);
				setState(125);
				match(T__6);
				setState(126);
				expr(0);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(127);
					match(T__4);
					setState(128);
					match(ID);
					setState(129);
					match(T__6);
					setState(130);
					expr(0);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(T__7);
				setState(137);
				match(ID);
				setState(138);
				match(T__6);
				setState(139);
				match(String);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(140);
					match(T__4);
					setState(141);
					match(ID);
					setState(142);
					match(T__6);
					setState(143);
					match(String);
					}
					}
					setState(148);
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
		enterRule(_localctx, 14, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__8);
			setState(152);
			rettype();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(153);
				match(T__9);
				}
			}

			setState(156);
			match(ID);
			setState(157);
			match(T__3);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				setState(158);
				rettype();
				setState(159);
				match(ID);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(160);
					match(T__4);
					setState(161);
					rettype();
					setState(162);
					match(ID);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(171);
			match(T__5);
			setState(172);
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
		enterRule(_localctx, 16, RULE_function_prototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__10);
			setState(175);
			rettype();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(176);
				match(T__9);
				}
			}

			setState(179);
			match(ID);
			setState(180);
			match(T__3);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) {
				{
				setState(181);
				rettype();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(182);
					match(T__4);
					setState(183);
					rettype();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(191);
			match(T__5);
			setState(192);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 18, RULE_selective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__11);
			setState(195);
			match(T__3);
			setState(196);
			bexpr(0);
			setState(197);
			match(T__5);
			setState(198);
			block();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(199);
				match(T__12);
				setState(200);
				match(T__3);
				setState(201);
				bexpr(0);
				setState(202);
				match(T__5);
				setState(203);
				block();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(210);
				match(T__13);
				setState(211);
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
		enterRule(_localctx, 20, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__14);
			setState(215);
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
		enterRule(_localctx, 22, RULE_iterative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__15);
			setState(218);
			match(T__3);
			setState(219);
			assignment();
			setState(220);
			match(T__2);
			setState(221);
			bexpr(0);
			setState(222);
			match(T__2);
			setState(223);
			exprs();
			setState(224);
			match(T__5);
			setState(225);
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
		enterRule(_localctx, 24, RULE_parameters);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				bexpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				martix_math();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				martix_pre_stuff();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
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
		enterRule(_localctx, 26, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			expr(0);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(234);
				match(T__4);
				setState(235);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(239);
				match(T__3);
				setState(240);
				expr(0);
				setState(241);
				match(T__5);
				}
				break;
			case 2:
				{
				setState(243);
				match(T__16);
				setState(244);
				expr(9);
				}
				break;
			case 3:
				{
				setState(245);
				match(ID);
				setState(246);
				match(T__25);
				setState(247);
				expr(0);
				setState(248);
				match(T__26);
				}
				break;
			case 4:
				{
				setState(250);
				match(ID);
				setState(251);
				match(T__25);
				setState(252);
				expr(0);
				setState(253);
				match(T__4);
				setState(254);
				expr(0);
				setState(255);
				match(T__26);
				}
				break;
			case 5:
				{
				setState(257);
				val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(261);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(264);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(265);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(267);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(268);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(270);
						match(T__23);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(272);
						match(T__24);
						}
						break;
					}
					} 
				}
				setState(277);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_bexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(279);
				match(T__29);
				setState(280);
				expr(0);
				}
				break;
			case 2:
				{
				setState(281);
				match(T__29);
				setState(282);
				match(T__3);
				setState(283);
				bexpr(0);
				setState(284);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(286);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(289);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(290);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(292);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__6) {
							{
							setState(291);
							match(T__6);
							}
						}

						setState(294);
						bexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new BexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(295);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(296);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(297);
						match(T__6);
						setState(298);
						bexpr(5);
						}
						break;
					}
					} 
				}
				setState(303);
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
		enterRule(_localctx, 32, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(T__30);
			setState(305);
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
		enterRule(_localctx, 34, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__31);
			setState(308);
			parameters();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(309);
				match(T__4);
				setState(310);
				parameters();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(316);
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
		enterRule(_localctx, 36, RULE_val);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(ID);
				}
				break;
			case T__21:
			case T__22:
			case Inum:
			case Fnum:
			case Dnum:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(320);
					match(T__21);
					}
					break;
				case T__22:
				case Inum:
				case Fnum:
				case Dnum:
					{
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__22) {
						{
						setState(321);
						match(T__22);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326);
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
		enterRule(_localctx, 38, RULE_valtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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
		enterRule(_localctx, 40, RULE_matrix_assignment);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				valtype();
				setState(332);
				match(T__25);
				setState(333);
				match(Inum);
				setState(334);
				match(T__4);
				setState(335);
				match(Inum);
				setState(336);
				match(T__26);
				setState(337);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(ID);
				setState(340);
				match(T__25);
				setState(341);
				match(Inum);
				setState(342);
				match(T__4);
				setState(343);
				match(Inum);
				setState(344);
				match(T__26);
				setState(345);
				match(T__6);
				setState(346);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				match(ID);
				setState(348);
				martix_pre_stuff();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				match(ID);
				setState(350);
				match(T__6);
				setState(351);
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
		enterRule(_localctx, 42, RULE_martix_math);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
			case T__5:
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(ID);
				setState(356);
				match(T__35);
				setState(357);
				match(ID);
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
			setState(360);
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
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				valtype();
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(363);
					match(T__25);
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(364);
						match(T__4);
						}
						}
						setState(369);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(370);
					match(T__26);
					}
					break;
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
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
		enterRule(_localctx, 48, RULE_array_constructs);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(T__25);
				setState(377);
				match(Inum);
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(378);
					match(T__4);
					setState(379);
					match(Inum);
					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(385);
				match(T__26);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(T__25);
				setState(387);
				match(Fnum);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(388);
					match(T__4);
					setState(389);
					match(Fnum);
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(395);
				match(T__26);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				match(T__25);
				setState(397);
				match(Dnum);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(398);
					match(T__4);
					setState(399);
					match(Dnum);
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405);
				match(T__26);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				match(T__25);
				setState(407);
				match(String);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(408);
					match(T__4);
					setState(409);
					match(String);
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				match(T__26);
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
		enterRule(_localctx, 50, RULE_array_statements);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				rettype();
				setState(419);
				match(T__25);
				setState(420);
				match(Inum);
				setState(421);
				match(T__26);
				setState(422);
				match(ID);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(423);
					match(T__6);
					setState(424);
					array_constructs();
					}
				}

				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(ID);
				setState(428);
				match(T__25);
				setState(429);
				expr(0);
				setState(430);
				match(T__26);
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
		enterRule(_localctx, 52, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01b7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3A\n"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\7\3\7\3\7\7\7`\n\7\f\7\16\7"+
		"c\13\7\5\7e\n\7\3\7\3\7\5\7i\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7r\n\7"+
		"\f\7\16\7u\13\7\5\7w\n\7\3\7\5\7z\n\7\3\b\5\b}\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u0086\n\b\f\b\16\b\u0089\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u0093\n\b\f\b\16\b\u0096\13\b\5\b\u0098\n\b\3\t\3\t\3\t\5\t\u009d"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a7\n\t\f\t\16\t\u00aa\13\t"+
		"\5\t\u00ac\n\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00b4\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\7\n\u00bb\n\n\f\n\16\n\u00be\13\n\5\n\u00c0\n\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d0\n\13\f\13"+
		"\16\13\u00d3\13\13\3\13\3\13\5\13\u00d7\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00ea\n\16\3\17\3"+
		"\17\3\17\5\17\u00ef\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0105\n\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u0114\n\20\f\20\16\20\u0117\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0122\n\21\3\21\3\21\3\21\5\21\u0127\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u012e\n\21\f\21\16\21\u0131\13\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\7\23\u013a\n\23\f\23\16\23\u013d\13\23\3\23\5\23\u0140"+
		"\n\23\3\24\3\24\3\24\5\24\u0145\n\24\5\24\u0147\n\24\3\24\5\24\u014a\n"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0163\n\26\3\27"+
		"\3\27\3\27\3\27\5\27\u0169\n\27\3\30\3\30\3\31\3\31\3\31\7\31\u0170\n"+
		"\31\f\31\16\31\u0173\13\31\3\31\5\31\u0176\n\31\3\31\5\31\u0179\n\31\3"+
		"\32\3\32\3\32\3\32\7\32\u017f\n\32\f\32\16\32\u0182\13\32\3\32\3\32\3"+
		"\32\3\32\3\32\7\32\u0189\n\32\f\32\16\32\u018c\13\32\3\32\3\32\3\32\3"+
		"\32\3\32\7\32\u0193\n\32\f\32\16\32\u0196\13\32\3\32\3\32\3\32\3\32\3"+
		"\32\7\32\u019d\n\32\f\32\16\32\u01a0\13\32\3\32\5\32\u01a3\n\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u01ac\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u01b3\n\33\3\34\3\34\3\34\2\4\36 \35\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\66\2\n\3\2\24\25\3\2\26\27\3\2\30\31\3"+
		"\2\36\37\4\2\t\t  \3\2#%\3\2\'*\3\2+-\2\u01de\28\3\2\2\2\4@\3\2\2\2\6"+
		"B\3\2\2\2\bI\3\2\2\2\nX\3\2\2\2\fy\3\2\2\2\16\u0097\3\2\2\2\20\u0099\3"+
		"\2\2\2\22\u00b0\3\2\2\2\24\u00c4\3\2\2\2\26\u00d8\3\2\2\2\30\u00db\3\2"+
		"\2\2\32\u00e9\3\2\2\2\34\u00eb\3\2\2\2\36\u0104\3\2\2\2 \u0121\3\2\2\2"+
		"\"\u0132\3\2\2\2$\u0135\3\2\2\2&\u0149\3\2\2\2(\u014b\3\2\2\2*\u0162\3"+
		"\2\2\2,\u0168\3\2\2\2.\u016a\3\2\2\2\60\u0178\3\2\2\2\62\u01a2\3\2\2\2"+
		"\64\u01b2\3\2\2\2\66\u01b4\3\2\2\289\5\b\5\29:\5\4\3\2:;\5\"\22\2;<\7"+
		"\2\2\3<\3\3\2\2\2=>\5\n\6\2>?\5\4\3\2?A\3\2\2\2@=\3\2\2\2@A\3\2\2\2A\5"+
		"\3\2\2\2BC\7\3\2\2CD\5\4\3\2DE\7\4\2\2E\7\3\2\2\2FG\5\22\n\2GH\5\b\5\2"+
		"HJ\3\2\2\2IF\3\2\2\2IJ\3\2\2\2J\t\3\2\2\2KR\5\f\7\2LR\5\26\f\2MR\5\64"+
		"\33\2NR\5\16\b\2OR\5*\26\2PR\5$\23\2QK\3\2\2\2QL\3\2\2\2QM\3\2\2\2QN\3"+
		"\2\2\2QO\3\2\2\2QP\3\2\2\2RS\3\2\2\2ST\7\5\2\2TY\3\2\2\2UY\5\20\t\2VY"+
		"\5\24\13\2WY\5\30\r\2XQ\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\13\3\2"+
		"\2\2Z[\7/\2\2[d\7\6\2\2\\a\5\32\16\2]^\7\7\2\2^`\5\32\16\2_]\3\2\2\2`"+
		"c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2d\\\3\2\2\2de\3\2\2\2"+
		"ef\3\2\2\2fz\7\b\2\2gi\5\60\31\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7/\2"+
		"\2kl\7\t\2\2lm\7/\2\2mv\7\6\2\2ns\5\32\16\2op\7\7\2\2pr\5\32\16\2qo\3"+
		"\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vn\3\2\2\2vw\3"+
		"\2\2\2wx\3\2\2\2xz\7\b\2\2yZ\3\2\2\2yh\3\2\2\2z\r\3\2\2\2{}\5(\25\2|{"+
		"\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7/\2\2\177\u0080\7\t\2\2\u0080\u0087"+
		"\5\36\20\2\u0081\u0082\7\7\2\2\u0082\u0083\7/\2\2\u0083\u0084\7\t\2\2"+
		"\u0084\u0086\5\36\20\2\u0085\u0081\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0098\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\7\n\2\2\u008b\u008c\7/\2\2\u008c\u008d\7\t\2\2\u008d\u0094\7.\2"+
		"\2\u008e\u008f\7\7\2\2\u008f\u0090\7/\2\2\u0090\u0091\7\t\2\2\u0091\u0093"+
		"\7.\2\2\u0092\u008e\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097|\3\2\2\2"+
		"\u0097\u008a\3\2\2\2\u0098\17\3\2\2\2\u0099\u009a\7\13\2\2\u009a\u009c"+
		"\5\60\31\2\u009b\u009d\7\f\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\u009f\7/\2\2\u009f\u00ab\7\6\2\2\u00a0\u00a1"+
		"\5\60\31\2\u00a1\u00a8\7/\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\5\60\31"+
		"\2\u00a4\u00a5\7/\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00a0\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00af\5\6\4\2\u00af\21\3\2\2\2\u00b0\u00b1"+
		"\7\r\2\2\u00b1\u00b3\5\60\31\2\u00b2\u00b4\7\f\2\2\u00b3\u00b2\3\2\2\2"+
		"\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7/\2\2\u00b6\u00bf"+
		"\7\6\2\2\u00b7\u00bc\5\60\31\2\u00b8\u00b9\7\7\2\2\u00b9\u00bb\5\60\31"+
		"\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\7\5"+
		"\2\2\u00c3\23\3\2\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\7\6\2\2\u00c6\u00c7"+
		"\5 \21\2\u00c7\u00c8\7\b\2\2\u00c8\u00d1\5\6\4\2\u00c9\u00ca\7\17\2\2"+
		"\u00ca\u00cb\7\6\2\2\u00cb\u00cc\5 \21\2\u00cc\u00cd\7\b\2\2\u00cd\u00ce"+
		"\5\6\4\2\u00ce\u00d0\3\2\2\2\u00cf\u00c9\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d5\7\20\2\2\u00d5\u00d7\5\6\4\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\25\3\2\2\2\u00d8\u00d9\7\21\2\2\u00d9\u00da\5\36"+
		"\20\2\u00da\27\3\2\2\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\7\6\2\2\u00dd"+
		"\u00de\5\16\b\2\u00de\u00df\7\5\2\2\u00df\u00e0\5 \21\2\u00e0\u00e1\7"+
		"\5\2\2\u00e1\u00e2\5\34\17\2\u00e2\u00e3\7\b\2\2\u00e3\u00e4\5\6\4\2\u00e4"+
		"\31\3\2\2\2\u00e5\u00ea\5 \21\2\u00e6\u00ea\5,\27\2\u00e7\u00ea\5.\30"+
		"\2\u00e8\u00ea\7.\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\33\3\2\2\2\u00eb\u00ee\5\36\20\2\u00ec"+
		"\u00ed\7\7\2\2\u00ed\u00ef\5\34\17\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\35\3\2\2\2\u00f0\u00f1\b\20\1\2\u00f1\u00f2\7\6\2\2\u00f2"+
		"\u00f3\5\36\20\2\u00f3\u00f4\7\b\2\2\u00f4\u0105\3\2\2\2\u00f5\u00f6\7"+
		"\23\2\2\u00f6\u0105\5\36\20\13\u00f7\u00f8\7/\2\2\u00f8\u00f9\7\34\2\2"+
		"\u00f9\u00fa\5\36\20\2\u00fa\u00fb\7\35\2\2\u00fb\u0105\3\2\2\2\u00fc"+
		"\u00fd\7/\2\2\u00fd\u00fe\7\34\2\2\u00fe\u00ff\5\36\20\2\u00ff\u0100\7"+
		"\7\2\2\u0100\u0101\5\36\20\2\u0101\u0102\7\35\2\2\u0102\u0105\3\2\2\2"+
		"\u0103\u0105\5&\24\2\u0104\u00f0\3\2\2\2\u0104\u00f5\3\2\2\2\u0104\u00f7"+
		"\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0115\3\2\2\2\u0106"+
		"\u0107\f\n\2\2\u0107\u0108\t\2\2\2\u0108\u0114\5\36\20\13\u0109\u010a"+
		"\f\t\2\2\u010a\u010b\t\3\2\2\u010b\u0114\5\36\20\n\u010c\u010d\f\b\2\2"+
		"\u010d\u010e\t\4\2\2\u010e\u0114\5\36\20\t\u010f\u0110\f\7\2\2\u0110\u0114"+
		"\7\32\2\2\u0111\u0112\f\6\2\2\u0112\u0114\7\33\2\2\u0113\u0106\3\2\2\2"+
		"\u0113\u0109\3\2\2\2\u0113\u010c\3\2\2\2\u0113\u010f\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\37\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\b\21\1\2\u0119\u011a\7 \2"+
		"\2\u011a\u0122\5\36\20\2\u011b\u011c\7 \2\2\u011c\u011d\7\6\2\2\u011d"+
		"\u011e\5 \21\2\u011e\u011f\7\b\2\2\u011f\u0122\3\2\2\2\u0120\u0122\5\36"+
		"\20\2\u0121\u0118\3\2\2\2\u0121\u011b\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"\u012f\3\2\2\2\u0123\u0124\f\7\2\2\u0124\u0126\t\5\2\2\u0125\u0127\7\t"+
		"\2\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u012e\5 \21\b\u0129\u012a\f\6\2\2\u012a\u012b\t\6\2\2\u012b\u012c\7\t"+
		"\2\2\u012c\u012e\5 \21\7\u012d\u0123\3\2\2\2\u012d\u0129\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130!\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0132\u0133\7!\2\2\u0133\u0134\5\6\4\2\u0134#\3\2"+
		"\2\2\u0135\u0136\7\"\2\2\u0136\u013b\5\32\16\2\u0137\u0138\7\7\2\2\u0138"+
		"\u013a\5\32\16\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3"+
		"\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0140\7\61\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140%\3\2\2\2"+
		"\u0141\u014a\7/\2\2\u0142\u0147\7\30\2\2\u0143\u0145\7\31\2\2\u0144\u0143"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0142\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\5\66\34\2\u0149\u0141\3"+
		"\2\2\2\u0149\u0146\3\2\2\2\u014a\'\3\2\2\2\u014b\u014c\t\7\2\2\u014c)"+
		"\3\2\2\2\u014d\u014e\5(\25\2\u014e\u014f\7\34\2\2\u014f\u0150\7+\2\2\u0150"+
		"\u0151\7\7\2\2\u0151\u0152\7+\2\2\u0152\u0153\7\35\2\2\u0153\u0154\7/"+
		"\2\2\u0154\u0163\3\2\2\2\u0155\u0156\7/\2\2\u0156\u0157\7\34\2\2\u0157"+
		"\u0158\7+\2\2\u0158\u0159\7\7\2\2\u0159\u015a\7+\2\2\u015a\u015b\7\35"+
		"\2\2\u015b\u015c\7\t\2\2\u015c\u0163\5\36\20\2\u015d\u015e\7/\2\2\u015e"+
		"\u0163\5.\30\2\u015f\u0160\7/\2\2\u0160\u0161\7\t\2\2\u0161\u0163\5,\27"+
		"\2\u0162\u014d\3\2\2\2\u0162\u0155\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u015f"+
		"\3\2\2\2\u0163+\3\2\2\2\u0164\u0169\3\2\2\2\u0165\u0166\7/\2\2\u0166\u0167"+
		"\7&\2\2\u0167\u0169\7/\2\2\u0168\u0164\3\2\2\2\u0168\u0165\3\2\2\2\u0169"+
		"-\3\2\2\2\u016a\u016b\t\b\2\2\u016b/\3\2\2\2\u016c\u0175\5(\25\2\u016d"+
		"\u0171\7\34\2\2\u016e\u0170\7\7\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3"+
		"\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0176\7\35\2\2\u0175\u016d\3\2\2\2\u0175\u0176\3"+
		"\2\2\2\u0176\u0179\3\2\2\2\u0177\u0179\7\n\2\2\u0178\u016c\3\2\2\2\u0178"+
		"\u0177\3\2\2\2\u0179\61\3\2\2\2\u017a\u017b\7\34\2\2\u017b\u0180\7+\2"+
		"\2\u017c\u017d\7\7\2\2\u017d\u017f\7+\2\2\u017e\u017c\3\2\2\2\u017f\u0182"+
		"\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0183\u01a3\7\35\2\2\u0184\u0185\7\34\2\2\u0185\u018a\7"+
		",\2\2\u0186\u0187\7\7\2\2\u0187\u0189\7,\2\2\u0188\u0186\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018d\u01a3\7\35\2\2\u018e\u018f\7\34\2\2\u018f"+
		"\u0194\7-\2\2\u0190\u0191\7\7\2\2\u0191\u0193\7-\2\2\u0192\u0190\3\2\2"+
		"\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u01a3\7\35\2\2\u0198\u0199\7\34\2\2"+
		"\u0199\u019e\7.\2\2\u019a\u019b\7\7\2\2\u019b\u019d\7.\2\2\u019c\u019a"+
		"\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\7\35\2\2\u01a2\u017a\3"+
		"\2\2\2\u01a2\u0184\3\2\2\2\u01a2\u018e\3\2\2\2\u01a2\u0198\3\2\2\2\u01a3"+
		"\63\3\2\2\2\u01a4\u01a5\5\60\31\2\u01a5\u01a6\7\34\2\2\u01a6\u01a7\7+"+
		"\2\2\u01a7\u01a8\7\35\2\2\u01a8\u01ab\7/\2\2\u01a9\u01aa\7\t\2\2\u01aa"+
		"\u01ac\5\62\32\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b3\3"+
		"\2\2\2\u01ad\u01ae\7/\2\2\u01ae\u01af\7\34\2\2\u01af\u01b0\5\36\20\2\u01b0"+
		"\u01b1\7\35\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01a4\3\2\2\2\u01b2\u01ad\3"+
		"\2\2\2\u01b3\65\3\2\2\2\u01b4\u01b5\t\t\2\2\u01b5\67\3\2\2\2\62@IQXad"+
		"hsvy|\u0087\u0094\u0097\u009c\u00a8\u00ab\u00b3\u00bc\u00bf\u00d1\u00d6"+
		"\u00e9\u00ee\u0104\u0113\u0115\u0121\u0126\u012d\u012f\u013b\u013f\u0144"+
		"\u0146\u0149\u0162\u0168\u0171\u0175\u0178\u0180\u018a\u0194\u019e\u01a2"+
		"\u01ab\u01b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}