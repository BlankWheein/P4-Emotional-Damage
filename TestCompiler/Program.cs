using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Text;
using static TestGrammarParser;

internal static class Program
{
    public static void Main()
    {

        try
        {
            string input = "";
            StringBuilder text = new StringBuilder();
            Console.WriteLine("Input the chat.");

            // to type the EOF character and end the input: use CTRL+D, then press <enter>
            while ((input = Console.ReadLine()) != "EOF")
            {
                text.AppendLine(input);
            }

            AntlrInputStream inputStream = new AntlrInputStream(text.ToString());
            TestGrammarLexer speakLexer = new TestGrammarLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(speakLexer);
            TestGrammarParser speakParser = new TestGrammarParser(commonTokenStream);
            ProgContext progContext = speakParser.prog();
            BasicSpeakVisitor visitor = new BasicSpeakVisitor();
            visitor.Visit(progContext);
            foreach (var line in visitor.Lines)
            {
                Console.WriteLine($"PRINT ({line.Text});");
            }
            
        }
        catch (Exception ex)
        {
            Console.WriteLine("Error: " + ex);
        }
    }
}

public partial class BasicSpeakVisitor : TestGrammarBaseVisitor<object>
{
    public List<Line> Lines = new();
    public override object VisitPrint(TestGrammarParser.PrintContext context)
    {
        TextstringContext opinion;
        BexprContext opinion2;
            opinion = context.textstring();
            if (opinion != null)
            {
                var line = new SpeakLine() { Text = opinion.GetText().Trim('"') };
                Lines.Add(line);
                return line;
            } else
            {
                opinion2 = context.bexpr();
                var line = new SpeakLine() { Text = opinion2.GetText().Trim('"') };
                Lines.Add(line);
                return line;
            }
    }
}

public partial class BasicSpeakVisitor : TestGrammarBaseVisitor<object>
{

    public override object VisitAssignment(AssignmentContext context)
    {
        ValtypeContext valtype = context.valtype();
        ExprContext expr = context.expr();
        IdContext id = context.id();
        AssignmentLine line = new() { ValType = valtype.GetText().Trim('"'), Expr = expr.GetText().Trim('"'), Id = id.GetText().Trim('"') };
        var test = line.ValType.ToString() switch
        {
            "int" => int.TryParse(line.Expr.ToString(), out int result),
            _ => (object)false,
        };
        if ((bool)test == false)
        {
            throw new Exception("TypeError");
        }
        Lines.Add(line);

        return line;

    }
}
public abstract class Line
{
    public string? Text { get; internal set; }
}
public class AssignmentLine : Line
{
    public string ValType { get; set; }
    public string Expr { get; set; }
    public string Id { get; set; }
    public new string Text { get => $"{ValType} {Id} = {Expr}"; }
}

public class SpeakLine : Line
{
    public new string Text { get; internal set; }
}