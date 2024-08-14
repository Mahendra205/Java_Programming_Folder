import java.util.*;

public class BinaryToDecimal {
    public static void BinaryToDec(int Binum) {
        int mynum = Binum;
        int pow = 0;
        int Decnum = 0;
        while (Binum > 0) {
            int lastdigit = Binum % 10;
            Decnum = Decnum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            Binum = Binum / 10;
        }
        System.out.println("The decimal of " + mynum + "=" + Decnum);
    }

    public static void main(String[] args) {
        BinaryToDec(10001);
    }
}
