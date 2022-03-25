using System.Collections.Generic;
using System.Linq;

namespace Compiler.CodeAnalysis
{
        public sealed class EvaluationResult
        {
            public EvaluationResult(IEnumerable<string> diagnotics, object value)
            {
                Diagnotics = diagnotics.ToArray();
                Value = value;
            }

            public IReadOnlyList<string> Diagnotics { get; }
            public object Value { get; }
        }
}