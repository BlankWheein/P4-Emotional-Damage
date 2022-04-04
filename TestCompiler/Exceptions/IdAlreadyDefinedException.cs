using Antlr4.Runtime;

namespace TestCompiler.Exceptions
{
    public class IdAlreadyDefinedException : ParserExceptions
    {
        public IdAlreadyDefinedException(string? message, ParserRuleContext? Line, ParserRuleContext? character) : base(message, Line, character)
        {
        }
    }
}
