
public class PrintI {

    public static void printIncresing(int n) {
        if (n == 1) {
            System.err.println(1);
            return;
        }
        printIncresing(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printIncresing(5);
    }
}
