int m = 2;
int n = 3;
void Hej() {
    print("Hello World");
}

int[m, n] Test(int[m, n] x, int[n, m] y) {
    int[2, 2] xy = x . y;
    return xy;
}

int[2, 2] Test2() {
    int[2, 2] x = 2;
    int[2, 2] xy = ~(x);
    return xy;
}

void Test3(int[m, n] x, int[n, m] y) {
    println("Hejsa");
}

void Test4(int[m] x, int[m] y) {
    println("Hejsa");
}

autograd void Test5(float x, double y, string test) {
    println("Hejsa");
}

void Test6() {
    int kage;
    if (1 == 2 OR 2 == 2) {
        kage = 3;
    } elif (1 == 1 AND 2 == 2) {
        kage = 5;
    } else {
        kage = 69;
    }
}

void Main() 
{
    Hej();
    int[2, 1] x = 1;
    int[1, 2] y = 68;
    int[2, 2] xy = Test(x, y);
    int kage = x.row;
    kage = x.col;
    int[2] l = 2;
    kage = l.len;
    Test2();
    Test3();
    Test4();
    Test5();
    Test5().backwards;
}


Main();