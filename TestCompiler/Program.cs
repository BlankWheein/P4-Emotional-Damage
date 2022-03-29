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
            TestGrammarParser.StmtsContext progContext = speakParser.stmts();
            BasicSpeakVisitor visitor = new BasicSpeakVisitor();
            visitor.Visit(progContext);
            foreach (var line in visitor.Lines)
            {
                Console.WriteLine("PRINT ({0});", line.Text);
            }
        }
        catch (Exception ex)
        {
            Console.WriteLine("Error: " + ex);
        }
    }
}

public class BasicSpeakVisitor : TestGrammarBaseVisitor<object>
{
    public List<SpeakLine> Lines = new List<SpeakLine>();
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

public class SpeakLine
{
    public string Text { get; internal set; }
}