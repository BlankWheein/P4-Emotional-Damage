using Antlr4.Runtime;

namespace TestCompiler.Exceptions
{
    public class IdNotFoundException : ParserExceptions
    {
        public IdNotFoundException(string? message, ParserRuleContext? Line, ParserRuleContext? character) : base(message, Line, character)
        {
        }
    }
}
