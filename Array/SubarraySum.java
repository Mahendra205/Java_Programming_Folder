
//return the max sum of subarry
import java.util.*;

public class SubarraySum {

    public static void main(String[] args) {
        int n = 5;
        int currentsum = 0;
        int maximumsum = Integer.MIN_VALUE;
        int arr[] = new int[n];
        arr[0] = 2;
        arr[1] = 5;
        arr[2] = 8;
        arr[3] = 9;
        arr[4] = 4;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j <= n - 1; j++) {
                currentsum = 0;
                for (int k = i; k <= j; k++) {

                    currentsum += arr[k];
                }
                System.out.println(currentsum);
                if (currentsum > maximumsum) {
                    maximumsum = currentsum;
                }
            }

        }
        System.out.println();
        System.out.println("maximum sum is: " + maximumsum);

    }
}
