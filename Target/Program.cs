using AutoGrad;

Value x = new Value(4, null,"x", true);
float f = MathF.Sqrt(x.data + 4 * MathF.Sqrt(45));
Value y = x.Pow(1 / 2);
y.Backward();
float h = x.grad;
