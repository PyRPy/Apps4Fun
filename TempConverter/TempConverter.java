// model, actual calculations for temperature conversions
public class TempConverter
{
    public double c2f(double temp) 
    {
        return 1.8 * temp + 32;
    }

    public double f2c(double temp)
    {
        return 0.556 * (temp - 32);
    }
}