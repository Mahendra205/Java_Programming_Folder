
//if income is less then 5l then tax is 0%,if income is between 5l to 10l then tax is 20%.if income is greater then 10l then tax is 30%.
import java.util.*;

public class TaxCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary");
        int income = sc.nextInt();
        int tax;
        if (income <= 500000) {
            tax = 0;
        } else if (income > 500000 && income <= 1000000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("your tax is " + tax);
    }
}
