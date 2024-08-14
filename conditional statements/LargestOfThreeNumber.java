import java.util.*;

public class LargestOfThreeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter third number");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("A is largest among three numeber");
        } else if (b > c) {
            System.out.println("B is the largest among three number");
        } else {
            System.out.println("C is the largest among three number");

        }
    }
}
