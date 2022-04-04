int m = 2;
int n = 3;
func void Hej() {
    print("Hello World");
}

func int[2, 2] Test(int[2, 1] x, int[1, 2] y) {
    int[2, 2] xy = x . y;
    return xy;
}

func int[2, 2] Test2() {
    int[2, 2] x = 2;
    int[2, 2] xy = ~(x);
    return xy;
}

func void Test3(int[m, n] x, int[n, m] y) {
    println("Hejsa");
}

func void Test4(int[m] x, int[m] y) {
    println("Hejsa");
}

autograd func void Test5(float x, double y, string test) {
    println("Hejsa");
}

func void Main() {
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