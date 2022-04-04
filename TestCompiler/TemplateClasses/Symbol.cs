public class Symbol
{
    public string? Name { get; set; }
    public string? Value { get; set; }
    public string? Type { get; set; }
    public int Id { get; set; }
    public Symbol(int Id, string name)
    {
        Name = name;
        this.Id = Id;
    }
    public Symbol()
    {

    }
    public override bool Equals(object? obj)
    {
        Symbol? table = obj as Symbol;
        if (table == null) return false;
        return table.ToString() == ToString();
    }
    public override string ToString()
    {
        return $"{Type} {Name} = {Value}";
    }
}
