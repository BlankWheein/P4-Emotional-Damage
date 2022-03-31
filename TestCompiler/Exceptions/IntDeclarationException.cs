using Antlr4.Runtime;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestCompiler.Exceptions
{
    public class IntDeclarationException : ParserExceptions
    {
        public IntDeclarationException(string? message, ParserRuleContext? Line, ParserRuleContext? character) : base(message, Line, character)
        {
        }
    }
}
