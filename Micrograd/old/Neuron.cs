// See https://aka.ms/new-console-template for more information
public class Neuron : Module
{
    private readonly int nin;
    public readonly bool nonlin;
    public List<Value> w = new List<Value>();
    public Value b;
    Random random = new Random();
    public Neuron(int nin, bool nonlin = true)
    {
        for (int i = 0; i < nin; i++)
            w.Add(new Value((float)random.NextDouble()));
        b = new Value(0);
        this.nin = nin;
        this.nonlin = nonlin;
    }
    public Action Call(int x)
    {
        foreach (Value wi, xi in w, x)
    }
    public override List<Value> Parameters()
    {
        var res = w;
        res.Add(b);
        return res;
    }
    public override string ToString()
    {
        var lin = nonlin == true ? "ReLU" : "Linear";
        return $"{lin} Neuron({w.Count})";
    }

}