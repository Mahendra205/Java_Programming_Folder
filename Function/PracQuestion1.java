//Write a Java method to compute the averageof three numbers.

import java.util.*;

public class PracQuestion1 {
    public static double AvgOfNumber(double a, double b, double c) {

        double avg = (a + b + c) / 3;
        return avg;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        System.out.println(AvgOfNumber(a, b, c));
    }

}
