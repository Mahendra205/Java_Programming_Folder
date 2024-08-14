
//Write a program that reads a set of integers,and then prints the sum of the even and odd integers
import java.util.*;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value");
        int fv = sc.nextInt();
        System.out.println("enter last value");
        int lv = sc.nextInt();
        int EvenSum = 0;
        int OddSum = 0;

        for (int i = fv; i <= lv; i++) {
            if (i % 2 == 0) {
                EvenSum += i;
            } else {
                OddSum += i;
            }
        }
        System.out.println(EvenSum);
        System.out.println(OddSum);
    }
}
