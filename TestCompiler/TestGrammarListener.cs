//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from TestGrammar.g4 by ANTLR 4.9.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="TestGrammarParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.3")]
[System.CLSCompliant(false)]
public interface ITestGrammarListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterProg([NotNull] TestGrammarParser.ProgContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitProg([NotNull] TestGrammarParser.ProgContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.stmts"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmts([NotNull] TestGrammarParser.StmtsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.stmts"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmts([NotNull] TestGrammarParser.StmtsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmt([NotNull] TestGrammarParser.StmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmt([NotNull] TestGrammarParser.StmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.assignment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssignment([NotNull] TestGrammarParser.AssignmentContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.assignment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssignment([NotNull] TestGrammarParser.AssignmentContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.exprs"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExprs([NotNull] TestGrammarParser.ExprsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.exprs"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExprs([NotNull] TestGrammarParser.ExprsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpr([NotNull] TestGrammarParser.ExprContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpr([NotNull] TestGrammarParser.ExprContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.textstring"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTextstring([NotNull] TestGrammarParser.TextstringContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.textstring"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTextstring([NotNull] TestGrammarParser.TextstringContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.selective"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSelective([NotNull] TestGrammarParser.SelectiveContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.selective"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSelective([NotNull] TestGrammarParser.SelectiveContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.ifstatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIfstatement([NotNull] TestGrammarParser.IfstatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.ifstatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIfstatement([NotNull] TestGrammarParser.IfstatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.elifstatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElifstatement([NotNull] TestGrammarParser.ElifstatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.elifstatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElifstatement([NotNull] TestGrammarParser.ElifstatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.elsestatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElsestatement([NotNull] TestGrammarParser.ElsestatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.elsestatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElsestatement([NotNull] TestGrammarParser.ElsestatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.iterative"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIterative([NotNull] TestGrammarParser.IterativeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.iterative"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIterative([NotNull] TestGrammarParser.IterativeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBexpr([NotNull] TestGrammarParser.BexprContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBexpr([NotNull] TestGrammarParser.BexprContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.print"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPrint([NotNull] TestGrammarParser.PrintContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.print"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPrint([NotNull] TestGrammarParser.PrintContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.dummy"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDummy([NotNull] TestGrammarParser.DummyContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.dummy"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDummy([NotNull] TestGrammarParser.DummyContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.val"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVal([NotNull] TestGrammarParser.ValContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.val"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVal([NotNull] TestGrammarParser.ValContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.valtype"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterValtype([NotNull] TestGrammarParser.ValtypeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.valtype"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitValtype([NotNull] TestGrammarParser.ValtypeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.id"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterId([NotNull] TestGrammarParser.IdContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.id"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitId([NotNull] TestGrammarParser.IdContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="TestGrammarParser.num"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNum([NotNull] TestGrammarParser.NumContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="TestGrammarParser.num"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNum([NotNull] TestGrammarParser.NumContext context);
}