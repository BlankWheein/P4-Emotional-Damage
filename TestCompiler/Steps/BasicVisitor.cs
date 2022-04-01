using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using TestCompiler.Exceptions;
using TestCompiler.Steps;
using static TestGrammarParser;
namespace TestCompiler.Steps
{
    public class BasicVisitor : TestGrammarBaseVisitor<object>, ICompilerStep
{
        private SymbolTable _scope = new();
        public SymbolTable Scope
        {
            get => _scope; set
            {
                if (value != null)
                    _scope = value;
            }
        }
        public BasicVisitor()
        {
            this.TypeChecker = new(this);
        }
        public TypeChecker TypeChecker { get; set; }

        public IEnumerable<Exception> Diagnostics => Scope.Diagnostics;

        public void Print()
        {
            PrintScope(Scope);
        }
        private void PrintScope(SymbolTable table, string indent = " ")
        {
            PrintSymbolTable(table, indent);
            foreach (var s in table.Children)
                PrintScope(s, indent + "   ");
        }
        private void PrintSymbolTable(SymbolTable s, string indent)
        {
            if ((s.Parent != null && s.Parent.Children.Count == 0) || s?.Parent?.Children.Last() == s || s.Parent == null)
            {
                Console.Write(indent + "└──");
            }
            else
            {
                Console.Write(indent + "├──");
            }
            Console.WriteLine(s);
            Console.ForegroundColor = ConsoleColor.Green;
        }

        public override object VisitErrorNode(IErrorNode node)
        {
            return base.VisitErrorNode(node);
        }
        public override object VisitPrint(TestGrammarParser.PrintContext context)
        {
            TextstringContext opinion;
            BexprContext opinion2;
            opinion = context.textstring();
            if (opinion != null)
            {
                var line = new SpeakLine() { Text = opinion.GetText().Trim('"') };
                return line;
            }
            else
            {
                opinion2 = context.bexpr();
                VisitBexpr(opinion2);
                var line = new SpeakLine() { Text = opinion2.GetText().Trim('"') };
                return line;
            }
        }

        public override object VisitAssignment(AssignmentContext context)
        {
            ValtypeContext valtype = context.valtype();
            ExprContext expr = context.expr();
            IdContext id = context.id();
            AssignmentLine line = new() { ValType = valtype?.GetText()?.Trim('"'), Expr = expr?.GetText()?.Trim('"'), Id = id?.GetText()?.Trim('"') };
            if (valtype == null)
            {
                var _symbol = Scope.Lookup(line?.Id);
                line.ValType = _symbol?.Type;
            }
            if (expr != null && line.ValType != null)
            {
                TypeChecker.EvalutateExpr(expr, line.ValType);
            }

            if (valtype?.GetText()?.Trim('"') != null)
            {
                if (Scope.Lookup(line?.Id) != null)
                {
                    Scope.AddDiagnostic(new IdAlreadyDefinedException($"The Id {id?.GetText()} was already defined", context, id));
                } else
                {
                    Scope.Insert(line?.ValType, line?.Id, line.Expr);
                }
            }
            else
            {
                //Scope.SetAttribute(line?.Id, line?.Expr);
            }
            if (expr != null)
                VisitExpr(expr);

            return line;

        }

        public override object VisitForassignment(ForassignmentContext context)
        {
            ValtypeContext valtype = context.valtype();
            ExprContext expr = context.expr();
            IdContext id = context.id();
            AssignmentLine line = new() { ValType = valtype?.GetText()?.Trim('"'), Expr = expr?.GetText()?.Trim('"'), Id = id?.GetText()?.Trim('"') };
            if (expr != null)
                VisitExpr(expr);
            if (line.ValType == null)
            {
                var _symbol = Scope.Lookup(line?.Id);
                line.ValType = _symbol?.Type;
            }
            
            var Result = line?.ValType?.ToString() switch
            {
                "int" => int.TryParse(line?.Expr?.ToString(), out int intResult),
                "double" => double.TryParse(line?.Expr?.ToString(), out double doubleResult),
                "float" => float.TryParse(line?.Expr?.ToString(), out float floatResult),
                _ => (object)false,
            };
            if ((bool)Result == false)
            {
                _ = line?.ValType?.ToString() switch
                {
                    "int" => Scope.AddDiagnostic(new IntDeclarationException($"Could not parse '{line?.Id}'", context, id)),
                    "double" => Scope.AddDiagnostic(new DoubleDeclarationException($"Could not parse '{line?.Id}'", context, id)),
                    "float" => Scope.AddDiagnostic(new FloatDeclarationException($"Could not parse '{line?.Id}'", context, id)),
                    _ => 0,
                };
            }

            if (valtype?.GetText()?.Trim('"') != null)
            {
                Scope.Insert(line?.ValType, line?.Id, line.Expr);
            }
            else
            {
                //Scope.SetAttribute(line?.Id, line?.Expr);
            }

            return line;

        }

        public override object VisitSelective(SelectiveContext context)
    {
       
        IfstatementContext ifstatement = context.ifstatement();
        var elifstatement = context.elifstatement();
        ElsestatementContext elsestatement = context.elsestatement();

        if (ifstatement != null)
        {
            Scope = Scope.Allocate();
            VisitBexpr(context.bexpr().First());
            VisitStmts(context.stmts().First());
            Scope = Scope.ExitScope();
        }
        if (elifstatement.Length != 0)
        {
            for (int i = 1; i < elifstatement.Length + 1; i++)
            {
                Scope = Scope.Allocate();
                VisitBexpr(context.bexpr()[i]);
                VisitStmts(context.stmts()[i]);
                Scope = Scope.ExitScope();
            }
        }
        if (elsestatement != null)
        {
            Scope = Scope.Allocate();
            VisitStmts(context.stmts().Last());
            Scope = Scope.ExitScope();
            }
        return true;
    }

    public override object VisitStmts(StmtsContext context)
    {
        if (context == null) { return true; }
        VisitStmt(context.stmt());
        VisitStmts(context.stmts());
        return true;
    }
    public override object VisitStmt(StmtContext context)
    {
        if (context == null) { return true; }
        if (context.assignment() != null)
            VisitAssignment(context.assignment());
        else if (context.print() != null)
            VisitPrint(context.print());
        else if (context.selective() != null)
            VisitSelective(context.selective());
        else if (context.iterative() != null)
            VisitIterative(context.iterative());
        return true;
    }




    public override object VisitIterative(IterativeContext context)
    {
        Scope = Scope.Allocate();
        if (context.forassignment() != null)
            VisitForassignment(context.forassignment());
        else
            Scope.AddDiagnostic(new IterativeAssignmentUndefined($"Assignment was null", context, context.forassignment()));
        VisitBexpr(context.bexpr());
        VisitExpr(context.expr());
        VisitStmts(context.stmts());
        Scope = Scope.ExitScope();
        return true;
    }

    public override object VisitBexpr(BexprContext context)
    {
        if (context.bexpr() != null)
        foreach (BexprContext t in context.bexpr())
                VisitBexpr(t);
        if (context.expr() != null)
            VisitExpr(context.expr());

        return false;
    }
    public override object VisitExpr(ExprContext context)
    {
        if (context.expr() != null)
            foreach (var t in context.expr())
                VisitExpr(t);
        else
            VisitVal(context.val());

        return false;
    }
     
    public override object VisitVal(ValContext context)
    {

        if (context.num() != null)
        {
            string Value = context.num().GetText().Trim('"');
                    if (int.TryParse(Value, out int result)
                    || double.TryParse(Value, out double result2)
                    || float.TryParse(Value, out float result3))
                    return true;
                else
                    Scope.AddDiagnostic(new NumberDeclarationException($"Could not parse '{context.num().GetText().Trim('"')}'", context, context.num()));
        }

        if (context.id() != null)
        {
            if (Scope.Lookup(context.id().GetText().Trim('"').ToString()) == null) {
                Scope.AddDiagnostic(new IdNotFoundException($"Id was not found '{context.id().GetText().Trim('"')}'", context, context.id()));
            }
        }
        return false;
    }

        public void Dispose()
        {
            
        }
    }
}