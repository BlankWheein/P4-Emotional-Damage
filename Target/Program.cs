using AutoGrad;

Value f = new Value(2.5f, null,"f", true);
Value g = f.Pow(MathF.Pow(4, 2));
f.Backward();
Value d = g.grad;
