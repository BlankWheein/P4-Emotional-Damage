public static class ArrayExftensions
{
    public static string ToString(this int[] kage)
    {
        string Arr = "";
        for (int i = 0; i < kage.Length; i++)
        {
            Arr += kage[i];
            Arr += ", ";
        }
        return $"{Arr}";
    }
    public static string ToString(this float[] kage)
    {
        string Arr = "";
        for (int i = 0; i < kage.Length; i++)
        {
            Arr += kage[i];
            Arr += ", ";
        }
        return $"{Arr}";
    }
} 
