public class Symbol
{
    public string? Name { get; set; }
    public string? Value { get; set; }
    public string? Type { get; set; }
    public int Id { get; set; }
    public Symbol(int Id, string name)
    {
        this.Name = name;
        this.Id = Id;
    }
    public Symbol()
    {

    }
}
