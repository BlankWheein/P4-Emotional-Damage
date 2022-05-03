using AutoGrad;
Random rnd = new();
float kage = 2.34f;
float lol = 10.56f;
float din = 0.95f;
din = rnd.Next(kage, lol);
Console.Write($"{din.ToStringExtension()}");
