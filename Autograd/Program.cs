using Autograd;



kage(-4, 2);
void kage(int x, int y)
{
    Value a = new(x);
    Value b = new(y);
    Value c = a + b;
    Value d = (a * b) + b.Pow(3);
    c += c + 1f;
    c += 1 + c + (-a);
    d += d * 2f + (b + a).relu();
    d += d * 3f + (b - a).relu();
    Value e = c - d;
    Value f = e.Pow(2);
    Value g = f / 2.0f;
    g += 10.0f / f;
    Console.WriteLine($"{g.data}");  // prints 24.7041, the outcome of this forward pass
    g.backward();
    Console.WriteLine($"{a.grad}");  // prints 138.8338, i.e. the numerical value of dg/da
    Console.WriteLine($"{b.grad}");  // prints 645.5773, i.e. the numerical value of dg/db
}

 Value kage2(int x)
{
    Value a = new Value(x) * 2;
    a.backward();
    return a;
}