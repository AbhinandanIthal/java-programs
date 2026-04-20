package b3;

import java.util.Scanner;

public class WhitespaceRemover {

    // User-defined function to eliminate all whitespace characters
    public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }
        // Using replaceAll with regex \\s to target all whitespace
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string with spaces:");
        String input = sc.nextLine();
        
        // Calling the user-defined function
        String result = removeWhitespace(input);
        
        System.out.println("Original String: '" + input + "'");
        System.out.println("String after removing whitespace: '" + result + "'");
        
        sc.close();
    }
}
