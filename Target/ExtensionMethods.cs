public static class ExtensionMethods
{
    public static string ToStringExtension(this int[] kage)
    {
        string Arr = "";
        for (int i = 0; i < kage.Length; i++)
        {
            Arr += kage[i].ToString();
            Arr += ", ";
        }
        Arr = Arr[0..^2];
        return $"[{Arr}]";
    }
    public static string ToStringExtension(this float[] kage)
    {
        string Arr = "";
        for (int i = 0; i < kage.Length; i++)
        {
            Arr += kage[i].ToString();
            Arr += ", ";
        }
        Arr = Arr[0..^2];
        return $"[{Arr}]";
    }

    public static string ToStringExtension(this float kage)
    {
        return $"{kage}";
    }

    public static string ToStringExtension(this int kage)
    {
        return $"{kage}";
    }

    public static string ToStringExtension(this string kage)
    {
        return $"{kage}";
    }

    public static string ToStringExtension(this bool kage)
    {
        return $"{kage}";
    }
} 
