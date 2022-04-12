using AutoGrad;

IEnumerable<Value> kage(int x,int y) {
    Value _x = new(x);
    Value _y = new(y);
    Value _res = _x*2/10+_y*5;
    _res.backward();
    yield return _res;
    yield return _x;
    yield return _y;
}
var k = kage(2);
var k3 = kage(4, 2);
var k2 = kage();
