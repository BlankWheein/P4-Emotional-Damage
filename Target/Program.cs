using AutoGrad;
Random rnd = new();
Value a = new Value(2.5f, null,"a", true);
Matrix b = new(2,2);
float[] c = new float[3];
b.Values[1][1] = b.Values[1][1].relu();
a = a.relu();
c[0] = c.relu();
