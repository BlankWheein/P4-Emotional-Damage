using AutoGrad;

Value[] kage(int x,int y) {
    Value _x = new(x);
    Value _y = new(y);
    Value _res =  _x  * 2 / 10 + _y  * 5;
    _res.backward();
    return new Value[3] { _res, _x, _y };
}
int x = 2;
int y = 4;
int i = 0;
float kagda = 2f * 4f;
float kagda2 = x*4f;
float kagda3 = 2f * y;
float kagda4 = x*y;
void kage2 ( int x) {
    Console.WriteLine(x);
}
int kage3 ( int x) {
    Console.WriteLine(x);
    return 3;
}
if (2==1) {
    Console.WriteLine($"1");
}
else if (2==3) {
    Console.WriteLine($"2");
}
else if (4==3) {
    Console.WriteLine($"3");
}
else {
    Console.WriteLine($"4");
}
while (1==2) {
    Console.WriteLine($"1");
}
Console.WriteLine($"1");
var k = kage(x, y);
Console.WriteLine(k[0].data);
Console.WriteLine($"{k[1].grad} - {k[1].data}");
Console.WriteLine($"{k[2].grad} - {k[2].data}");
