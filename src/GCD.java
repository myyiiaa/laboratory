/**
 * This method calculates the greatest common divisor (GCD) of two numbers 'a' and 'b' using recursion.
 * It utilizes the Euclidean algorithm for finding the GCD.
 * @param a The first number.
 * @param b The second number.
 * @return The GCD of 'a' and 'b'.
 */


import java.util.Scanner;

public class GCD {

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();
        scanner.close();

        int result = gcd(a, b);

        System.out.println("The GCD of " + a + " and " + b + " is: " + result);
    }
}
