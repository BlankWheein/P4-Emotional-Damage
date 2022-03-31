namespace TestCompiler
{
    public class AssignmentLine
{
    public string? ValType { get; set; }
    public string? Expr { get; set; }
    public string? Id { get; set; }
    public new string Text { get => $"{ValType} {Id} = {Expr}"; }
}
}