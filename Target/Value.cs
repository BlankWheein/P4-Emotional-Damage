using System;
namespace AutoGrad
{
    public class Value
    {
        public static int counter = 1;
        public float data;
        public int Id;
        public string _op;
        public Action? _backwards;
        public List<Value> prev;
        public List<Value> topo;
        public List<Value> visited;
        public float grad { get; set; }
        public bool? CalculateGradient { get; }

        public Value(float data, IEnumerable<Value?>? _children = null, string _op = "", bool? CalculateGradient = null)
        {
            if (CalculateGradient == null) this.CalculateGradient = true;
            grad = 0;
            this.data = data;
            this._op = _op;
            this.CalculateGradient = CalculateGradient;
            Id = counter++;
            _backwards = null;
            prev = new();
            if (_children != null)
                foreach (var child in _children.Reverse())
                    if (child != null)
                    prev.Add(child);
        }
        public static Value operator +(Value self, float other) => self + new Value(other);
        public static Value operator +(Value self, int other) => self + new Value(other);

        public static Value operator +(float self, Value other) => new Value(self) + other;
        public static Value operator +(int self, Value other) => new Value(self) + other;
        public static Value operator +(Value self, Value other)
        {
            return self.Plus(other);
        }
        public Value Plus(Value other)
        {
            Value _out = new(this.data + other.data, null, "+", CalculateGradient: CalculateGradient | other.CalculateGradient);
            if (_out.CalculateGradient == true)
            {
                _out.prev.Add(other);
                _out.prev.Add(this);
                _out._backwards = () =>
                {
                    this.grad += _out.grad;
                    other.grad += _out.grad;
                };
            }
            return _out;
        }

        public static Value operator *(Value self, float other) => self * new Value(other, CalculateGradient: self.CalculateGradient);
        public static Value operator *(Value self, int other) => self * new Value(other, CalculateGradient: self.CalculateGradient);
        public static Value operator *(float self, Value other) => new Value(self) * other;
        public static Value operator *(int self, Value other) => new Value(self) * other;
        public static Value operator *(Value self, Value other)
        {
            return self.Times(other);
        }
        public Value Times(Value other)
        {
            Value? _out = new(data * other.data, null, "*", CalculateGradient: CalculateGradient | other.CalculateGradient);
            if (_out.CalculateGradient == true)
            {
                _out.prev.Add(other);
                _out.prev.Add(this);
                _out._backwards = () =>
                    {
                        this.grad += other.data * _out.grad;
                        other.grad += this.data * _out.grad;
                    };
            }

            return _out;
        }

        public Value Pow(int v) => Pow((float)v);
        public Value Pow(float other)
        {
            Value? _out = new(MathF.Pow(data, other), new List<Value>() { this }, $"**{other}", CalculateGradient: CalculateGradient);
            if (CalculateGradient == true)
                _out._backwards = () =>
                {
                    this.grad += (other * MathF.Pow(this.data, other - 1.0f)) * _out.grad;
                };
            return _out;
        }
        public Value relu()
        {
            Value? _out = new(data < 0 ? 0 : data, new List<Value>() { this }, "ReLU", CalculateGradient: CalculateGradient);
            if (CalculateGradient == true)
                _out._backwards = () =>
                {
                    if (_out.data > 0)
                        this.grad += _out.grad;
                };
            return _out;
        }

        public Value Backward()
        {
            topo = new();
            visited = new();
            void build_topo(Value v)
            {
                if (!visited.Contains(v))
                {
                    visited.Add(v);
                    foreach (Value child in v.prev)
                        if (child.CalculateGradient == true)
                        build_topo(child);
                    topo.Add(v);
                }
            }
            build_topo(this);
            foreach (Value v in topo.Reverse<Value>())
                v.grad = 0;
            grad = 1.0f;
            foreach (Value v in topo.Reverse<Value>())
                if (v?._backwards != null)
                    v?._backwards();
            return this;
        }

        public static Value operator -(Value self)
        {
            return self * (-1);
        }

        public static Value operator -(Value self, Value other)
        {
            return self + (-other);
        }
        public static Value operator -(float self, Value other)
        {
            return new Value(self, CalculateGradient: other.CalculateGradient) + (-other);
        }
        public static Value operator -(Value self, float other)
        {
            return self + new Value(-other, CalculateGradient: self.CalculateGradient);
        }

        public static Value operator /(Value self, float other)
        {
            return self * new Value(other, CalculateGradient: self.CalculateGradient).Pow(-1);
        }
        public static Value operator /(Value self, Value other)
        {
            return self * new Value(other.data, CalculateGradient: self.CalculateGradient).Pow(-1);
        }
        public static Value operator /(float self, Value other)
        {
            return new Value(self, CalculateGradient: other.CalculateGradient) * other.Pow(-1);
        }

        public override string ToString()
        {
            return $"{data}";
        }

        public string ToStringExtension() => ToString();
    }
}