using AutoGrad;

float kage (float a) {
    return a;
}
float f = 2;
float a = MathF.Pow(f + 2, 10);
float b = MathF.Pow(230, 10);
float c = MathF.Pow(20 + kage(f) + 30, 10 * 2456);
