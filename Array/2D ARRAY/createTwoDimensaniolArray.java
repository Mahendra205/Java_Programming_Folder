import java.util.*;

public class createTwoDimensaniolArray {

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// public static void main(String args[]) {

// int arr[][] = new int[3][3];
// int value = 1;
// int row = arr.length;
// int column = arr[0].length;
// for (int i = 0; i < row; i++) {
// for (int j = 0; j < column; j++) {
// arr[i][j] = value;
// }
// }
// for (int i = 0; i < row; i++) {
// for (int j = 0; j < column; j++) {
// System.out.print(arr[i][j] + " ");
// }
// System.out.println();
// }

// }
// }
