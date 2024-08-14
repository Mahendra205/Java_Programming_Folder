//Write a method named isEven that accepts an int argument.The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

import java.util.*;

public class PracQuestion2 {
    public static boolean isEven(int evenNum) {
        if (evenNum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // int evenNum;

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter an integer: ");
        // evenNum = sc.nextInt();
        int target = 8;

        if (isEven(target)) {
            System.out.println("even number");
        } else {
            System.out.println("is odd");
        }

    }
}
