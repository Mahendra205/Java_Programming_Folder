
public class PrintD {

    public static void PrintDecresing(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        PrintDecresing(n - 1);
    }

    public static void main(String[] args) {
        PrintDecresing(10);
    }
}
