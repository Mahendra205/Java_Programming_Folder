
import java.util.*;

public class EligibleForVote {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println(age + " eligible for vote");
        } else {
            System.out.println(age + " not eligible for vote");
        }

    }
}
