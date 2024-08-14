import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int numbers[] = { 1, 4, 34, 56, 14 };
        int key = 14;
        int sortnum = sorting(numbers, key);
        if (sortnum == -1) {
            System.out.println("number not in the array");
        } else {
            System.out.println("the index of number is " + sortnum);
        }
    }

    public static int sorting(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }

        }
        return -1;
    }
}