import java.util.*;

//revers an array

//public class Practice {
    // public static void ReversAnArray(int numbers[]) {
    // int i = 0;
    // int j = numbers.length - 1;
    // while (i < j) {
    // int temp = numbers[i];
    // numbers[i] = numbers[j];
    // numbers[j] = temp;
    // i++;
    // j--;
    // }
    // for (i = 0; i < numbers.length; i++) {
    // System.out.print(numbers[i]);
    // }
    // }

    // public static void main(String args[]) {
    // int numbers[] = { 5, 6, 7, 8, 9 };
    // ReversAnArray(numbers);
    // }

// return subarray sum
public class Practice {
    public static void SubArray(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;
        int maximumsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for (int i = start; i <= end; i++) {
            for (int j = i; j <= end; j++) {
                currentsum = 0;
                for (int k = i; k <= j; k++) {
                    currentsum += numbers[k];
                }
                if (currentsum > maximumsum) {
                    maximumsum = currentsum;
                }
            }
        }
        System.out.println("maximum sum is : "+maximumsum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3 };
        SubArray(numbers);
    }

}
