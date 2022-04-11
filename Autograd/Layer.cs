namespace Autograd
{
    internal class Layer : Module
    {
        public Layer(int nin, int nout, bool nonlin = false)
        {
            Neurons = new List<Neuron>();
            for (int i = 0; i < nout; i++)
                Neurons.Add(new Neuron(nin, nonlin));
        }
        public List<Value> Call(List<Value> x)
        {
            var out_ = new List<Value>();
            foreach (var n in Neurons)
                out_.Add(n.Call(x));
            return out_;
        }
        public override List<IParameter> parameters()
        {
            List<IParameter> out_ = new();
            foreach(var n in Neurons)
                foreach(var p in n.parameters())
                    out_.Add(p);
            return out_;
        }

        public override string ToString()
        {
            string msg = "";
            foreach (var n in Neurons)
                msg += $"{n}, ";
            return $"Layer of [{msg}]";
            return msg;
        }

        public List<Neuron> Neurons { get; private set; }
    }
}
