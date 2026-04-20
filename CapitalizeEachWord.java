//Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()
package c3;

import java.util.Scanner;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        
        // Calling the user-defined function
        String result = capitalizeWords(input);
        
        System.out.println("Modified Sentence: " + result);
        sc.close();
    }

    /**
     * User-defined function to capitalize the first letter of each word
     */
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Split the string into words using whitespace as a delimiter
        String[] words = str.split("\\s+");
        StringBuilder capitalizedString = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter and append the rest of the word
                String firstLetter = word.substring(0, 1).toUpperCase();
                String remainingLetters = word.substring(1).toLowerCase();
                capitalizedString.append(firstLetter).append(remainingLetters).append(" ");
            }
        }

        // Return the final string after trimming the trailing space
        return capitalizedString.toString().trim();
    }
}
