/**
 * This method checks whether a given number is prime.
 * It determines if the number has exactly two distinct positive divisors: 1 and itself.
 * Time complexity: O(sqrt(n))
 * The method iterates up to the square root of n to check for divisors,
 * reducing the number of iterations compared to checking up to n directly.
 *
 * @param n The number to be checked for primality.
 * @return true if the number is prime, false otherwise.
 */



import java.util.Scanner;
public class Prime {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }


        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println("prime");
        } else {
            System.out.println("composite");
        }

        scanner.close();
    }
}
