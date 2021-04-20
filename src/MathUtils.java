public class MathUtils {
    public static int factorial(int n) {
        if (n < 1)
            throw new IllegalArgumentException("Меньше");
        else if (n > 16)
            throw new IllegalArgumentException("Больше");
        int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }
}
