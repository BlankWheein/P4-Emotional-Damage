
func void Hej() {
    print("Hello World");
}

func int[2, 2] Test(int[2, 1] x, int[1, 2] y) {
    int[2, 2] xy = x . y;
    return xy;
}

func void Main() {
    Hej();
    int[2, 1] x = 1;
    int[1, 2] y = 68;
    int[2, 2] xy = Test(x, y);
}







Main();