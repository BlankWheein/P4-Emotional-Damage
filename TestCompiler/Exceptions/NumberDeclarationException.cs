using Antlr4.Runtime;

namespace TestCompiler.Exceptions
{
    public class NumberDeclarationException : ParserExceptions
    {
        public NumberDeclarationException(string? message, ParserRuleContext? Line, ParserRuleContext? character) : base(message, Line, character)
        {
        }
    }
}
