package c3;

import java.util.Scanner;

public class NumericVerifier {

    // User-defined function to check if a string contains only numeric characters
    public static boolean isNumeric(String str) {
        // Return false if the string is null or empty
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // If any character is not a digit, return false
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        // All characters were digits
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to verify: ");
        String input = scanner.nextLine();

        // Call the user-defined isNumeric function
        if (isNumeric(input)) {
            System.out.println("The string '" + input + "' contains only numeric characters.");
        } else {
            System.out.println("The string '" + input + "' contains non-numeric characters.");
        }

        scanner.close();
    }
}
