import java.util.Scanner;

public class DefenceAss1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string:");
        String lowerCaseString = scanner.nextLine();
        String upperCaseString = convertToUpperCase(lowerCaseString);
        System.out.println("Uppercase string: " + upperCaseString);
    }

    public static String convertToUpperCase(String str) {
        if (str.isEmpty()) {
            return str;
        } else {

            char firstChar = Character.toUpperCase(str.charAt(0));
            String restOfString = convertToUpperCase(str.substring(1));
            return firstChar + restOfString;
        }
    }
}

