using AutoGrad;
Random rnd = new();
void kage () {
    float a =  - 23.0f;
    float b = 24.0f;
    float c = a + b;
}
void kage2 () {
    Value a = new Value( - 4.0f, null,"a", true);
    float b = 2.0f;
    Value c = a + b;
    c.Backward();
    float g = a.grad;
}
