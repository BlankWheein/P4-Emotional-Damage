using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static EmotionalDamageParser;
namespace Compiler.Phases
{
    interface ITypeChecker
    {
        public void EvaluateMatrixExpr(MatrixarrexprContext context, string type);
        public void EvaluateMatrixDimensions();
        public void EvaluateNumExpr(NumexprContext context, string type);

    }
}
