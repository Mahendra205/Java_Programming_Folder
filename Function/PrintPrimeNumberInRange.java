import java.util.*;

public class PrintPrimeNumberInRange {

    public static boolean Prime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                return false;

            }

        }
        return true;
    }

    public static void PrimesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (Prime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimesInRange(20);
    }
}
