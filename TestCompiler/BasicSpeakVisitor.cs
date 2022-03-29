using static TestCompiler.TestGrammarParser;

public class BasicSpeakVisitor : TestGrammarBaseVisitor<object>
{
    public List<TestGrammarLine> Lines = new List<TestGrammarLine>();
    public override object VisitLine(TestGrammarParser.PrintContext context)
    {
        NumContext name = context.;
        OpinionContext opinion = context.opinion();
        SpeakLine line = new SpeakLine() { Person = name.GetText(), Text = opinion.GetText().Trim('"') };
        Lines.Add(line);
        return line;
    }
}

public class TestGrammarLine
{

}
