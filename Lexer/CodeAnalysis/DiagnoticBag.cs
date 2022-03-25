using System.Collections;
using System.Collections.Generic;

namespace Compiler.CodeAnalysis
{
    public sealed class DiagnoticBag : IEnumerable<Diagnotics>
    {
        private readonly List<Diagnotics> _diagnotics = new List<Diagnotics>();

        public IEnumerator<Diagnotics> GetEnumerator() => _diagnotics.GetEnumerator();

        IEnumerator IEnumerable.GetEnumerator() => GetEnumerator();

        private void Report(TextSpan span, string message)
        {
            var diagnotics = new Diagnotics(span, message);
            _diagnotics.Add(diagnotics);
        }

        public void ReportInvalidNumber(TextSpan span, string text, Type type)
        {
            var message = $"The number {text} isn't valid {type}.";
            Report(span, message);
        }

        public void ReportBadCharacter(int position, char character)
        {
            var span = new TextSpan(position, 1);
            var message = $"ERROR: bad character input: '{character}'";
            Report(span, message);
        }

        public void AddRange(DiagnoticBag diagnotics)
        {
            _diagnotics.AddRange(diagnotics._diagnotics);
        }
    }
}