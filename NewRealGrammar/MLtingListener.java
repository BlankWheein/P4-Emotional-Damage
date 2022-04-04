// Generated from MLting.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MLtingParser}.
 */
public interface MLtingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MLtingParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MLtingParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MLtingParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(MLtingParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(MLtingParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MLtingParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MLtingParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MLtingParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MLtingParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MLtingParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MLtingParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(MLtingParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(MLtingParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(MLtingParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(MLtingParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#gradfunc}.
	 * @param ctx the parse tree
	 */
	void enterGradfunc(MLtingParser.GradfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#gradfunc}.
	 * @param ctx the parse tree
	 */
	void exitGradfunc(MLtingParser.GradfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#rettype}.
	 * @param ctx the parse tree
	 */
	void enterRettype(MLtingParser.RettypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#rettype}.
	 * @param ctx the parse tree
	 */
	void exitRettype(MLtingParser.RettypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MLtingParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MLtingParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MLtingParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MLtingParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#matrixparameter}.
	 * @param ctx the parse tree
	 */
	void enterMatrixparameter(MLtingParser.MatrixparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#matrixparameter}.
	 * @param ctx the parse tree
	 */
	void exitMatrixparameter(MLtingParser.MatrixparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#arrparameter}.
	 * @param ctx the parse tree
	 */
	void enterArrparameter(MLtingParser.ArrparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#arrparameter}.
	 * @param ctx the parse tree
	 */
	void exitArrparameter(MLtingParser.ArrparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#intdcl}.
	 * @param ctx the parse tree
	 */
	void enterIntdcl(MLtingParser.IntdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#intdcl}.
	 * @param ctx the parse tree
	 */
	void exitIntdcl(MLtingParser.IntdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#doubledcl}.
	 * @param ctx the parse tree
	 */
	void enterDoubledcl(MLtingParser.DoubledclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#doubledcl}.
	 * @param ctx the parse tree
	 */
	void exitDoubledcl(MLtingParser.DoubledclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#floatdcl}.
	 * @param ctx the parse tree
	 */
	void enterFloatdcl(MLtingParser.FloatdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#floatdcl}.
	 * @param ctx the parse tree
	 */
	void exitFloatdcl(MLtingParser.FloatdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#intarrdcl}.
	 * @param ctx the parse tree
	 */
	void enterIntarrdcl(MLtingParser.IntarrdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#intarrdcl}.
	 * @param ctx the parse tree
	 */
	void exitIntarrdcl(MLtingParser.IntarrdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#doublearrdcl}.
	 * @param ctx the parse tree
	 */
	void enterDoublearrdcl(MLtingParser.DoublearrdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#doublearrdcl}.
	 * @param ctx the parse tree
	 */
	void exitDoublearrdcl(MLtingParser.DoublearrdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#floatarrdcl}.
	 * @param ctx the parse tree
	 */
	void enterFloatarrdcl(MLtingParser.FloatarrdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#floatarrdcl}.
	 * @param ctx the parse tree
	 */
	void exitFloatarrdcl(MLtingParser.FloatarrdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#arrupdate}.
	 * @param ctx the parse tree
	 */
	void enterArrupdate(MLtingParser.ArrupdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#arrupdate}.
	 * @param ctx the parse tree
	 */
	void exitArrupdate(MLtingParser.ArrupdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#arrassign}.
	 * @param ctx the parse tree
	 */
	void enterArrassign(MLtingParser.ArrassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#arrassign}.
	 * @param ctx the parse tree
	 */
	void exitArrassign(MLtingParser.ArrassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#matrixassign}.
	 * @param ctx the parse tree
	 */
	void enterMatrixassign(MLtingParser.MatrixassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#matrixassign}.
	 * @param ctx the parse tree
	 */
	void exitMatrixassign(MLtingParser.MatrixassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#intmatrixdcl}.
	 * @param ctx the parse tree
	 */
	void enterIntmatrixdcl(MLtingParser.IntmatrixdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#intmatrixdcl}.
	 * @param ctx the parse tree
	 */
	void exitIntmatrixdcl(MLtingParser.IntmatrixdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#doublematrixdcl}.
	 * @param ctx the parse tree
	 */
	void enterDoublematrixdcl(MLtingParser.DoublematrixdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#doublematrixdcl}.
	 * @param ctx the parse tree
	 */
	void exitDoublematrixdcl(MLtingParser.DoublematrixdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#floatmatrixdcl}.
	 * @param ctx the parse tree
	 */
	void enterFloatmatrixdcl(MLtingParser.FloatmatrixdclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#floatmatrixdcl}.
	 * @param ctx the parse tree
	 */
	void exitFloatmatrixdcl(MLtingParser.FloatmatrixdclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#matrixupdate}.
	 * @param ctx the parse tree
	 */
	void enterMatrixupdate(MLtingParser.MatrixupdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#matrixupdate}.
	 * @param ctx the parse tree
	 */
	void exitMatrixupdate(MLtingParser.MatrixupdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#matrixarrexpr}.
	 * @param ctx the parse tree
	 */
	void enterMatrixarrexpr(MLtingParser.MatrixarrexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#matrixarrexpr}.
	 * @param ctx the parse tree
	 */
	void exitMatrixarrexpr(MLtingParser.MatrixarrexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#arrexpr}.
	 * @param ctx the parse tree
	 */
	void enterArrexpr(MLtingParser.ArrexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#arrexpr}.
	 * @param ctx the parse tree
	 */
	void exitArrexpr(MLtingParser.ArrexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#matrixtranspose}.
	 * @param ctx the parse tree
	 */
	void enterMatrixtranspose(MLtingParser.MatrixtransposeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#matrixtranspose}.
	 * @param ctx the parse tree
	 */
	void exitMatrixtranspose(MLtingParser.MatrixtransposeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#matrixinverse}.
	 * @param ctx the parse tree
	 */
	void enterMatrixinverse(MLtingParser.MatrixinverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#matrixinverse}.
	 * @param ctx the parse tree
	 */
	void exitMatrixinverse(MLtingParser.MatrixinverseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#numassign}.
	 * @param ctx the parse tree
	 */
	void enterNumassign(MLtingParser.NumassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#numassign}.
	 * @param ctx the parse tree
	 */
	void exitNumassign(MLtingParser.NumassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#numupdate}.
	 * @param ctx the parse tree
	 */
	void enterNumupdate(MLtingParser.NumupdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#numupdate}.
	 * @param ctx the parse tree
	 */
	void exitNumupdate(MLtingParser.NumupdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#boolassign}.
	 * @param ctx the parse tree
	 */
	void enterBoolassign(MLtingParser.BoolassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#boolassign}.
	 * @param ctx the parse tree
	 */
	void exitBoolassign(MLtingParser.BoolassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#boolupdate}.
	 * @param ctx the parse tree
	 */
	void enterBoolupdate(MLtingParser.BoolupdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#boolupdate}.
	 * @param ctx the parse tree
	 */
	void exitBoolupdate(MLtingParser.BoolupdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#booldcl}.
	 * @param ctx the parse tree
	 */
	void enterBooldcl(MLtingParser.BooldclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#booldcl}.
	 * @param ctx the parse tree
	 */
	void exitBooldcl(MLtingParser.BooldclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#boolval}.
	 * @param ctx the parse tree
	 */
	void enterBoolval(MLtingParser.BoolvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#boolval}.
	 * @param ctx the parse tree
	 */
	void exitBoolval(MLtingParser.BoolvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#selective}.
	 * @param ctx the parse tree
	 */
	void enterSelective(MLtingParser.SelectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#selective}.
	 * @param ctx the parse tree
	 */
	void exitSelective(MLtingParser.SelectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(MLtingParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(MLtingParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#elifstmt}.
	 * @param ctx the parse tree
	 */
	void enterElifstmt(MLtingParser.ElifstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#elifstmt}.
	 * @param ctx the parse tree
	 */
	void exitElifstmt(MLtingParser.ElifstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void enterElsestmt(MLtingParser.ElsestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#elsestmt}.
	 * @param ctx the parse tree
	 */
	void exitElsestmt(MLtingParser.ElsestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#iterative}.
	 * @param ctx the parse tree
	 */
	void enterIterative(MLtingParser.IterativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#iterative}.
	 * @param ctx the parse tree
	 */
	void exitIterative(MLtingParser.IterativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void enterForstmt(MLtingParser.ForstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#forstmt}.
	 * @param ctx the parse tree
	 */
	void exitForstmt(MLtingParser.ForstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void enterWhilestmt(MLtingParser.WhilestmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#whilestmt}.
	 * @param ctx the parse tree
	 */
	void exitWhilestmt(MLtingParser.WhilestmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#random}.
	 * @param ctx the parse tree
	 */
	void enterRandom(MLtingParser.RandomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#random}.
	 * @param ctx the parse tree
	 */
	void exitRandom(MLtingParser.RandomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#numexpr}.
	 * @param ctx the parse tree
	 */
	void enterNumexpr(MLtingParser.NumexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#numexpr}.
	 * @param ctx the parse tree
	 */
	void exitNumexpr(MLtingParser.NumexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(MLtingParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(MLtingParser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void enterSqrt(MLtingParser.SqrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#sqrt}.
	 * @param ctx the parse tree
	 */
	void exitSqrt(MLtingParser.SqrtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(MLtingParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(MLtingParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(MLtingParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(MLtingParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryoperator(MLtingParser.UnaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryoperator(MLtingParser.UnaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(MLtingParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(MLtingParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(MLtingParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(MLtingParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#gradfunccall}.
	 * @param ctx the parse tree
	 */
	void enterGradfunccall(MLtingParser.GradfunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#gradfunccall}.
	 * @param ctx the parse tree
	 */
	void exitGradfunccall(MLtingParser.GradfunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MLtingParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MLtingParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(MLtingParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(MLtingParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLtingParser#numtypes}.
	 * @param ctx the parse tree
	 */
	void enterNumtypes(MLtingParser.NumtypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLtingParser#numtypes}.
	 * @param ctx the parse tree
	 */
	void exitNumtypes(MLtingParser.NumtypesContext ctx);
}