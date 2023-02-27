# P4-Emotional-Damage
A compiler for a statically typed language, which simplifies the ability to compute first-order gradients, while providing type safety of common
domain types and operations.

![](https://c.tenor.com/K9-SqJMNjkEAAAAC/emotional-damage.gif)

as the name suggest this project involved a lot of math to compute the correct gradients and outputs of matrices.

# structure of the compiler

The compiler consists of 4 Files:

1. TypeChecker
2. ScopeVisitor
3. PreCodeGen
4. CodeGeneratorV2

These files cover these phases of the compiler:

* Lexical Analysis.
* Syntactic Analysis or Parsing.
* Semantic Analysis.
* Intermediate Code Generation.
* Code Generation.

This is done using an abstract syntax tree

# Example input

```cs
float a = -4.0;
float b = 2.0;
float c = a + b;
float d = a * b + b**3;
c = c + c + 1;
c = c + 1 + c + (-a);
float k1 = (b + a);
k1.relu;
float k2 = (b - a);
k2.relu;
d = d + d * 2 + k1;
d = d + 3 * d + k2;
float e = c - d;
float f = e**2;
float g = f / 2.0;
g = g + 10.0 / f;
println($"{g}");
float x = g \\ a;
float x2 = g \\ b;
println(x);
println(x2);
```


# Example Compiled Program

```cs
using AutoGrad;
Random rnd = new();
Value a = new Value( - 4.0f, null,"a", true);
Value b = new Value(2.0f, null,"b", true);
Value c = a + b;
Value d = a * b + b.Pow(3);
c = c + c + 1;
c = c + 1 + c + ( - a);
Value k1 = (b + a);
k1 = k1.relu();
Value k2 = (b - a);
k2 = k2.relu();
d = d + d * 2 + k1;
d = d + 3 * d + k2;
Value e = c - d;
Value f = e.Pow(2);
Value g = f / 2.0f;
g = g + 10.0f / f;
Console.WriteLine($"{g.ToStringExtension()}");
g.Backward();
float x = a.grad;
float x2 = b.grad;
Console.WriteLine(x);
Console.WriteLine(x2);
```
