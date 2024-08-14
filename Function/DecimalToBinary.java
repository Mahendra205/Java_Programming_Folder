import java.util.*;

public class DecimalToBinary {
    public static void DecToBin(int Decnum) {
        int mynum = Decnum;
        int pow = 0;
        int binum = 0;
        while (Decnum > 0) {
            int rem = Decnum % 2;
            binum = binum + (rem * (int) Math.pow(10, pow));
            pow++;
            Decnum = Decnum / 2;
        }
        System.out.println("the binary number of " + mynum + " is " + binum);
    }

    public static void main(String[] args) {
        DecToBin(17);
    }
}
