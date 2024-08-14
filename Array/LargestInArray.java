import java.util.*;

public class LargestInArray {
    public static void main(String[] args) {
        int numbers[] = { 1, 45, 52, 12, 74, 56 };
        System.out.println("largest number is = " + GetLargest(numbers));
    }

    public static int GetLargest(int numbers[]) {
        int largestValue = Integer.MIN_VALUE;// - infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largestValue < numbers[i]) {
                largestValue = numbers[i];
            }
        }
        return largestValue;
    }
}
