import java.util.*;

public class WhileExample2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }

    }
}
