using Antlr4.Runtime;

namespace TestCompiler.Exceptions
{
    public class TypeErrorException : ParserExceptions
    {
        public TypeErrorException(string? message, ParserRuleContext? Line, ParserRuleContext? character) : base(message, Line, character)
        {
        }
        public TypeErrorException(string? message, ParserRuleContext? Line) : base(message, Line, null)
        {
        }
    }
}
