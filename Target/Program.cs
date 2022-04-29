using AutoGrad;

Value kage = new Value(2, null,"kage", true);
Value k = new Value(3, null,"k", true);
Value l = k * kage;
l.Backward();
float test = kage.grad;
Console.WriteLine(test);
