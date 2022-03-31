using Antlr4.Runtime;
using System;
using System.Runtime.Serialization;

namespace TestCompiler.Exceptions
{
    public abstract class ParserExceptions : Exception
    {
        public string? Line { get; private set; }
        public string? Character { get; private set; }

        public string GetLineNumber<T, U>(T? ctx, U? ctx2) where T : ParserRuleContext where U : ParserRuleContext
        {
            return $"{ctx?.Start.Line}:{ctx2?.Start.Column + 1}";
        }
        protected ParserExceptions(string? message, ParserRuleContext? Line, ParserRuleContext? character) : base(message)
        {
            this.Line = Line?.Start.Line.ToString();
            Character = character?.Start.Column.ToString();
        }
        protected ParserExceptions()
        {
        }

        protected ParserExceptions(string? message) : base(message)
        {
        }

        protected ParserExceptions(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }

        protected ParserExceptions(string? message, Exception? innerException) : base(message, innerException)
        {
        }
        public override string ToString()
        {
            return base.ToString() + " " + Line + ":"+Character;
        }
    }
}
