/**
 * This method reverses the order of elements in the given array using recursion.
 * @param array The array of elements to be reversed.
 * @param start The starting index of the portion of the array to be reversed.
 * @param end   The ending index of the portion of the array to be reversed.
 */


import java.util.Scanner;

public class ReverseArray {

    public static void reverseArray(int[] array, int start, int end) {

        if (start >= end) {
            return;
        }


        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;


        reverseArray(array, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();


        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();


        reverseArray(array, 0, n - 1);


        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
