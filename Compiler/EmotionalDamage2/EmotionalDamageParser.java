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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, Inum=45, Fnum=46, 
		IDENTIFIER=47, STRING_CONSTANT=48, WS=49;
	public static final int
		RULE_prog = 0, RULE_stmts = 1, RULE_numtype = 2, RULE_print = 3, RULE_types = 4, 
		RULE_returntype = 5, RULE_dcl = 6, RULE_stmt = 7, RULE_ifstmt = 8, RULE_elifstmt = 9, 
		RULE_elsestmt = 10, RULE_expr = 11, RULE_bexpr = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmts", "numtype", "print", "types", "returntype", "dcl", "stmt", 
			"ifstmt", "elifstmt", "elsestmt", "expr", "bexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'print'", "'println'", "'['", "']'", "'bool'", 
			"'string'", "'void'", "'('", "')'", "'{'", "'}'", "';'", "'='", "'return'", 
			"'++'", "'--'", "'T'", "'while'", "'for'", "','", "'if'", "'elif'", "'else'", 
			"'sqrt'", "'**'", "'%'", "'*'", "'/'", "'+'", "'-'", "'\\\\'", "'.row'", 
			"'.col'", "'.len'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Inum", "Fnum", 
			"IDENTIFIER", "STRING_CONSTANT", "WS"
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
			setState(26);
			stmts();
			setState(27);
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
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__6:
				case T__7:
				case T__8:
					{
					setState(29);
					dcl();
					}
					break;
				case T__2:
				case T__3:
				case T__15:
				case T__18:
				case T__19:
				case T__20:
				case T__22:
				case IDENTIFIER:
					{
					setState(30);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class NumtypeContext extends ParserRuleContext {
		public NumtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterNumtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitNumtype(this);
		}
	}

	public final NumtypeContext numtype() throws RecognitionException {
		NumtypeContext _localctx = new NumtypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
		enterRule(_localctx, 6, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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

	public static class TypesContext extends ParserRuleContext {
		public List<TerminalNode> Inum() { return getTokens(EmotionalDamageParser.Inum); }
		public TerminalNode Inum(int i) {
			return getToken(EmotionalDamageParser.Inum, i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitTypes(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_types);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__0);
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(41);
					match(T__4);
					setState(42);
					match(Inum);
					setState(43);
					match(T__5);
					}
					break;
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(46);
					match(T__4);
					setState(47);
					match(Inum);
					setState(48);
					match(T__5);
					}
				}

				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(T__1);
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(52);
					match(T__4);
					setState(53);
					match(Inum);
					setState(54);
					match(T__5);
					}
					break;
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(57);
					match(T__4);
					setState(58);
					match(Inum);
					setState(59);
					match(T__5);
					}
				}

				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
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

	public static class ReturntypeContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ReturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterReturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitReturntype(this);
		}
	}

	public final ReturntypeContext returntype() throws RecognitionException {
		ReturntypeContext _localctx = new ReturntypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returntype);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				types();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__8);
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
		public NumtypeContext numtype() {
			return getRuleContext(NumtypeContext.class,0);
		}
		public TerminalNode Inum() { return getToken(EmotionalDamageParser.Inum, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public ArrayDeclarationContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitArrayDeclaration(this);
		}
	}
	public static class StringDclContext extends DclContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public TerminalNode STRING_CONSTANT() { return getToken(EmotionalDamageParser.STRING_CONSTANT, 0); }
		public StringDclContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterStringDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitStringDcl(this);
		}
	}
	public static class MatrixDeclarationContext extends DclContext {
		public NumtypeContext numtype() {
			return getRuleContext(NumtypeContext.class,0);
		}
		public List<TerminalNode> Inum() { return getTokens(EmotionalDamageParser.Inum); }
		public TerminalNode Inum(int i) {
			return getToken(EmotionalDamageParser.Inum, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public MatrixDeclarationContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterMatrixDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitMatrixDeclaration(this);
		}
	}
	public static class NumDclContext extends DclContext {
		public NumtypeContext numtype() {
			return getRuleContext(NumtypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NumDclContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterNumDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitNumDcl(this);
		}
	}
	public static class FuncDclContext extends DclContext {
		public ReturntypeContext returntype() {
			return getRuleContext(ReturntypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(EmotionalDamageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EmotionalDamageParser.IDENTIFIER, i);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public FuncDclContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterFuncDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitFuncDcl(this);
		}
	}
	public static class BoolDeclarationContext extends DclContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BoolDeclarationContext(DclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterBoolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitBoolDeclaration(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dcl);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new FuncDclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				returntype();
				setState(71);
				match(IDENTIFIER);
				setState(72);
				match(T__9);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6) | (1L << T__7))) != 0)) {
					{
					setState(73);
					types();
					setState(74);
					match(IDENTIFIER);
					}
				}

				setState(78);
				match(T__10);
				setState(79);
				match(T__11);
				setState(80);
				stmts();
				setState(81);
				match(T__12);
				}
				break;
			case 2:
				_localctx = new MatrixDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				numtype();
				setState(84);
				match(T__4);
				setState(85);
				match(Inum);
				setState(86);
				match(T__5);
				setState(87);
				match(T__4);
				setState(88);
				match(Inum);
				setState(89);
				match(T__5);
				setState(90);
				match(IDENTIFIER);
				setState(91);
				match(T__13);
				}
				break;
			case 3:
				_localctx = new ArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				numtype();
				setState(94);
				match(T__4);
				setState(95);
				match(Inum);
				setState(96);
				match(T__5);
				setState(97);
				match(IDENTIFIER);
				setState(98);
				match(T__13);
				}
				break;
			case 4:
				_localctx = new NumDclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				numtype();
				setState(101);
				match(IDENTIFIER);
				setState(102);
				match(T__14);
				setState(103);
				expr(0);
				setState(104);
				match(T__13);
				}
				break;
			case 5:
				_localctx = new StringDclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(T__7);
				setState(107);
				match(IDENTIFIER);
				setState(108);
				match(T__14);
				setState(109);
				match(STRING_CONSTANT);
				setState(110);
				match(T__13);
				}
				break;
			case 6:
				_localctx = new BoolDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				match(T__6);
				setState(112);
				match(IDENTIFIER);
				setState(113);
				match(T__14);
				setState(114);
				bexpr(0);
				setState(115);
				match(T__13);
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
	public static class UnaryPlusContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public UnaryPlusContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterUnaryPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitUnaryPlus(this);
		}
	}
	public static class UnaryMinusContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public UnaryMinusContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitUnaryMinus(this);
		}
	}
	public static class ArrayElementAssignStmtContext extends StmtContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EmotionalDamageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EmotionalDamageParser.IDENTIFIER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Inum() { return getToken(EmotionalDamageParser.Inum, 0); }
		public ArrayElementAssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterArrayElementAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitArrayElementAssignStmt(this);
		}
	}
	public static class BoolAssignStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public BoolAssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterBoolAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitBoolAssignStmt(this);
		}
	}
	public static class PrintStmtContext extends StmtContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode STRING_CONSTANT() { return getToken(EmotionalDamageParser.STRING_CONSTANT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitPrintStmt(this);
		}
	}
	public static class FuncCallContext extends StmtContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EmotionalDamageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EmotionalDamageParser.IDENTIFIER, i);
		}
		public FuncCallContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitFuncCall(this);
		}
	}
	public static class NumAssignStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NumAssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterNumAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitNumAssignStmt(this);
		}
	}
	public static class MatrixElementAssignStmtContext extends StmtContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EmotionalDamageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EmotionalDamageParser.IDENTIFIER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> Inum() { return getTokens(EmotionalDamageParser.Inum); }
		public TerminalNode Inum(int i) {
			return getToken(EmotionalDamageParser.Inum, i);
		}
		public MatrixElementAssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterMatrixElementAssignStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitMatrixElementAssignStmt(this);
		}
	}
	public static class WhileStmtContext extends StmtContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitWhileStmt(this);
		}
	}
	public static class SelectiveContext extends StmtContext {
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
		public SelectiveContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterSelective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitSelective(this);
		}
	}
	public static class ReturnStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitReturnStmt(this);
		}
	}
	public static class ForStmtContext extends StmtContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EmotionalDamageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EmotionalDamageParser.IDENTIFIER, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public ForStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitForStmt(this);
		}
	}
	public static class TransposeMatrixStmtContext extends StmtContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public TransposeMatrixStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterTransposeMatrixStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitTransposeMatrixStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				print();
				setState(120);
				match(T__9);
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_CONSTANT:
					{
					setState(121);
					match(STRING_CONSTANT);
					}
					break;
				case T__9:
				case T__25:
				case T__31:
				case Inum:
				case Fnum:
				case IDENTIFIER:
					{
					setState(122);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(125);
				match(T__10);
				setState(126);
				match(T__13);
				}
				break;
			case 2:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__15);
				setState(129);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new NumAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(IDENTIFIER);
				setState(131);
				match(T__14);
				setState(132);
				expr(0);
				setState(133);
				match(T__13);
				}
				break;
			case 4:
				_localctx = new BoolAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(IDENTIFIER);
				setState(136);
				match(T__14);
				setState(137);
				bexpr(0);
				setState(138);
				match(T__13);
				}
				break;
			case 5:
				_localctx = new MatrixElementAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(IDENTIFIER);
				setState(141);
				match(T__4);
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==Inum || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				match(T__5);
				setState(144);
				match(T__4);
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==Inum || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				match(T__5);
				setState(147);
				match(T__14);
				setState(148);
				expr(0);
				setState(149);
				match(T__13);
				}
				break;
			case 6:
				_localctx = new ArrayElementAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(IDENTIFIER);
				setState(152);
				match(T__4);
				setState(153);
				_la = _input.LA(1);
				if ( !(_la==Inum || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(154);
				match(T__5);
				setState(155);
				match(T__14);
				setState(156);
				expr(0);
				setState(157);
				match(T__13);
				}
				break;
			case 7:
				_localctx = new UnaryPlusContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				match(IDENTIFIER);
				setState(160);
				match(T__16);
				setState(161);
				match(T__13);
				}
				break;
			case 8:
				_localctx = new UnaryMinusContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				match(IDENTIFIER);
				setState(163);
				match(T__17);
				setState(164);
				match(T__13);
				}
				break;
			case 9:
				_localctx = new TransposeMatrixStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(165);
				match(T__18);
				setState(166);
				match(T__9);
				setState(167);
				match(IDENTIFIER);
				setState(168);
				match(T__10);
				setState(169);
				match(T__13);
				}
				break;
			case 10:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(170);
				match(T__19);
				setState(171);
				match(T__9);
				setState(172);
				bexpr(0);
				setState(173);
				match(T__10);
				setState(174);
				match(T__11);
				setState(175);
				stmts();
				setState(176);
				match(T__12);
				}
				break;
			case 11:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				match(T__20);
				setState(179);
				match(T__9);
				setState(180);
				match(T__0);
				setState(181);
				match(IDENTIFIER);
				setState(182);
				match(T__14);
				setState(183);
				expr(0);
				setState(184);
				match(T__13);
				setState(185);
				bexpr(0);
				setState(186);
				match(T__13);
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(187);
					match(IDENTIFIER);
					setState(188);
					match(T__16);
					}
					break;
				case 2:
					{
					setState(189);
					match(IDENTIFIER);
					setState(190);
					match(T__17);
					}
					break;
				}
				setState(193);
				match(T__10);
				setState(194);
				match(T__11);
				setState(195);
				stmts();
				setState(196);
				match(T__12);
				}
				break;
			case 12:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(198);
				match(IDENTIFIER);
				setState(199);
				match(T__9);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(200);
					match(IDENTIFIER);
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__21) {
						{
						{
						setState(201);
						match(T__21);
						setState(202);
						match(IDENTIFIER);
						}
						}
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(210);
				match(T__10);
				}
				break;
			case 13:
				_localctx = new SelectiveContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(211);
				ifstmt();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(212);
					elifstmt();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(218);
					elsestmt();
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

	public static class IfstmtContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
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
		enterRule(_localctx, 16, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__22);
			setState(224);
			match(T__9);
			setState(225);
			bexpr(0);
			setState(226);
			match(T__10);
			setState(227);
			match(T__11);
			setState(228);
			stmts();
			setState(229);
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

	public static class ElifstmtContext extends ParserRuleContext {
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
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
		enterRule(_localctx, 18, RULE_elifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__23);
			setState(232);
			match(T__9);
			setState(233);
			bexpr(0);
			setState(234);
			match(T__10);
			setState(235);
			match(T__11);
			setState(236);
			stmts();
			setState(237);
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

	public static class ElsestmtContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
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
		enterRule(_localctx, 20, RULE_elsestmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__24);
			setState(240);
			match(T__11);
			setState(241);
			stmts();
			setState(242);
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
	public static class RowidContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public RowidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterRowid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitRowid(this);
		}
	}
	public static class LengthidContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public LengthidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterLengthid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitLengthid(this);
		}
	}
	public static class IntValContext extends ExprContext {
		public TerminalNode Inum() { return getToken(EmotionalDamageParser.Inum, 0); }
		public IntValContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterIntVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitIntVal(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitPowExpr(this);
		}
	}
	public static class NegValContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegValContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterNegVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitNegVal(this);
		}
	}
	public static class FloatValContext extends ExprContext {
		public TerminalNode Fnum() { return getToken(EmotionalDamageParser.Fnum, 0); }
		public FloatValContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterFloatVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitFloatVal(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterDivideExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitDivideExpr(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterGradientExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitGradientExpr(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitPlusExpr(this);
		}
	}
	public static class NumArrMatrixValueContext extends ExprContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EmotionalDamageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EmotionalDamageParser.IDENTIFIER, i);
		}
		public List<TerminalNode> Inum() { return getTokens(EmotionalDamageParser.Inum); }
		public TerminalNode Inum(int i) {
			return getToken(EmotionalDamageParser.Inum, i);
		}
		public NumArrMatrixValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterNumArrMatrixValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitNumArrMatrixValue(this);
		}
	}
	public static class SqrtExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SqrtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterSqrtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitSqrtExpr(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitModExpr(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitParenExpr(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterTimesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitTimesExpr(this);
		}
	}
	public static class ColidContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(EmotionalDamageParser.IDENTIFIER, 0); }
		public ColidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterColid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitColid(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitMinusExpr(this);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(245);
				match(T__9);
				setState(246);
				expr(0);
				setState(247);
				match(T__10);
				}
				break;
			case 2:
				{
				_localctx = new SqrtExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(T__25);
				setState(250);
				expr(15);
				}
				break;
			case 3:
				{
				_localctx = new NumArrMatrixValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(IDENTIFIER);
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(252);
					match(T__4);
					setState(253);
					_la = _input.LA(1);
					if ( !(_la==Inum || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(254);
					match(T__5);
					}
					break;
				}
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(257);
					match(T__4);
					setState(258);
					_la = _input.LA(1);
					if ( !(_la==Inum || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(259);
					match(T__5);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new RowidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(IDENTIFIER);
				setState(263);
				match(T__33);
				}
				break;
			case 5:
				{
				_localctx = new ColidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(IDENTIFIER);
				setState(265);
				match(T__34);
				}
				break;
			case 6:
				{
				_localctx = new LengthidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(IDENTIFIER);
				setState(267);
				match(T__35);
				}
				break;
			case 7:
				{
				_localctx = new NegValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				match(T__31);
				setState(269);
				expr(3);
				}
				break;
			case 8:
				{
				_localctx = new IntValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(Inum);
				}
				break;
			case 9:
				{
				_localctx = new FloatValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(Fnum);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(275);
						match(T__26);
						setState(276);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(278);
						match(T__27);
						setState(279);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new TimesExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(281);
						match(T__28);
						setState(282);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new DivideExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(284);
						match(T__29);
						setState(285);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new PlusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(287);
						match(T__30);
						setState(288);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new MinusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(290);
						match(T__31);
						setState(291);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new GradientExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(293);
						match(T__32);
						setState(294);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitBoolExpr(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitEquals(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterGreaterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitGreaterEquals(this);
		}
	}
	public static class BoolValueContext extends BexprContext {
		public BoolValueContext(BexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitBoolValue(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterSmallerEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitSmallerEquals(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitGreater(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterSmaller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitSmaller(this);
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
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).enterNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmotionalDamageListener ) ((EmotionalDamageListener)listener).exitNotEquals(this);
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
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
			case T__43:
				{
				_localctx = new BoolValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(301);
				_la = _input.LA(1);
				if ( !(_la==T__42 || _la==T__43) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__9:
			case T__25:
			case T__31:
			case Inum:
			case Fnum:
			case IDENTIFIER:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new GreaterContext(new BexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(305);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(306);
						match(T__36);
						setState(307);
						bexpr(9);
						}
						break;
					case 2:
						{
						_localctx = new SmallerContext(new BexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(308);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(309);
						match(T__37);
						setState(310);
						bexpr(8);
						}
						break;
					case 3:
						{
						_localctx = new GreaterEqualsContext(new BexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(311);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(312);
						match(T__38);
						setState(313);
						bexpr(7);
						}
						break;
					case 4:
						{
						_localctx = new SmallerEqualsContext(new BexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(314);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(315);
						match(T__39);
						setState(316);
						bexpr(6);
						}
						break;
					case 5:
						{
						_localctx = new EqualsContext(new BexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(317);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(318);
						match(T__40);
						setState(319);
						bexpr(5);
						}
						break;
					case 6:
						{
						_localctx = new NotEqualsContext(new BexprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bexpr);
						setState(320);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(321);
						match(T__41);
						setState(322);
						bexpr(4);
						}
						break;
					}
					} 
				}
				setState(327);
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
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u014b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\7\3\"\n\3\f\3\16\3"+
		"%\13\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6/\n\6\3\6\3\6\3\6\5\6\64\n\6"+
		"\3\6\3\6\3\6\3\6\5\6:\n\6\3\6\3\6\3\6\5\6?\n\6\3\6\3\6\5\6C\n\6\3\7\3"+
		"\7\5\7G\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bO\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bx\n\b"+
		"\3\t\3\t\3\t\3\t\5\t~\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u00c2\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ce"+
		"\n\t\f\t\16\t\u00d1\13\t\5\t\u00d3\n\t\3\t\3\t\3\t\7\t\u00d8\n\t\f\t\16"+
		"\t\u00db\13\t\3\t\5\t\u00de\n\t\5\t\u00e0\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0102\n\r\3\r\3\r\3\r\5"+
		"\r\u0107\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0113\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u012a\n\r\f\r\16\r\u012d\13\r\3\16\3\16\3\16\5\16\u0132"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u0146\n\16\f\16\16\16\u0149\13\16\3\16"+
		"\2\4\30\32\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\6\3\2\3\4\3\2\5\6\4\2"+
		"//\61\61\3\2-.\2\u0177\2\34\3\2\2\2\4#\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n"+
		"B\3\2\2\2\fF\3\2\2\2\16w\3\2\2\2\20\u00df\3\2\2\2\22\u00e1\3\2\2\2\24"+
		"\u00e9\3\2\2\2\26\u00f1\3\2\2\2\30\u0112\3\2\2\2\32\u0131\3\2\2\2\34\35"+
		"\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37\"\5\16\b\2 \"\5\20\t\2!\37\3\2"+
		"\2\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&\'"+
		"\t\2\2\2\'\7\3\2\2\2()\t\3\2\2)\t\3\2\2\2*.\7\3\2\2+,\7\7\2\2,-\7/\2\2"+
		"-/\7\b\2\2.+\3\2\2\2./\3\2\2\2/\63\3\2\2\2\60\61\7\7\2\2\61\62\7/\2\2"+
		"\62\64\7\b\2\2\63\60\3\2\2\2\63\64\3\2\2\2\64C\3\2\2\2\659\7\4\2\2\66"+
		"\67\7\7\2\2\678\7/\2\28:\7\b\2\29\66\3\2\2\29:\3\2\2\2:>\3\2\2\2;<\7\7"+
		"\2\2<=\7/\2\2=?\7\b\2\2>;\3\2\2\2>?\3\2\2\2?C\3\2\2\2@C\7\t\2\2AC\7\n"+
		"\2\2B*\3\2\2\2B\65\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\13\3\2\2\2DG\5\n\6\2E"+
		"G\7\13\2\2FD\3\2\2\2FE\3\2\2\2G\r\3\2\2\2HI\5\f\7\2IJ\7\61\2\2JN\7\f\2"+
		"\2KL\5\n\6\2LM\7\61\2\2MO\3\2\2\2NK\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\r"+
		"\2\2QR\7\16\2\2RS\5\4\3\2ST\7\17\2\2Tx\3\2\2\2UV\5\6\4\2VW\7\7\2\2WX\7"+
		"/\2\2XY\7\b\2\2YZ\7\7\2\2Z[\7/\2\2[\\\7\b\2\2\\]\7\61\2\2]^\7\20\2\2^"+
		"x\3\2\2\2_`\5\6\4\2`a\7\7\2\2ab\7/\2\2bc\7\b\2\2cd\7\61\2\2de\7\20\2\2"+
		"ex\3\2\2\2fg\5\6\4\2gh\7\61\2\2hi\7\21\2\2ij\5\30\r\2jk\7\20\2\2kx\3\2"+
		"\2\2lm\7\n\2\2mn\7\61\2\2no\7\21\2\2op\7\62\2\2px\7\20\2\2qr\7\t\2\2r"+
		"s\7\61\2\2st\7\21\2\2tu\5\32\16\2uv\7\20\2\2vx\3\2\2\2wH\3\2\2\2wU\3\2"+
		"\2\2w_\3\2\2\2wf\3\2\2\2wl\3\2\2\2wq\3\2\2\2x\17\3\2\2\2yz\5\b\5\2z}\7"+
		"\f\2\2{~\7\62\2\2|~\5\30\r\2}{\3\2\2\2}|\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\7\r\2\2\u0080\u0081\7\20\2\2\u0081\u00e0\3\2\2\2\u0082\u0083\7\22\2\2"+
		"\u0083\u00e0\7\61\2\2\u0084\u0085\7\61\2\2\u0085\u0086\7\21\2\2\u0086"+
		"\u0087\5\30\r\2\u0087\u0088\7\20\2\2\u0088\u00e0\3\2\2\2\u0089\u008a\7"+
		"\61\2\2\u008a\u008b\7\21\2\2\u008b\u008c\5\32\16\2\u008c\u008d\7\20\2"+
		"\2\u008d\u00e0\3\2\2\2\u008e\u008f\7\61\2\2\u008f\u0090\7\7\2\2\u0090"+
		"\u0091\t\4\2\2\u0091\u0092\7\b\2\2\u0092\u0093\7\7\2\2\u0093\u0094\t\4"+
		"\2\2\u0094\u0095\7\b\2\2\u0095\u0096\7\21\2\2\u0096\u0097\5\30\r\2\u0097"+
		"\u0098\7\20\2\2\u0098\u00e0\3\2\2\2\u0099\u009a\7\61\2\2\u009a\u009b\7"+
		"\7\2\2\u009b\u009c\t\4\2\2\u009c\u009d\7\b\2\2\u009d\u009e\7\21\2\2\u009e"+
		"\u009f\5\30\r\2\u009f\u00a0\7\20\2\2\u00a0\u00e0\3\2\2\2\u00a1\u00a2\7"+
		"\61\2\2\u00a2\u00a3\7\23\2\2\u00a3\u00e0\7\20\2\2\u00a4\u00a5\7\61\2\2"+
		"\u00a5\u00a6\7\24\2\2\u00a6\u00e0\7\20\2\2\u00a7\u00a8\7\25\2\2\u00a8"+
		"\u00a9\7\f\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7\r\2\2\u00ab\u00e0\7"+
		"\20\2\2\u00ac\u00ad\7\26\2\2\u00ad\u00ae\7\f\2\2\u00ae\u00af\5\32\16\2"+
		"\u00af\u00b0\7\r\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\5\4\3\2\u00b2\u00b3"+
		"\7\17\2\2\u00b3\u00e0\3\2\2\2\u00b4\u00b5\7\27\2\2\u00b5\u00b6\7\f\2\2"+
		"\u00b6\u00b7\7\3\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\7\21\2\2\u00b9\u00ba"+
		"\5\30\r\2\u00ba\u00bb\7\20\2\2\u00bb\u00bc\5\32\16\2\u00bc\u00c1\7\20"+
		"\2\2\u00bd\u00be\7\61\2\2\u00be\u00c2\7\23\2\2\u00bf\u00c0\7\61\2\2\u00c0"+
		"\u00c2\7\24\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c4\7\r\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\5\4\3\2\u00c6"+
		"\u00c7\7\17\2\2\u00c7\u00e0\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9\u00d2\7"+
		"\f\2\2\u00ca\u00cf\7\61\2\2\u00cb\u00cc\7\30\2\2\u00cc\u00ce\7\61\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00e0\7\r\2\2\u00d5\u00d9\5\22"+
		"\n\2\u00d6\u00d8\5\24\13\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00de\5\26\f\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e0\3\2\2\2\u00dfy\3\2\2\2\u00df\u0082\3\2\2\2\u00df\u0084\3\2\2\2"+
		"\u00df\u0089\3\2\2\2\u00df\u008e\3\2\2\2\u00df\u0099\3\2\2\2\u00df\u00a1"+
		"\3\2\2\2\u00df\u00a4\3\2\2\2\u00df\u00a7\3\2\2\2\u00df\u00ac\3\2\2\2\u00df"+
		"\u00b4\3\2\2\2\u00df\u00c8\3\2\2\2\u00df\u00d5\3\2\2\2\u00e0\21\3\2\2"+
		"\2\u00e1\u00e2\7\31\2\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\5\32\16\2\u00e4"+
		"\u00e5\7\r\2\2\u00e5\u00e6\7\16\2\2\u00e6\u00e7\5\4\3\2\u00e7\u00e8\7"+
		"\17\2\2\u00e8\23\3\2\2\2\u00e9\u00ea\7\32\2\2\u00ea\u00eb\7\f\2\2\u00eb"+
		"\u00ec\5\32\16\2\u00ec\u00ed\7\r\2\2\u00ed\u00ee\7\16\2\2\u00ee\u00ef"+
		"\5\4\3\2\u00ef\u00f0\7\17\2\2\u00f0\25\3\2\2\2\u00f1\u00f2\7\33\2\2\u00f2"+
		"\u00f3\7\16\2\2\u00f3\u00f4\5\4\3\2\u00f4\u00f5\7\17\2\2\u00f5\27\3\2"+
		"\2\2\u00f6\u00f7\b\r\1\2\u00f7\u00f8\7\f\2\2\u00f8\u00f9\5\30\r\2\u00f9"+
		"\u00fa\7\r\2\2\u00fa\u0113\3\2\2\2\u00fb\u00fc\7\34\2\2\u00fc\u0113\5"+
		"\30\r\21\u00fd\u0101\7\61\2\2\u00fe\u00ff\7\7\2\2\u00ff\u0100\t\4\2\2"+
		"\u0100\u0102\7\b\2\2\u0101\u00fe\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0106"+
		"\3\2\2\2\u0103\u0104\7\7\2\2\u0104\u0105\t\4\2\2\u0105\u0107\7\b\2\2\u0106"+
		"\u0103\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0113\3\2\2\2\u0108\u0109\7\61"+
		"\2\2\u0109\u0113\7$\2\2\u010a\u010b\7\61\2\2\u010b\u0113\7%\2\2\u010c"+
		"\u010d\7\61\2\2\u010d\u0113\7&\2\2\u010e\u010f\7\"\2\2\u010f\u0113\5\30"+
		"\r\5\u0110\u0113\7/\2\2\u0111\u0113\7\60\2\2\u0112\u00f6\3\2\2\2\u0112"+
		"\u00fb\3\2\2\2\u0112\u00fd\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u010a\3\2"+
		"\2\2\u0112\u010c\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0111\3\2\2\2\u0113\u012b\3\2\2\2\u0114\u0115\f\20\2\2\u0115\u0116\7"+
		"\35\2\2\u0116\u012a\5\30\r\21\u0117\u0118\f\17\2\2\u0118\u0119\7\36\2"+
		"\2\u0119\u012a\5\30\r\20\u011a\u011b\f\16\2\2\u011b\u011c\7\37\2\2\u011c"+
		"\u012a\5\30\r\17\u011d\u011e\f\r\2\2\u011e\u011f\7 \2\2\u011f\u012a\5"+
		"\30\r\16\u0120\u0121\f\f\2\2\u0121\u0122\7!\2\2\u0122\u012a\5\30\r\r\u0123"+
		"\u0124\f\13\2\2\u0124\u0125\7\"\2\2\u0125\u012a\5\30\r\f\u0126\u0127\f"+
		"\n\2\2\u0127\u0128\7#\2\2\u0128\u012a\5\30\r\13\u0129\u0114\3\2\2\2\u0129"+
		"\u0117\3\2\2\2\u0129\u011a\3\2\2\2\u0129\u011d\3\2\2\2\u0129\u0120\3\2"+
		"\2\2\u0129\u0123\3\2\2\2\u0129\u0126\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\31\3\2\2\2\u012d\u012b\3\2\2"+
		"\2\u012e\u012f\b\16\1\2\u012f\u0132\t\5\2\2\u0130\u0132\5\30\r\2\u0131"+
		"\u012e\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0147\3\2\2\2\u0133\u0134\f\n"+
		"\2\2\u0134\u0135\7\'\2\2\u0135\u0146\5\32\16\13\u0136\u0137\f\t\2\2\u0137"+
		"\u0138\7(\2\2\u0138\u0146\5\32\16\n\u0139\u013a\f\b\2\2\u013a\u013b\7"+
		")\2\2\u013b\u0146\5\32\16\t\u013c\u013d\f\7\2\2\u013d\u013e\7*\2\2\u013e"+
		"\u0146\5\32\16\b\u013f\u0140\f\6\2\2\u0140\u0141\7+\2\2\u0141\u0146\5"+
		"\32\16\7\u0142\u0143\f\5\2\2\u0143\u0144\7,\2\2\u0144\u0146\5\32\16\6"+
		"\u0145\u0133\3\2\2\2\u0145\u0136\3\2\2\2\u0145\u0139\3\2\2\2\u0145\u013c"+
		"\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0142\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\33\3\2\2\2\u0149\u0147\3\2\2"+
		"\2\33!#.\639>BFNw}\u00c1\u00cf\u00d2\u00d9\u00dd\u00df\u0101\u0106\u0112"+
		"\u0129\u012b\u0131\u0145\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}