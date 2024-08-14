import java.util.*;

public class maxsubarraysumbroutforce {

    public static int subArraySum(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum += arr[k];
                }
                // System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        System.out.println(subArraySum(arr));

    }

}
