import java.util.*;

// create sub array
/*
 * public class livesession {
 * public static void subarray(int number[]) {
 * for (int i = 0; i <= number.length - 1; i++) {
 * for (int j = i; j <= number.length - 1; j++) {
 * for (int k = i; k <= j; k++) {
 * System.out.print(number[k] + " ");
 * }
 * System.out.println();
 * }
 * System.out.println();
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int number[] = { 2, 5, 8, 9, 4 };
 * subarray(number);
 * }
 * }
 */
// another process
/*
 * public class livesession {
 * public static void main(String[] args) {
 * int n = 5;
 * int arr[] = new int[n];
 * arr[0] = 2;
 * arr[1] = 5;
 * arr[2] = 8;
 * arr[3] = 9;
 * arr[4] = 4;
 * for (int i = 0; i <= n - 1; i++) {
 * for (int j = i; j <= n - 1; j++) {
 * for (int k = i; k <= j; k++) {
 * System.out.print(arr[k] + " ");
 * }
 * System.out.println();
 * }
 * System.out.println();
 * }
 * 
 * }
 * }
 */

// REVERSE ELEMENT

/*
 * public class livesession {
 * public static void main(String[] args) {
 * int n = 5;
 * int arr[] = new int[n];
 * arr[0] = 2;
 * arr[1] = 5;
 * arr[2] = 8;
 * arr[3] = 9;
 * arr[4] = 4;
 * 
 * int i = 0;
 * int j = n - 1;
 * while (i <= j) {
 * int temp = arr[i];
 * arr[i] = arr[j];
 * arr[j] = temp;
 * i++;
 * j--;
 * 
 * }
 * for (i = 0; i < n; i++) {
 * System.out.println(arr[i] + " ");
 * }
 * }
 * }
 */

// REVERSE ELEMENT USING FUNCTION

/*
 * public class livesession {
 * public static void reversenumber(int numbers[]) {
 * int i = 0;
 * int j = numbers.length - 1;
 * while (i < j) {
 * int temp = numbers[i];
 * numbers[i] = numbers[j];
 * numbers[j] = temp;
 * i++;
 * j--;
 * 
 * }
 * System.out.println("the reverse array is");
 * 
 * for (i = 0; i < numbers.length; i++) {
 * System.out.print(numbers[i] + ",");
 * 
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int numbers[] = { 5, 2, 4, 8, 3 };
 * reversenumber(numbers);
 * }
 * }
 */

// BINARY SEARCH

/*
 * public class livesession {
 * public static void main(String[] args) {
 * int n = 4;
 * int arr[] = new int[n];
 * arr[0] = 2;
 * arr[1] = 6;
 * arr[2] = 12;
 * arr[3] = 15;
 * int target = 102;
 * int i = 0;
 * int j = n - 1;
 * 
 * int index = -1;
 * while (i <= j) {
 * int mid = (i + j) / 2;
 * if (target == arr[mid]) {
 * index = mid;
 * break;
 * } else if (arr[mid] > target) {
 * j = mid - 1;
 * } else {
 * i = mid + 1;
 * }
 * }
 * System.out.println(index);
 * 
 * }
 * }
 */

//
// BINARY SEARCH USING FUNCTION
/*
 * public class livesession {
 * public static void binarysearch(int numbers[]) {
 * int target = 2;
 * int lo = 0;
 * int hi = numbers.length - 1;
 * int index = -1;
 * while (lo <= hi) {
 * 
 * int mid = (lo + hi) / 2;
 * if (numbers[mid] == target) {
 * index = mid;
 * 
 * break;
 * } else if (numbers[mid] > target) {
 * hi = mid - 1;
 * } else {
 * lo = mid + 1;
 * }
 * 
 * }
 * System.out.println("number found at index: " + index);
 * 
 * }
 * 
 * public static void main(String[] args) {
 * int numbers[] = { 2, 4, 8, 10, 22 };
 * binarysearch(numbers);
 * 
 * }
 * }
 */
