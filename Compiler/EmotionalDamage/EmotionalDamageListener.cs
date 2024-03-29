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
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="EmotionalDamageParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.3")]
[System.CLSCompliant(false)]
public interface IEmotionalDamageListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="EmotionalDamageParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterProg([NotNull] EmotionalDamageParser.ProgContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="EmotionalDamageParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitProg([NotNull] EmotionalDamageParser.ProgContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="EmotionalDamageParser.stmts"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmts([NotNull] EmotionalDamageParser.StmtsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="EmotionalDamageParser.stmts"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmts([NotNull] EmotionalDamageParser.StmtsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="EmotionalDamageParser.numtype"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNumtype([NotNull] EmotionalDamageParser.NumtypeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="EmotionalDamageParser.numtype"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNumtype([NotNull] EmotionalDamageParser.NumtypeContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="EmotionalDamageParser.print"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPrint([NotNull] EmotionalDamageParser.PrintContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="EmotionalDamageParser.print"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPrint([NotNull] EmotionalDamageParser.PrintContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="EmotionalDamageParser.types"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTypes([NotNull] EmotionalDamageParser.TypesContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="EmotionalDamageParser.types"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTypes([NotNull] EmotionalDamageParser.TypesContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="EmotionalDamageParser.returntype"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterReturntype([NotNull] EmotionalDamageParser.ReturntypeContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="EmotionalDamageParser.returntype"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitReturntype([NotNull] EmotionalDamageParser.ReturntypeContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>FuncDcl</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFuncDcl([NotNull] EmotionalDamageParser.FuncDclContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>FuncDcl</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFuncDcl([NotNull] EmotionalDamageParser.FuncDclContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>MatrixDeclaration</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMatrixDeclaration([NotNull] EmotionalDamageParser.MatrixDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>MatrixDeclaration</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMatrixDeclaration([NotNull] EmotionalDamageParser.MatrixDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>ArrayDeclaration</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArrayDeclaration([NotNull] EmotionalDamageParser.ArrayDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>ArrayDeclaration</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArrayDeclaration([NotNull] EmotionalDamageParser.ArrayDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>NumDcl</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNumDcl([NotNull] EmotionalDamageParser.NumDclContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>NumDcl</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNumDcl([NotNull] EmotionalDamageParser.NumDclContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>StringDcl</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStringDcl([NotNull] EmotionalDamageParser.StringDclContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>StringDcl</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStringDcl([NotNull] EmotionalDamageParser.StringDclContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>BoolDeclaration</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBoolDeclaration([NotNull] EmotionalDamageParser.BoolDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>BoolDeclaration</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBoolDeclaration([NotNull] EmotionalDamageParser.BoolDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>GradientDcl</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterGradientDcl([NotNull] EmotionalDamageParser.GradientDclContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>GradientDcl</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.dcl"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitGradientDcl([NotNull] EmotionalDamageParser.GradientDclContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>printStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPrintStmt([NotNull] EmotionalDamageParser.PrintStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>printStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPrintStmt([NotNull] EmotionalDamageParser.PrintStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>ReturnStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterReturnStmt([NotNull] EmotionalDamageParser.ReturnStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>ReturnStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitReturnStmt([NotNull] EmotionalDamageParser.ReturnStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>NumAssignStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNumAssignStmt([NotNull] EmotionalDamageParser.NumAssignStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>NumAssignStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNumAssignStmt([NotNull] EmotionalDamageParser.NumAssignStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>RandIdentifierStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterRandIdentifierStmt([NotNull] EmotionalDamageParser.RandIdentifierStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>RandIdentifierStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitRandIdentifierStmt([NotNull] EmotionalDamageParser.RandIdentifierStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>BoolAssignStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBoolAssignStmt([NotNull] EmotionalDamageParser.BoolAssignStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>BoolAssignStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBoolAssignStmt([NotNull] EmotionalDamageParser.BoolAssignStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>TransposeMatrixStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTransposeMatrixStmt([NotNull] EmotionalDamageParser.TransposeMatrixStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>TransposeMatrixStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTransposeMatrixStmt([NotNull] EmotionalDamageParser.TransposeMatrixStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>DotExprs</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDotExprs([NotNull] EmotionalDamageParser.DotExprsContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>DotExprs</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDotExprs([NotNull] EmotionalDamageParser.DotExprsContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>ReluStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterReluStmt([NotNull] EmotionalDamageParser.ReluStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>ReluStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitReluStmt([NotNull] EmotionalDamageParser.ReluStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>MatrixElementAssignStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMatrixElementAssignStmt([NotNull] EmotionalDamageParser.MatrixElementAssignStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>MatrixElementAssignStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMatrixElementAssignStmt([NotNull] EmotionalDamageParser.MatrixElementAssignStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>ArrayElementAssignStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArrayElementAssignStmt([NotNull] EmotionalDamageParser.ArrayElementAssignStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>ArrayElementAssignStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArrayElementAssignStmt([NotNull] EmotionalDamageParser.ArrayElementAssignStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>UnaryPlus</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterUnaryPlus([NotNull] EmotionalDamageParser.UnaryPlusContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>UnaryPlus</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitUnaryPlus([NotNull] EmotionalDamageParser.UnaryPlusContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>UnaryMinus</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterUnaryMinus([NotNull] EmotionalDamageParser.UnaryMinusContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>UnaryMinus</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitUnaryMinus([NotNull] EmotionalDamageParser.UnaryMinusContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>FuncStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFuncStmt([NotNull] EmotionalDamageParser.FuncStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>FuncStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFuncStmt([NotNull] EmotionalDamageParser.FuncStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>WhileStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhileStmt([NotNull] EmotionalDamageParser.WhileStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>WhileStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhileStmt([NotNull] EmotionalDamageParser.WhileStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>ForStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterForStmt([NotNull] EmotionalDamageParser.ForStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>ForStmt</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitForStmt([NotNull] EmotionalDamageParser.ForStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>Selective</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSelective([NotNull] EmotionalDamageParser.SelectiveContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>Selective</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSelective([NotNull] EmotionalDamageParser.SelectiveContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="EmotionalDamageParser.ifstmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIfstmt([NotNull] EmotionalDamageParser.IfstmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="EmotionalDamageParser.ifstmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIfstmt([NotNull] EmotionalDamageParser.IfstmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="EmotionalDamageParser.elifstmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElifstmt([NotNull] EmotionalDamageParser.ElifstmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="EmotionalDamageParser.elifstmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElifstmt([NotNull] EmotionalDamageParser.ElifstmtContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="EmotionalDamageParser.elsestmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElsestmt([NotNull] EmotionalDamageParser.ElsestmtContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="EmotionalDamageParser.elsestmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElsestmt([NotNull] EmotionalDamageParser.ElsestmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>Rowid</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterRowid([NotNull] EmotionalDamageParser.RowidContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>Rowid</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitRowid([NotNull] EmotionalDamageParser.RowidContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>Lengthid</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLengthid([NotNull] EmotionalDamageParser.LengthidContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>Lengthid</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLengthid([NotNull] EmotionalDamageParser.LengthidContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>IntVal</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIntVal([NotNull] EmotionalDamageParser.IntValContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>IntVal</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIntVal([NotNull] EmotionalDamageParser.IntValContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>PowExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPowExpr([NotNull] EmotionalDamageParser.PowExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>PowExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPowExpr([NotNull] EmotionalDamageParser.PowExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>NegVal</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNegVal([NotNull] EmotionalDamageParser.NegValContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>NegVal</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNegVal([NotNull] EmotionalDamageParser.NegValContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>FloatVal</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFloatVal([NotNull] EmotionalDamageParser.FloatValContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>FloatVal</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFloatVal([NotNull] EmotionalDamageParser.FloatValContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>DivideExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterDivideExpr([NotNull] EmotionalDamageParser.DivideExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>DivideExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitDivideExpr([NotNull] EmotionalDamageParser.DivideExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>FuncCall</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFuncCall([NotNull] EmotionalDamageParser.FuncCallContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>FuncCall</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFuncCall([NotNull] EmotionalDamageParser.FuncCallContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>NumArrValue</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNumArrValue([NotNull] EmotionalDamageParser.NumArrValueContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>NumArrValue</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNumArrValue([NotNull] EmotionalDamageParser.NumArrValueContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>PlusExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPlusExpr([NotNull] EmotionalDamageParser.PlusExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>PlusExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPlusExpr([NotNull] EmotionalDamageParser.PlusExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>NumValue</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNumValue([NotNull] EmotionalDamageParser.NumValueContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>NumValue</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNumValue([NotNull] EmotionalDamageParser.NumValueContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>NumMatrixValue</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNumMatrixValue([NotNull] EmotionalDamageParser.NumMatrixValueContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>NumMatrixValue</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNumMatrixValue([NotNull] EmotionalDamageParser.NumMatrixValueContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>SqrtExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSqrtExpr([NotNull] EmotionalDamageParser.SqrtExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>SqrtExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSqrtExpr([NotNull] EmotionalDamageParser.SqrtExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>ModExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterModExpr([NotNull] EmotionalDamageParser.ModExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>ModExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitModExpr([NotNull] EmotionalDamageParser.ModExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>ParenExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterParenExpr([NotNull] EmotionalDamageParser.ParenExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>ParenExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitParenExpr([NotNull] EmotionalDamageParser.ParenExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>TimesExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTimesExpr([NotNull] EmotionalDamageParser.TimesExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>TimesExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTimesExpr([NotNull] EmotionalDamageParser.TimesExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>Colid</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterColid([NotNull] EmotionalDamageParser.ColidContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>Colid</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitColid([NotNull] EmotionalDamageParser.ColidContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>MinusExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMinusExpr([NotNull] EmotionalDamageParser.MinusExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>MinusExpr</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMinusExpr([NotNull] EmotionalDamageParser.MinusExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>Greater</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterGreater([NotNull] EmotionalDamageParser.GreaterContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>Greater</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitGreater([NotNull] EmotionalDamageParser.GreaterContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>Smaller</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSmaller([NotNull] EmotionalDamageParser.SmallerContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>Smaller</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSmaller([NotNull] EmotionalDamageParser.SmallerContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>GreaterEquals</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterGreaterEquals([NotNull] EmotionalDamageParser.GreaterEqualsContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>GreaterEquals</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitGreaterEquals([NotNull] EmotionalDamageParser.GreaterEqualsContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>SmallerEquals</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterSmallerEquals([NotNull] EmotionalDamageParser.SmallerEqualsContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>SmallerEquals</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitSmallerEquals([NotNull] EmotionalDamageParser.SmallerEqualsContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>Equals</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterEquals([NotNull] EmotionalDamageParser.EqualsContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>Equals</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitEquals([NotNull] EmotionalDamageParser.EqualsContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>NotEquals</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNotEquals([NotNull] EmotionalDamageParser.NotEqualsContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>NotEquals</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNotEquals([NotNull] EmotionalDamageParser.NotEqualsContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>BoolValue</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBoolValue([NotNull] EmotionalDamageParser.BoolValueContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>BoolValue</c>
	/// labeled alternative in <see cref="EmotionalDamageParser.bexpr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBoolValue([NotNull] EmotionalDamageParser.BoolValueContext context);
}
