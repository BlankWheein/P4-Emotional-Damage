using Antlr4.Runtime;

namespace TestCompiler.Exceptions
{
    public class FloatDeclarationException : ParserExceptions
    {
        public FloatDeclarationException(string? message, ParserRuleContext? Line, ParserRuleContext? character) : base(message, Line, character)
        {
        }
    }
}
