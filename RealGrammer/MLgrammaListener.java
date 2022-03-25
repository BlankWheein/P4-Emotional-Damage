// Generated from MLgramma.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MLgrammaParser}.
 */
public interface MLgrammaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MLgrammaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MLgrammaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#prototypes}.
	 * @param ctx the parse tree
	 */
	void enterPrototypes(MLgrammaParser.PrototypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#prototypes}.
	 * @param ctx the parse tree
	 */
	void exitPrototypes(MLgrammaParser.PrototypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prototype(MLgrammaParser.Function_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prototype(MLgrammaParser.Function_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(MLgrammaParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(MLgrammaParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MLgrammaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MLgrammaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#iterative_stmts}.
	 * @param ctx the parse tree
	 */
	void enterIterative_stmts(MLgrammaParser.Iterative_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#iterative_stmts}.
	 * @param ctx the parse tree
	 */
	void exitIterative_stmts(MLgrammaParser.Iterative_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(MLgrammaParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(MLgrammaParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MLgrammaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MLgrammaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#iterative_block}.
	 * @param ctx the parse tree
	 */
	void enterIterative_block(MLgrammaParser.Iterative_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#iterative_block}.
	 * @param ctx the parse tree
	 */
	void exitIterative_block(MLgrammaParser.Iterative_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MLgrammaParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MLgrammaParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MLgrammaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MLgrammaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MLgrammaParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MLgrammaParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(MLgrammaParser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(MLgrammaParser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#one_word_statements}.
	 * @param ctx the parse tree
	 */
	void enterOne_word_statements(MLgrammaParser.One_word_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#one_word_statements}.
	 * @param ctx the parse tree
	 */
	void exitOne_word_statements(MLgrammaParser.One_word_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MLgrammaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MLgrammaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MLgrammaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MLgrammaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#getters}.
	 * @param ctx the parse tree
	 */
	void enterGetters(MLgrammaParser.GettersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#getters}.
	 * @param ctx the parse tree
	 */
	void exitGetters(MLgrammaParser.GettersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#iterative}.
	 * @param ctx the parse tree
	 */
	void enterIterative(MLgrammaParser.IterativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#iterative}.
	 * @param ctx the parse tree
	 */
	void exitIterative(MLgrammaParser.IterativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#selective}.
	 * @param ctx the parse tree
	 */
	void enterSelective(MLgrammaParser.SelectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#selective}.
	 * @param ctx the parse tree
	 */
	void exitSelective(MLgrammaParser.SelectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(MLgrammaParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(MLgrammaParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MLgrammaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MLgrammaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void enterBexpr(MLgrammaParser.BexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#bexpr}.
	 * @param ctx the parse tree
	 */
	void exitBexpr(MLgrammaParser.BexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#martix_pre_stuff}.
	 * @param ctx the parse tree
	 */
	void enterMartix_pre_stuff(MLgrammaParser.Martix_pre_stuffContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#martix_pre_stuff}.
	 * @param ctx the parse tree
	 */
	void exitMartix_pre_stuff(MLgrammaParser.Martix_pre_stuffContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#rettype}.
	 * @param ctx the parse tree
	 */
	void enterRettype(MLgrammaParser.RettypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#rettype}.
	 * @param ctx the parse tree
	 */
	void exitRettype(MLgrammaParser.RettypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#array_constructs}.
	 * @param ctx the parse tree
	 */
	void enterArray_constructs(MLgrammaParser.Array_constructsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#array_constructs}.
	 * @param ctx the parse tree
	 */
	void exitArray_constructs(MLgrammaParser.Array_constructsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(MLgrammaParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(MLgrammaParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#valtype}.
	 * @param ctx the parse tree
	 */
	void enterValtype(MLgrammaParser.ValtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#valtype}.
	 * @param ctx the parse tree
	 */
	void exitValtype(MLgrammaParser.ValtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLgrammaParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(MLgrammaParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLgrammaParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(MLgrammaParser.NumContext ctx);
}