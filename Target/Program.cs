using AutoGrad;
using BenchmarkDotNet.Attributes;
using BenchmarkDotNet.Running;

namespace Benchamrks
{

    [MemoryDiagnoser]
    public class Tests
    {
        private int c = 100;
        private int r = 100;
        [Benchmark]
        public void CalculateGradientTrue()
        {
            Matrix m = new(r, c, 0, true);
            Matrix m2 = new(r, c, 0, true);
            var k = m.Dot(m2);
        }
        [Benchmark]
        public void CalculateGradientFalse()
        {
            Matrix m = new(r, c, 0, false);
            Matrix m2 = new(r, c, 0, false);
            var k = m.Dot(m2);
        }
        
        [Benchmark]
        public void DotCSMatrix()
        {
            float[,] m = new float[r, c];
            float[,] m2 = new float[r, c];
            float[,] prod = new float[r, c];
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                {
                    m[i, j] = 0;
                    m2[i, j] = 0;
                }
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    for (int k = 0; k < c; k++)
                        prod[i, j] = prod[i, j] + (m[i, k] * m2[k, j]);
        }
    }
    public class Program
    {
        public static void Main(string[] args)
        {
            var summary = BenchmarkRunner.Run<Tests>();
        }
    }
}
