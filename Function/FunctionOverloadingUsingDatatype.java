
public class FunctionOverloadingUsingDatatype {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static float Sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(Sum(3, 5));
        System.out.println(Sum(3.50f, 4.50f));
    }
}
