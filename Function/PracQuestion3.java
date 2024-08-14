
//write a java method to check the number is palindrome or not.
import java.util.*;

import javax.lang.model.type.NullType;

public class PracQuestion3 {
    public static void PalindromeNumber(int number) {
        int myNum = number;
        int revers = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            revers = revers * 10 + lastDigit;
            number = number / 10;
        }
        if (myNum == revers) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");

        }

    }

    public static void main(String[] args) {
        PalindromeNumber(222);
    }
}
