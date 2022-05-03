using AutoGrad;

Matrix happy = new(2,2);
happy.Values[1][0] = new Value(1, CalculateGradient: false);
happy.Values[1][1] = new Value(1, CalculateGradient: false);
happy.Values[0][1] = new Value(1, CalculateGradient: false);
int[] hap = new int[2];
hap[0] = 1;
hap[1] = 2;
Console.Write($"{happy}");
