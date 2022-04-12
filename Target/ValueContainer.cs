
namespace AutoGrad
{
    public class ValueContainer
    {
        public ValueContainer(Value result, List<Value> grad)
        {
            Result = result;
            Grad = grad;
        }
        public Value Result { get; set; }
        public List<Value> Grad { get; set; }
    }
}