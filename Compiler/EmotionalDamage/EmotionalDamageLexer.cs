//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from EmotionalDamage.g4 by ANTLR 4.9.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.3")]
[System.CLSCompliant(false)]
public partial class EmotionalDamageLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, Inum=50, Fnum=51, IDENTIFIER=52, 
		STRING_CONSTANT=53, WS=54, LINE_COMMENT=55;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"Inum", "Fnum", "IDENTIFIER", "STRING_CONSTANT", "ESC", "UNICODE", "HEX", 
		"WS", "LINE_COMMENT"
	};


	public EmotionalDamageLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public EmotionalDamageLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'int'", "'float'", "'print'", "'println'", "'['", "']'", "'bool'", 
		"'string'", "'void'", "'('", "','", "')'", "'{'", "'}'", "';'", "'='", 
		"'\\\\'", "'$'", "'return'", "'.rand'", "'T'", "'#'", "'.'", "'relu'", 
		"'++'", "'--'", "'while'", "'for'", "'if'", "'elif'", "'else'", "'sqrt'", 
		"'**'", "'%'", "'*'", "'/'", "'+'", "'-'", "'.row'", "'.col'", "'.len'", 
		"'>'", "'<'", "'>='", "'<='", "'=='", "'true'", "'false'", "'!='"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "Inum", "Fnum", "IDENTIFIER", "STRING_CONSTANT", "WS", "LINE_COMMENT"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "EmotionalDamage.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static EmotionalDamageLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '\x39', '\x168', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x4', 
		' ', '\t', ' ', '\x4', '!', '\t', '!', '\x4', '\"', '\t', '\"', '\x4', 
		'#', '\t', '#', '\x4', '$', '\t', '$', '\x4', '%', '\t', '%', '\x4', '&', 
		'\t', '&', '\x4', '\'', '\t', '\'', '\x4', '(', '\t', '(', '\x4', ')', 
		'\t', ')', '\x4', '*', '\t', '*', '\x4', '+', '\t', '+', '\x4', ',', '\t', 
		',', '\x4', '-', '\t', '-', '\x4', '.', '\t', '.', '\x4', '/', '\t', '/', 
		'\x4', '\x30', '\t', '\x30', '\x4', '\x31', '\t', '\x31', '\x4', '\x32', 
		'\t', '\x32', '\x4', '\x33', '\t', '\x33', '\x4', '\x34', '\t', '\x34', 
		'\x4', '\x35', '\t', '\x35', '\x4', '\x36', '\t', '\x36', '\x4', '\x37', 
		'\t', '\x37', '\x4', '\x38', '\t', '\x38', '\x4', '\x39', '\t', '\x39', 
		'\x4', ':', '\t', ':', '\x4', ';', '\t', ';', '\x3', '\x2', '\x3', '\x2', 
		'\x3', '\x2', '\x3', '\x2', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', 
		'\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x4', '\x3', '\x4', 
		'\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x5', '\x3', '\x6', '\x3', '\x6', '\x3', '\a', '\x3', 
		'\a', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', 
		'\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', 
		'\t', '\x3', '\t', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', 
		'\x3', '\n', '\x3', '\v', '\x3', '\v', '\x3', '\f', '\x3', '\f', '\x3', 
		'\r', '\x3', '\r', '\x3', '\xE', '\x3', '\xE', '\x3', '\xF', '\x3', '\xF', 
		'\x3', '\x10', '\x3', '\x10', '\x3', '\x11', '\x3', '\x11', '\x3', '\x12', 
		'\x3', '\x12', '\x3', '\x12', '\x3', '\x13', '\x3', '\x13', '\x3', '\x14', 
		'\x3', '\x14', '\x3', '\x14', '\x3', '\x14', '\x3', '\x14', '\x3', '\x14', 
		'\x3', '\x14', '\x3', '\x15', '\x3', '\x15', '\x3', '\x15', '\x3', '\x15', 
		'\x3', '\x15', '\x3', '\x15', '\x3', '\x16', '\x3', '\x16', '\x3', '\x17', 
		'\x3', '\x17', '\x3', '\x18', '\x3', '\x18', '\x3', '\x19', '\x3', '\x19', 
		'\x3', '\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x1A', '\x3', '\x1A', 
		'\x3', '\x1A', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1C', 
		'\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', 
		'\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1E', 
		'\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1F', '\x3', '\x1F', '\x3', '\x1F', 
		'\x3', '\x1F', '\x3', '\x1F', '\x3', ' ', '\x3', ' ', '\x3', ' ', '\x3', 
		' ', '\x3', ' ', '\x3', '!', '\x3', '!', '\x3', '!', '\x3', '!', '\x3', 
		'!', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', '#', '\x3', '#', '\x3', 
		'$', '\x3', '$', '\x3', '%', '\x3', '%', '\x3', '&', '\x3', '&', '\x3', 
		'\'', '\x3', '\'', '\x3', '(', '\x3', '(', '\x3', '(', '\x3', '(', '\x3', 
		'(', '\x3', ')', '\x3', ')', '\x3', ')', '\x3', ')', '\x3', ')', '\x3', 
		'*', '\x3', '*', '\x3', '*', '\x3', '*', '\x3', '*', '\x3', '+', '\x3', 
		'+', '\x3', ',', '\x3', ',', '\x3', '-', '\x3', '-', '\x3', '-', '\x3', 
		'.', '\x3', '.', '\x3', '.', '\x3', '/', '\x3', '/', '\x3', '/', '\x3', 
		'\x30', '\x3', '\x30', '\x3', '\x30', '\x3', '\x30', '\x3', '\x30', '\x3', 
		'\x31', '\x3', '\x31', '\x3', '\x31', '\x3', '\x31', '\x3', '\x31', '\x3', 
		'\x31', '\x3', '\x32', '\x3', '\x32', '\x3', '\x32', '\x3', '\x33', '\x6', 
		'\x33', '\x12A', '\n', '\x33', '\r', '\x33', '\xE', '\x33', '\x12B', '\x3', 
		'\x34', '\x6', '\x34', '\x12F', '\n', '\x34', '\r', '\x34', '\xE', '\x34', 
		'\x130', '\x3', '\x34', '\x3', '\x34', '\x6', '\x34', '\x135', '\n', '\x34', 
		'\r', '\x34', '\xE', '\x34', '\x136', '\x3', '\x35', '\x3', '\x35', '\a', 
		'\x35', '\x13B', '\n', '\x35', '\f', '\x35', '\xE', '\x35', '\x13E', '\v', 
		'\x35', '\x3', '\x36', '\x3', '\x36', '\x3', '\x36', '\a', '\x36', '\x143', 
		'\n', '\x36', '\f', '\x36', '\xE', '\x36', '\x146', '\v', '\x36', '\x3', 
		'\x36', '\x3', '\x36', '\x3', '\x37', '\x3', '\x37', '\x3', '\x37', '\x5', 
		'\x37', '\x14D', '\n', '\x37', '\x3', '\x38', '\x3', '\x38', '\x3', '\x38', 
		'\x3', '\x38', '\x3', '\x38', '\x3', '\x38', '\x3', '\x39', '\x3', '\x39', 
		'\x3', ':', '\x6', ':', '\x158', '\n', ':', '\r', ':', '\xE', ':', '\x159', 
		'\x3', ':', '\x3', ':', '\x3', ';', '\x3', ';', '\x3', ';', '\x3', ';', 
		'\a', ';', '\x162', '\n', ';', '\f', ';', '\xE', ';', '\x165', '\v', ';', 
		'\x3', ';', '\x3', ';', '\x2', '\x2', '<', '\x3', '\x3', '\x5', '\x4', 
		'\a', '\x5', '\t', '\x6', '\v', '\a', '\r', '\b', '\xF', '\t', '\x11', 
		'\n', '\x13', '\v', '\x15', '\f', '\x17', '\r', '\x19', '\xE', '\x1B', 
		'\xF', '\x1D', '\x10', '\x1F', '\x11', '!', '\x12', '#', '\x13', '%', 
		'\x14', '\'', '\x15', ')', '\x16', '+', '\x17', '-', '\x18', '/', '\x19', 
		'\x31', '\x1A', '\x33', '\x1B', '\x35', '\x1C', '\x37', '\x1D', '\x39', 
		'\x1E', ';', '\x1F', '=', ' ', '?', '!', '\x41', '\"', '\x43', '#', '\x45', 
		'$', 'G', '%', 'I', '&', 'K', '\'', 'M', '(', 'O', ')', 'Q', '*', 'S', 
		'+', 'U', ',', 'W', '-', 'Y', '.', '[', '/', ']', '\x30', '_', '\x31', 
		'\x61', '\x32', '\x63', '\x33', '\x65', '\x34', 'g', '\x35', 'i', '\x36', 
		'k', '\x37', 'm', '\x2', 'o', '\x2', 'q', '\x2', 's', '\x38', 'u', '\x39', 
		'\x3', '\x2', '\n', '\x3', '\x2', '\x32', ';', '\x5', '\x2', '\x43', '\\', 
		'\x61', '\x61', '\x63', '|', '\x6', '\x2', '\x32', ';', '\x43', '\\', 
		'\x61', '\x61', '\x63', '|', '\x4', '\x2', '$', '$', '^', '^', '\n', '\x2', 
		'$', '$', '\x31', '\x31', '^', '^', '\x64', '\x64', 'h', 'h', 'p', 'p', 
		't', 't', 'v', 'v', '\x5', '\x2', '\x32', ';', '\x43', 'H', '\x63', 'h', 
		'\x5', '\x2', '\v', '\f', '\xF', '\xF', '\"', '\"', '\x4', '\x2', '\f', 
		'\f', '\xF', '\xF', '\x2', '\x16D', '\x2', '\x3', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x5', '\x3', '\x2', '\x2', '\x2', '\x2', '\a', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\t', '\x3', '\x2', '\x2', '\x2', '\x2', '\v', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\r', '\x3', '\x2', '\x2', '\x2', '\x2', '\xF', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x11', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x13', '\x3', '\x2', '\x2', '\x2', '\x2', '\x15', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x17', '\x3', '\x2', '\x2', '\x2', '\x2', '\x19', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x1B', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x1D', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1F', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '!', '\x3', '\x2', '\x2', '\x2', '\x2', '#', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '%', '\x3', '\x2', '\x2', '\x2', '\x2', '\'', 
		'\x3', '\x2', '\x2', '\x2', '\x2', ')', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'+', '\x3', '\x2', '\x2', '\x2', '\x2', '-', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '/', '\x3', '\x2', '\x2', '\x2', '\x2', '\x31', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x33', '\x3', '\x2', '\x2', '\x2', '\x2', '\x35', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x37', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x39', '\x3', '\x2', '\x2', '\x2', '\x2', ';', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '=', '\x3', '\x2', '\x2', '\x2', '\x2', '?', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x41', '\x3', '\x2', '\x2', '\x2', '\x2', '\x43', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x45', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'G', '\x3', '\x2', '\x2', '\x2', '\x2', 'I', '\x3', '\x2', '\x2', '\x2', 
		'\x2', 'K', '\x3', '\x2', '\x2', '\x2', '\x2', 'M', '\x3', '\x2', '\x2', 
		'\x2', '\x2', 'O', '\x3', '\x2', '\x2', '\x2', '\x2', 'Q', '\x3', '\x2', 
		'\x2', '\x2', '\x2', 'S', '\x3', '\x2', '\x2', '\x2', '\x2', 'U', '\x3', 
		'\x2', '\x2', '\x2', '\x2', 'W', '\x3', '\x2', '\x2', '\x2', '\x2', 'Y', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '[', '\x3', '\x2', '\x2', '\x2', '\x2', 
		']', '\x3', '\x2', '\x2', '\x2', '\x2', '_', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x61', '\x3', '\x2', '\x2', '\x2', '\x2', '\x63', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x65', '\x3', '\x2', '\x2', '\x2', '\x2', 'g', '\x3', 
		'\x2', '\x2', '\x2', '\x2', 'i', '\x3', '\x2', '\x2', '\x2', '\x2', 'k', 
		'\x3', '\x2', '\x2', '\x2', '\x2', 's', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'u', '\x3', '\x2', '\x2', '\x2', '\x3', 'w', '\x3', '\x2', '\x2', '\x2', 
		'\x5', '{', '\x3', '\x2', '\x2', '\x2', '\a', '\x81', '\x3', '\x2', '\x2', 
		'\x2', '\t', '\x87', '\x3', '\x2', '\x2', '\x2', '\v', '\x8F', '\x3', 
		'\x2', '\x2', '\x2', '\r', '\x91', '\x3', '\x2', '\x2', '\x2', '\xF', 
		'\x93', '\x3', '\x2', '\x2', '\x2', '\x11', '\x98', '\x3', '\x2', '\x2', 
		'\x2', '\x13', '\x9F', '\x3', '\x2', '\x2', '\x2', '\x15', '\xA4', '\x3', 
		'\x2', '\x2', '\x2', '\x17', '\xA6', '\x3', '\x2', '\x2', '\x2', '\x19', 
		'\xA8', '\x3', '\x2', '\x2', '\x2', '\x1B', '\xAA', '\x3', '\x2', '\x2', 
		'\x2', '\x1D', '\xAC', '\x3', '\x2', '\x2', '\x2', '\x1F', '\xAE', '\x3', 
		'\x2', '\x2', '\x2', '!', '\xB0', '\x3', '\x2', '\x2', '\x2', '#', '\xB2', 
		'\x3', '\x2', '\x2', '\x2', '%', '\xB5', '\x3', '\x2', '\x2', '\x2', '\'', 
		'\xB7', '\x3', '\x2', '\x2', '\x2', ')', '\xBE', '\x3', '\x2', '\x2', 
		'\x2', '+', '\xC4', '\x3', '\x2', '\x2', '\x2', '-', '\xC6', '\x3', '\x2', 
		'\x2', '\x2', '/', '\xC8', '\x3', '\x2', '\x2', '\x2', '\x31', '\xCA', 
		'\x3', '\x2', '\x2', '\x2', '\x33', '\xCF', '\x3', '\x2', '\x2', '\x2', 
		'\x35', '\xD2', '\x3', '\x2', '\x2', '\x2', '\x37', '\xD5', '\x3', '\x2', 
		'\x2', '\x2', '\x39', '\xDB', '\x3', '\x2', '\x2', '\x2', ';', '\xDF', 
		'\x3', '\x2', '\x2', '\x2', '=', '\xE2', '\x3', '\x2', '\x2', '\x2', '?', 
		'\xE7', '\x3', '\x2', '\x2', '\x2', '\x41', '\xEC', '\x3', '\x2', '\x2', 
		'\x2', '\x43', '\xF1', '\x3', '\x2', '\x2', '\x2', '\x45', '\xF4', '\x3', 
		'\x2', '\x2', '\x2', 'G', '\xF6', '\x3', '\x2', '\x2', '\x2', 'I', '\xF8', 
		'\x3', '\x2', '\x2', '\x2', 'K', '\xFA', '\x3', '\x2', '\x2', '\x2', 'M', 
		'\xFC', '\x3', '\x2', '\x2', '\x2', 'O', '\xFE', '\x3', '\x2', '\x2', 
		'\x2', 'Q', '\x103', '\x3', '\x2', '\x2', '\x2', 'S', '\x108', '\x3', 
		'\x2', '\x2', '\x2', 'U', '\x10D', '\x3', '\x2', '\x2', '\x2', 'W', '\x10F', 
		'\x3', '\x2', '\x2', '\x2', 'Y', '\x111', '\x3', '\x2', '\x2', '\x2', 
		'[', '\x114', '\x3', '\x2', '\x2', '\x2', ']', '\x117', '\x3', '\x2', 
		'\x2', '\x2', '_', '\x11A', '\x3', '\x2', '\x2', '\x2', '\x61', '\x11F', 
		'\x3', '\x2', '\x2', '\x2', '\x63', '\x125', '\x3', '\x2', '\x2', '\x2', 
		'\x65', '\x129', '\x3', '\x2', '\x2', '\x2', 'g', '\x12E', '\x3', '\x2', 
		'\x2', '\x2', 'i', '\x138', '\x3', '\x2', '\x2', '\x2', 'k', '\x13F', 
		'\x3', '\x2', '\x2', '\x2', 'm', '\x149', '\x3', '\x2', '\x2', '\x2', 
		'o', '\x14E', '\x3', '\x2', '\x2', '\x2', 'q', '\x154', '\x3', '\x2', 
		'\x2', '\x2', 's', '\x157', '\x3', '\x2', '\x2', '\x2', 'u', '\x15D', 
		'\x3', '\x2', '\x2', '\x2', 'w', 'x', '\a', 'k', '\x2', '\x2', 'x', 'y', 
		'\a', 'p', '\x2', '\x2', 'y', 'z', '\a', 'v', '\x2', '\x2', 'z', '\x4', 
		'\x3', '\x2', '\x2', '\x2', '{', '|', '\a', 'h', '\x2', '\x2', '|', '}', 
		'\a', 'n', '\x2', '\x2', '}', '~', '\a', 'q', '\x2', '\x2', '~', '\x7F', 
		'\a', '\x63', '\x2', '\x2', '\x7F', '\x80', '\a', 'v', '\x2', '\x2', '\x80', 
		'\x6', '\x3', '\x2', '\x2', '\x2', '\x81', '\x82', '\a', 'r', '\x2', '\x2', 
		'\x82', '\x83', '\a', 't', '\x2', '\x2', '\x83', '\x84', '\a', 'k', '\x2', 
		'\x2', '\x84', '\x85', '\a', 'p', '\x2', '\x2', '\x85', '\x86', '\a', 
		'v', '\x2', '\x2', '\x86', '\b', '\x3', '\x2', '\x2', '\x2', '\x87', '\x88', 
		'\a', 'r', '\x2', '\x2', '\x88', '\x89', '\a', 't', '\x2', '\x2', '\x89', 
		'\x8A', '\a', 'k', '\x2', '\x2', '\x8A', '\x8B', '\a', 'p', '\x2', '\x2', 
		'\x8B', '\x8C', '\a', 'v', '\x2', '\x2', '\x8C', '\x8D', '\a', 'n', '\x2', 
		'\x2', '\x8D', '\x8E', '\a', 'p', '\x2', '\x2', '\x8E', '\n', '\x3', '\x2', 
		'\x2', '\x2', '\x8F', '\x90', '\a', ']', '\x2', '\x2', '\x90', '\f', '\x3', 
		'\x2', '\x2', '\x2', '\x91', '\x92', '\a', '_', '\x2', '\x2', '\x92', 
		'\xE', '\x3', '\x2', '\x2', '\x2', '\x93', '\x94', '\a', '\x64', '\x2', 
		'\x2', '\x94', '\x95', '\a', 'q', '\x2', '\x2', '\x95', '\x96', '\a', 
		'q', '\x2', '\x2', '\x96', '\x97', '\a', 'n', '\x2', '\x2', '\x97', '\x10', 
		'\x3', '\x2', '\x2', '\x2', '\x98', '\x99', '\a', 'u', '\x2', '\x2', '\x99', 
		'\x9A', '\a', 'v', '\x2', '\x2', '\x9A', '\x9B', '\a', 't', '\x2', '\x2', 
		'\x9B', '\x9C', '\a', 'k', '\x2', '\x2', '\x9C', '\x9D', '\a', 'p', '\x2', 
		'\x2', '\x9D', '\x9E', '\a', 'i', '\x2', '\x2', '\x9E', '\x12', '\x3', 
		'\x2', '\x2', '\x2', '\x9F', '\xA0', '\a', 'x', '\x2', '\x2', '\xA0', 
		'\xA1', '\a', 'q', '\x2', '\x2', '\xA1', '\xA2', '\a', 'k', '\x2', '\x2', 
		'\xA2', '\xA3', '\a', '\x66', '\x2', '\x2', '\xA3', '\x14', '\x3', '\x2', 
		'\x2', '\x2', '\xA4', '\xA5', '\a', '*', '\x2', '\x2', '\xA5', '\x16', 
		'\x3', '\x2', '\x2', '\x2', '\xA6', '\xA7', '\a', '.', '\x2', '\x2', '\xA7', 
		'\x18', '\x3', '\x2', '\x2', '\x2', '\xA8', '\xA9', '\a', '+', '\x2', 
		'\x2', '\xA9', '\x1A', '\x3', '\x2', '\x2', '\x2', '\xAA', '\xAB', '\a', 
		'}', '\x2', '\x2', '\xAB', '\x1C', '\x3', '\x2', '\x2', '\x2', '\xAC', 
		'\xAD', '\a', '\x7F', '\x2', '\x2', '\xAD', '\x1E', '\x3', '\x2', '\x2', 
		'\x2', '\xAE', '\xAF', '\a', '=', '\x2', '\x2', '\xAF', ' ', '\x3', '\x2', 
		'\x2', '\x2', '\xB0', '\xB1', '\a', '?', '\x2', '\x2', '\xB1', '\"', '\x3', 
		'\x2', '\x2', '\x2', '\xB2', '\xB3', '\a', '^', '\x2', '\x2', '\xB3', 
		'\xB4', '\a', '^', '\x2', '\x2', '\xB4', '$', '\x3', '\x2', '\x2', '\x2', 
		'\xB5', '\xB6', '\a', '&', '\x2', '\x2', '\xB6', '&', '\x3', '\x2', '\x2', 
		'\x2', '\xB7', '\xB8', '\a', 't', '\x2', '\x2', '\xB8', '\xB9', '\a', 
		'g', '\x2', '\x2', '\xB9', '\xBA', '\a', 'v', '\x2', '\x2', '\xBA', '\xBB', 
		'\a', 'w', '\x2', '\x2', '\xBB', '\xBC', '\a', 't', '\x2', '\x2', '\xBC', 
		'\xBD', '\a', 'p', '\x2', '\x2', '\xBD', '(', '\x3', '\x2', '\x2', '\x2', 
		'\xBE', '\xBF', '\a', '\x30', '\x2', '\x2', '\xBF', '\xC0', '\a', 't', 
		'\x2', '\x2', '\xC0', '\xC1', '\a', '\x63', '\x2', '\x2', '\xC1', '\xC2', 
		'\a', 'p', '\x2', '\x2', '\xC2', '\xC3', '\a', '\x66', '\x2', '\x2', '\xC3', 
		'*', '\x3', '\x2', '\x2', '\x2', '\xC4', '\xC5', '\a', 'V', '\x2', '\x2', 
		'\xC5', ',', '\x3', '\x2', '\x2', '\x2', '\xC6', '\xC7', '\a', '%', '\x2', 
		'\x2', '\xC7', '.', '\x3', '\x2', '\x2', '\x2', '\xC8', '\xC9', '\a', 
		'\x30', '\x2', '\x2', '\xC9', '\x30', '\x3', '\x2', '\x2', '\x2', '\xCA', 
		'\xCB', '\a', 't', '\x2', '\x2', '\xCB', '\xCC', '\a', 'g', '\x2', '\x2', 
		'\xCC', '\xCD', '\a', 'n', '\x2', '\x2', '\xCD', '\xCE', '\a', 'w', '\x2', 
		'\x2', '\xCE', '\x32', '\x3', '\x2', '\x2', '\x2', '\xCF', '\xD0', '\a', 
		'-', '\x2', '\x2', '\xD0', '\xD1', '\a', '-', '\x2', '\x2', '\xD1', '\x34', 
		'\x3', '\x2', '\x2', '\x2', '\xD2', '\xD3', '\a', '/', '\x2', '\x2', '\xD3', 
		'\xD4', '\a', '/', '\x2', '\x2', '\xD4', '\x36', '\x3', '\x2', '\x2', 
		'\x2', '\xD5', '\xD6', '\a', 'y', '\x2', '\x2', '\xD6', '\xD7', '\a', 
		'j', '\x2', '\x2', '\xD7', '\xD8', '\a', 'k', '\x2', '\x2', '\xD8', '\xD9', 
		'\a', 'n', '\x2', '\x2', '\xD9', '\xDA', '\a', 'g', '\x2', '\x2', '\xDA', 
		'\x38', '\x3', '\x2', '\x2', '\x2', '\xDB', '\xDC', '\a', 'h', '\x2', 
		'\x2', '\xDC', '\xDD', '\a', 'q', '\x2', '\x2', '\xDD', '\xDE', '\a', 
		't', '\x2', '\x2', '\xDE', ':', '\x3', '\x2', '\x2', '\x2', '\xDF', '\xE0', 
		'\a', 'k', '\x2', '\x2', '\xE0', '\xE1', '\a', 'h', '\x2', '\x2', '\xE1', 
		'<', '\x3', '\x2', '\x2', '\x2', '\xE2', '\xE3', '\a', 'g', '\x2', '\x2', 
		'\xE3', '\xE4', '\a', 'n', '\x2', '\x2', '\xE4', '\xE5', '\a', 'k', '\x2', 
		'\x2', '\xE5', '\xE6', '\a', 'h', '\x2', '\x2', '\xE6', '>', '\x3', '\x2', 
		'\x2', '\x2', '\xE7', '\xE8', '\a', 'g', '\x2', '\x2', '\xE8', '\xE9', 
		'\a', 'n', '\x2', '\x2', '\xE9', '\xEA', '\a', 'u', '\x2', '\x2', '\xEA', 
		'\xEB', '\a', 'g', '\x2', '\x2', '\xEB', '@', '\x3', '\x2', '\x2', '\x2', 
		'\xEC', '\xED', '\a', 'u', '\x2', '\x2', '\xED', '\xEE', '\a', 's', '\x2', 
		'\x2', '\xEE', '\xEF', '\a', 't', '\x2', '\x2', '\xEF', '\xF0', '\a', 
		'v', '\x2', '\x2', '\xF0', '\x42', '\x3', '\x2', '\x2', '\x2', '\xF1', 
		'\xF2', '\a', ',', '\x2', '\x2', '\xF2', '\xF3', '\a', ',', '\x2', '\x2', 
		'\xF3', '\x44', '\x3', '\x2', '\x2', '\x2', '\xF4', '\xF5', '\a', '\'', 
		'\x2', '\x2', '\xF5', '\x46', '\x3', '\x2', '\x2', '\x2', '\xF6', '\xF7', 
		'\a', ',', '\x2', '\x2', '\xF7', 'H', '\x3', '\x2', '\x2', '\x2', '\xF8', 
		'\xF9', '\a', '\x31', '\x2', '\x2', '\xF9', 'J', '\x3', '\x2', '\x2', 
		'\x2', '\xFA', '\xFB', '\a', '-', '\x2', '\x2', '\xFB', 'L', '\x3', '\x2', 
		'\x2', '\x2', '\xFC', '\xFD', '\a', '/', '\x2', '\x2', '\xFD', 'N', '\x3', 
		'\x2', '\x2', '\x2', '\xFE', '\xFF', '\a', '\x30', '\x2', '\x2', '\xFF', 
		'\x100', '\a', 't', '\x2', '\x2', '\x100', '\x101', '\a', 'q', '\x2', 
		'\x2', '\x101', '\x102', '\a', 'y', '\x2', '\x2', '\x102', 'P', '\x3', 
		'\x2', '\x2', '\x2', '\x103', '\x104', '\a', '\x30', '\x2', '\x2', '\x104', 
		'\x105', '\a', '\x65', '\x2', '\x2', '\x105', '\x106', '\a', 'q', '\x2', 
		'\x2', '\x106', '\x107', '\a', 'n', '\x2', '\x2', '\x107', 'R', '\x3', 
		'\x2', '\x2', '\x2', '\x108', '\x109', '\a', '\x30', '\x2', '\x2', '\x109', 
		'\x10A', '\a', 'n', '\x2', '\x2', '\x10A', '\x10B', '\a', 'g', '\x2', 
		'\x2', '\x10B', '\x10C', '\a', 'p', '\x2', '\x2', '\x10C', 'T', '\x3', 
		'\x2', '\x2', '\x2', '\x10D', '\x10E', '\a', '@', '\x2', '\x2', '\x10E', 
		'V', '\x3', '\x2', '\x2', '\x2', '\x10F', '\x110', '\a', '>', '\x2', '\x2', 
		'\x110', 'X', '\x3', '\x2', '\x2', '\x2', '\x111', '\x112', '\a', '@', 
		'\x2', '\x2', '\x112', '\x113', '\a', '?', '\x2', '\x2', '\x113', 'Z', 
		'\x3', '\x2', '\x2', '\x2', '\x114', '\x115', '\a', '>', '\x2', '\x2', 
		'\x115', '\x116', '\a', '?', '\x2', '\x2', '\x116', '\\', '\x3', '\x2', 
		'\x2', '\x2', '\x117', '\x118', '\a', '?', '\x2', '\x2', '\x118', '\x119', 
		'\a', '?', '\x2', '\x2', '\x119', '^', '\x3', '\x2', '\x2', '\x2', '\x11A', 
		'\x11B', '\a', 'v', '\x2', '\x2', '\x11B', '\x11C', '\a', 't', '\x2', 
		'\x2', '\x11C', '\x11D', '\a', 'w', '\x2', '\x2', '\x11D', '\x11E', '\a', 
		'g', '\x2', '\x2', '\x11E', '`', '\x3', '\x2', '\x2', '\x2', '\x11F', 
		'\x120', '\a', 'h', '\x2', '\x2', '\x120', '\x121', '\a', '\x63', '\x2', 
		'\x2', '\x121', '\x122', '\a', 'n', '\x2', '\x2', '\x122', '\x123', '\a', 
		'u', '\x2', '\x2', '\x123', '\x124', '\a', 'g', '\x2', '\x2', '\x124', 
		'\x62', '\x3', '\x2', '\x2', '\x2', '\x125', '\x126', '\a', '#', '\x2', 
		'\x2', '\x126', '\x127', '\a', '?', '\x2', '\x2', '\x127', '\x64', '\x3', 
		'\x2', '\x2', '\x2', '\x128', '\x12A', '\t', '\x2', '\x2', '\x2', '\x129', 
		'\x128', '\x3', '\x2', '\x2', '\x2', '\x12A', '\x12B', '\x3', '\x2', '\x2', 
		'\x2', '\x12B', '\x129', '\x3', '\x2', '\x2', '\x2', '\x12B', '\x12C', 
		'\x3', '\x2', '\x2', '\x2', '\x12C', '\x66', '\x3', '\x2', '\x2', '\x2', 
		'\x12D', '\x12F', '\t', '\x2', '\x2', '\x2', '\x12E', '\x12D', '\x3', 
		'\x2', '\x2', '\x2', '\x12F', '\x130', '\x3', '\x2', '\x2', '\x2', '\x130', 
		'\x12E', '\x3', '\x2', '\x2', '\x2', '\x130', '\x131', '\x3', '\x2', '\x2', 
		'\x2', '\x131', '\x132', '\x3', '\x2', '\x2', '\x2', '\x132', '\x134', 
		'\a', '\x30', '\x2', '\x2', '\x133', '\x135', '\t', '\x2', '\x2', '\x2', 
		'\x134', '\x133', '\x3', '\x2', '\x2', '\x2', '\x135', '\x136', '\x3', 
		'\x2', '\x2', '\x2', '\x136', '\x134', '\x3', '\x2', '\x2', '\x2', '\x136', 
		'\x137', '\x3', '\x2', '\x2', '\x2', '\x137', 'h', '\x3', '\x2', '\x2', 
		'\x2', '\x138', '\x13C', '\t', '\x3', '\x2', '\x2', '\x139', '\x13B', 
		'\t', '\x4', '\x2', '\x2', '\x13A', '\x139', '\x3', '\x2', '\x2', '\x2', 
		'\x13B', '\x13E', '\x3', '\x2', '\x2', '\x2', '\x13C', '\x13A', '\x3', 
		'\x2', '\x2', '\x2', '\x13C', '\x13D', '\x3', '\x2', '\x2', '\x2', '\x13D', 
		'j', '\x3', '\x2', '\x2', '\x2', '\x13E', '\x13C', '\x3', '\x2', '\x2', 
		'\x2', '\x13F', '\x144', '\a', '$', '\x2', '\x2', '\x140', '\x143', '\x5', 
		'm', '\x37', '\x2', '\x141', '\x143', '\n', '\x5', '\x2', '\x2', '\x142', 
		'\x140', '\x3', '\x2', '\x2', '\x2', '\x142', '\x141', '\x3', '\x2', '\x2', 
		'\x2', '\x143', '\x146', '\x3', '\x2', '\x2', '\x2', '\x144', '\x142', 
		'\x3', '\x2', '\x2', '\x2', '\x144', '\x145', '\x3', '\x2', '\x2', '\x2', 
		'\x145', '\x147', '\x3', '\x2', '\x2', '\x2', '\x146', '\x144', '\x3', 
		'\x2', '\x2', '\x2', '\x147', '\x148', '\a', '$', '\x2', '\x2', '\x148', 
		'l', '\x3', '\x2', '\x2', '\x2', '\x149', '\x14C', '\a', '^', '\x2', '\x2', 
		'\x14A', '\x14D', '\t', '\x6', '\x2', '\x2', '\x14B', '\x14D', '\x5', 
		'o', '\x38', '\x2', '\x14C', '\x14A', '\x3', '\x2', '\x2', '\x2', '\x14C', 
		'\x14B', '\x3', '\x2', '\x2', '\x2', '\x14D', 'n', '\x3', '\x2', '\x2', 
		'\x2', '\x14E', '\x14F', '\a', 'w', '\x2', '\x2', '\x14F', '\x150', '\x5', 
		'q', '\x39', '\x2', '\x150', '\x151', '\x5', 'q', '\x39', '\x2', '\x151', 
		'\x152', '\x5', 'q', '\x39', '\x2', '\x152', '\x153', '\x5', 'q', '\x39', 
		'\x2', '\x153', 'p', '\x3', '\x2', '\x2', '\x2', '\x154', '\x155', '\t', 
		'\a', '\x2', '\x2', '\x155', 'r', '\x3', '\x2', '\x2', '\x2', '\x156', 
		'\x158', '\t', '\b', '\x2', '\x2', '\x157', '\x156', '\x3', '\x2', '\x2', 
		'\x2', '\x158', '\x159', '\x3', '\x2', '\x2', '\x2', '\x159', '\x157', 
		'\x3', '\x2', '\x2', '\x2', '\x159', '\x15A', '\x3', '\x2', '\x2', '\x2', 
		'\x15A', '\x15B', '\x3', '\x2', '\x2', '\x2', '\x15B', '\x15C', '\b', 
		':', '\x2', '\x2', '\x15C', 't', '\x3', '\x2', '\x2', '\x2', '\x15D', 
		'\x15E', '\a', '\x31', '\x2', '\x2', '\x15E', '\x15F', '\a', '\x31', '\x2', 
		'\x2', '\x15F', '\x163', '\x3', '\x2', '\x2', '\x2', '\x160', '\x162', 
		'\n', '\t', '\x2', '\x2', '\x161', '\x160', '\x3', '\x2', '\x2', '\x2', 
		'\x162', '\x165', '\x3', '\x2', '\x2', '\x2', '\x163', '\x161', '\x3', 
		'\x2', '\x2', '\x2', '\x163', '\x164', '\x3', '\x2', '\x2', '\x2', '\x164', 
		'\x166', '\x3', '\x2', '\x2', '\x2', '\x165', '\x163', '\x3', '\x2', '\x2', 
		'\x2', '\x166', '\x167', '\b', ';', '\x3', '\x2', '\x167', 'v', '\x3', 
		'\x2', '\x2', '\x2', '\f', '\x2', '\x12B', '\x130', '\x136', '\x13C', 
		'\x142', '\x144', '\x14C', '\x159', '\x163', '\x4', '\x2', '\x3', '\x2', 
		'\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
