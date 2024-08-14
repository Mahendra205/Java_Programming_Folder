import java.util.*;

public class Multiplication {
    public static int Multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter first number");
        // int a = sc.nextInt();
        // System.out.println("enter second number");
        // int b = sc.nextInt();
        int product = Multiply(4, 4);
        System.out.println("product is = " + product);
    }

}
