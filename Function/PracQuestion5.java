
//Write a Java method to compute the sum of the digits in an integer.
import java.util.*;

public class PracQuestion5 {
    public static int SumOfDigit(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            number = number / 10;
            sum = sum + digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SumOfDigit(889));
    }
}
