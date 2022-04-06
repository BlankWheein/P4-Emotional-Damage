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
	 * Enter a parse tree produced by {@link EmotionalDamageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EmotionalDamageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EmotionalDamageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(EmotionalDamageParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(EmotionalDamageParser.StmtContext ctx);
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
	 * Enter a parse tree produced by {@link EmotionalDamageParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(EmotionalDamageParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(EmotionalDamageParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(EmotionalDamageParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(EmotionalDamageParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(EmotionalDamageParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(EmotionalDamageParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#gradfunc}.
	 * @param ctx the parse tree
	 */
	void enterGradfunc(EmotionalDamageParser.GradfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#gradfunc}.
	 * @param ctx the parse tree
	 */
	void exitGradfunc(EmotionalDamageParser.GradfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#rettype}.
	 * @param ctx the parse tree
	 */
	void enterRettype(EmotionalDamageParser.RettypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#rettype}.
	 * @param ctx the parse tree
	 */
	void exitRettype(EmotionalDamageParser.RettypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(EmotionalDamageParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(EmotionalDamageParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(EmotionalDamageParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(EmotionalDamageParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#matrixparameter}.
	 * @param ctx the parse tree
	 */
	void enterMatrixparameter(EmotionalDamageParser.MatrixparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#matrixparameter}.
	 * @param ctx the parse tree
	 */
	void exitMatrixparameter(EmotionalDamageParser.MatrixparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#arrparameter}.
	 * @param ctx the parse tree
	 */
	void enterArrparameter(EmotionalDamageParser.ArrparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#arrparameter}.
	 * @param ctx the parse tree
	 */
	void exitArrparameter(EmotionalDamageParser.ArrparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#intdcl}.
	 * @param ctx the parse tree
	 */
	void enterIntdcl(EmotionalDamageParser.IntdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#intdcl}.
	 * @param ctx the parse tree
	 */
	void exitIntdcl(EmotionalDamageParser.IntdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#floatdcl}.
	 * @param ctx the parse tree
	 */
	void enterFloatdcl(EmotionalDamageParser.FloatdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#floatdcl}.
	 * @param ctx the parse tree
	 */
	void exitFloatdcl(EmotionalDamageParser.FloatdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#intarrdcl}.
	 * @param ctx the parse tree
	 */
	void enterIntarrdcl(EmotionalDamageParser.IntarrdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#intarrdcl}.
	 * @param ctx the parse tree
	 */
	void exitIntarrdcl(EmotionalDamageParser.IntarrdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#floatarrdcl}.
	 * @param ctx the parse tree
	 */
	void enterFloatarrdcl(EmotionalDamageParser.FloatarrdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#floatarrdcl}.
	 * @param ctx the parse tree
	 */
	void exitFloatarrdcl(EmotionalDamageParser.FloatarrdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#arrupdate}.
	 * @param ctx the parse tree
	 */
	void enterArrupdate(EmotionalDamageParser.ArrupdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#arrupdate}.
	 * @param ctx the parse tree
	 */
	void exitArrupdate(EmotionalDamageParser.ArrupdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#arrassign}.
	 * @param ctx the parse tree
	 */
	void enterArrassign(EmotionalDamageParser.ArrassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#arrassign}.
	 * @param ctx the parse tree
	 */
	void exitArrassign(EmotionalDamageParser.ArrassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#matrixassign}.
	 * @param ctx the parse tree
	 */
	void enterMatrixassign(EmotionalDamageParser.MatrixassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#matrixassign}.
	 * @param ctx the parse tree
	 */
	void exitMatrixassign(EmotionalDamageParser.MatrixassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#intmatrixdcl}.
	 * @param ctx the parse tree
	 */
	void enterIntmatrixdcl(EmotionalDamageParser.IntmatrixdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#intmatrixdcl}.
	 * @param ctx the parse tree
	 */
	void exitIntmatrixdcl(EmotionalDamageParser.IntmatrixdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#floatmatrixdcl}.
	 * @param ctx the parse tree
	 */
	void enterFloatmatrixdcl(EmotionalDamageParser.FloatmatrixdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#floatmatrixdcl}.
	 * @param ctx the parse tree
	 */
	void exitFloatmatrixdcl(EmotionalDamageParser.FloatmatrixdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#matrixupdate}.
	 * @param ctx the parse tree
	 */
	void enterMatrixupdate(EmotionalDamageParser.MatrixupdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#matrixupdate}.
	 * @param ctx the parse tree
	 */
	void exitMatrixupdate(EmotionalDamageParser.MatrixupdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#matrixarrexpr}.
	 * @param ctx the parse tree
	 */
	void enterMatrixarrexpr(EmotionalDamageParser.MatrixarrexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#matrixarrexpr}.
	 * @param ctx the parse tree
	 */
	void exitMatrixarrexpr(EmotionalDamageParser.MatrixarrexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#arrexpr}.
	 * @param ctx the parse tree
	 */
	void enterArrexpr(EmotionalDamageParser.ArrexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#arrexpr}.
	 * @param ctx the parse tree
	 */
	void exitArrexpr(EmotionalDamageParser.ArrexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#matrixtranspose}.
	 * @param ctx the parse tree
	 */
	void enterMatrixtranspose(EmotionalDamageParser.MatrixtransposeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#matrixtranspose}.
	 * @param ctx the parse tree
	 */
	void exitMatrixtranspose(EmotionalDamageParser.MatrixtransposeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#matrixinverse}.
	 * @param ctx the parse tree
	 */
	void enterMatrixinverse(EmotionalDamageParser.MatrixinverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#matrixinverse}.
	 * @param ctx the parse tree
	 */
	void exitMatrixinverse(EmotionalDamageParser.MatrixinverseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#numassign}.
	 * @param ctx the parse tree
	 */
	void enterNumassign(EmotionalDamageParser.NumassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#numassign}.
	 * @param ctx the parse tree
	 */
	void exitNumassign(EmotionalDamageParser.NumassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#numupdate}.
	 * @param ctx the parse tree
	 */
	void enterNumupdate(EmotionalDamageParser.NumupdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#numupdate}.
	 * @param ctx the parse tree
	 */
	void exitNumupdate(EmotionalDamageParser.NumupdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#boolassign}.
	 * @param ctx the parse tree
	 */
	void enterBoolassign(EmotionalDamageParser.BoolassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#boolassign}.
	 * @param ctx the parse tree
	 */
	void exitBoolassign(EmotionalDamageParser.BoolassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#boolupdate}.
	 * @param ctx the parse tree
	 */
	void enterBoolupdate(EmotionalDamageParser.BoolupdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#boolupdate}.
	 * @param ctx the parse tree
	 */
	void exitBoolupdate(EmotionalDamageParser.BoolupdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#booldcl}.
	 * @param ctx the parse tree
	 */
	void enterBooldcl(EmotionalDamageParser.BooldclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#booldcl}.
	 * @param ctx the parse tree
	 */
	void exitBooldcl(EmotionalDamageParser.BooldclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#boolval}.
	 * @param ctx the parse tree
	 */
	void enterBoolval(EmotionalDamageParser.BoolvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#boolval}.
	 * @param ctx the parse tree
	 */
	void exitBoolval(EmotionalDamageParser.BoolvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#selective}.
	 * @param ctx the parse tree
	 */
	void enterSelective(EmotionalDamageParser.SelectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#selective}.
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
	 * Enter a parse tree produced by {@link EmotionalDamageParser#iterative}.
	 * @param ctx the parse tree
	 */
	void enterIterative(EmotionalDamageParser.IterativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#iterative}.
	 * @param ctx the parse tree
	 */
	void exitIterative(EmotionalDamageParser.IterativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(EmotionalDamageParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(EmotionalDamageParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(EmotionalDamageParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(EmotionalDamageParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandom(EmotionalDamageParser.RandomContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandom(EmotionalDamageParser.RandomContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#numexpr}.
	 * @param ctx the parse tree
	 */
	void enterNumexpr(EmotionalDamageParser.NumexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#numexpr}.
	 * @param ctx the parse tree
	 */
	void exitNumexpr(EmotionalDamageParser.NumexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(EmotionalDamageParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(EmotionalDamageParser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void enterSqrt(EmotionalDamageParser.SqrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void exitSqrt(EmotionalDamageParser.SqrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(EmotionalDamageParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(EmotionalDamageParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(EmotionalDamageParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(EmotionalDamageParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryoperator(EmotionalDamageParser.UnaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryoperator(EmotionalDamageParser.UnaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(EmotionalDamageParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(EmotionalDamageParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(EmotionalDamageParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(EmotionalDamageParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#gradfunccall}.
	 * @param ctx the parse tree
	 */
	void enterGradfunccall(EmotionalDamageParser.GradfunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#gradfunccall}.
	 * @param ctx the parse tree
	 */
	void exitGradfunccall(EmotionalDamageParser.GradfunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(EmotionalDamageParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(EmotionalDamageParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(EmotionalDamageParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(EmotionalDamageParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link EmotionalDamageParser#numtypes}.
	 * @param ctx the parse tree
	 */
	void enterNumtypes(EmotionalDamageParser.NumtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EmotionalDamageParser#numtypes}.
	 * @param ctx the parse tree
	 */
	void exitNumtypes(EmotionalDamageParser.NumtypesContext ctx);
}