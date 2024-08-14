import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        marks[0] = sc.nextInt();// for phy number
        marks[1] = sc.nextInt();// for chem number
        marks[2] = sc.nextInt();// for math number

        System.out.println("phy number is = " + marks[0]);
        System.out.println("chem number is = " + marks[1]);

        System.out.println("math number is = " + marks[2]);
        double percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage of marks is " + percentage);
        System.out.println(marks[2] = marks[2] + 1);
        System.out.println(marks.length);
    }
}
