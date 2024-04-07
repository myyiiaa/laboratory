/**
 * This method calculates the sum of all elements in an array of integers.
 * It utilizes a for-each loop to iterate through the array.
 * Time complexity: O(n), where n is the length of the input array.
 * The for-each loop iterates through each element of the array,
 * resulting in a linear time complexity proportional to the array size.
 *
 * @param array The array of integers whose elements will be summed.
 * @return sum The sum of all elements in the input array.
 */



import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        double average = calculateAverage(array);

        System.out.println("Average of the elements: " + average);

        scanner.close();
    }


    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }
}
