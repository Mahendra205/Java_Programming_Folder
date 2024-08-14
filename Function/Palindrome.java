
import java.util.*;

public class Palindrome {
    public static int reversNumber(int number) {
        int reversnumber = 0;
        while (number != 0) {
            int lastdigit = number % 10;
            number = number / 10;
            reversnumber = reversnumber * 10 + lastdigit;
        }
        return reversnumber;
    }

    public static boolean isPalindrome(int number) {
        int reversnumber = reversNumber(number);
        if (reversnumber == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean ans = isPalindrome(12231);
        System.out.println(ans);
    }
}
