using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Compiler.SymbolTableFolder;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Compiler.Phases
{
    public static class PreCodeGenExtensionMethods
    {
        public static HashSet<string> GetVariablesInExpr(this string text)
        {
            HashSet<string> res = new();
            string _res = "";
            text.ToList().ForEach(s =>
            {
                if (_res.Length == 0 && char.IsLetter(s))
                {
                    _res += s;
                } else if (_res.Length > 0 && char.IsLetterOrDigit(s) || s == '_')
                {
                    _res += s;
                } else
                {

                    if (_res.Length > 0 && s != '(')
                        res.Add(_res);
                    _res = "";
                }
            });

            if (_res.Length > 0)
                res.Add(_res);
            return res;
        }
    }
    public class ExprTree
    {
        public string VariableName;
        public bool IsValue;
        public void AddExprToVariable(HashSet<string> Variables) => Variables.Where(p => p != this.VariableName && p != "relu").ToList().ForEach(p => this.Variables.Add(p));
        public HashSet<string> Variables = new();
        public ExprTree(string name, HashSet<string> Variables, bool isValue)
        {
            this.VariableName = name;
            AddExprToVariable(Variables);
            IsValue = isValue;
        }
        public override string ToString()
        {
            var v = "";
            Variables.ToList().ForEach(p => v += $"{p}, ");
            if (v.Length > 2)
            v = v[0..^2];
            return $"{VariableName} | {v} | {IsValue}";
        }
    }
    internal class PreCodeGen : EmotionalDamageBaseVisitor<object>
    {
        public RootSymbolTable Scope { get; set; }
        public PreCodeGen(RootSymbolTable Scope) {
            this.Scope = Scope;
        }
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
        

        public override object VisitGradientDcl([NotNull] EmotionalDamageParser.GradientDclContext context)
        {
            CheckExpr(context.GetText());
            return false;
        }
        public void CheckExpr(string input)
        {
            if (input.Split("=").Length > 1)
            {
                var id = input.Split('=').First().Replace("float", "").Replace("int", "").Trim();
                Scope.AddExprTree(id, input.Split("=").Last().ToString().GetVariablesInExpr(), input.Contains("\\\\"));
                if (input.Contains("\\\\"))
                    Scope.SetExprTreeTrue(id, input.Split("\\\\").Last().ToString().Replace(";", ""));
            }
        }

        public override object VisitWhileStmt([NotNull] EmotionalDamageParser.WhileStmtContext context)
        {
            Scope.NextScope();
            VisitStmts(context.stmts());
            Scope.ExitScopeCodeGen();
            return false;
        }
        public override object VisitForStmt([NotNull] EmotionalDamageParser.ForStmtContext context)
        {
            Scope.NextScope();
            CheckExpr(context.GetText()); 
            VisitStmts(context.stmts());
            Scope.ExitScopeCodeGen();
            return false;
        }
        public override object VisitIfstmt([NotNull] EmotionalDamageParser.IfstmtContext context)
        {
            Scope.NextScope();
            VisitStmts(context.stmts());
            Scope.ExitScopeCodeGen();
            return false;
        }
        public override object VisitElifstmt([NotNull] EmotionalDamageParser.ElifstmtContext context)
        {
            Scope.NextScope();
            VisitStmts(context.stmts());
            Scope.ExitScopeCodeGen();
            return false;
        }
        public override object VisitElsestmt([NotNull] EmotionalDamageParser.ElsestmtContext context)
        {
            Scope.NextScope();
            VisitStmts(context.stmts());
            Scope.ExitScopeCodeGen();
            return false;
        }
        public override object VisitFuncDcl([NotNull] EmotionalDamageParser.FuncDclContext context)
        {
            Scope.NextScope();
            var stmts = context.stmts();
            VisitStmts(stmts);
            Scope.ExitScopeCodeGen();
            return false;
        }
    }
}
