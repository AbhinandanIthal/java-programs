//Write a Java Program for Counting the number of words in a string using user defined function countWords()
package c3;

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Calling the user-defined function
        int result = countWords(input);
        
        System.out.println("Total number of words: " + result);
        
        scanner.close();
    }

    /**
     * User-defined function to count words in a string.
     * It handles null, empty strings, and multiple spaces.
     */
    public static int countWords(String str) {
        // Check if string is null or empty after trimming
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        
        // Split the string by one or more whitespace characters
        // \\s+ is a regular expression for "one or more spaces"
        String[] words = str.trim().split("\\s+");
        
        return words.length;
    }
}
