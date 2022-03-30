using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using static TestGrammarParser;

internal static class Program
{
    public static void Main()
    {
        while (true)
        {
            try
            {
                string? input = "";
                StringBuilder text = new StringBuilder();
                Console.WriteLine("> Input source code: ");

                // to type the EOF character and end the input: use CTRL+D, then press <enter>
                while ((input = Console.ReadLine()) != "")
                {
                    text.AppendLine(input);
                }
                if (text.Length == 0)
                {
                string testLine = "int kage = 2;if (1){int kage = 2;int akwd = 2;}if (1){int dkawp = 2;int kdwa = 3;if (1){if (2){int kage = 3;}}}";
                    Console.WriteLine(testLine);
                    Console.WriteLine();
                    text.AppendLine(testLine);
                }

                AntlrInputStream inputStream = new AntlrInputStream(text.ToString());
                TestGrammarLexer speakLexer = new TestGrammarLexer(inputStream);
                CommonTokenStream commonTokenStream = new CommonTokenStream(speakLexer);
                TestGrammarParser speakParser = new TestGrammarParser(commonTokenStream);
                ProgContext progContext = speakParser.prog();
                BasicVisitor visitor = new BasicVisitor();
                visitor.Visit(progContext);
                Console.ForegroundColor = ConsoleColor.Red;
                foreach (string s in visitor.Scope.Diagnostics)
                {
                    Console.WriteLine(s);
                }
                Console.ResetColor();
                Console.WriteLine("Printing Scope Tree:");
                Console.ForegroundColor= ConsoleColor.Green;
                visitor.Print();
                Console.ResetColor();
                Console.WriteLine() ;
            
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex);
            }
        }
    }
}

public partial class BasicVisitor : TestGrammarBaseVisitor<object>
{
    private SymbolTable _scope = new();
    public SymbolTable Scope { get => _scope; set
        {
            if (value != null)
                _scope = value;
        }
    }
    public void Print()
    {
        PrintScope(Scope);
    }
    private void PrintScope(SymbolTable table,string indent=" ")
    {
        PrintSymbolTable(table, indent);
        foreach(var s in table.Children)
            PrintScope(s, indent + "   ");
    }
    private void PrintSymbolTable(SymbolTable s, string indent)
    {
        if ((s.Parent != null && s.Parent.Children.Count == 0) || s?.Parent?.Children.Last() == s || s.Parent == null)
        {
            Console.Write(indent + "└──");
        } else
        {
            Console.Write (indent + "├──");
        }
        Console.WriteLine(s);
        Console.ForegroundColor = ConsoleColor.Green;
    }
}
public partial class BasicVisitor : TestGrammarBaseVisitor<object>
{
    public override object VisitPrint(TestGrammarParser.PrintContext context)
    {
        TextstringContext opinion;
        BexprContext opinion2;
            opinion = context.textstring();
            if (opinion != null)
            {
                var line = new SpeakLine() { Text = opinion.GetText().Trim('"') };
                return line;
            } else
            {
                opinion2 = context.bexpr();
                var line = new SpeakLine() { Text = opinion2.GetText().Trim('"') };
                return line;
            }
    }
}
public partial class BasicVisitor : TestGrammarBaseVisitor<object>
{

    public override object VisitAssignment(AssignmentContext context)
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
            "int" => int.TryParse(line?.Expr?.ToString(), out int result),
            "double" => double.TryParse(line?.Expr?.ToString(), out double result),
            "float" => float.TryParse(line?.Expr?.ToString(), out float result),
            _ => (object)false,
        };
        if ((bool)Result == false)
            Scope.AddDiagnostic($"Could not parse '{line?.Id}'");
        if (valtype?.GetText()?.Trim('"') != null)
            Scope.Insert(line.ValType, line.Id, line.Expr);
        else
        {
            //Scope.SetAttribute(line?.Id, line?.Expr);
        }

        return line;

    }
}

public partial class BasicVisitor : TestGrammarBaseVisitor<object>
{

    public override object VisitSelective(SelectiveContext context)
    {
         var Result = line?.ValType?.ToString() switch
        {
            "if" => VisitIfstatement(ifstatement),
            "elif" => VisitElifstatement(elifstatement),
            "else" => VisitIfstatement(elsestatement),
            _ => (object)false,
        };
        return (object)true;
    }
    public override object VisitIfstatement(IfstatementContext context)
    {
        foreach (var bxepr in context.bexpr())
            VisitBexpr(bxepr);
        Scope = Scope.Allocate();
        foreach (var stmt in context.stmts())
            VisitStmts(stmt);
        //Scope.Free();
        Scope = Scope.ExitScope();
        return (object)true;
    }
    public override object VisitElifstatement(ElifstatementContext context)
    {
        foreach (var bxepr in context.bexpr())
            VisitBexpr(bxepr);
        Scope = Scope.Allocate();
        foreach (var stmt in context.stmts())
            VisitStmts(stmt);
        //Scope.Free();
        Scope = Scope.ExitScope();
        return (object)true;
    }
    public override object VisitElsestatement(ElsestatementContext context)
    {
        Scope = Scope.Allocate();
        foreach (var stmt in context.stmts())
            VisitStmts(stmt);
        //Scope.Free();
        Scope = Scope.ExitScope();
        return (object)true;
    }


    public override object VisitIterative(IterativeContext context)
    {
        if (context.assignment() != null)
            VisitAssignment(context.assignment());
        else
            Scope.AddDiagnostic($"Assignment was null");
        VisitBexpr(context.bexpr());
        VisitExprs(context.exprs());
        Scope = Scope.Allocate();
        VisitStmts(context.stmts());
        //Scope.Free();
        Scope = Scope.ExitScope();
        return true;
    }

    public override object VisitBexpr(BexprContext context)
    {

        if (context.bexpr().Length == 2)
            foreach (var t in context.bexpr())
                VisitBexpr(t);
        else if (context.bexpr().Length == 1)
            foreach (var t in context.bexpr())
                VisitBexpr(t);
        else
            VisitExpr(context.expr());

        return false;
    }
    public override object VisitExpr(ExprContext context)
    {
        if (context.expr().Length == 2)
            foreach (var t in context.expr())
                VisitExpr(t);
        else if (context.expr().Length == 1)
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
            return true;
        }

        if (context.id() != null)
        {
            if (Scope.Lookup(context.id().GetText().Trim('"').ToString()) == null)
            {
                Scope.AddDiagnostic($"Id was not found '{context.id().GetText().Trim('"')}'");
            }
        }
        return false;
    }
}

public class AssignmentLine
{
    public string? ValType { get; set; }
    public string? Expr { get; set; }
    public string? Id { get; set; }
    public new string Text { get => $"{ValType} {Id} = {Expr}"; }
}

public class SpeakLine
{
    public new string Text { get; internal set; }
}