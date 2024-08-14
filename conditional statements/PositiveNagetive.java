
//Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.*;

public class PositiveNagetive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        if (number >= 0) {
            System.out.println(number + " is a positive number");
        } else {
            System.out.println(number + " is a nagetive number");
        }
    }
}
