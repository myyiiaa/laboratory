/**
 * This method calculates the binomial coefficient C(n, k) using recursion.
 * The binomial coefficient C(n, k) represents the number of ways to choose k elements from a set of n elements.
 *
 * @param n The total number of elements.
 * @param k The number of elements to choose.
 * @return The binomial coefficient C(n, k).
 */

import java.util.Scanner;

public class BinomialCoefficient {

    public static int binomialCoefficient(int n, int k) {

        if (k == 0 || k == n) {
            return 1;
        }

        // Recursive case
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        scanner.close();

        int result = binomialCoefficient(n, k);

        System.out.println("The binomial coefficient C(" + n + ", " + k + ") is: " + result);
    }
}
