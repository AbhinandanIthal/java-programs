//Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()


package b3;

import java.util.Scanner;

public class SubstringCounter {

    // User-defined function to count substring occurrences
    public static int countOccurrences(String mainStr, String subStr) {
        if (subStr == null || subStr.isEmpty() || mainStr == null) {
            return 0;
        }

        int count = 0;
        int lastIndex = 0;

        // Iterate through the main string to find occurrences of the substring
        while ((lastIndex = mainStr.indexOf(subStr, lastIndex)) != -1) {
            count++;
            // Increment index by substring length to find non-overlapping occurrences
            lastIndex += subStr.length();
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for main string and substring
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to search: ");
        String subString = scanner.nextLine();

        // Calling the user-defined function
        int result = countOccurrences(mainString, subString);

        // Displaying the result
        System.out.println("The substring '" + subString + "' appears " + result + " times.");
        
        scanner.close();
    }
}
