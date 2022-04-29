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

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="EmotionalDamageParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.3")]
[System.CLSCompliant(false)]
public interface IEmotionalDamageVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="EmotionalDamageParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProg([NotNull] EmotionalDamageParser.ProgContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="EmotionalDamageParser.stmts"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStmts([NotNull] EmotionalDamageParser.StmtsContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="EmotionalDamageParser.numtype"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNumtype([NotNull] EmotionalDamageParser.NumtypeContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="EmotionalDamageParser.print"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPrint([NotNull] EmotionalDamageParser.PrintContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="EmotionalDamageParser.types"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitTypes([NotNull] EmotionalDamageParser.TypesContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="EmotionalDamageParser.returntype"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitReturntype([NotNull] EmotionalDamageParser.ReturntypeContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>FuncDcl</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFuncDcl([NotNull] EmotionalDamageParser.FuncDclContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>MatrixDeclaration</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMatrixDeclaration([NotNull] EmotionalDamageParser.MatrixDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>ArrayDeclaration</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitArrayDeclaration([NotNull] EmotionalDamageParser.ArrayDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>NumDcl</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNumDcl([NotNull] EmotionalDamageParser.NumDclContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>StringDcl</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStringDcl([NotNull] EmotionalDamageParser.StringDclContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>BoolDeclaration</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBoolDeclaration([NotNull] EmotionalDamageParser.BoolDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>printStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPrintStmt([NotNull] EmotionalDamageParser.PrintStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>ReturnStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitReturnStmt([NotNull] EmotionalDamageParser.ReturnStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>NumAssignStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNumAssignStmt([NotNull] EmotionalDamageParser.NumAssignStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>BoolAssignStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBoolAssignStmt([NotNull] EmotionalDamageParser.BoolAssignStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>MatrixElementAssignStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMatrixElementAssignStmt([NotNull] EmotionalDamageParser.MatrixElementAssignStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>ArrayElementAssignStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitArrayElementAssignStmt([NotNull] EmotionalDamageParser.ArrayElementAssignStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>UnaryPlus</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitUnaryPlus([NotNull] EmotionalDamageParser.UnaryPlusContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>UnaryMinus</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitUnaryMinus([NotNull] EmotionalDamageParser.UnaryMinusContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>FuncStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFuncStmt([NotNull] EmotionalDamageParser.FuncStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>WhileStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitWhileStmt([NotNull] EmotionalDamageParser.WhileStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>ForStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitForStmt([NotNull] EmotionalDamageParser.ForStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>Selective</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSelective([NotNull] EmotionalDamageParser.SelectiveContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="EmotionalDamageParser.ifstmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIfstmt([NotNull] EmotionalDamageParser.IfstmtContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="EmotionalDamageParser.elifstmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitElifstmt([NotNull] EmotionalDamageParser.ElifstmtContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="EmotionalDamageParser.elsestmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitElsestmt([NotNull] EmotionalDamageParser.ElsestmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>Rowid</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitRowid([NotNull] EmotionalDamageParser.RowidContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>Lengthid</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitLengthid([NotNull] EmotionalDamageParser.LengthidContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>IntVal</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIntVal([NotNull] EmotionalDamageParser.IntValContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>PowExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPowExpr([NotNull] EmotionalDamageParser.PowExprContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>NegVal</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNegVal([NotNull] EmotionalDamageParser.NegValContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>DotExprs</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDotExprs([NotNull] EmotionalDamageParser.DotExprsContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>FloatVal</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFloatVal([NotNull] EmotionalDamageParser.FloatValContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>DivideExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDivideExpr([NotNull] EmotionalDamageParser.DivideExprContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>GradientExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitGradientExpr([NotNull] EmotionalDamageParser.GradientExprContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>FuncCall</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFuncCall([NotNull] EmotionalDamageParser.FuncCallContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>NumArrValue</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNumArrValue([NotNull] EmotionalDamageParser.NumArrValueContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>PlusExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPlusExpr([NotNull] EmotionalDamageParser.PlusExprContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>NumValue</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNumValue([NotNull] EmotionalDamageParser.NumValueContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>NumMatrixValue</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNumMatrixValue([NotNull] EmotionalDamageParser.NumMatrixValueContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>SqrtExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSqrtExpr([NotNull] EmotionalDamageParser.SqrtExprContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>ModExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitModExpr([NotNull] EmotionalDamageParser.ModExprContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>ParenExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitParenExpr([NotNull] EmotionalDamageParser.ParenExprContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>TimesExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitTimesExpr([NotNull] EmotionalDamageParser.TimesExprContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>TransposeMatrixStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitTransposeMatrixStmt([NotNull] EmotionalDamageParser.TransposeMatrixStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>Colid</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitColid([NotNull] EmotionalDamageParser.ColidContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>MinusExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMinusExpr([NotNull] EmotionalDamageParser.MinusExprContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>Greater</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitGreater([NotNull] EmotionalDamageParser.GreaterContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>Smaller</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSmaller([NotNull] EmotionalDamageParser.SmallerContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>GreaterEquals</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitGreaterEquals([NotNull] EmotionalDamageParser.GreaterEqualsContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>SmallerEquals</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitSmallerEquals([NotNull] EmotionalDamageParser.SmallerEqualsContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>Equals</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitEquals([NotNull] EmotionalDamageParser.EqualsContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>NotEquals</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitNotEquals([NotNull] EmotionalDamageParser.NotEqualsContext context);
	/// <summary>
	/// Visit a parse tree produced by the <c>BoolValue</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBoolValue([NotNull] EmotionalDamageParser.BoolValueContext context);
}
