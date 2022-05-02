
namespace AutoGrad
{
    public class Matrix
    {
        Random Random = new();
        private float grad;

        public int Rows { get; }
        public int Columns { get; }
        public bool CalculateGradient { get; }
        public Value[][] Values { get; set; }
        public Matrix(int rows, int columns, float? InitialValue = null, bool CalculateGradient = false)
        {
            Rows = rows;
            Columns = columns;
            this.CalculateGradient = CalculateGradient;
            Values = new Value[Rows][];
            for (int i = 0; i < Rows; i++)
            {
                Values[i] = new Value[Columns];
                for (int j = 0; j < Columns; j++)
                {
                    if (InitialValue == null)
                        Values[i][j] = new Value((float)Random.NextDouble(), CalculateGradient: CalculateGradient);
                    else
                        Values[i][j] = new Value((float)InitialValue, CalculateGradient: CalculateGradient);
                }
            }
        }

        public void Backward()
        {
            for (int i = 0; i < Rows; i++)
                for (int j = 0; j < Columns; j++)
                    Values[i][j].Backward();
            ZeroGrad();
        }
        public void ZeroGrad()
        {
            grad = 0;
            for (int i = 0; i < Rows; i++)
                for (int j = 0; j < Columns; j++)
                {
                    grad += Values[i][j].grad;
                    Values[i][j] = null;
                }
        }
        public Matrix Transpose()
        {
            Matrix result = new(Columns, Rows);
            for (int i = 0; i < Columns; i++)
                for (int j = 0; j < Rows; j++)
                    result.Values[i][j] = Values[j][i];
            return result;
        }
        public Matrix Dot(Matrix other)
        {
            if (Columns != other.Rows)
                throw new Exception();
            var prod = new Matrix(Rows, other.Columns, 0);
            for (int i = 0; i < prod.Rows; i++)
                for (int j = 0; j < prod.Columns; j++)
                    for (int k = 0; k < Columns; k++)
                        prod.Values[i][j] += Values[i][k] * other.Values[k][j];
            return prod;
        }

        public static Matrix operator *(Matrix self, Matrix other)
        {
            return self.Dot(other);
        }

        public static Matrix operator *(Matrix self, float other)
        {
            Matrix matrix = new(self.Rows, self.Columns);
            for (int i = 0; i < self.Rows; i++)
                for (int j = 0; j < self.Columns; j++)
                    matrix.Values[i][j] = self.Values[i][j] * other;
            return matrix;
        }
        public static Matrix operator +(Matrix self, Matrix other)
        {
            if (self.Rows != other.Rows && self.Columns != other.Columns)
                throw new Exception();
            Matrix res = new(self.Rows, self.Columns, 0);
            for (int i = 0; i < res.Rows; i++)
                for (int j = 0; j < res.Columns; j++)
                    res.Values[i][j] = self.Values[i][j] + other.Values[i][j];
            return res;
        }
        public static Matrix operator -(Matrix self, Matrix other)
        {
            if (self.Rows != other.Rows && self.Columns != other.Columns)
                throw new Exception();
            Matrix res = new(self.Rows, self.Columns, 0);
            for (int i = 0; i < res.Rows; i++)
                for (int j = 0; j < res.Columns; j++)
                    res.Values[i][j] = self.Values[i][j] - other.Values[i][j];
            return res;
        }
    }

}