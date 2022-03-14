

using Compiler.CodeAnalysis.Syntax;
using Compiler.CodeAnalysis.Binding;
using Compiler.CodeAnalysis;

class Program
{
    public static void Main()
    {
        bool showTree = true;

        while (true)
        {
            Console.Write("> ");
            var line = Console.ReadLine();
            if (string.IsNullOrWhiteSpace(line))
                return;

            if (line == "#showTree")
            {
                showTree = !showTree;
                Console.WriteLine(showTree ? "Showing parse trees." : "Not showing parse trees");
                continue;
            }
            else if (line == "#cls")
            {
                Console.Clear();
                continue;
            }

            var syntaxTree = SyntaxTree.Parse(line);
            var Binder = new Binder();
            var boundExpression = Binder.BindExpression(syntaxTree.Root);
            var diagnostics = syntaxTree.Diagnostics.Concat(Binder.Diagnostics).ToArray();
            if (showTree)
            {
                Console.ForegroundColor = ConsoleColor.DarkGray;
                Pretty.Printer(syntaxTree.Root);
                Console.ResetColor();
            }

            if (!diagnostics.Any())
            {
                var e = new Evaluator(boundExpression);
                var result = e.Evaluate();
                Console.WriteLine(result);
            }
            else
            {
                Console.ForegroundColor = ConsoleColor.DarkRed;
                foreach (var diagnostic in syntaxTree.Diagnostics)
                    Console.WriteLine(diagnostic);
                Console.ResetColor();

            }
        }

    }
}
