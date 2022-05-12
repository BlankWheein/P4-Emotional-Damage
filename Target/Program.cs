using AutoGrad;
Random rnd = new();
float a = 2.5f;
Value b = new Value(2.612f, null,"b", true);
Value c = new Value(235 + a, null,"c", true);
b.Backward();
float d = c.grad;
Console.WriteLine();