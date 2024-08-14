import java.util.*;

public class PrimeNUmber {
    // public static boolean Prime(int n) {
    // if (n == 2) {
    // return true;
    // }
    // boolean isPrime = true;
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // isPrime = false;
    // break;
    // }

    // }
    // return isPrime;
    // }

    // using under_root N
    public static boolean Prime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (i % n == 0) {

                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Prime(7));
    }
}
