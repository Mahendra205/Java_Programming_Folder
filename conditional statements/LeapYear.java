
//Write a Java program that takes a year from the user and print whether that year is a leap year or not.
import java.util.*;

/*public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("its leap year");
                } else {
                    System.out.println("its not a leap year");
                }
            } else {
                System.out.println("its a leap year");
            }
        } else {
            System.out.println("its not a leap year");
        }
    }
}*/

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (year % 100) == 0 && (year % 400) == 0;

        if (x && (y || z)) {
            System.out.println("its a leap year");
        } else {
            System.out.println("its not a leap year");
        }
    }
}
