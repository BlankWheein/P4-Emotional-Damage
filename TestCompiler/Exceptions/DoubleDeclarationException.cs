using Antlr4.Runtime;

namespace TestCompiler.Exceptions
{
    public class DoubleDeclarationException : ParserExceptions
    {
        public DoubleDeclarationException(string? message, ParserRuleContext? Line, ParserRuleContext? character) : base(message, Line, character)
        {
        }
    }
}
