//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.8
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from c:\Users\noobs\Documents\Github\P4-Emotional-Damage\Compiler\EmotionalDamage2\EmotionalDamage.g4 by ANTLR 4.8

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

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, Inum=45, Fnum=46, 
		IDENTIFIER=47, STRING_CONSTANT=48, WS=49;
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
		"T__41", "T__42", "T__43", "Inum", "Fnum", "IDENTIFIER", "STRING_CONSTANT", 
		"ESC", "UNICODE", "HEX", "WS"
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
		"'return'", "'++'", "'--'", "'T'", "'while'", "'for'", "'if'", "'elif'", 
		"'else'", "'sqrt'", "'**'", "'%'", "'*'", "'/'", "'+'", "'-'", "'\\\\'", 
		"'.row'", "'.col'", "'.len'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
		"'true'", "'false'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "Inum", "Fnum", 
		"IDENTIFIER", "STRING_CONSTANT", "WS"
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
		'\x5964', '\x2', '\x33', '\x140', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
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
		'\x4', '\x35', '\t', '\x35', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', 
		'\x3', '\x2', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', 
		'\x3', '\x3', '\x3', '\x3', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', 
		'\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x6', '\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x3', 
		'\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\t', 
		'\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', 
		'\t', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', 
		'\x3', '\v', '\x3', '\v', '\x3', '\f', '\x3', '\f', '\x3', '\r', '\x3', 
		'\r', '\x3', '\xE', '\x3', '\xE', '\x3', '\xF', '\x3', '\xF', '\x3', '\x10', 
		'\x3', '\x10', '\x3', '\x11', '\x3', '\x11', '\x3', '\x12', '\x3', '\x12', 
		'\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', 
		'\x3', '\x13', '\x3', '\x13', '\x3', '\x13', '\x3', '\x14', '\x3', '\x14', 
		'\x3', '\x14', '\x3', '\x15', '\x3', '\x15', '\x3', '\x16', '\x3', '\x16', 
		'\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x17', 
		'\x3', '\x17', '\x3', '\x17', '\x3', '\x17', '\x3', '\x18', '\x3', '\x18', 
		'\x3', '\x18', '\x3', '\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x19', 
		'\x3', '\x19', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', 
		'\x3', '\x1A', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', 
		'\x3', '\x1B', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1D', 
		'\x3', '\x1D', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1F', '\x3', '\x1F', 
		'\x3', ' ', '\x3', ' ', '\x3', '!', '\x3', '!', '\x3', '\"', '\x3', '\"', 
		'\x3', '\"', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', '\x3', '#', 
		'\x3', '$', '\x3', '$', '\x3', '$', '\x3', '$', '\x3', '$', '\x3', '%', 
		'\x3', '%', '\x3', '%', '\x3', '%', '\x3', '%', '\x3', '&', '\x3', '&', 
		'\x3', '\'', '\x3', '\'', '\x3', '(', '\x3', '(', '\x3', '(', '\x3', ')', 
		'\x3', ')', '\x3', ')', '\x3', '*', '\x3', '*', '\x3', '*', '\x3', '+', 
		'\x3', '+', '\x3', '+', '\x3', ',', '\x3', ',', '\x3', ',', '\x3', ',', 
		'\x3', ',', '\x3', '-', '\x3', '-', '\x3', '-', '\x3', '-', '\x3', '-', 
		'\x3', '-', '\x3', '.', '\x6', '.', '\x10D', '\n', '.', '\r', '.', '\xE', 
		'.', '\x10E', '\x3', '/', '\x6', '/', '\x112', '\n', '/', '\r', '/', '\xE', 
		'/', '\x113', '\x3', '/', '\x3', '/', '\x6', '/', '\x118', '\n', '/', 
		'\r', '/', '\xE', '/', '\x119', '\x3', '\x30', '\x3', '\x30', '\a', '\x30', 
		'\x11E', '\n', '\x30', '\f', '\x30', '\xE', '\x30', '\x121', '\v', '\x30', 
		'\x3', '\x31', '\x3', '\x31', '\x3', '\x31', '\a', '\x31', '\x126', '\n', 
		'\x31', '\f', '\x31', '\xE', '\x31', '\x129', '\v', '\x31', '\x3', '\x31', 
		'\x3', '\x31', '\x3', '\x32', '\x3', '\x32', '\x3', '\x32', '\x5', '\x32', 
		'\x130', '\n', '\x32', '\x3', '\x33', '\x3', '\x33', '\x3', '\x33', '\x3', 
		'\x33', '\x3', '\x33', '\x3', '\x33', '\x3', '\x34', '\x3', '\x34', '\x3', 
		'\x35', '\x6', '\x35', '\x13B', '\n', '\x35', '\r', '\x35', '\xE', '\x35', 
		'\x13C', '\x3', '\x35', '\x3', '\x35', '\x2', '\x2', '\x36', '\x3', '\x3', 
		'\x5', '\x4', '\a', '\x5', '\t', '\x6', '\v', '\a', '\r', '\b', '\xF', 
		'\t', '\x11', '\n', '\x13', '\v', '\x15', '\f', '\x17', '\r', '\x19', 
		'\xE', '\x1B', '\xF', '\x1D', '\x10', '\x1F', '\x11', '!', '\x12', '#', 
		'\x13', '%', '\x14', '\'', '\x15', ')', '\x16', '+', '\x17', '-', '\x18', 
		'/', '\x19', '\x31', '\x1A', '\x33', '\x1B', '\x35', '\x1C', '\x37', '\x1D', 
		'\x39', '\x1E', ';', '\x1F', '=', ' ', '?', '!', '\x41', '\"', '\x43', 
		'#', '\x45', '$', 'G', '%', 'I', '&', 'K', '\'', 'M', '(', 'O', ')', 'Q', 
		'*', 'S', '+', 'U', ',', 'W', '-', 'Y', '.', '[', '/', ']', '\x30', '_', 
		'\x31', '\x61', '\x32', '\x63', '\x2', '\x65', '\x2', 'g', '\x2', 'i', 
		'\x33', '\x3', '\x2', '\t', '\x3', '\x2', '\x32', ';', '\x5', '\x2', '\x43', 
		'\\', '\x61', '\x61', '\x63', '|', '\x6', '\x2', '\x32', ';', '\x43', 
		'\\', '\x61', '\x61', '\x63', '|', '\x4', '\x2', '$', '$', '^', '^', '\n', 
		'\x2', '$', '$', '\x31', '\x31', '^', '^', '\x64', '\x64', 'h', 'h', 'p', 
		'p', 't', 't', 'v', 'v', '\x5', '\x2', '\x32', ';', '\x43', 'H', '\x63', 
		'h', '\x5', '\x2', '\v', '\f', '\xF', '\xF', '\"', '\"', '\x2', '\x144', 
		'\x2', '\x3', '\x3', '\x2', '\x2', '\x2', '\x2', '\x5', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', '\r', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x11', '\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x19', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x1B', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1D', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x1F', '\x3', '\x2', '\x2', '\x2', '\x2', '!', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '#', '\x3', '\x2', '\x2', '\x2', '\x2', '%', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\'', '\x3', '\x2', '\x2', '\x2', '\x2', 
		')', '\x3', '\x2', '\x2', '\x2', '\x2', '+', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '-', '\x3', '\x2', '\x2', '\x2', '\x2', '/', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x31', '\x3', '\x2', '\x2', '\x2', '\x2', '\x33', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x35', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x37', '\x3', '\x2', '\x2', '\x2', '\x2', '\x39', '\x3', '\x2', '\x2', 
		'\x2', '\x2', ';', '\x3', '\x2', '\x2', '\x2', '\x2', '=', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '?', '\x3', '\x2', '\x2', '\x2', '\x2', '\x41', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x43', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x45', '\x3', '\x2', '\x2', '\x2', '\x2', 'G', '\x3', '\x2', '\x2', '\x2', 
		'\x2', 'I', '\x3', '\x2', '\x2', '\x2', '\x2', 'K', '\x3', '\x2', '\x2', 
		'\x2', '\x2', 'M', '\x3', '\x2', '\x2', '\x2', '\x2', 'O', '\x3', '\x2', 
		'\x2', '\x2', '\x2', 'Q', '\x3', '\x2', '\x2', '\x2', '\x2', 'S', '\x3', 
		'\x2', '\x2', '\x2', '\x2', 'U', '\x3', '\x2', '\x2', '\x2', '\x2', 'W', 
		'\x3', '\x2', '\x2', '\x2', '\x2', 'Y', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'[', '\x3', '\x2', '\x2', '\x2', '\x2', ']', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '_', '\x3', '\x2', '\x2', '\x2', '\x2', '\x61', '\x3', '\x2', '\x2', 
		'\x2', '\x2', 'i', '\x3', '\x2', '\x2', '\x2', '\x3', 'k', '\x3', '\x2', 
		'\x2', '\x2', '\x5', 'o', '\x3', '\x2', '\x2', '\x2', '\a', 'u', '\x3', 
		'\x2', '\x2', '\x2', '\t', '{', '\x3', '\x2', '\x2', '\x2', '\v', '\x83', 
		'\x3', '\x2', '\x2', '\x2', '\r', '\x85', '\x3', '\x2', '\x2', '\x2', 
		'\xF', '\x87', '\x3', '\x2', '\x2', '\x2', '\x11', '\x8C', '\x3', '\x2', 
		'\x2', '\x2', '\x13', '\x93', '\x3', '\x2', '\x2', '\x2', '\x15', '\x98', 
		'\x3', '\x2', '\x2', '\x2', '\x17', '\x9A', '\x3', '\x2', '\x2', '\x2', 
		'\x19', '\x9C', '\x3', '\x2', '\x2', '\x2', '\x1B', '\x9E', '\x3', '\x2', 
		'\x2', '\x2', '\x1D', '\xA0', '\x3', '\x2', '\x2', '\x2', '\x1F', '\xA2', 
		'\x3', '\x2', '\x2', '\x2', '!', '\xA4', '\x3', '\x2', '\x2', '\x2', '#', 
		'\xA6', '\x3', '\x2', '\x2', '\x2', '%', '\xAD', '\x3', '\x2', '\x2', 
		'\x2', '\'', '\xB0', '\x3', '\x2', '\x2', '\x2', ')', '\xB3', '\x3', '\x2', 
		'\x2', '\x2', '+', '\xB5', '\x3', '\x2', '\x2', '\x2', '-', '\xBB', '\x3', 
		'\x2', '\x2', '\x2', '/', '\xBF', '\x3', '\x2', '\x2', '\x2', '\x31', 
		'\xC2', '\x3', '\x2', '\x2', '\x2', '\x33', '\xC7', '\x3', '\x2', '\x2', 
		'\x2', '\x35', '\xCC', '\x3', '\x2', '\x2', '\x2', '\x37', '\xD1', '\x3', 
		'\x2', '\x2', '\x2', '\x39', '\xD4', '\x3', '\x2', '\x2', '\x2', ';', 
		'\xD6', '\x3', '\x2', '\x2', '\x2', '=', '\xD8', '\x3', '\x2', '\x2', 
		'\x2', '?', '\xDA', '\x3', '\x2', '\x2', '\x2', '\x41', '\xDC', '\x3', 
		'\x2', '\x2', '\x2', '\x43', '\xDE', '\x3', '\x2', '\x2', '\x2', '\x45', 
		'\xE1', '\x3', '\x2', '\x2', '\x2', 'G', '\xE6', '\x3', '\x2', '\x2', 
		'\x2', 'I', '\xEB', '\x3', '\x2', '\x2', '\x2', 'K', '\xF0', '\x3', '\x2', 
		'\x2', '\x2', 'M', '\xF2', '\x3', '\x2', '\x2', '\x2', 'O', '\xF4', '\x3', 
		'\x2', '\x2', '\x2', 'Q', '\xF7', '\x3', '\x2', '\x2', '\x2', 'S', '\xFA', 
		'\x3', '\x2', '\x2', '\x2', 'U', '\xFD', '\x3', '\x2', '\x2', '\x2', 'W', 
		'\x100', '\x3', '\x2', '\x2', '\x2', 'Y', '\x105', '\x3', '\x2', '\x2', 
		'\x2', '[', '\x10C', '\x3', '\x2', '\x2', '\x2', ']', '\x111', '\x3', 
		'\x2', '\x2', '\x2', '_', '\x11B', '\x3', '\x2', '\x2', '\x2', '\x61', 
		'\x122', '\x3', '\x2', '\x2', '\x2', '\x63', '\x12C', '\x3', '\x2', '\x2', 
		'\x2', '\x65', '\x131', '\x3', '\x2', '\x2', '\x2', 'g', '\x137', '\x3', 
		'\x2', '\x2', '\x2', 'i', '\x13A', '\x3', '\x2', '\x2', '\x2', 'k', 'l', 
		'\a', 'k', '\x2', '\x2', 'l', 'm', '\a', 'p', '\x2', '\x2', 'm', 'n', 
		'\a', 'v', '\x2', '\x2', 'n', '\x4', '\x3', '\x2', '\x2', '\x2', 'o', 
		'p', '\a', 'h', '\x2', '\x2', 'p', 'q', '\a', 'n', '\x2', '\x2', 'q', 
		'r', '\a', 'q', '\x2', '\x2', 'r', 's', '\a', '\x63', '\x2', '\x2', 's', 
		't', '\a', 'v', '\x2', '\x2', 't', '\x6', '\x3', '\x2', '\x2', '\x2', 
		'u', 'v', '\a', 'r', '\x2', '\x2', 'v', 'w', '\a', 't', '\x2', '\x2', 
		'w', 'x', '\a', 'k', '\x2', '\x2', 'x', 'y', '\a', 'p', '\x2', '\x2', 
		'y', 'z', '\a', 'v', '\x2', '\x2', 'z', '\b', '\x3', '\x2', '\x2', '\x2', 
		'{', '|', '\a', 'r', '\x2', '\x2', '|', '}', '\a', 't', '\x2', '\x2', 
		'}', '~', '\a', 'k', '\x2', '\x2', '~', '\x7F', '\a', 'p', '\x2', '\x2', 
		'\x7F', '\x80', '\a', 'v', '\x2', '\x2', '\x80', '\x81', '\a', 'n', '\x2', 
		'\x2', '\x81', '\x82', '\a', 'p', '\x2', '\x2', '\x82', '\n', '\x3', '\x2', 
		'\x2', '\x2', '\x83', '\x84', '\a', ']', '\x2', '\x2', '\x84', '\f', '\x3', 
		'\x2', '\x2', '\x2', '\x85', '\x86', '\a', '_', '\x2', '\x2', '\x86', 
		'\xE', '\x3', '\x2', '\x2', '\x2', '\x87', '\x88', '\a', '\x64', '\x2', 
		'\x2', '\x88', '\x89', '\a', 'q', '\x2', '\x2', '\x89', '\x8A', '\a', 
		'q', '\x2', '\x2', '\x8A', '\x8B', '\a', 'n', '\x2', '\x2', '\x8B', '\x10', 
		'\x3', '\x2', '\x2', '\x2', '\x8C', '\x8D', '\a', 'u', '\x2', '\x2', '\x8D', 
		'\x8E', '\a', 'v', '\x2', '\x2', '\x8E', '\x8F', '\a', 't', '\x2', '\x2', 
		'\x8F', '\x90', '\a', 'k', '\x2', '\x2', '\x90', '\x91', '\a', 'p', '\x2', 
		'\x2', '\x91', '\x92', '\a', 'i', '\x2', '\x2', '\x92', '\x12', '\x3', 
		'\x2', '\x2', '\x2', '\x93', '\x94', '\a', 'x', '\x2', '\x2', '\x94', 
		'\x95', '\a', 'q', '\x2', '\x2', '\x95', '\x96', '\a', 'k', '\x2', '\x2', 
		'\x96', '\x97', '\a', '\x66', '\x2', '\x2', '\x97', '\x14', '\x3', '\x2', 
		'\x2', '\x2', '\x98', '\x99', '\a', '*', '\x2', '\x2', '\x99', '\x16', 
		'\x3', '\x2', '\x2', '\x2', '\x9A', '\x9B', '\a', '.', '\x2', '\x2', '\x9B', 
		'\x18', '\x3', '\x2', '\x2', '\x2', '\x9C', '\x9D', '\a', '+', '\x2', 
		'\x2', '\x9D', '\x1A', '\x3', '\x2', '\x2', '\x2', '\x9E', '\x9F', '\a', 
		'}', '\x2', '\x2', '\x9F', '\x1C', '\x3', '\x2', '\x2', '\x2', '\xA0', 
		'\xA1', '\a', '\x7F', '\x2', '\x2', '\xA1', '\x1E', '\x3', '\x2', '\x2', 
		'\x2', '\xA2', '\xA3', '\a', '=', '\x2', '\x2', '\xA3', ' ', '\x3', '\x2', 
		'\x2', '\x2', '\xA4', '\xA5', '\a', '?', '\x2', '\x2', '\xA5', '\"', '\x3', 
		'\x2', '\x2', '\x2', '\xA6', '\xA7', '\a', 't', '\x2', '\x2', '\xA7', 
		'\xA8', '\a', 'g', '\x2', '\x2', '\xA8', '\xA9', '\a', 'v', '\x2', '\x2', 
		'\xA9', '\xAA', '\a', 'w', '\x2', '\x2', '\xAA', '\xAB', '\a', 't', '\x2', 
		'\x2', '\xAB', '\xAC', '\a', 'p', '\x2', '\x2', '\xAC', '$', '\x3', '\x2', 
		'\x2', '\x2', '\xAD', '\xAE', '\a', '-', '\x2', '\x2', '\xAE', '\xAF', 
		'\a', '-', '\x2', '\x2', '\xAF', '&', '\x3', '\x2', '\x2', '\x2', '\xB0', 
		'\xB1', '\a', '/', '\x2', '\x2', '\xB1', '\xB2', '\a', '/', '\x2', '\x2', 
		'\xB2', '(', '\x3', '\x2', '\x2', '\x2', '\xB3', '\xB4', '\a', 'V', '\x2', 
		'\x2', '\xB4', '*', '\x3', '\x2', '\x2', '\x2', '\xB5', '\xB6', '\a', 
		'y', '\x2', '\x2', '\xB6', '\xB7', '\a', 'j', '\x2', '\x2', '\xB7', '\xB8', 
		'\a', 'k', '\x2', '\x2', '\xB8', '\xB9', '\a', 'n', '\x2', '\x2', '\xB9', 
		'\xBA', '\a', 'g', '\x2', '\x2', '\xBA', ',', '\x3', '\x2', '\x2', '\x2', 
		'\xBB', '\xBC', '\a', 'h', '\x2', '\x2', '\xBC', '\xBD', '\a', 'q', '\x2', 
		'\x2', '\xBD', '\xBE', '\a', 't', '\x2', '\x2', '\xBE', '.', '\x3', '\x2', 
		'\x2', '\x2', '\xBF', '\xC0', '\a', 'k', '\x2', '\x2', '\xC0', '\xC1', 
		'\a', 'h', '\x2', '\x2', '\xC1', '\x30', '\x3', '\x2', '\x2', '\x2', '\xC2', 
		'\xC3', '\a', 'g', '\x2', '\x2', '\xC3', '\xC4', '\a', 'n', '\x2', '\x2', 
		'\xC4', '\xC5', '\a', 'k', '\x2', '\x2', '\xC5', '\xC6', '\a', 'h', '\x2', 
		'\x2', '\xC6', '\x32', '\x3', '\x2', '\x2', '\x2', '\xC7', '\xC8', '\a', 
		'g', '\x2', '\x2', '\xC8', '\xC9', '\a', 'n', '\x2', '\x2', '\xC9', '\xCA', 
		'\a', 'u', '\x2', '\x2', '\xCA', '\xCB', '\a', 'g', '\x2', '\x2', '\xCB', 
		'\x34', '\x3', '\x2', '\x2', '\x2', '\xCC', '\xCD', '\a', 'u', '\x2', 
		'\x2', '\xCD', '\xCE', '\a', 's', '\x2', '\x2', '\xCE', '\xCF', '\a', 
		't', '\x2', '\x2', '\xCF', '\xD0', '\a', 'v', '\x2', '\x2', '\xD0', '\x36', 
		'\x3', '\x2', '\x2', '\x2', '\xD1', '\xD2', '\a', ',', '\x2', '\x2', '\xD2', 
		'\xD3', '\a', ',', '\x2', '\x2', '\xD3', '\x38', '\x3', '\x2', '\x2', 
		'\x2', '\xD4', '\xD5', '\a', '\'', '\x2', '\x2', '\xD5', ':', '\x3', '\x2', 
		'\x2', '\x2', '\xD6', '\xD7', '\a', ',', '\x2', '\x2', '\xD7', '<', '\x3', 
		'\x2', '\x2', '\x2', '\xD8', '\xD9', '\a', '\x31', '\x2', '\x2', '\xD9', 
		'>', '\x3', '\x2', '\x2', '\x2', '\xDA', '\xDB', '\a', '-', '\x2', '\x2', 
		'\xDB', '@', '\x3', '\x2', '\x2', '\x2', '\xDC', '\xDD', '\a', '/', '\x2', 
		'\x2', '\xDD', '\x42', '\x3', '\x2', '\x2', '\x2', '\xDE', '\xDF', '\a', 
		'^', '\x2', '\x2', '\xDF', '\xE0', '\a', '^', '\x2', '\x2', '\xE0', '\x44', 
		'\x3', '\x2', '\x2', '\x2', '\xE1', '\xE2', '\a', '\x30', '\x2', '\x2', 
		'\xE2', '\xE3', '\a', 't', '\x2', '\x2', '\xE3', '\xE4', '\a', 'q', '\x2', 
		'\x2', '\xE4', '\xE5', '\a', 'y', '\x2', '\x2', '\xE5', '\x46', '\x3', 
		'\x2', '\x2', '\x2', '\xE6', '\xE7', '\a', '\x30', '\x2', '\x2', '\xE7', 
		'\xE8', '\a', '\x65', '\x2', '\x2', '\xE8', '\xE9', '\a', 'q', '\x2', 
		'\x2', '\xE9', '\xEA', '\a', 'n', '\x2', '\x2', '\xEA', 'H', '\x3', '\x2', 
		'\x2', '\x2', '\xEB', '\xEC', '\a', '\x30', '\x2', '\x2', '\xEC', '\xED', 
		'\a', 'n', '\x2', '\x2', '\xED', '\xEE', '\a', 'g', '\x2', '\x2', '\xEE', 
		'\xEF', '\a', 'p', '\x2', '\x2', '\xEF', 'J', '\x3', '\x2', '\x2', '\x2', 
		'\xF0', '\xF1', '\a', '@', '\x2', '\x2', '\xF1', 'L', '\x3', '\x2', '\x2', 
		'\x2', '\xF2', '\xF3', '\a', '>', '\x2', '\x2', '\xF3', 'N', '\x3', '\x2', 
		'\x2', '\x2', '\xF4', '\xF5', '\a', '@', '\x2', '\x2', '\xF5', '\xF6', 
		'\a', '?', '\x2', '\x2', '\xF6', 'P', '\x3', '\x2', '\x2', '\x2', '\xF7', 
		'\xF8', '\a', '>', '\x2', '\x2', '\xF8', '\xF9', '\a', '?', '\x2', '\x2', 
		'\xF9', 'R', '\x3', '\x2', '\x2', '\x2', '\xFA', '\xFB', '\a', '?', '\x2', 
		'\x2', '\xFB', '\xFC', '\a', '?', '\x2', '\x2', '\xFC', 'T', '\x3', '\x2', 
		'\x2', '\x2', '\xFD', '\xFE', '\a', '#', '\x2', '\x2', '\xFE', '\xFF', 
		'\a', '?', '\x2', '\x2', '\xFF', 'V', '\x3', '\x2', '\x2', '\x2', '\x100', 
		'\x101', '\a', 'v', '\x2', '\x2', '\x101', '\x102', '\a', 't', '\x2', 
		'\x2', '\x102', '\x103', '\a', 'w', '\x2', '\x2', '\x103', '\x104', '\a', 
		'g', '\x2', '\x2', '\x104', 'X', '\x3', '\x2', '\x2', '\x2', '\x105', 
		'\x106', '\a', 'h', '\x2', '\x2', '\x106', '\x107', '\a', '\x63', '\x2', 
		'\x2', '\x107', '\x108', '\a', 'n', '\x2', '\x2', '\x108', '\x109', '\a', 
		'u', '\x2', '\x2', '\x109', '\x10A', '\a', 'g', '\x2', '\x2', '\x10A', 
		'Z', '\x3', '\x2', '\x2', '\x2', '\x10B', '\x10D', '\t', '\x2', '\x2', 
		'\x2', '\x10C', '\x10B', '\x3', '\x2', '\x2', '\x2', '\x10D', '\x10E', 
		'\x3', '\x2', '\x2', '\x2', '\x10E', '\x10C', '\x3', '\x2', '\x2', '\x2', 
		'\x10E', '\x10F', '\x3', '\x2', '\x2', '\x2', '\x10F', '\\', '\x3', '\x2', 
		'\x2', '\x2', '\x110', '\x112', '\t', '\x2', '\x2', '\x2', '\x111', '\x110', 
		'\x3', '\x2', '\x2', '\x2', '\x112', '\x113', '\x3', '\x2', '\x2', '\x2', 
		'\x113', '\x111', '\x3', '\x2', '\x2', '\x2', '\x113', '\x114', '\x3', 
		'\x2', '\x2', '\x2', '\x114', '\x115', '\x3', '\x2', '\x2', '\x2', '\x115', 
		'\x117', '\a', '\x30', '\x2', '\x2', '\x116', '\x118', '\t', '\x2', '\x2', 
		'\x2', '\x117', '\x116', '\x3', '\x2', '\x2', '\x2', '\x118', '\x119', 
		'\x3', '\x2', '\x2', '\x2', '\x119', '\x117', '\x3', '\x2', '\x2', '\x2', 
		'\x119', '\x11A', '\x3', '\x2', '\x2', '\x2', '\x11A', '^', '\x3', '\x2', 
		'\x2', '\x2', '\x11B', '\x11F', '\t', '\x3', '\x2', '\x2', '\x11C', '\x11E', 
		'\t', '\x4', '\x2', '\x2', '\x11D', '\x11C', '\x3', '\x2', '\x2', '\x2', 
		'\x11E', '\x121', '\x3', '\x2', '\x2', '\x2', '\x11F', '\x11D', '\x3', 
		'\x2', '\x2', '\x2', '\x11F', '\x120', '\x3', '\x2', '\x2', '\x2', '\x120', 
		'`', '\x3', '\x2', '\x2', '\x2', '\x121', '\x11F', '\x3', '\x2', '\x2', 
		'\x2', '\x122', '\x127', '\a', '$', '\x2', '\x2', '\x123', '\x126', '\x5', 
		'\x63', '\x32', '\x2', '\x124', '\x126', '\n', '\x5', '\x2', '\x2', '\x125', 
		'\x123', '\x3', '\x2', '\x2', '\x2', '\x125', '\x124', '\x3', '\x2', '\x2', 
		'\x2', '\x126', '\x129', '\x3', '\x2', '\x2', '\x2', '\x127', '\x125', 
		'\x3', '\x2', '\x2', '\x2', '\x127', '\x128', '\x3', '\x2', '\x2', '\x2', 
		'\x128', '\x12A', '\x3', '\x2', '\x2', '\x2', '\x129', '\x127', '\x3', 
		'\x2', '\x2', '\x2', '\x12A', '\x12B', '\a', '$', '\x2', '\x2', '\x12B', 
		'\x62', '\x3', '\x2', '\x2', '\x2', '\x12C', '\x12F', '\a', '^', '\x2', 
		'\x2', '\x12D', '\x130', '\t', '\x6', '\x2', '\x2', '\x12E', '\x130', 
		'\x5', '\x65', '\x33', '\x2', '\x12F', '\x12D', '\x3', '\x2', '\x2', '\x2', 
		'\x12F', '\x12E', '\x3', '\x2', '\x2', '\x2', '\x130', '\x64', '\x3', 
		'\x2', '\x2', '\x2', '\x131', '\x132', '\a', 'w', '\x2', '\x2', '\x132', 
		'\x133', '\x5', 'g', '\x34', '\x2', '\x133', '\x134', '\x5', 'g', '\x34', 
		'\x2', '\x134', '\x135', '\x5', 'g', '\x34', '\x2', '\x135', '\x136', 
		'\x5', 'g', '\x34', '\x2', '\x136', '\x66', '\x3', '\x2', '\x2', '\x2', 
		'\x137', '\x138', '\t', '\a', '\x2', '\x2', '\x138', 'h', '\x3', '\x2', 
		'\x2', '\x2', '\x139', '\x13B', '\t', '\b', '\x2', '\x2', '\x13A', '\x139', 
		'\x3', '\x2', '\x2', '\x2', '\x13B', '\x13C', '\x3', '\x2', '\x2', '\x2', 
		'\x13C', '\x13A', '\x3', '\x2', '\x2', '\x2', '\x13C', '\x13D', '\x3', 
		'\x2', '\x2', '\x2', '\x13D', '\x13E', '\x3', '\x2', '\x2', '\x2', '\x13E', 
		'\x13F', '\b', '\x35', '\x2', '\x2', '\x13F', 'j', '\x3', '\x2', '\x2', 
		'\x2', '\v', '\x2', '\x10E', '\x113', '\x119', '\x11F', '\x125', '\x127', 
		'\x12F', '\x13C', '\x3', '\x2', '\x3', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
