﻿using Antlr4.Runtime.Misc;
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
       
        public HashSet<string> Exprs = new();
        private List<string> _grads = new();

       // private int count = 0;
        public bool lookingforGrads = false;
        public PreCodeGen() {}
        public override object VisitNumDcl([NotNull] EmotionalDamageParser.NumDclContext context)
        {
           
            var expr_str = context.GetText().Replace(";", "");
            CheckExpr(expr_str);
            return false;
        }
        public override object VisitNumAssignStmt([NotNull] EmotionalDamageParser.NumAssignStmtContext context)
        { 
            CheckExpr(context.GetText());
           
            return false;
        }

        public override object VisitReluStmt([NotNull] EmotionalDamageParser.ReluStmtContext context)
        {
            CheckExpr(context.GetText());
            return false;
        }
        public override object VisitPrintStmt([NotNull] EmotionalDamageParser.PrintStmtContext context)
        {
            if (context.expr() != null) { 
                CheckExpr(context.GetText());
            }
            
            return false;
        }
        public override object VisitMatrixElementAssignStmt([NotNull] EmotionalDamageParser.MatrixElementAssignStmtContext context)
        {

            CheckExpr(context.GetText());
           

            return false;
        }
        public override object VisitArrayElementAssignStmt([NotNull] EmotionalDamageParser.ArrayElementAssignStmtContext context)
        {
            CheckExpr(context.GetText());
            
            return false;
        }
        public override object VisitForStmt([NotNull] EmotionalDamageParser.ForStmtContext context)
        {
           
           CheckExpr(context.GetText());
           
            VisitStmts(context.stmts());
            
            return false;
        }

        public override object VisitGradientDcl([NotNull] EmotionalDamageParser.GradientDclContext context)
        {
            CheckExpr(context.GetText());
            return false;
        }
        public void CheckExpr(string input)
        {
            var id = input.Split('=').First().Replace("float", "").Replace("int", "").Trim();
            var exprs = input.Replace(";", "").Split('=').Last();
            if (exprs.Contains("\\\\") && !lookingforGrads)
            {
                var _expr1 = input.Split('=')[1].Split("\\\\")[0];
                var _expr2 = input.Split("\\\\")[1].Replace(";", "");
                    Exprs.Add(_expr1);
                    Exprs.Add(_expr2);
                    _grads.Add(_expr1);
            }
            else if (exprs.Contains(".relu") && !lookingforGrads)
            {
                Exprs.Add(input.Replace(".relu;", ""));
            }
            else if (exprs.Any(c => char.IsLetter(c)) && lookingforGrads) { 

                var expr = exprs.Replace("(", "").Replace(")","").Split('%', '/', '+', '-', '*');
                foreach (var _expr in expr)
                    if (_expr.Any(c => char.IsLetter(c)))
                        if (CheckForGrad(_expr))
                            Exprs.Add(id);
            }
        }
        public bool CheckForGrad(string input)
        {
            if (Exprs.Any(c => c == input) && !_grads.Any(c => c == input)) { 
                return true;
            }
            
            return false;
        }


    }
}
