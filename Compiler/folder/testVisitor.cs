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

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="testParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public interface ItestVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProg([NotNull] testParser.ProgContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.stmts"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStmts([NotNull] testParser.StmtsContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStmt([NotNull] testParser.StmtContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.assignment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAssignment([NotNull] testParser.AssignmentContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.exprs"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExprs([NotNull] testParser.ExprsContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpr([NotNull] testParser.ExprContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.selective"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSelective([NotNull] testParser.SelectiveContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.iterative"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIterative([NotNull] testParser.IterativeContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBexpr([NotNull] testParser.BexprContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.print"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPrint([NotNull] testParser.PrintContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.dummy"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDummy([NotNull] testParser.DummyContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.val"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVal([NotNull] testParser.ValContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.valtype"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitValtype([NotNull] testParser.ValtypeContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="testParser.num"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNum([NotNull] testParser.NumContext context);
}
