//Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():


package b3;

import java.util.Scanner;

public class PalindromeChecker {

    /**
     * Checks if a string is a palindrome by ignoring case and punctuation.
     */
    public static boolean isPalindrome(String s) {
        // 1. Remove all non-alphanumeric characters and convert to lowercase
        // [^a-zA-Z0-9] matches anything that is not a letter or number
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 2. Reverse the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // 3. Compare the cleaned string with its reverse
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
        
        scanner.close();
    }
}
