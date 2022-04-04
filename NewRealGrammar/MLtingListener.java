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
}