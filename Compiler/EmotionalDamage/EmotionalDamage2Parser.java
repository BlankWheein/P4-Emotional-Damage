// Generated from EmotionalDamage2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EmotionalDamage2Parser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, Inum=43, Fnum=44, NUMTYPE=45, 
		TYPES=46, RETURNTYPE=47, IDENTIFIER=48, STRING_CONSTANT=49, WS=50;
	public static final int
		RULE_prog = 0, RULE_stmts = 1, RULE_block = 2, RULE_dcl = 3, RULE_parameters = 4, 
		RULE_parameter = 5, RULE_stmt = 6, RULE_unaryexpr = 7, RULE_selectivestmt = 8, 
		RULE_ifstmt = 9, RULE_elifstmt = 10, RULE_elsestmt = 11, RULE_expr = 12, 
		RULE_bexpr = 13, RULE_val = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "block", "dcl", "parameters", "parameter", "stmt", "unaryexpr", 
			"selectivestmt", "ifstmt", "elifstmt", "elsestmt", "expr", "bexpr", "val"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'string'", "'['", "']'", "'bool'", 
			"'('", "')'", "','", "'print'", "'println'", "'return'", "'T'", "'while'", 
			"'for'", "'int'", "'++'", "'--'", "'if'", "'elif'", "'else'", "'sqrt'", 
			"'**'", "'%'", "'*'", "'/'", "'+'", "'-'", "'\\\\'", "'>'", "'<'", "'>='", 
			"'<='", "'=='", "'!='", "'true'", "'false'", "'.row'", "'.col'", "'.len'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Inum", "Fnum", "NUMTYPE", 
			"TYPES", "RETURNTYPE", "IDENTIFIER", "STRING_CONSTANT", "WS"
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
	public String getGrammarFileName() { return "EmotionalDamage2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EmotionalDamage2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EmotionalDamage2Parser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			stmts();
			setState(31);
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
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
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
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitStmts(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__20:
			case IDENTIFIER:
				{
				setState(33);
				stmt();
				}
				break;
			case T__4:
			case T__7:
			case NUMTYPE:
			case RETURNTYPE:
				{
				setState(34);
				dcl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__20) | (1L << NUMTYPE) | (1L << RETURNTYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(37);
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
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			stmts();
			setState(42);
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

	public static class DclContext extends ParserRuleContext {
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
	 
		public DclContext() { }
		public void copyFrom(DclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDeclarationContext extends DclContext {
		public TerminalNode NUMTYPE() { return getToken(EmotionalDamage2Parser.NUMTYPE, 0); }
		public TerminalNode Inum() { return getToken(EmotionalDamage2Parser.Inum, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public ArrayDeclarationContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitArrayDeclaration(this);
		}
	}
	public static class StringDclContext extends DclContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public TerminalNode STRING_CONSTANT() { return getToken(EmotionalDamage2Parser.STRING_CONSTANT, 0); }
		public StringDclContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterStringDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitStringDcl(this);
		}
	}
	public static class MatrixDeclarationContext extends DclContext {
		public TerminalNode NUMTYPE() { return getToken(EmotionalDamage2Parser.NUMTYPE, 0); }
		public List<TerminalNode> Inum() { return getTokens(EmotionalDamage2Parser.Inum); }
		public TerminalNode Inum(int i) {
			return getToken(EmotionalDamage2Parser.Inum, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public MatrixDeclarationContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterMatrixDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitMatrixDeclaration(this);
		}
	}
	public static class NumDclContext extends DclContext {
		public TerminalNode NUMTYPE() { return getToken(EmotionalDamage2Parser.NUMTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public TerminalNode Fnum() { return getToken(EmotionalDamage2Parser.Fnum, 0); }
		public TerminalNode Inum() { return getToken(EmotionalDamage2Parser.Inum, 0); }
		public NumDclContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterNumDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitNumDcl(this);
		}
	}
	public static class BoolDeclarationContext extends DclContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BoolDeclarationContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterBoolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitBoolDeclaration(this);
		}
	}
	public static class FuncDclContext extends DclContext {
		public TerminalNode RETURNTYPE() { return getToken(EmotionalDamage2Parser.RETURNTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FuncDclContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterFuncDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitFuncDcl(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dcl);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new NumDclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(NUMTYPE);
				setState(45);
				match(IDENTIFIER);
				setState(46);
				match(T__2);
				setState(47);
				_la = _input.LA(1);
				if ( !(_la==Inum || _la==Fnum) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(48);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new StringDclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(T__4);
				setState(50);
				match(IDENTIFIER);
				setState(51);
				match(T__2);
				setState(52);
				match(STRING_CONSTANT);
				setState(53);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new ArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(NUMTYPE);
				setState(55);
				match(T__5);
				setState(56);
				match(Inum);
				setState(57);
				match(T__6);
				setState(58);
				match(IDENTIFIER);
				setState(59);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new MatrixDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(NUMTYPE);
				setState(61);
				match(T__5);
				setState(62);
				match(Inum);
				setState(63);
				match(T__6);
				setState(64);
				match(T__5);
				setState(65);
				match(Inum);
				setState(66);
				match(T__6);
				setState(67);
				match(IDENTIFIER);
				setState(68);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new BoolDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				match(T__7);
				setState(70);
				match(IDENTIFIER);
				setState(71);
				match(T__2);
				setState(72);
				bexpr(0);
				setState(73);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new FuncDclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				match(RETURNTYPE);
				setState(76);
				match(IDENTIFIER);
				setState(77);
				match(T__8);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPES) {
					{
					setState(78);
					parameters();
					}
				}

				setState(81);
				match(T__9);
				setState(82);
				block();
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
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			parameter();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(86);
				match(T__10);
				setState(87);
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
		public TerminalNode TYPES() { return getToken(EmotionalDamage2Parser.TYPES, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(TYPES);
			setState(91);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
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
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolAssignStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BoolAssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterBoolAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitBoolAssignStmt(this);
		}
	}
	public static class FuncCallContext extends StmtContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EmotionalDamage2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EmotionalDamage2Parser.IDENTIFIER, i);
		}
		public FuncCallContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitFuncCall(this);
		}
	}
	public static class PrintStmtContext extends StmtContext {
		public TerminalNode STRING_CONSTANT() { return getToken(EmotionalDamage2Parser.STRING_CONSTANT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitPrintStmt(this);
		}
	}
	public static class NumAssignStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public NumAssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterNumAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitNumAssignStmt(this);
		}
	}
	public static class MatrixElementAssignStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public MatrixElementAssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterMatrixElementAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitMatrixElementAssignStmt(this);
		}
	}
	public static class WhileStmtContext extends StmtContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitWhileStmt(this);
		}
	}
	public static class SelectiveContext extends StmtContext {
		public SelectivestmtContext selectivestmt() {
			return getRuleContext(SelectivestmtContext.class,0);
		}
		public SelectiveContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterSelective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitSelective(this);
		}
	}
	public static class UnaryAssignContext extends StmtContext {
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public UnaryAssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterUnaryAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitUnaryAssign(this);
		}
	}
	public static class ArrayElementAssignStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public ArrayElementAssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterArrayElementAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitArrayElementAssignStmt(this);
		}
	}
	public static class ReturnStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitReturnStmt(this);
		}
	}
	public static class ForStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public ForStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitForStmt(this);
		}
	}
	public static class TransposeMatrixStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public TransposeMatrixStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterTransposeMatrixStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitTransposeMatrixStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(94);
				match(T__8);
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_CONSTANT:
					{
					setState(95);
					match(STRING_CONSTANT);
					}
					break;
				case T__8:
				case T__23:
				case T__29:
				case Inum:
				case Fnum:
				case IDENTIFIER:
					{
					setState(96);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(99);
				match(T__9);
				setState(100);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__13);
				setState(102);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new NumAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(IDENTIFIER);
				setState(104);
				match(T__2);
				setState(105);
				val();
				setState(106);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new BoolAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(IDENTIFIER);
				setState(109);
				match(T__2);
				setState(110);
				bexpr(0);
				setState(111);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new ArrayElementAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(IDENTIFIER);
				setState(114);
				match(T__5);
				setState(115);
				val();
				setState(116);
				match(T__6);
				setState(117);
				match(T__2);
				setState(118);
				val();
				setState(119);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new MatrixElementAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				match(IDENTIFIER);
				setState(122);
				match(T__5);
				setState(123);
				val();
				setState(124);
				match(T__6);
				setState(125);
				match(T__5);
				setState(126);
				val();
				setState(127);
				match(T__6);
				setState(128);
				match(T__2);
				setState(129);
				val();
				setState(130);
				match(T__3);
				}
				break;
			case 7:
				_localctx = new TransposeMatrixStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				match(T__14);
				setState(133);
				match(T__8);
				setState(134);
				match(IDENTIFIER);
				setState(135);
				match(T__9);
				}
				break;
			case 8:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(136);
				match(T__15);
				setState(137);
				match(T__8);
				setState(138);
				bexpr(0);
				setState(139);
				match(T__9);
				setState(140);
				block();
				}
				break;
			case 9:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				match(T__16);
				setState(143);
				match(T__8);
				setState(144);
				match(T__17);
				setState(145);
				match(IDENTIFIER);
				setState(146);
				match(T__2);
				setState(147);
				val();
				setState(148);
				match(T__3);
				setState(149);
				bexpr(0);
				setState(150);
				match(T__3);
				setState(151);
				unaryexpr();
				setState(152);
				match(T__9);
				setState(153);
				match(T__3);
				}
				break;
			case 10:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(155);
				match(IDENTIFIER);
				setState(156);
				match(T__8);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(157);
					match(IDENTIFIER);
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(158);
						match(T__10);
						setState(159);
						match(IDENTIFIER);
						}
						}
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(167);
				match(T__9);
				}
				break;
			case 11:
				_localctx = new SelectiveContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(168);
				selectivestmt();
				}
				break;
			case 12:
				_localctx = new UnaryAssignContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(169);
				unaryexpr();
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

	public static class UnaryexprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public UnaryexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterUnaryexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitUnaryexpr(this);
		}
	}

	public final UnaryexprContext unaryexpr() throws RecognitionException {
		UnaryexprContext _localctx = new UnaryexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryexpr);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(IDENTIFIER);
				setState(173);
				match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(IDENTIFIER);
				setState(175);
				match(T__19);
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

	public static class SelectivestmtContext extends ParserRuleContext {
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
		public SelectivestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectivestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterSelectivestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitSelectivestmt(this);
		}
	}

	public final SelectivestmtContext selectivestmt() throws RecognitionException {
		SelectivestmtContext _localctx = new SelectivestmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selectivestmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			ifstmt();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(179);
				elifstmt();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(185);
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
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitIfstmt(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__20);
			setState(189);
			match(T__8);
			setState(190);
			bexpr(0);
			setState(191);
			match(T__9);
			setState(192);
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
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterElifstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitElifstmt(this);
		}
	}

	public final ElifstmtContext elifstmt() throws RecognitionException {
		ElifstmtContext _localctx = new ElifstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__21);
			setState(195);
			match(T__8);
			setState(196);
			bexpr(0);
			setState(197);
			match(T__9);
			setState(198);
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
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterElsestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitElsestmt(this);
		}
	}

	public final ElsestmtContext elsestmt() throws RecognitionException {
		ElsestmtContext _localctx = new ElsestmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elsestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__22);
			setState(201);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GradientExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GradientExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterGradientExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitGradientExpr(this);
		}
	}
	public static class PlusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PlusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitPlusExpr(this);
		}
	}
	public static class ValExprContext extends ExprContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ValExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterValExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitValExpr(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitPowExpr(this);
		}
	}
	public static class SqrtExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SqrtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterSqrtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitSqrtExpr(this);
		}
	}
	public static class ModExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitModExpr(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitParenExpr(this);
		}
	}
	public static class TimesExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TimesExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterTimesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitTimesExpr(this);
		}
	}
	public static class DivideExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivideExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterDivideExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitDivideExpr(this);
		}
	}
	public static class MinusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitMinusExpr(this);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(204);
				match(T__8);
				setState(205);
				expr(0);
				setState(206);
				match(T__9);
				}
				break;
			case T__23:
				{
				_localctx = new SqrtExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(T__23);
				setState(209);
				expr(9);
				}
				break;
			case T__29:
			case Inum:
			case Fnum:
			case IDENTIFIER:
				{
				_localctx = new ValExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(214);
						match(T__24);
						setState(215);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(217);
						match(T__25);
						setState(218);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new TimesExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(220);
						match(T__26);
						setState(221);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new DivideExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(223);
						match(T__27);
						setState(224);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new PlusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(226);
						match(T__28);
						setState(227);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new MinusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(229);
						match(T__29);
						setState(230);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new GradientExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(232);
						match(T__30);
						setState(233);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
	 
		public BexprContext() { }
		public void copyFrom(BexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolExprContext extends BexprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolExprContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitBoolExpr(this);
		}
	}
	public static class EqualsContext extends BexprContext {
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public EqualsContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitEquals(this);
		}
	}
	public static class GreaterEqualsContext extends BexprContext {
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public GreaterEqualsContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterGreaterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitGreaterEquals(this);
		}
	}
	public static class BoolValueContext extends BexprContext {
		public BoolValueContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitBoolValue(this);
		}
	}
	public static class SmallerEqualsContext extends BexprContext {
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public SmallerEqualsContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterSmallerEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitSmallerEquals(this);
		}
	}
	public static class GreaterContext extends BexprContext {
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public GreaterContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitGreater(this);
		}
	}
	public static class SmallerContext extends BexprContext {
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public SmallerContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterSmaller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitSmaller(this);
		}
	}
	public static class NotEqualsContext extends BexprContext {
		public List<BexprContext> bexpr() {
			return getRuleContexts(BexprContext.class);
		}
		public BexprContext bexpr(int i) {
			return getRuleContext(BexprContext.class,i);
		}
		public NotEqualsContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitNotEquals(this);
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
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
			case T__38:
				{
				_localctx = new BoolValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(240);
				_la = _input.LA(1);
				if ( !(_la==T__37 || _la==T__38) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__8:
			case T__23:
			case T__29:
			case Inum:
			case Fnum:
			case IDENTIFIER:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(262);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new GreaterContext(new BexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(244);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(245);
						match(T__31);
						setState(246);
						bexpr(9);
						}
						break;
					case 2:
						{
						_localctx = new SmallerContext(new BexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(247);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(248);
						match(T__32);
						setState(249);
						bexpr(8);
						}
						break;
					case 3:
						{
						_localctx = new GreaterEqualsContext(new BexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(250);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(251);
						match(T__33);
						setState(252);
						bexpr(7);
						}
						break;
					case 4:
						{
						_localctx = new SmallerEqualsContext(new BexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(253);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(254);
						match(T__34);
						setState(255);
						bexpr(6);
						}
						break;
					case 5:
						{
						_localctx = new EqualsContext(new BexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(256);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(257);
						match(T__35);
						setState(258);
						bexpr(5);
						}
						break;
					case 6:
						{
						_localctx = new NotEqualsContext(new BexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(259);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(260);
						match(T__36);
						setState(261);
						bexpr(4);
						}
						break;
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class ValContext extends ParserRuleContext {
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	 
		public ValContext() { }
		public void copyFrom(ValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumArrMatrixValueContext extends ValContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public NumArrMatrixValueContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterNumArrMatrixValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitNumArrMatrixValue(this);
		}
	}
	public static class NegationValueContext extends ValContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public NegationValueContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterNegationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitNegationValue(this);
		}
	}
	public static class LengthIdentifierContext extends ValContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public LengthIdentifierContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterLengthIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitLengthIdentifier(this);
		}
	}
	public static class RowIdentifierContext extends ValContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public RowIdentifierContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterRowIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitRowIdentifier(this);
		}
	}
	public static class FloatValueContext extends ValContext {
		public TerminalNode Fnum() { return getToken(EmotionalDamage2Parser.Fnum, 0); }
		public FloatValueContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterFloatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitFloatValue(this);
		}
	}
	public static class IntValueContext extends ValContext {
		public TerminalNode Inum() { return getToken(EmotionalDamage2Parser.Inum, 0); }
		public IntValueContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitIntValue(this);
		}
	}
	public static class ColIdentifierContext extends ValContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamage2Parser.IDENTIFIER, 0); }
		public ColIdentifierContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).enterColIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamage2Listener ) ((EmotionalDamage2Listener)listener).exitColIdentifier(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_val);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new NumArrMatrixValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(IDENTIFIER);
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(268);
					match(T__5);
					setState(269);
					val();
					setState(270);
					match(T__6);
					}
					break;
				}
				setState(278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(274);
					match(T__5);
					setState(275);
					val();
					setState(276);
					match(T__6);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(IDENTIFIER);
				setState(281);
				match(T__39);
				}
				break;
			case 3:
				_localctx = new ColIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(IDENTIFIER);
				setState(283);
				match(T__40);
				}
				break;
			case 4:
				_localctx = new LengthIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(IDENTIFIER);
				setState(285);
				match(T__41);
				}
				break;
			case 5:
				_localctx = new IntValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				match(Inum);
				}
				break;
			case 6:
				_localctx = new FloatValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				match(Fnum);
				}
				break;
			case 7:
				_localctx = new NegationValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				match(T__29);
				setState(289);
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
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bexpr_sempred(BexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0127\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3"+
		"\3\5\3&\n\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n\5\3\5\3\5\5\5V\n\5\3\6"+
		"\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bd\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00a3\n\b\f\b\16\b\u00a6\13\b\5\b\u00a8\n\b\3\b"+
		"\3\b\3\b\5\b\u00ad\n\b\3\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\n\3\n\7\n\u00b7"+
		"\n\n\f\n\16\n\u00ba\13\n\3\n\5\n\u00bd\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00d6\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ed"+
		"\n\16\f\16\16\16\u00f0\13\16\3\17\3\17\3\17\5\17\u00f5\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u0109\n\17\f\17\16\17\u010c\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0113\n\20\3\20\3\20\3\20\3\20\5\20\u0119\n\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0125\n\20\3\20\2\4\32\34"+
		"\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\3\2-.\3\2\16\17\3\2()\2"+
		"\u0149\2 \3\2\2\2\4%\3\2\2\2\6*\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\f\\\3\2"+
		"\2\2\16\u00ac\3\2\2\2\20\u00b2\3\2\2\2\22\u00b4\3\2\2\2\24\u00be\3\2\2"+
		"\2\26\u00c4\3\2\2\2\30\u00ca\3\2\2\2\32\u00d5\3\2\2\2\34\u00f4\3\2\2\2"+
		"\36\u0124\3\2\2\2 !\5\4\3\2!\"\7\2\2\3\"\3\3\2\2\2#&\5\16\b\2$&\5\b\5"+
		"\2%#\3\2\2\2%$\3\2\2\2&(\3\2\2\2\')\5\4\3\2(\'\3\2\2\2()\3\2\2\2)\5\3"+
		"\2\2\2*+\7\3\2\2+,\5\4\3\2,-\7\4\2\2-\7\3\2\2\2./\7/\2\2/\60\7\62\2\2"+
		"\60\61\7\5\2\2\61\62\t\2\2\2\62V\7\6\2\2\63\64\7\7\2\2\64\65\7\62\2\2"+
		"\65\66\7\5\2\2\66\67\7\63\2\2\67V\7\6\2\289\7/\2\29:\7\b\2\2:;\7-\2\2"+
		";<\7\t\2\2<=\7\62\2\2=V\7\6\2\2>?\7/\2\2?@\7\b\2\2@A\7-\2\2AB\7\t\2\2"+
		"BC\7\b\2\2CD\7-\2\2DE\7\t\2\2EF\7\62\2\2FV\7\6\2\2GH\7\n\2\2HI\7\62\2"+
		"\2IJ\7\5\2\2JK\5\34\17\2KL\7\6\2\2LV\3\2\2\2MN\7\61\2\2NO\7\62\2\2OQ\7"+
		"\13\2\2PR\5\n\6\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\f\2\2TV\5\6\4\2U."+
		"\3\2\2\2U\63\3\2\2\2U8\3\2\2\2U>\3\2\2\2UG\3\2\2\2UM\3\2\2\2V\t\3\2\2"+
		"\2WZ\5\f\7\2XY\7\r\2\2Y[\5\n\6\2ZX\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\]\7"+
		"\60\2\2]^\7\62\2\2^\r\3\2\2\2_`\t\3\2\2`c\7\13\2\2ad\7\63\2\2bd\5\32\16"+
		"\2ca\3\2\2\2cb\3\2\2\2de\3\2\2\2ef\7\f\2\2f\u00ad\7\6\2\2gh\7\20\2\2h"+
		"\u00ad\7\62\2\2ij\7\62\2\2jk\7\5\2\2kl\5\36\20\2lm\7\6\2\2m\u00ad\3\2"+
		"\2\2no\7\62\2\2op\7\5\2\2pq\5\34\17\2qr\7\6\2\2r\u00ad\3\2\2\2st\7\62"+
		"\2\2tu\7\b\2\2uv\5\36\20\2vw\7\t\2\2wx\7\5\2\2xy\5\36\20\2yz\7\6\2\2z"+
		"\u00ad\3\2\2\2{|\7\62\2\2|}\7\b\2\2}~\5\36\20\2~\177\7\t\2\2\177\u0080"+
		"\7\b\2\2\u0080\u0081\5\36\20\2\u0081\u0082\7\t\2\2\u0082\u0083\7\5\2\2"+
		"\u0083\u0084\5\36\20\2\u0084\u0085\7\6\2\2\u0085\u00ad\3\2\2\2\u0086\u0087"+
		"\7\21\2\2\u0087\u0088\7\13\2\2\u0088\u0089\7\62\2\2\u0089\u00ad\7\f\2"+
		"\2\u008a\u008b\7\22\2\2\u008b\u008c\7\13\2\2\u008c\u008d\5\34\17\2\u008d"+
		"\u008e\7\f\2\2\u008e\u008f\5\6\4\2\u008f\u00ad\3\2\2\2\u0090\u0091\7\23"+
		"\2\2\u0091\u0092\7\13\2\2\u0092\u0093\7\24\2\2\u0093\u0094\7\62\2\2\u0094"+
		"\u0095\7\5\2\2\u0095\u0096\5\36\20\2\u0096\u0097\7\6\2\2\u0097\u0098\5"+
		"\34\17\2\u0098\u0099\7\6\2\2\u0099\u009a\5\20\t\2\u009a\u009b\7\f\2\2"+
		"\u009b\u009c\7\6\2\2\u009c\u00ad\3\2\2\2\u009d\u009e\7\62\2\2\u009e\u00a7"+
		"\7\13\2\2\u009f\u00a4\7\62\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a3\7\62\2"+
		"\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad\7\f\2\2\u00aa\u00ad\5\22"+
		"\n\2\u00ab\u00ad\5\20\t\2\u00ac_\3\2\2\2\u00acg\3\2\2\2\u00aci\3\2\2\2"+
		"\u00acn\3\2\2\2\u00acs\3\2\2\2\u00ac{\3\2\2\2\u00ac\u0086\3\2\2\2\u00ac"+
		"\u008a\3\2\2\2\u00ac\u0090\3\2\2\2\u00ac\u009d\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ab\3\2\2\2\u00ad\17\3\2\2\2\u00ae\u00af\7\62\2\2\u00af\u00b3"+
		"\7\25\2\2\u00b0\u00b1\7\62\2\2\u00b1\u00b3\7\26\2\2\u00b2\u00ae\3\2\2"+
		"\2\u00b2\u00b0\3\2\2\2\u00b3\21\3\2\2\2\u00b4\u00b8\5\24\13\2\u00b5\u00b7"+
		"\5\26\f\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd"+
		"\5\30\r\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\23\3\2\2\2\u00be"+
		"\u00bf\7\27\2\2\u00bf\u00c0\7\13\2\2\u00c0\u00c1\5\34\17\2\u00c1\u00c2"+
		"\7\f\2\2\u00c2\u00c3\5\6\4\2\u00c3\25\3\2\2\2\u00c4\u00c5\7\30\2\2\u00c5"+
		"\u00c6\7\13\2\2\u00c6\u00c7\5\34\17\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9"+
		"\5\6\4\2\u00c9\27\3\2\2\2\u00ca\u00cb\7\31\2\2\u00cb\u00cc\5\6\4\2\u00cc"+
		"\31\3\2\2\2\u00cd\u00ce\b\16\1\2\u00ce\u00cf\7\13\2\2\u00cf\u00d0\5\32"+
		"\16\2\u00d0\u00d1\7\f\2\2\u00d1\u00d6\3\2\2\2\u00d2\u00d3\7\32\2\2\u00d3"+
		"\u00d6\5\32\16\13\u00d4\u00d6\5\36\20\2\u00d5\u00cd\3\2\2\2\u00d5\u00d2"+
		"\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00ee\3\2\2\2\u00d7\u00d8\f\n\2\2\u00d8"+
		"\u00d9\7\33\2\2\u00d9\u00ed\5\32\16\13\u00da\u00db\f\t\2\2\u00db\u00dc"+
		"\7\34\2\2\u00dc\u00ed\5\32\16\n\u00dd\u00de\f\b\2\2\u00de\u00df\7\35\2"+
		"\2\u00df\u00ed\5\32\16\t\u00e0\u00e1\f\7\2\2\u00e1\u00e2\7\36\2\2\u00e2"+
		"\u00ed\5\32\16\b\u00e3\u00e4\f\6\2\2\u00e4\u00e5\7\37\2\2\u00e5\u00ed"+
		"\5\32\16\7\u00e6\u00e7\f\5\2\2\u00e7\u00e8\7 \2\2\u00e8\u00ed\5\32\16"+
		"\6\u00e9\u00ea\f\4\2\2\u00ea\u00eb\7!\2\2\u00eb\u00ed\5\32\16\5\u00ec"+
		"\u00d7\3\2\2\2\u00ec\u00da\3\2\2\2\u00ec\u00dd\3\2\2\2\u00ec\u00e0\3\2"+
		"\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\33\3\2\2"+
		"\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\b\17\1\2\u00f2\u00f5\t\4\2\2\u00f3"+
		"\u00f5\5\32\16\2\u00f4\u00f1\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u010a\3"+
		"\2\2\2\u00f6\u00f7\f\n\2\2\u00f7\u00f8\7\"\2\2\u00f8\u0109\5\34\17\13"+
		"\u00f9\u00fa\f\t\2\2\u00fa\u00fb\7#\2\2\u00fb\u0109\5\34\17\n\u00fc\u00fd"+
		"\f\b\2\2\u00fd\u00fe\7$\2\2\u00fe\u0109\5\34\17\t\u00ff\u0100\f\7\2\2"+
		"\u0100\u0101\7%\2\2\u0101\u0109\5\34\17\b\u0102\u0103\f\6\2\2\u0103\u0104"+
		"\7&\2\2\u0104\u0109\5\34\17\7\u0105\u0106\f\5\2\2\u0106\u0107\7\'\2\2"+
		"\u0107\u0109\5\34\17\6\u0108\u00f6\3\2\2\2\u0108\u00f9\3\2\2\2\u0108\u00fc"+
		"\3\2\2\2\u0108\u00ff\3\2\2\2\u0108\u0102\3\2\2\2\u0108\u0105\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\35\3\2\2"+
		"\2\u010c\u010a\3\2\2\2\u010d\u0112\7\62\2\2\u010e\u010f\7\b\2\2\u010f"+
		"\u0110\5\36\20\2\u0110\u0111\7\t\2\2\u0111\u0113\3\2\2\2\u0112\u010e\3"+
		"\2\2\2\u0112\u0113\3\2\2\2\u0113\u0118\3\2\2\2\u0114\u0115\7\b\2\2\u0115"+
		"\u0116\5\36\20\2\u0116\u0117\7\t\2\2\u0117\u0119\3\2\2\2\u0118\u0114\3"+
		"\2\2\2\u0118\u0119\3\2\2\2\u0119\u0125\3\2\2\2\u011a\u011b\7\62\2\2\u011b"+
		"\u0125\7*\2\2\u011c\u011d\7\62\2\2\u011d\u0125\7+\2\2\u011e\u011f\7\62"+
		"\2\2\u011f\u0125\7,\2\2\u0120\u0125\7-\2\2\u0121\u0125\7.\2\2\u0122\u0123"+
		"\7 \2\2\u0123\u0125\5\36\20\2\u0124\u010d\3\2\2\2\u0124\u011a\3\2\2\2"+
		"\u0124\u011c\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0121"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0125\37\3\2\2\2\27%(QUZc\u00a4\u00a7\u00ac"+
		"\u00b2\u00b8\u00bc\u00d5\u00ec\u00ee\u00f4\u0108\u010a\u0112\u0118\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}