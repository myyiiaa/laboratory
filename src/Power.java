/**
 * This method calculates the exponentiation of a number 'a' raised to the power 'n' using recursion.
 *
 * @param a The base number.
 * @param n The exponent.
 * @return The result of 'a' raised to the power 'n'.
 */


import java.util.Scanner;

public class Power {

    public static double power(double a, int n) {

        if (n == 0) {
            return 1;
        }


        if (n > 0) {
            return a * power(a, n - 1);
        } else {
            return (1 / a) * power(a, n + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();
        scanner.close();

        double result = power(a, n);

        System.out.println(a + " raised to the power " + n + " is: " + result);
    }
}
