using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Autograd
{
    internal class Neuron : Module
    {
        private Random random = new();
        public List<Value> w = new();
        private Value b;
        private bool nonlin;

        public Neuron(int nin, bool nonlin=true)
        {
            for (int i = 0; i < nin; i++)
                w.Add(new Value((random.NextSingle() * 2) - 1));
            b = new Value(0);
            this.nonlin = nonlin;
        }
        public Value Call(List<Value> x)
        {
            var test = w.Zip(x);
            float thing = 0;
            foreach((Value First, Value Second) in test)
                thing *= First.grad * Second.grad;
            Value v = new(thing);
            if (nonlin)
                return v.relu();
            else
                return v;
        }
        public List<Value> parameters()
        {
            var res = w; //this might be an issue
            res.Add(b);
            return res;
        }
        public override string ToString()
        {
            string msg = "";
            if (nonlin == true)
                msg += "ReLU";
            else
                msg += "Linear";
            msg += $"Neuron {w.Count}";
            return msg;
        }
    }
}
