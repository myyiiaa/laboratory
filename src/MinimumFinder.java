/**
 * This method returns the smallest number from an array.
 * It uses a for cycle.
 * Time complexity: 0(n), where n is length of input array.
 * For cycle iterates through the array and searches the smallest number,
 * resulting in linear time complexity.
 * @param arr The array of integers where we need to find smallest.
 * @return min The smallest integer from the array
 */

import java.util.Scanner;
public class MinimumFinder {


    public static int findMin(int[] arr, int n) {

        if (n == 1) {
            return arr[0];
        }


        int minOfRest = findMin(arr, n - 1);

        return Math.min(arr[n - 1], minOfRest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int min = findMin(arr, n - 1);
        System.out.println(min);
    }
}
