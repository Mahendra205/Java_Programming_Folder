import java.util.*;

public class countingSort {
    public static void countingSortalgo(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            count[element]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // another process for conting sort
    public static void easyCountingSort(int arr[]) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            count[element]++;
        }
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            int frequency = count[i];
            for (int j = 1; j <= frequency; j++) {
                arr[k] = i;
                k++;
            }

        }

    }

    public static void printSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingSortalgo(arr);
        printSort(arr);
        easyCountingSort(arr);
        printSort(arr);
    }
}
