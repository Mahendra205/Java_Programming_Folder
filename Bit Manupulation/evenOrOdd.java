
import java.util.*;

public class evenOrOdd {
    public static void checkEvenOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String args[]) {
        checkEvenOdd(3);
        checkEvenOdd(9);
        checkEvenOdd(14);
    }
}
