import java.util.*;

public class CreateSubArray {
    public static void SubArray(int numbers[]) {
        int totalSubArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            // int start = i;
            for (int j = i; j < numbers.length; j++) {
                // int end = j;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array is" + totalSubArray);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        SubArray(numbers);
    }
}
