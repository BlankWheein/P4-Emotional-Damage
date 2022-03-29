using Antlr4.Runtime;
using System.Text;
using TestCompiler;

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
            while ((input = Console.ReadLine()) != "u0004")
            {
                text.AppendLine(input);
            }

            AntlrInputStream inputStream = new AntlrInputStream(text.ToString());
            TestGrammarLexer speakLexer = new TestGrammarLexer(inputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(speakLexer);
            TestGrammarParser speakParser = new TestGrammarParser(commonTokenStream);
            TestGrammarParser.PrintContext progContext = speakParser.print();
            BasicSpeakVisitor visitor = new BasicSpeakVisitor();
            visitor.Visit(progContext);
            foreach (var line in visitor.Lines)
            {
                Console.WriteLine("{0} has said {1}", line.Person, line.Text);
            }
        }
        catch (Exception ex)
        {
            Console.WriteLine("Error: " + ex);
        }
    }
}
