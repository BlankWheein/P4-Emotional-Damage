using Antlr4.Runtime;
using System;
using System.Collections.Generic;
using System.Text;
using TestCompiler.Steps;
using static TestGrammarParser;
namespace TestCompiler.Steps
{
    public class Compiler
    {
        private readonly StringBuilder __source;
        private List<ICompilerStep> Steps = new List<ICompilerStep>();

        public Compiler(StringBuilder source)
        {
            __source = source;
        }

        public void Compile()
        {
            AntlrInputStream inputStream = new(__source.ToString());
            TestGrammarLexer speakLexer = new(inputStream);
            CommonTokenStream commonTokenStream = new(speakLexer);
            TestGrammarParser speakParser = new(commonTokenStream);
            ProgContext progContext = speakParser.prog();
            BasicVisitor visitor = new();
            Console.ResetColor();
            visitor.Visit(progContext);
            Console.ForegroundColor = ConsoleColor.Red;
            foreach (var s in visitor.Scope.Diagnostics)
            {
                Console.WriteLine(s);
            }
            Console.ResetColor();
            if (visitor.Scope.Diagnostics.Count == 0)
            {
                Console.WriteLine("Printing Scope Tree:");
                Console.ForegroundColor= ConsoleColor.Green;
                visitor.Print();
                Console.ResetColor();
                Console.WriteLine() ;
            }
            visitor.Generator.Dispose();
        }

    }
}