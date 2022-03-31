using Antlr4.Runtime.Tree;
using static TestGrammarParser;

namespace TestCompiler.Steps
{
    public interface ICompilerStep
    {
        public abstract object VisitErrorNode(IErrorNode node);
        public abstract object VisitPrint(TestGrammarParser.PrintContext context);
        public abstract object VisitAssignment(AssignmentContext context);
        public abstract object VisitForassignment(ForassignmentContext context);
        public abstract object VisitSelective(SelectiveContext context);
        public abstract object VisitStmts(StmtsContext context);
        public abstract object VisitStmt(StmtContext context);
        public abstract object VisitIterative(IterativeContext context);
        public abstract object VisitBexpr(BexprContext context);
        public abstract object VisitExpr(ExprContext context);
        public abstract object VisitVal(ValContext context);
    }
}