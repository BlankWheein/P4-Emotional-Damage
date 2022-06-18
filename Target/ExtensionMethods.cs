using AutoGrad;

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

    public static float Next( this Random rnd, float min, float max)
    {
        double dmin = (double)min;
        double dmax = (double)max;
        double range = dmax - dmin;
        double sample = rnd.NextDouble();
        double scaled = (sample * range) + dmin;
        float k = (float)scaled;
        return k;
    }

    public static void Next(this int num, int min, int max)
    {
        num = new Random().Next(min, max);
    }
    public static void Next(this float num, float min, float max)
    {
        num = new Random().Next(min, max);
    }

    public static void Next(this int[] arr, int min, int max)
    {
        for (int i = 0; i < arr.Length; i++)
            arr[i] = new Random().Next(min, max);
    }

    public static void Next(this float[] arr, float min, float max)
    {
        var rnd = new Random();
        for (int i = 0; i < arr.Length; i++)
            arr[i] = new Random().Next(min, max);
    }

    public static float Pow(this float self, float other)
    {
        return MathF.Pow(self, other);
    }
    public static int Pow(this int self, int other)
    {
        return (int)MathF.Pow(self, other);
    }
    public static float relu(this float self)
    {
        return self < 0 ? 0 : self;
    }
    public static int relu(this int self)
    {
        return self < 0 ? 0 : self;
    }



}

