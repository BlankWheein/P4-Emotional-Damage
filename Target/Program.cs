using AutoGrad;

Value x = new Value(4, null,"x", true);
float f = MathF.Sqrt(x.data + 4 * MathF.Sqrt(45));
Value y = x.Pow(1 / 2);
y.Backward();
float h = x.grad;
Matrix a = new(1,2);
Matrix j = new(1,2);
a.Values[0][0] = new Value(1);
a.Values[0][1] = new Value(2);
j.Values[0][0] = new Value(2);
j.Values[0][1] = new Value(1);
Matrix g = new(1,2);
int s = 4;
g = a - j;
bool t = true;
if(t==true){
Console.WriteLine("hej");
}
if(x.data>=f){
Console.WriteLine("hej");
}
if(x.data<f){
Console.WriteLine("hej");
}
if(x.data<=f){
Console.WriteLine("hej");
}
if(x.data==f){
Console.WriteLine("hej");
}
if(x.data!=f){
Console.WriteLine("hej");
}
float ttsqrt (float l) {
    return l;
}
float xk = 4;
