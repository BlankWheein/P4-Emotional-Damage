using System.Collections.Generic;
using System.Linq;

public class SymbolTable
{
    private readonly List<string> __defaults = new() { "if", "for", "print", "int", "float", "double", "dummy", "EOF" };

    private SymbolTable? _parent = null;
    private SymbolTable? _current;
    public SymbolTable? Parent { get => _parent; set { _parent = value; } }
    public SymbolTable? Current { get => _current; set { _current = value; } }

    public override string ToString()
    {
        string res = "";
        foreach (Symbol s in Symbols.FindAll(p => __defaults.All(o => o != p.Name)))
        {
            res += $"'{s.Type}' '{s.Name}''{s.Value}'";
            if (Symbols.FindAll(p => __defaults.All(o => o != p.Name)).Last() != s)
            {
                res += " // ";
            }
        }
        if (res == "")
        {
            System.Console.ForegroundColor = System.ConsoleColor.Red;
            res = "Scope not used";
        }
        return res;
    }
    public List<SymbolTable> Children = new();
    public List<Symbol> Symbols = new();
    public IEnumerable<Symbol> NonDefaultSymbols
    {
        get
        {
            foreach (Symbol symbol in Symbols.FindAll(p => __defaults.All(o => o != p.Name)))
                yield return symbol;
        }
    }
    private List<string> _diagnostics = new();
    public List<string> Diagnostics => GetDiagnostics();
    public SymbolTable? ExitScope()
    {
        return Parent;
    }

    private List<string> GetDiagnostics()
    {
        List<string> diag = new();
        foreach(string item in _diagnostics)
            diag.Add(item);
        foreach(SymbolTable t in Children)
            foreach (string item in t.Diagnostics)
                diag.Add(item);
        return diag;
    }
    public void AddDiagnostic(string Diag)
    {
        _diagnostics.Add(Diag);
    }

    public SymbolTable(SymbolTable symbolTable) : this()
    {
        Parent = symbolTable;
    }
    public SymbolTable()
    {
        _current = this;
        foreach (string symbol in __defaults)
            Insert("keyword", symbol);
    }

    public SymbolTable Allocate()
    {
        var res = new SymbolTable(this);
        Children.Add(res);
        return res;
    }
    public void Free()
    {
        Symbols.Clear();
        foreach (string symbol in __defaults)
            Insert("keyword", symbol);
    }
    public int Insert(string type, string name, string? value=null)
    {
        Symbol symbol = new Symbol() { Name = name, Type = type, Value = value, Id = Symbols.Count};
        return Insert(symbol);
    }
    public int Insert(Symbol s)
    {
        if (Symbols.Any(p => p.Name == s.Name))
            _diagnostics.Add($"Symbol was already defined '{s.Name}'");
        Symbols.Add(s);
        return s.Id;
    }

    public void SetAttribute(string? Name, string? Value)
    {
        if (Name == null)
            _diagnostics.Add($"Name was null '{Name}'");
        if (Value == null)
            _diagnostics.Add($"Value was null '{Value}'");

        Symbol? symbol = null;
        SymbolTable? target = this;
        while (target != null)
        {
            symbol = target?.Symbols?.FirstOrDefault(p => p.Name == Name);
            if (symbol == null)
            {
                target = Parent;
            }
            else
            {
                symbol.Value = Value;
                break;
            }
        }
        if (symbol == null)
            _diagnostics.Add($"Symbol was not found '{Name}'");
    }

    public Symbol? GetSymbol(string Name)
    {
        return null;
    }

    public Symbol? Lookup(string Name)
    {
        if (Name == null)
        {
            _diagnostics.Add($"Name was null '{Name}'");
            return null;
        }
        Symbol? symbol = null;
        SymbolTable? target = this;
        while (target != null)
        {
            symbol = target?.Symbols?.FirstOrDefault(p => p.Name == Name);
            if (symbol == null)
            {
                target = Parent;
            } else
            {
                break;
            }
        }
        if (symbol == null)
            _diagnostics.Add($"Symbol was not found '{Name}'");
        return symbol;
    }

}
