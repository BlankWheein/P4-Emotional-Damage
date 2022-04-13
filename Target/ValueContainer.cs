
namespace AutoGrad
{
    public class ValueContainer
    {
        public ValueContainer(Value result, Value[] grad)
        {
            Result = result;
            Grad = grad;
        }
        public Value Result { get; set; }
        public Value[] Grad { get; set; }
    }
}