/**
 * This method checks if a given string consists only of digits.
 * @param s The input string to be checked.
 * @return true if the string consists only of digits, false otherwise.
 */


import java.util.Scanner;

public class CheckDigits {

    public static boolean allDigits(String s) {

        if (s.isEmpty()) {
            return true;
        }

        char firstChar = s.charAt(0);
        if (Character.isDigit(firstChar)) {

            return allDigits(s.substring(1));
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it consists only of digits: ");
        String s = scanner.nextLine();
        scanner.close();

        boolean isAllDigits = allDigits(s);

        if (isAllDigits) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
