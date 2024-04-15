import java.util.Scanner;

public class Defence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your string:");
        String lowerCaseString = scanner.nextLine();
        String upperCaseString = lowerCaseString.toUpperCase();
        System.out.println("Upper Case String:" + upperCaseString);
        scanner.close();

    }
}