using AutoGrad;

ValueContainer kage(int x,int y) {
    Value _x = new(x);
    Value _y = new(y);
    Value _res =  _x  * 2 / 10 + _y  * 5;
    _res.backward();
    return new ValueContainer(_res, new List<Value>() { _x, _y });
}
int x = 2;
int y = 4;
var k = kage(x, y);
Console.WriteLine(k.Result.data);
Console.WriteLine($"{k.Grad[0].grad} - {k.Grad[0].data}");
Console.WriteLine($"{k.Grad[1].grad} - {k.Grad[1].data}");
