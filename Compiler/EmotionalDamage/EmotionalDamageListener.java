// Generated from EmotionalDamage.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EmotionalDamageParser}.
 */
public interface EmotionalDamageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(EmotionalDamageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(EmotionalDamageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(EmotionalDamageParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(EmotionalDamageParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#numtype}.
	 * @param ctx the parse tree
	 */
	void enterNumtype(EmotionalDamageParser.NumtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#numtype}.
	 * @param ctx the parse tree
	 */
	void exitNumtype(EmotionalDamageParser.NumtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(EmotionalDamageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(EmotionalDamageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(EmotionalDamageParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(EmotionalDamageParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#returntype}.
	 * @param ctx the parse tree
	 */
	void enterReturntype(EmotionalDamageParser.ReturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#returntype}.
	 * @param ctx the parse tree
	 */
	void exitReturntype(EmotionalDamageParser.ReturntypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDcl}
	 * labeled alternative in {@link EmotionalDamageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDcl(EmotionalDamageParser.FuncDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDcl}
	 * labeled alternative in {@link EmotionalDamageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDcl(EmotionalDamageParser.FuncDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixDeclaration}
	 * labeled alternative in {@link EmotionalDamageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterMatrixDeclaration(EmotionalDamageParser.MatrixDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixDeclaration}
	 * labeled alternative in {@link EmotionalDamageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitMatrixDeclaration(EmotionalDamageParser.MatrixDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclaration}
	 * labeled alternative in {@link EmotionalDamageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(EmotionalDamageParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclaration}
	 * labeled alternative in {@link EmotionalDamageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(EmotionalDamageParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumDcl}
	 * labeled alternative in {@link EmotionalDamageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterNumDcl(EmotionalDamageParser.NumDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumDcl}
	 * labeled alternative in {@link EmotionalDamageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitNumDcl(EmotionalDamageParser.NumDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringDcl}
	 * labeled alternative in {@link EmotionalDamageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterStringDcl(EmotionalDamageParser.StringDclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringDcl}
	 * labeled alternative in {@link EmotionalDamageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitStringDcl(EmotionalDamageParser.StringDclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolDeclaration}
	 * labeled alternative in {@link EmotionalDamageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterBoolDeclaration(EmotionalDamageParser.BoolDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolDeclaration}
	 * labeled alternative in {@link EmotionalDamageParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitBoolDeclaration(EmotionalDamageParser.BoolDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(EmotionalDamageParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(EmotionalDamageParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(EmotionalDamageParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(EmotionalDamageParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumAssignStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterNumAssignStmt(EmotionalDamageParser.NumAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumAssignStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitNumAssignStmt(EmotionalDamageParser.NumAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolAssignStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBoolAssignStmt(EmotionalDamageParser.BoolAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolAssignStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBoolAssignStmt(EmotionalDamageParser.BoolAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixElementAssignStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterMatrixElementAssignStmt(EmotionalDamageParser.MatrixElementAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixElementAssignStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitMatrixElementAssignStmt(EmotionalDamageParser.MatrixElementAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayElementAssignStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterArrayElementAssignStmt(EmotionalDamageParser.ArrayElementAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayElementAssignStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitArrayElementAssignStmt(EmotionalDamageParser.ArrayElementAssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlus}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlus(EmotionalDamageParser.UnaryPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlus}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlus(EmotionalDamageParser.UnaryPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(EmotionalDamageParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(EmotionalDamageParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransposeMatrixStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterTransposeMatrixStmt(EmotionalDamageParser.TransposeMatrixStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransposeMatrixStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitTransposeMatrixStmt(EmotionalDamageParser.TransposeMatrixStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncStmt(EmotionalDamageParser.FuncStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncStmt(EmotionalDamageParser.FuncStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(EmotionalDamageParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(EmotionalDamageParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(EmotionalDamageParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(EmotionalDamageParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Selective}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelective(EmotionalDamageParser.SelectiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Selective}
	 * labeled alternative in {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelective(EmotionalDamageParser.SelectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(EmotionalDamageParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(EmotionalDamageParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#elifstmt}.
	 * @param ctx the parse tree
	 */
	void enterElifstmt(EmotionalDamageParser.ElifstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#elifstmt}.
	 * @param ctx the parse tree
	 */
	void exitElifstmt(EmotionalDamageParser.ElifstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void enterElsestmt(EmotionalDamageParser.ElsestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void exitElsestmt(EmotionalDamageParser.ElsestmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rowid}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRowid(EmotionalDamageParser.RowidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rowid}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRowid(EmotionalDamageParser.RowidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lengthid}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLengthid(EmotionalDamageParser.LengthidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lengthid}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLengthid(EmotionalDamageParser.LengthidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntVal}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntVal(EmotionalDamageParser.IntValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntVal}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntVal(EmotionalDamageParser.IntValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(EmotionalDamageParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(EmotionalDamageParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegVal}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegVal(EmotionalDamageParser.NegValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegVal}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegVal(EmotionalDamageParser.NegValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatVal}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatVal(EmotionalDamageParser.FloatValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatVal}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatVal(EmotionalDamageParser.FloatValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpr(EmotionalDamageParser.DivideExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpr(EmotionalDamageParser.DivideExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GradientExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGradientExpr(EmotionalDamageParser.GradientExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GradientExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGradientExpr(EmotionalDamageParser.GradientExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(EmotionalDamageParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(EmotionalDamageParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumArrValue}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumArrValue(EmotionalDamageParser.NumArrValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumArrValue}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumArrValue(EmotionalDamageParser.NumArrValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(EmotionalDamageParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(EmotionalDamageParser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumValue}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumValue(EmotionalDamageParser.NumValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumValue}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumValue(EmotionalDamageParser.NumValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumMatrixValue}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumMatrixValue(EmotionalDamageParser.NumMatrixValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumMatrixValue}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumMatrixValue(EmotionalDamageParser.NumMatrixValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SqrtExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSqrtExpr(EmotionalDamageParser.SqrtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SqrtExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSqrtExpr(EmotionalDamageParser.SqrtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModExpr(EmotionalDamageParser.ModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModExpr(EmotionalDamageParser.ModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(EmotionalDamageParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(EmotionalDamageParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTimesExpr(EmotionalDamageParser.TimesExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TimesExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTimesExpr(EmotionalDamageParser.TimesExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Colid}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterColid(EmotionalDamageParser.ColidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Colid}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitColid(EmotionalDamageParser.ColidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(EmotionalDamageParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link EmotionalDamageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(EmotionalDamageParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterGreater(EmotionalDamageParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitGreater(EmotionalDamageParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Smaller}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterSmaller(EmotionalDamageParser.SmallerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Smaller}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitSmaller(EmotionalDamageParser.SmallerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEquals}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEquals(EmotionalDamageParser.GreaterEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEquals}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEquals(EmotionalDamageParser.GreaterEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SmallerEquals}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterSmallerEquals(EmotionalDamageParser.SmallerEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SmallerEquals}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitSmallerEquals(EmotionalDamageParser.SmallerEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterEquals(EmotionalDamageParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equals}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitEquals(EmotionalDamageParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEquals}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterNotEquals(EmotionalDamageParser.NotEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEquals}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitNotEquals(EmotionalDamageParser.NotEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolValue}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(EmotionalDamageParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolValue}
	 * labeled alternative in {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(EmotionalDamageParser.BoolValueContext ctx);
}