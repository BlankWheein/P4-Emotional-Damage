using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.Phases
{
    internal class PreCodeGen : EmotionalDamageBaseVisitor<object>
    {
       
        public List<string> Exprs = new();

        public PreCodeGen() {
            
           
        }
        public override object VisitNumDcl([NotNull] EmotionalDamageParser.NumDclContext context)
        {
            var numtype = context.numtype().GetText();
            var id = context.IDENTIFIER().GetText();
            var expr_str = context.GetText().Replace(";", "").Split('=').Last();
            var expr = CheckExpr(expr_str);
            return false;
        }
        public override object VisitNumAssignStmt([NotNull] EmotionalDamageParser.NumAssignStmtContext context)
        {
            var id = context.IDENTIFIER().GetText();
            var expr = CheckExpr(context.expr().GetText());
           
            return false;
        }
        public override object VisitPrintStmt([NotNull] EmotionalDamageParser.PrintStmtContext context)
        {
            if (context.expr() != null) { 
                CheckExpr(context.expr().GetText());
            }
            
            return false;
        }
        public override object VisitMatrixElementAssignStmt([NotNull] EmotionalDamageParser.MatrixElementAssignStmtContext context)
        {

            var expr = CheckExpr(context.expr().GetText());
           

            return false;
        }
        public override object VisitArrayElementAssignStmt([NotNull] EmotionalDamageParser.ArrayElementAssignStmtContext context)
        {
            var expr = CheckExpr(context.expr().GetText());
            
            return false;
        }
        public override object VisitForStmt([NotNull] EmotionalDamageParser.ForStmtContext context)
        {
           
            var expr = CheckExpr(context.expr().GetText());
           
            VisitStmts(context.stmts());
            
            return false;
        }


        public string CheckExpr(string input)
        {
           
            if (input.Contains("\\\\"))
            {

                var _expr1 = input.Split("\\\\")[0];
                var _expr2 = input.Split("\\\\")[1];
                Exprs.Add(_expr1);
                Exprs.Add(_expr2);
            }
            return input;
        }
        
        
    }
}
