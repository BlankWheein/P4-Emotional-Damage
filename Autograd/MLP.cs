//namespace Autograd
//{
//    internal class MLP : Module
//    {
//        private List<int> sz;
//        private List<Layer> layers;

//        public MLP(int nin, List<int> nouts)
//        {
//            var res = nouts.ToList();
//            res.Add(nin);
//            sz = res;
//            layers = new List<Layer>();
//            for (int i = 0; i < nouts.Count; i++)
//                layers.Add(new Layer(sz[i], sz[i+1], nonlin: i != nouts.Count-1));
//        }
//        public List<Value> Call(List<Value> x)
//        {
//            List<Value> x2 = new();
//            foreach (Layer layer in layers)
//                x2 = layer.Call(x);
//            return x2;
//        }
//        public override List<IParameter> parameters()
//        {
//            var temp = new List<IParameter>();
//            foreach(var p in layers)
//                foreach(var p2 in p.parameters())
//                    temp.Add(p2);
//            return temp;
//        }

//    }
//}
