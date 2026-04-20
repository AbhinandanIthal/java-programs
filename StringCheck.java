//Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().


package b3;

public class StringCheck {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "   "; // Whitespace only
        String str3 = "Hello";

        System.out.println("str1 is null or whitespace: " + isNullOrEmpty(str1));
        System.out.println("str2 is null or whitespace: " + isNullOrEmpty(str2));
        System.out.println("str3 is null or whitespace: " + isNullOrEmpty(str3));
    }

    /**
     * User-defined function to check if a string is null or whitespace.
     */
    public static boolean isNullOrEmpty(String str) {
        // Option 1: Using trim().isEmpty() for all Java versions
        return str == null || str.trim().isEmpty();
        
        // Option 2: Using isBlank() (Available in Java 11+)
        // return str == null || str.isBlank();
    }
}
