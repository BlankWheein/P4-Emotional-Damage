public class Module
{
    public Module() { }
    public void zero_grad()
    {
        foreach (var p in Parameters())
        {
            p.grad = 0;
        }
    }

    public virtual List<Value> Parameters()
    {
        return new List<Value>();
    }
}