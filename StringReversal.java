//. Write a Java Program for Reversing the characters in a string using user defined function reverseString().


package b3;

import java.util.Scanner;

public class StringReversal {

    // User-defined function to reverse a string
    public static String reverseString(String input) {
        String reversed = "";
        
        // Loop from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            // Concatenate each character to the new string
            reversed = reversed + input.charAt(i);
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        // Use Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();
        
        // Calling the user-defined function
        String result = reverseString(original);
        
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + result);
        
        scanner.close();
    }
}
