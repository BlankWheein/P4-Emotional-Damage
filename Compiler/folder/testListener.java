// Generated from test.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(testParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(testParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(testParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(testParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(testParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(testParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(testParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(testParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(testParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(testParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(testParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(testParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#valtype}.
	 * @param ctx the parse tree
	 */
	void enterValtype(testParser.ValtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#valtype}.
	 * @param ctx the parse tree
	 */
	void exitValtype(testParser.ValtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(testParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(testParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(testParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(testParser.PrintContext ctx);
}