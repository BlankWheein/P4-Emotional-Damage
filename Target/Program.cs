using AutoGrad;
Random rnd = new();
int min = 1;
int max = 10000;
min.Next(min, max);
max.Next(min, max);
float[] k = new float[5];
k.Next(min, max);
Console.Write($"{k.ToStringExtension()}");
