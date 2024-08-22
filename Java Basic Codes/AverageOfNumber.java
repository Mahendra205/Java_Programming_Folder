
//In a program,input 3 numbers: A,B and C. You have to output the average of these 3 numbers
import java.util.*;

public class AverageOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = (a + b + c)/3;
        //int average = sum / 3;
        System.out.println(sum+ " is the average of three number");
    }
}
