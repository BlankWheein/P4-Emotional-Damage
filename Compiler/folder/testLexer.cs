//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.8
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from c:\Users\noobs\OneDrive\Documents\GitHub\P4-Emotional-Damage\Compiler\folder\test.g4 by ANTLR 4.8

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
public partial class testLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, Inum=29, Fnum=30, Dnum=31, String=32, 
		ID=33, WHITESPACE=34, NEWLINE=35;
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
		"T__25", "T__26", "T__27", "Inum", "Fnum", "Dnum", "String", "ID", "WHITESPACE", 
		"NEWLINE"
	};


	public testLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public testLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "';'", "'='", "','", "'('", "')'", "'sqrt'", "'%'", "'**'", "'*'", 
		"'/'", "'+'", "'-'", "'++'", "'--'", "'if'", "'{'", "'}'", "'elif'", "'else'", 
		"'for'", "'>'", "'<'", "'!'", "'Print'", "'dummy'", "'int'", "'float'", 
		"'double'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "Inum", "Fnum", "Dnum", "String", "ID", 
		"WHITESPACE", "NEWLINE"
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

	public override string GrammarFileName { get { return "test.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static testLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '%', '\xDF', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
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
		'#', '\t', '#', '\x4', '$', '\t', '$', '\x3', '\x2', '\x3', '\x2', '\x3', 
		'\x3', '\x3', '\x3', '\x3', '\x4', '\x3', '\x4', '\x3', '\x5', '\x3', 
		'\x5', '\x3', '\x6', '\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x3', '\a', 
		'\x3', '\a', '\x3', '\a', '\x3', '\b', '\x3', '\b', '\x3', '\t', '\x3', 
		'\t', '\x3', '\t', '\x3', '\n', '\x3', '\n', '\x3', '\v', '\x3', '\v', 
		'\x3', '\f', '\x3', '\f', '\x3', '\r', '\x3', '\r', '\x3', '\xE', '\x3', 
		'\xE', '\x3', '\xE', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', '\x3', 
		'\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x11', '\x3', '\x11', '\x3', 
		'\x12', '\x3', '\x12', '\x3', '\x13', '\x3', '\x13', '\x3', '\x13', '\x3', 
		'\x13', '\x3', '\x13', '\x3', '\x14', '\x3', '\x14', '\x3', '\x14', '\x3', 
		'\x14', '\x3', '\x14', '\x3', '\x15', '\x3', '\x15', '\x3', '\x15', '\x3', 
		'\x15', '\x3', '\x16', '\x3', '\x16', '\x3', '\x17', '\x3', '\x17', '\x3', 
		'\x18', '\x3', '\x18', '\x3', '\x19', '\x3', '\x19', '\x3', '\x19', '\x3', 
		'\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x1A', '\x3', '\x1A', '\x3', 
		'\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1B', '\x3', 
		'\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1C', '\x3', '\x1C', '\x3', 
		'\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1D', '\x3', 
		'\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', 
		'\x1D', '\x3', '\x1E', '\x6', '\x1E', '\xA5', '\n', '\x1E', '\r', '\x1E', 
		'\xE', '\x1E', '\xA6', '\x3', '\x1F', '\x6', '\x1F', '\xAA', '\n', '\x1F', 
		'\r', '\x1F', '\xE', '\x1F', '\xAB', '\x3', '\x1F', '\x3', '\x1F', '\a', 
		'\x1F', '\xB0', '\n', '\x1F', '\f', '\x1F', '\xE', '\x1F', '\xB3', '\v', 
		'\x1F', '\x3', ' ', '\x6', ' ', '\xB6', '\n', ' ', '\r', ' ', '\xE', ' ', 
		'\xB7', '\x3', ' ', '\x3', ' ', '\a', ' ', '\xBC', '\n', ' ', '\f', ' ', 
		'\xE', ' ', '\xBF', '\v', ' ', '\x3', '!', '\x3', '!', '\a', '!', '\xC3', 
		'\n', '!', '\f', '!', '\xE', '!', '\xC6', '\v', '!', '\x3', '!', '\x3', 
		'!', '\x3', '\"', '\x3', '\"', '\a', '\"', '\xCC', '\n', '\"', '\f', '\"', 
		'\xE', '\"', '\xCF', '\v', '\"', '\x3', '#', '\x6', '#', '\xD2', '\n', 
		'#', '\r', '#', '\xE', '#', '\xD3', '\x3', '#', '\x3', '#', '\x3', '$', 
		'\x5', '$', '\xD9', '\n', '$', '\x3', '$', '\x6', '$', '\xDC', '\n', '$', 
		'\r', '$', '\xE', '$', '\xDD', '\x3', '\xC4', '\x2', '%', '\x3', '\x3', 
		'\x5', '\x4', '\a', '\x5', '\t', '\x6', '\v', '\a', '\r', '\b', '\xF', 
		'\t', '\x11', '\n', '\x13', '\v', '\x15', '\f', '\x17', '\r', '\x19', 
		'\xE', '\x1B', '\xF', '\x1D', '\x10', '\x1F', '\x11', '!', '\x12', '#', 
		'\x13', '%', '\x14', '\'', '\x15', ')', '\x16', '+', '\x17', '-', '\x18', 
		'/', '\x19', '\x31', '\x1A', '\x33', '\x1B', '\x35', '\x1C', '\x37', '\x1D', 
		'\x39', '\x1E', ';', '\x1F', '=', ' ', '?', '!', '\x41', '\"', '\x43', 
		'#', '\x45', '$', 'G', '%', '\x3', '\x2', '\x6', '\x3', '\x2', '\x32', 
		';', '\x5', '\x2', '\x43', '\\', '\x61', '\x61', '\x63', '|', '\x6', '\x2', 
		'\x32', ';', '\x43', '\\', '\x61', '\x61', '\x63', '|', '\x6', '\x2', 
		'\v', '\f', '\xF', '\xF', '\"', '\"', ')', ')', '\x2', '\xE8', '\x2', 
		'\x3', '\x3', '\x2', '\x2', '\x2', '\x2', '\x5', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', '\r', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x11', '\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x19', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x1B', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1D', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x1F', '\x3', '\x2', '\x2', '\x2', '\x2', '!', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '#', '\x3', '\x2', '\x2', '\x2', '\x2', '%', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\'', '\x3', '\x2', '\x2', '\x2', '\x2', ')', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '+', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'-', '\x3', '\x2', '\x2', '\x2', '\x2', '/', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x31', '\x3', '\x2', '\x2', '\x2', '\x2', '\x33', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x35', '\x3', '\x2', '\x2', '\x2', '\x2', '\x37', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x39', '\x3', '\x2', '\x2', '\x2', 
		'\x2', ';', '\x3', '\x2', '\x2', '\x2', '\x2', '=', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '?', '\x3', '\x2', '\x2', '\x2', '\x2', '\x41', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x43', '\x3', '\x2', '\x2', '\x2', '\x2', '\x45', 
		'\x3', '\x2', '\x2', '\x2', '\x2', 'G', '\x3', '\x2', '\x2', '\x2', '\x3', 
		'I', '\x3', '\x2', '\x2', '\x2', '\x5', 'K', '\x3', '\x2', '\x2', '\x2', 
		'\a', 'M', '\x3', '\x2', '\x2', '\x2', '\t', 'O', '\x3', '\x2', '\x2', 
		'\x2', '\v', 'Q', '\x3', '\x2', '\x2', '\x2', '\r', 'S', '\x3', '\x2', 
		'\x2', '\x2', '\xF', 'X', '\x3', '\x2', '\x2', '\x2', '\x11', 'Z', '\x3', 
		'\x2', '\x2', '\x2', '\x13', ']', '\x3', '\x2', '\x2', '\x2', '\x15', 
		'_', '\x3', '\x2', '\x2', '\x2', '\x17', '\x61', '\x3', '\x2', '\x2', 
		'\x2', '\x19', '\x63', '\x3', '\x2', '\x2', '\x2', '\x1B', '\x65', '\x3', 
		'\x2', '\x2', '\x2', '\x1D', 'h', '\x3', '\x2', '\x2', '\x2', '\x1F', 
		'k', '\x3', '\x2', '\x2', '\x2', '!', 'n', '\x3', '\x2', '\x2', '\x2', 
		'#', 'p', '\x3', '\x2', '\x2', '\x2', '%', 'r', '\x3', '\x2', '\x2', '\x2', 
		'\'', 'w', '\x3', '\x2', '\x2', '\x2', ')', '|', '\x3', '\x2', '\x2', 
		'\x2', '+', '\x80', '\x3', '\x2', '\x2', '\x2', '-', '\x82', '\x3', '\x2', 
		'\x2', '\x2', '/', '\x84', '\x3', '\x2', '\x2', '\x2', '\x31', '\x86', 
		'\x3', '\x2', '\x2', '\x2', '\x33', '\x8C', '\x3', '\x2', '\x2', '\x2', 
		'\x35', '\x92', '\x3', '\x2', '\x2', '\x2', '\x37', '\x96', '\x3', '\x2', 
		'\x2', '\x2', '\x39', '\x9C', '\x3', '\x2', '\x2', '\x2', ';', '\xA4', 
		'\x3', '\x2', '\x2', '\x2', '=', '\xA9', '\x3', '\x2', '\x2', '\x2', '?', 
		'\xB5', '\x3', '\x2', '\x2', '\x2', '\x41', '\xC0', '\x3', '\x2', '\x2', 
		'\x2', '\x43', '\xC9', '\x3', '\x2', '\x2', '\x2', '\x45', '\xD1', '\x3', 
		'\x2', '\x2', '\x2', 'G', '\xDB', '\x3', '\x2', '\x2', '\x2', 'I', 'J', 
		'\a', '=', '\x2', '\x2', 'J', '\x4', '\x3', '\x2', '\x2', '\x2', 'K', 
		'L', '\a', '?', '\x2', '\x2', 'L', '\x6', '\x3', '\x2', '\x2', '\x2', 
		'M', 'N', '\a', '.', '\x2', '\x2', 'N', '\b', '\x3', '\x2', '\x2', '\x2', 
		'O', 'P', '\a', '*', '\x2', '\x2', 'P', '\n', '\x3', '\x2', '\x2', '\x2', 
		'Q', 'R', '\a', '+', '\x2', '\x2', 'R', '\f', '\x3', '\x2', '\x2', '\x2', 
		'S', 'T', '\a', 'u', '\x2', '\x2', 'T', 'U', '\a', 's', '\x2', '\x2', 
		'U', 'V', '\a', 't', '\x2', '\x2', 'V', 'W', '\a', 'v', '\x2', '\x2', 
		'W', '\xE', '\x3', '\x2', '\x2', '\x2', 'X', 'Y', '\a', '\'', '\x2', '\x2', 
		'Y', '\x10', '\x3', '\x2', '\x2', '\x2', 'Z', '[', '\a', ',', '\x2', '\x2', 
		'[', '\\', '\a', ',', '\x2', '\x2', '\\', '\x12', '\x3', '\x2', '\x2', 
		'\x2', ']', '^', '\a', ',', '\x2', '\x2', '^', '\x14', '\x3', '\x2', '\x2', 
		'\x2', '_', '`', '\a', '\x31', '\x2', '\x2', '`', '\x16', '\x3', '\x2', 
		'\x2', '\x2', '\x61', '\x62', '\a', '-', '\x2', '\x2', '\x62', '\x18', 
		'\x3', '\x2', '\x2', '\x2', '\x63', '\x64', '\a', '/', '\x2', '\x2', '\x64', 
		'\x1A', '\x3', '\x2', '\x2', '\x2', '\x65', '\x66', '\a', '-', '\x2', 
		'\x2', '\x66', 'g', '\a', '-', '\x2', '\x2', 'g', '\x1C', '\x3', '\x2', 
		'\x2', '\x2', 'h', 'i', '\a', '/', '\x2', '\x2', 'i', 'j', '\a', '/', 
		'\x2', '\x2', 'j', '\x1E', '\x3', '\x2', '\x2', '\x2', 'k', 'l', '\a', 
		'k', '\x2', '\x2', 'l', 'm', '\a', 'h', '\x2', '\x2', 'm', ' ', '\x3', 
		'\x2', '\x2', '\x2', 'n', 'o', '\a', '}', '\x2', '\x2', 'o', '\"', '\x3', 
		'\x2', '\x2', '\x2', 'p', 'q', '\a', '\x7F', '\x2', '\x2', 'q', '$', '\x3', 
		'\x2', '\x2', '\x2', 'r', 's', '\a', 'g', '\x2', '\x2', 's', 't', '\a', 
		'n', '\x2', '\x2', 't', 'u', '\a', 'k', '\x2', '\x2', 'u', 'v', '\a', 
		'h', '\x2', '\x2', 'v', '&', '\x3', '\x2', '\x2', '\x2', 'w', 'x', '\a', 
		'g', '\x2', '\x2', 'x', 'y', '\a', 'n', '\x2', '\x2', 'y', 'z', '\a', 
		'u', '\x2', '\x2', 'z', '{', '\a', 'g', '\x2', '\x2', '{', '(', '\x3', 
		'\x2', '\x2', '\x2', '|', '}', '\a', 'h', '\x2', '\x2', '}', '~', '\a', 
		'q', '\x2', '\x2', '~', '\x7F', '\a', 't', '\x2', '\x2', '\x7F', '*', 
		'\x3', '\x2', '\x2', '\x2', '\x80', '\x81', '\a', '@', '\x2', '\x2', '\x81', 
		',', '\x3', '\x2', '\x2', '\x2', '\x82', '\x83', '\a', '>', '\x2', '\x2', 
		'\x83', '.', '\x3', '\x2', '\x2', '\x2', '\x84', '\x85', '\a', '#', '\x2', 
		'\x2', '\x85', '\x30', '\x3', '\x2', '\x2', '\x2', '\x86', '\x87', '\a', 
		'R', '\x2', '\x2', '\x87', '\x88', '\a', 't', '\x2', '\x2', '\x88', '\x89', 
		'\a', 'k', '\x2', '\x2', '\x89', '\x8A', '\a', 'p', '\x2', '\x2', '\x8A', 
		'\x8B', '\a', 'v', '\x2', '\x2', '\x8B', '\x32', '\x3', '\x2', '\x2', 
		'\x2', '\x8C', '\x8D', '\a', '\x66', '\x2', '\x2', '\x8D', '\x8E', '\a', 
		'w', '\x2', '\x2', '\x8E', '\x8F', '\a', 'o', '\x2', '\x2', '\x8F', '\x90', 
		'\a', 'o', '\x2', '\x2', '\x90', '\x91', '\a', '{', '\x2', '\x2', '\x91', 
		'\x34', '\x3', '\x2', '\x2', '\x2', '\x92', '\x93', '\a', 'k', '\x2', 
		'\x2', '\x93', '\x94', '\a', 'p', '\x2', '\x2', '\x94', '\x95', '\a', 
		'v', '\x2', '\x2', '\x95', '\x36', '\x3', '\x2', '\x2', '\x2', '\x96', 
		'\x97', '\a', 'h', '\x2', '\x2', '\x97', '\x98', '\a', 'n', '\x2', '\x2', 
		'\x98', '\x99', '\a', 'q', '\x2', '\x2', '\x99', '\x9A', '\a', '\x63', 
		'\x2', '\x2', '\x9A', '\x9B', '\a', 'v', '\x2', '\x2', '\x9B', '\x38', 
		'\x3', '\x2', '\x2', '\x2', '\x9C', '\x9D', '\a', '\x66', '\x2', '\x2', 
		'\x9D', '\x9E', '\a', 'q', '\x2', '\x2', '\x9E', '\x9F', '\a', 'w', '\x2', 
		'\x2', '\x9F', '\xA0', '\a', '\x64', '\x2', '\x2', '\xA0', '\xA1', '\a', 
		'n', '\x2', '\x2', '\xA1', '\xA2', '\a', 'g', '\x2', '\x2', '\xA2', ':', 
		'\x3', '\x2', '\x2', '\x2', '\xA3', '\xA5', '\t', '\x2', '\x2', '\x2', 
		'\xA4', '\xA3', '\x3', '\x2', '\x2', '\x2', '\xA5', '\xA6', '\x3', '\x2', 
		'\x2', '\x2', '\xA6', '\xA4', '\x3', '\x2', '\x2', '\x2', '\xA6', '\xA7', 
		'\x3', '\x2', '\x2', '\x2', '\xA7', '<', '\x3', '\x2', '\x2', '\x2', '\xA8', 
		'\xAA', '\t', '\x2', '\x2', '\x2', '\xA9', '\xA8', '\x3', '\x2', '\x2', 
		'\x2', '\xAA', '\xAB', '\x3', '\x2', '\x2', '\x2', '\xAB', '\xA9', '\x3', 
		'\x2', '\x2', '\x2', '\xAB', '\xAC', '\x3', '\x2', '\x2', '\x2', '\xAC', 
		'\xAD', '\x3', '\x2', '\x2', '\x2', '\xAD', '\xB1', '\a', '\x30', '\x2', 
		'\x2', '\xAE', '\xB0', '\t', '\x2', '\x2', '\x2', '\xAF', '\xAE', '\x3', 
		'\x2', '\x2', '\x2', '\xB0', '\xB3', '\x3', '\x2', '\x2', '\x2', '\xB1', 
		'\xAF', '\x3', '\x2', '\x2', '\x2', '\xB1', '\xB2', '\x3', '\x2', '\x2', 
		'\x2', '\xB2', '>', '\x3', '\x2', '\x2', '\x2', '\xB3', '\xB1', '\x3', 
		'\x2', '\x2', '\x2', '\xB4', '\xB6', '\t', '\x2', '\x2', '\x2', '\xB5', 
		'\xB4', '\x3', '\x2', '\x2', '\x2', '\xB6', '\xB7', '\x3', '\x2', '\x2', 
		'\x2', '\xB7', '\xB5', '\x3', '\x2', '\x2', '\x2', '\xB7', '\xB8', '\x3', 
		'\x2', '\x2', '\x2', '\xB8', '\xB9', '\x3', '\x2', '\x2', '\x2', '\xB9', 
		'\xBD', '\a', '\x30', '\x2', '\x2', '\xBA', '\xBC', '\t', '\x2', '\x2', 
		'\x2', '\xBB', '\xBA', '\x3', '\x2', '\x2', '\x2', '\xBC', '\xBF', '\x3', 
		'\x2', '\x2', '\x2', '\xBD', '\xBB', '\x3', '\x2', '\x2', '\x2', '\xBD', 
		'\xBE', '\x3', '\x2', '\x2', '\x2', '\xBE', '@', '\x3', '\x2', '\x2', 
		'\x2', '\xBF', '\xBD', '\x3', '\x2', '\x2', '\x2', '\xC0', '\xC4', '\a', 
		'$', '\x2', '\x2', '\xC1', '\xC3', '\v', '\x2', '\x2', '\x2', '\xC2', 
		'\xC1', '\x3', '\x2', '\x2', '\x2', '\xC3', '\xC6', '\x3', '\x2', '\x2', 
		'\x2', '\xC4', '\xC5', '\x3', '\x2', '\x2', '\x2', '\xC4', '\xC2', '\x3', 
		'\x2', '\x2', '\x2', '\xC5', '\xC7', '\x3', '\x2', '\x2', '\x2', '\xC6', 
		'\xC4', '\x3', '\x2', '\x2', '\x2', '\xC7', '\xC8', '\a', '$', '\x2', 
		'\x2', '\xC8', '\x42', '\x3', '\x2', '\x2', '\x2', '\xC9', '\xCD', '\t', 
		'\x3', '\x2', '\x2', '\xCA', '\xCC', '\t', '\x4', '\x2', '\x2', '\xCB', 
		'\xCA', '\x3', '\x2', '\x2', '\x2', '\xCC', '\xCF', '\x3', '\x2', '\x2', 
		'\x2', '\xCD', '\xCB', '\x3', '\x2', '\x2', '\x2', '\xCD', '\xCE', '\x3', 
		'\x2', '\x2', '\x2', '\xCE', '\x44', '\x3', '\x2', '\x2', '\x2', '\xCF', 
		'\xCD', '\x3', '\x2', '\x2', '\x2', '\xD0', '\xD2', '\t', '\x5', '\x2', 
		'\x2', '\xD1', '\xD0', '\x3', '\x2', '\x2', '\x2', '\xD2', '\xD3', '\x3', 
		'\x2', '\x2', '\x2', '\xD3', '\xD1', '\x3', '\x2', '\x2', '\x2', '\xD3', 
		'\xD4', '\x3', '\x2', '\x2', '\x2', '\xD4', '\xD5', '\x3', '\x2', '\x2', 
		'\x2', '\xD5', '\xD6', '\b', '#', '\x2', '\x2', '\xD6', '\x46', '\x3', 
		'\x2', '\x2', '\x2', '\xD7', '\xD9', '\a', '\xF', '\x2', '\x2', '\xD8', 
		'\xD7', '\x3', '\x2', '\x2', '\x2', '\xD8', '\xD9', '\x3', '\x2', '\x2', 
		'\x2', '\xD9', '\xDA', '\x3', '\x2', '\x2', '\x2', '\xDA', '\xDC', '\a', 
		'\f', '\x2', '\x2', '\xDB', '\xD8', '\x3', '\x2', '\x2', '\x2', '\xDC', 
		'\xDD', '\x3', '\x2', '\x2', '\x2', '\xDD', '\xDB', '\x3', '\x2', '\x2', 
		'\x2', '\xDD', '\xDE', '\x3', '\x2', '\x2', '\x2', '\xDE', 'H', '\x3', 
		'\x2', '\x2', '\x2', '\r', '\x2', '\xA6', '\xAB', '\xB1', '\xB7', '\xBD', 
		'\xC4', '\xCD', '\xD3', '\xD8', '\xDD', '\x3', '\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
