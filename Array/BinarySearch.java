import java.util.*;

public class BinarySearch {
    public static void main(String args[]) {
        int numbers[] = { 12, 51, 45, 72, 10, 5 };
        int key = 455;
        System.out.println(binarynum(numbers, key));
    }

    public static int binarynum(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {// comparisons
                return mid;
            }
            if (numbers[mid] > key) {// left side
                end = mid - 1;
            } else {
                start = mid + 1;// right side
            }
        }
        return -1;
    }
}
