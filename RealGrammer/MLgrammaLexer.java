// Generated from MLgramma.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MLgrammaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "Inum", "Fnum", "Dnum", "String", "ID", "WHITESPACE", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'prototype'", "'autograd'", "'('", "','", "')'", "';'", "'main'", 
			"'{'", "'}'", "'fun'", "'='", "'return'", "'continue'", "'break'", "'print'", 
			"'string'", "'['", "']'", "'for'", "'while'", "'if'", "'elif'", "'else'", 
			"'sqrt'", "'%'", "'**'", "'*'", "'/'", "'+'", "'-'", "'++'", "'--'", 
			"'.'", "'.T'", "'>'", "'<'", "'!'", "'.random'", "'.one'", "'.zero'", 
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


	public MLgrammaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MLgramma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0157\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3"+
		"+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\6-\u0118\n-\r-\16-\u0119\3.\6.\u011d"+
		"\n.\r.\16.\u011e\3.\3.\7.\u0123\n.\f.\16.\u0126\13.\3/\6/\u0129\n/\r/"+
		"\16/\u012a\3/\3/\7/\u012f\n/\f/\16/\u0132\13/\3\60\3\60\7\60\u0136\n\60"+
		"\f\60\16\60\u0139\13\60\3\60\3\60\3\61\3\61\7\61\u013f\n\61\f\61\16\61"+
		"\u0142\13\61\3\62\6\62\u0145\n\62\r\62\16\62\u0146\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\7\63\u0151\n\63\f\63\16\63\u0154\13\63\3\63\3\63"+
		"\3\u0137\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3"+
		"\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\f\17\17\"\"))\4\2\f\f\17"+
		"\17\2\u015f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5q\3\2\2\2\7z\3\2\2\2"+
		"\t|\3\2\2\2\13~\3\2\2\2\r\u0080\3\2\2\2\17\u0082\3\2\2\2\21\u0087\3\2"+
		"\2\2\23\u0089\3\2\2\2\25\u008b\3\2\2\2\27\u008f\3\2\2\2\31\u0091\3\2\2"+
		"\2\33\u0098\3\2\2\2\35\u00a1\3\2\2\2\37\u00a7\3\2\2\2!\u00ad\3\2\2\2#"+
		"\u00b4\3\2\2\2%\u00b6\3\2\2\2\'\u00b8\3\2\2\2)\u00bc\3\2\2\2+\u00c2\3"+
		"\2\2\2-\u00c5\3\2\2\2/\u00ca\3\2\2\2\61\u00cf\3\2\2\2\63\u00d4\3\2\2\2"+
		"\65\u00d6\3\2\2\2\67\u00d9\3\2\2\29\u00db\3\2\2\2;\u00dd\3\2\2\2=\u00df"+
		"\3\2\2\2?\u00e1\3\2\2\2A\u00e4\3\2\2\2C\u00e7\3\2\2\2E\u00e9\3\2\2\2G"+
		"\u00ec\3\2\2\2I\u00ee\3\2\2\2K\u00f0\3\2\2\2M\u00f2\3\2\2\2O\u00fa\3\2"+
		"\2\2Q\u00ff\3\2\2\2S\u0105\3\2\2\2U\u0109\3\2\2\2W\u010f\3\2\2\2Y\u0117"+
		"\3\2\2\2[\u011c\3\2\2\2]\u0128\3\2\2\2_\u0133\3\2\2\2a\u013c\3\2\2\2c"+
		"\u0144\3\2\2\2e\u014a\3\2\2\2gh\7r\2\2hi\7t\2\2ij\7q\2\2jk\7v\2\2kl\7"+
		"q\2\2lm\7v\2\2mn\7{\2\2no\7r\2\2op\7g\2\2p\4\3\2\2\2qr\7c\2\2rs\7w\2\2"+
		"st\7v\2\2tu\7q\2\2uv\7i\2\2vw\7t\2\2wx\7c\2\2xy\7f\2\2y\6\3\2\2\2z{\7"+
		"*\2\2{\b\3\2\2\2|}\7.\2\2}\n\3\2\2\2~\177\7+\2\2\177\f\3\2\2\2\u0080\u0081"+
		"\7=\2\2\u0081\16\3\2\2\2\u0082\u0083\7o\2\2\u0083\u0084\7c\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7p\2\2\u0086\20\3\2\2\2\u0087\u0088\7}\2\2\u0088\22"+
		"\3\2\2\2\u0089\u008a\7\177\2\2\u008a\24\3\2\2\2\u008b\u008c\7h\2\2\u008c"+
		"\u008d\7w\2\2\u008d\u008e\7p\2\2\u008e\26\3\2\2\2\u008f\u0090\7?\2\2\u0090"+
		"\30\3\2\2\2\u0091\u0092\7t\2\2\u0092\u0093\7g\2\2\u0093\u0094\7v\2\2\u0094"+
		"\u0095\7w\2\2\u0095\u0096\7t\2\2\u0096\u0097\7p\2\2\u0097\32\3\2\2\2\u0098"+
		"\u0099\7e\2\2\u0099\u009a\7q\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2"+
		"\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7w\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4"+
		"\7g\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7m\2\2\u00a6\36\3\2\2\2\u00a7\u00a8"+
		"\7r\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab"+
		"\u00ac\7v\2\2\u00ac \3\2\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7v\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7i\2\2"+
		"\u00b3\"\3\2\2\2\u00b4\u00b5\7]\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7_\2\2"+
		"\u00b7&\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7t\2"+
		"\2\u00bb(\3\2\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7"+
		"k\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1*\3\2\2\2\u00c2\u00c3"+
		"\7k\2\2\u00c3\u00c4\7h\2\2\u00c4,\3\2\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7"+
		"\7n\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7h\2\2\u00c9.\3\2\2\2\u00ca\u00cb"+
		"\7g\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"\60\3\2\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7s\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"\u00d3\7v\2\2\u00d3\62\3\2\2\2\u00d4\u00d5\7\'\2\2\u00d5\64\3\2\2\2\u00d6"+
		"\u00d7\7,\2\2\u00d7\u00d8\7,\2\2\u00d8\66\3\2\2\2\u00d9\u00da\7,\2\2\u00da"+
		"8\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc:\3\2\2\2\u00dd\u00de\7-\2\2\u00de"+
		"<\3\2\2\2\u00df\u00e0\7/\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7-\2\2\u00e2\u00e3"+
		"\7-\2\2\u00e3@\3\2\2\2\u00e4\u00e5\7/\2\2\u00e5\u00e6\7/\2\2\u00e6B\3"+
		"\2\2\2\u00e7\u00e8\7\60\2\2\u00e8D\3\2\2\2\u00e9\u00ea\7\60\2\2\u00ea"+
		"\u00eb\7V\2\2\u00ebF\3\2\2\2\u00ec\u00ed\7@\2\2\u00edH\3\2\2\2\u00ee\u00ef"+
		"\7>\2\2\u00efJ\3\2\2\2\u00f0\u00f1\7#\2\2\u00f1L\3\2\2\2\u00f2\u00f3\7"+
		"\60\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7p\2\2\u00f6"+
		"\u00f7\7f\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7o\2\2\u00f9N\3\2\2\2\u00fa"+
		"\u00fb\7\60\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7g\2"+
		"\2\u00feP\3\2\2\2\u00ff\u0100\7\60\2\2\u0100\u0101\7|\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7t\2\2\u0103\u0104\7q\2\2\u0104R\3\2\2\2\u0105\u0106"+
		"\7k\2\2\u0106\u0107\7p\2\2\u0107\u0108\7v\2\2\u0108T\3\2\2\2\u0109\u010a"+
		"\7h\2\2\u010a\u010b\7n\2\2\u010b\u010c\7q\2\2\u010c\u010d\7c\2\2\u010d"+
		"\u010e\7v\2\2\u010eV\3\2\2\2\u010f\u0110\7f\2\2\u0110\u0111\7q\2\2\u0111"+
		"\u0112\7w\2\2\u0112\u0113\7d\2\2\u0113\u0114\7n\2\2\u0114\u0115\7g\2\2"+
		"\u0115X\3\2\2\2\u0116\u0118\t\2\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3"+
		"\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011aZ\3\2\2\2\u011b\u011d"+
		"\t\2\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0124\7\60\2\2\u0121\u0123\t"+
		"\2\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\\\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0129\t\2\2\2"+
		"\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0130\7\60\2\2\u012d\u012f\t\2\2\2"+
		"\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131^\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0137\7$\2\2\u0134\u0136"+
		"\13\2\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0138\3\2\2\2"+
		"\u0137\u0135\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b"+
		"\7$\2\2\u013b`\3\2\2\2\u013c\u0140\t\3\2\2\u013d\u013f\t\4\2\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"b\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\t\5\2\2\u0144\u0143\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\b\62\2\2\u0149d\3\2\2\2\u014a\u014b\7%\2\2\u014b"+
		"\u014c\7\61\2\2\u014c\u014d\7\61\2\2\u014d\u014e\7%\2\2\u014e\u0152\3"+
		"\2\2\2\u014f\u0151\n\6\2\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0155\u0156\b\63\2\2\u0156f\3\2\2\2\f\2\u0119\u011e\u0124\u012a\u0130"+
		"\u0137\u0140\u0146\u0152\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}