//Write a program to find the factorialof any number entered by the user

import java.util.*;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int num;
        System.out.println("enter the number");
        num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
