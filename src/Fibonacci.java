/**
 * This method calculates the n-th element in the Fibonacci sequence using recursion.
 * Fibonacci sequence: F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2) for n > 1.
 *
 * @param n The index of the Fibonacci number to be calculated.
 * @return The n-th Fibonacci number.
 */



import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }


        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n to find the nth Fibonacci number: ");
        int n = scanner.nextInt();
        scanner.close();


        int result = fibonacci(n);

        System.out.println("The " + n + "-th Fibonacci number is: " + result);
    }
}
