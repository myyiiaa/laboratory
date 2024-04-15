/**
 * This method calculates the factorial of a given non-negative integer using recursion.
 * The factorial of a non-negative integer n (denoted as n!) is the product of all positive integers
 * less than or equal to n.
 * Time complexity: O(n)
 * The method recursively calculates the factorial by multiplying n with factorial(n-1),
 * reducing the problem size by 1 in each recursive call until reaching the base case (n = 0 or n = 1).
 *
 * @param n The non-negative integer for which factorial is calculated.
 * @return The factorial of n.
 */


import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }

        scanner.close();
    }
}
