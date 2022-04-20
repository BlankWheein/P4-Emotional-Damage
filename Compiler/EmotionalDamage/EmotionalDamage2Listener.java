// Generated from EmotionalDamage2.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EmotionalDamage2Parser}.
 */
public interface EmotionalDamage2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EmotionalDamage2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(EmotionalDamage2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamage2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(EmotionalDamage2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamage2Parser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(EmotionalDamage2Parser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamage2Parser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(EmotionalDamage2Parser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamage2Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EmotionalDamage2Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamage2Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EmotionalDamage2Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumDcl}
	 * labeled alternative in {@link EmotionalDamage2Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterNumDcl(EmotionalDamage2Parser.NumDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumDcl}
	 * labeled alternative in {@link EmotionalDamage2Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitNumDcl(EmotionalDamage2Parser.NumDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDcl}
	 * labeled alternative in {@link EmotionalDamage2Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterStringDcl(EmotionalDamage2Parser.StringDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDcl}
	 * labeled alternative in {@link EmotionalDamage2Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitStringDcl(EmotionalDamage2Parser.StringDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclaration}
	 * labeled alternative in {@link EmotionalDamage2Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(EmotionalDamage2Parser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclaration}
	 * labeled alternative in {@link EmotionalDamage2Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(EmotionalDamage2Parser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixDeclaration}
	 * labeled alternative in {@link EmotionalDamage2Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterMatrixDeclaration(EmotionalDamage2Parser.MatrixDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixDeclaration}
	 * labeled alternative in {@link EmotionalDamage2Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitMatrixDeclaration(EmotionalDamage2Parser.MatrixDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolDeclaration}
	 * labeled alternative in {@link EmotionalDamage2Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterBoolDeclaration(EmotionalDamage2Parser.BoolDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolDeclaration}
	 * labeled alternative in {@link EmotionalDamage2Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitBoolDeclaration(EmotionalDamage2Parser.BoolDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDcl}
	 * labeled alternative in {@link EmotionalDamage2Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDcl(EmotionalDamage2Parser.FuncDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDcl}
	 * labeled alternative in {@link EmotionalDamage2Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDcl(EmotionalDamage2Parser.FuncDclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamage2Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(EmotionalDamage2Parser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamage2Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(EmotionalDamage2Parser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamage2Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(EmotionalDamage2Parser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamage2Parser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(EmotionalDamage2Parser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(EmotionalDamage2Parser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(EmotionalDamage2Parser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(EmotionalDamage2Parser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(EmotionalDamage2Parser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumAssignStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterNumAssignStmt(EmotionalDamage2Parser.NumAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumAssignStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitNumAssignStmt(EmotionalDamage2Parser.NumAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolAssignStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBoolAssignStmt(EmotionalDamage2Parser.BoolAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolAssignStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBoolAssignStmt(EmotionalDamage2Parser.BoolAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayElementAssignStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterArrayElementAssignStmt(EmotionalDamage2Parser.ArrayElementAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayElementAssignStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitArrayElementAssignStmt(EmotionalDamage2Parser.ArrayElementAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixElementAssignStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterMatrixElementAssignStmt(EmotionalDamage2Parser.MatrixElementAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixElementAssignStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitMatrixElementAssignStmt(EmotionalDamage2Parser.MatrixElementAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransposeMatrixStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterTransposeMatrixStmt(EmotionalDamage2Parser.TransposeMatrixStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransposeMatrixStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitTransposeMatrixStmt(EmotionalDamage2Parser.TransposeMatrixStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(EmotionalDamage2Parser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(EmotionalDamage2Parser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(EmotionalDamage2Parser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(EmotionalDamage2Parser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(EmotionalDamage2Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(EmotionalDamage2Parser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Selective}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelective(EmotionalDamage2Parser.SelectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Selective}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelective(EmotionalDamage2Parser.SelectiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryAssign}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterUnaryAssign(EmotionalDamage2Parser.UnaryAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryAssign}
	 * labeled alternative in {@link EmotionalDamage2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitUnaryAssign(EmotionalDamage2Parser.UnaryAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamage2Parser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpr(EmotionalDamage2Parser.UnaryexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamage2Parser#unaryexpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpr(EmotionalDamage2Parser.UnaryexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamage2Parser#selectivestmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectivestmt(EmotionalDamage2Parser.SelectivestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamage2Parser#selectivestmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectivestmt(EmotionalDamage2Parser.SelectivestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamage2Parser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(EmotionalDamage2Parser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamage2Parser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(EmotionalDamage2Parser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamage2Parser#elifstmt}.
	 * @param ctx the parse tree
	 */
	void enterElifstmt(EmotionalDamage2Parser.ElifstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamage2Parser#elifstmt}.
	 * @param ctx the parse tree
	 */
	void exitElifstmt(EmotionalDamage2Parser.ElifstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamage2Parser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void enterElsestmt(EmotionalDamage2Parser.ElsestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamage2Parser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void exitElsestmt(EmotionalDamage2Parser.ElsestmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GradientExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGradientExpr(EmotionalDamage2Parser.GradientExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GradientExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGradientExpr(EmotionalDamage2Parser.GradientExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(EmotionalDamage2Parser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(EmotionalDamage2Parser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValExpr(EmotionalDamage2Parser.ValExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValExpr(EmotionalDamage2Parser.ValExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(EmotionalDamage2Parser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(EmotionalDamage2Parser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SqrtExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSqrtExpr(EmotionalDamage2Parser.SqrtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SqrtExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSqrtExpr(EmotionalDamage2Parser.SqrtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModExpr(EmotionalDamage2Parser.ModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModExpr(EmotionalDamage2Parser.ModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(EmotionalDamage2Parser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(EmotionalDamage2Parser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTimesExpr(EmotionalDamage2Parser.TimesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTimesExpr(EmotionalDamage2Parser.TimesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpr(EmotionalDamage2Parser.DivideExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpr(EmotionalDamage2Parser.DivideExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(EmotionalDamage2Parser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(EmotionalDamage2Parser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(EmotionalDamage2Parser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(EmotionalDamage2Parser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterEquals(EmotionalDamage2Parser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitEquals(EmotionalDamage2Parser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEquals}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEquals(EmotionalDamage2Parser.GreaterEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEquals}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEquals(EmotionalDamage2Parser.GreaterEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolValue}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(EmotionalDamage2Parser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolValue}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(EmotionalDamage2Parser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallerEquals}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterSmallerEquals(EmotionalDamage2Parser.SmallerEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallerEquals}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitSmallerEquals(EmotionalDamage2Parser.SmallerEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterGreater(EmotionalDamage2Parser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitGreater(EmotionalDamage2Parser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Smaller}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterSmaller(EmotionalDamage2Parser.SmallerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Smaller}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitSmaller(EmotionalDamage2Parser.SmallerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEquals}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterNotEquals(EmotionalDamage2Parser.NotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEquals}
	 * labeled alternative in {@link EmotionalDamage2Parser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitNotEquals(EmotionalDamage2Parser.NotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumArrMatrixValue}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void enterNumArrMatrixValue(EmotionalDamage2Parser.NumArrMatrixValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumArrMatrixValue}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void exitNumArrMatrixValue(EmotionalDamage2Parser.NumArrMatrixValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RowIdentifier}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void enterRowIdentifier(EmotionalDamage2Parser.RowIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RowIdentifier}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void exitRowIdentifier(EmotionalDamage2Parser.RowIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColIdentifier}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void enterColIdentifier(EmotionalDamage2Parser.ColIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColIdentifier}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void exitColIdentifier(EmotionalDamage2Parser.ColIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LengthIdentifier}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void enterLengthIdentifier(EmotionalDamage2Parser.LengthIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LengthIdentifier}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void exitLengthIdentifier(EmotionalDamage2Parser.LengthIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntValue}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(EmotionalDamage2Parser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntValue}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(EmotionalDamage2Parser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatValue}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void enterFloatValue(EmotionalDamage2Parser.FloatValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatValue}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void exitFloatValue(EmotionalDamage2Parser.FloatValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegationValue}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void enterNegationValue(EmotionalDamage2Parser.NegationValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegationValue}
	 * labeled alternative in {@link EmotionalDamage2Parser#val}.
	 * @param ctx the parse tree
	 */
	void exitNegationValue(EmotionalDamage2Parser.NegationValueContext ctx);
}