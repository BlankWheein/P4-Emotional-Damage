public class Value
{
    public IEnumerable<Value> Children { get; }
    private float data;
    private string _op;
    private Action? _backwards;
    private HashSet<Value> _prev;
    public float grad;

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

    public static Value operator +(Value self, object v)
    {
        Value other;
        if (v is Value v2)
            other = v2;
        else
            other = new Value((float)v);
        Value? _out = new Value(self.data + other.data, new List<Value>() { self, other }, "+");
        _out._backwards = () =>
        {
            self.grad += _out.grad;
            other.grad += _out.grad;
        };
        return _out;
    }
    public static Value operator *(Value self, object v)
    {
        Value other;
        if (v is Value v2)
            other = v2;
        else
            other = new Value((float)v);
        Value? _out = new Value(self.data * other.data, new List<Value>() { self, other }, "*");
        _out._backwards = () =>
        {
            self.grad += other.data * _out.grad;
            other.grad += self.data * _out.grad;
        };
        return _out;
    }


    public Value Pow(object v)
    {
        Value other;
        if (v is int i)
            other = new Value(i);
        else if (v is float f)
            other = new Value(f);
        else
            throw new Exception();

        Value? _out = new Value(other.data * (float)Math.Pow(this.data, other.data - 1), new List<Value>() { this, other }, "+");
        _out._backwards = () =>
        {
            if (_out.data > 0)
            {
                grad += _out.data * _out.grad;
            }
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
            if (!topo.Any(p => p == v))
            {
                visited.Add(v);
            }
            foreach (var child in v._prev)
            {
                build_topo(child);
            }
            topo.Add(v);
        }
        build_topo(this);
        this.grad = 1;
        for (int i = topo.Count - 1; i >= 0; i--)
        {
            var v = topo[i];
            v?._backwards();
        }
    }
    public static Value operator -(Value self)
    {
        return -self;
    }
    public static Value operator -(Value self, Value other)
    {
        return self - other;
    }
    public static Value operator -(Value self, int other)
    {
        return self - other;
    }
    public static Value operator /(Value self, Value other)
    {
        return other / self;
    }
    public override string ToString()
    {
        return $"Value(data={data}, grad={grad})";
    }
}
