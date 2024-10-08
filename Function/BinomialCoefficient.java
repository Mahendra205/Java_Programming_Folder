import java.util.*;

public class BinomialCoefficient {
    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int BinoCoeffi(int n, int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n - r);
        int binocoeff = fact_n / (fact_r * fact_nmr);
        return binocoeff;

    }

    public static void main(String[] args) {
        System.out.println(BinoCoeffi(5, 2));
    }
}
