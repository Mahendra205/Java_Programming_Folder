import java.util.*;

public class FunctionExample {
    public static int CalculatSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write first number");
        int a = sc.nextInt();
        System.out.println("write second number");
        int b = sc.nextInt();
        int sum = CalculatSum(a, b);
        System.out.println("sum is = " + sum);
    }
}
