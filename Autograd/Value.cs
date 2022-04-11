namespace Autograd
{
    public class Value : IParameter
    {
        public IEnumerable<Value> Children { get; }
        public float data;
        public string _op;
        public Action? _backwards;
        public HashSet<Value> _prev;
        public float grad { get; set; }

        public Value(float data, IEnumerable<Value>? _children = null, string _op = "")
        {
            if (_children == null)
                _children = new List<Value>();
            grad = 0;
            this.data = data;
            Children = _children;
            this._op = _op;
            _backwards = null;
            _prev = new HashSet<Value>(Children);
        }
        public static Value operator +(Value self, float other) => self + new Value(other);
        public static Value operator +(Value self, int other) => self + new Value(other);

        public static Value operator +(float self, Value other) => other + new Value(self);
        public static Value operator +(int self, Value other) => other + new Value(self);
        public static Value operator +(Value self, Value other)
        {
            Value? _out = new(self.data + other.data, new List<Value>() { self, other }, "+");
            _out._backwards = () =>
            {
                self.grad += _out.grad;
                other.grad += _out.grad;
            };
            return _out;
        }
        public static Value operator *(Value self, float other) => self * new Value(other);
        public static Value operator *(float self, Value other) => other * new Value(self);
        public static Value operator *(Value self, int other) => self * new Value(other);
        public static Value operator *(int self, Value other) => other * new Value(self);
        public static Value operator *(Value self, Value other)
        {
            Value? _out = new(self.data * other.data, new List<Value>() { self, other }, "*");
            _out._backwards = () =>
            {
                self.grad += other.data * _out.grad;
                other.grad += self.data * _out.grad;
            };
            return _out;
        }

        public Value Pow(int v) => Pow(new Value(v));
        public Value Pow(float v) => Pow(new Value(v));
        public Value Pow(Value other)
        {
            Value? _out = new((float)Math.Pow(data, other.data), new List<Value>() { this }, $"**{other}");
            _out._backwards = () =>
            {
                grad += other.data * MathF.Pow(data, other.data - 1) * _out.grad;
            };
            return _out;
        }
        public Value relu()
        {
            Value? _out = new Value(data < 0 ? 0 : this.data, new List<Value>() { this }, "ReLU");
            _out._backwards = () =>
            {
                if (_out.data > 0)
                {
                    grad += _out.data * _out.grad;
                }
            };
            return _out;
        }
        public void backward()
        {
            var topo = new List<Value>();
            var visited = new HashSet<Value>();
            void build_topo(Value v)
            {
                if (!visited.Contains(v))
                {
                    visited.Add(v);
                    foreach(var child in v._prev)
                        build_topo(child);
                    topo.Add(v);
                }
            }
            build_topo(this);
            grad = 1;
            foreach (var v in topo.Reverse<Value>())
                if (v?._backwards != null)
                    v?._backwards();
        }

        public static Value operator -(Value self)
        {
            return new Value(-self.data);
        }
        public static Value operator -(Value self, Value other)
        {
            return self + -other;
        }
        
        public static Value operator / (Value self, Value other)
        {
            return other * self.Pow(-1);
        }
        public static Value operator /(Value self, float other)
        {
            return new Value(other) * self.Pow(-1);
        }
        public static Value operator /(float self, Value other)
        {
            return other * new Value(self).Pow(-1);
        }
        public override string ToString()
        {
            return $"Value(data={data}, grad={grad})";
        }
    }
}
