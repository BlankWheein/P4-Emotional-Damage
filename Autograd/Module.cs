using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Autograd
{
    internal class Module
    {
        public void zero_grad()
        {
            foreach (var p in parameters())
                p.grad = 0;
        }
        public virtual List<IParameter> parameters()
        {
            return new List<IParameter>();
        }
    }
}
