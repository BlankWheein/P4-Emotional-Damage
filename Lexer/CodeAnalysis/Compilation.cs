using Compiler.CodeAnalysis.Binding;
using Compiler.CodeAnalysis.Syntax;
using System;
using System.Linq;

namespace Compiler.CodeAnalysis
{
        public class Compilation
        {
            public Compilation(SyntaxTree syntax)
            {
                Syntax = syntax;
            }

            public SyntaxTree Syntax { get; }

            public EvaluationResult Evaluate()
            {
                var binder = new Binder();
                var boundExpression = binder.BindExpression(Syntax.Root);

                var diagnotics = Syntax.Diagnostics.Concat(binder.Diagnostics).ToArray();
                if (diagnotics.Any())
                    return new EvaluationResult(diagnotics, null);  

                var evaluator = new Evaluator(boundExpression); 
                var value = evaluator.Evaluate();
                return new EvaluationResult(Array.Empty<string>(), value);
            }
        }
}