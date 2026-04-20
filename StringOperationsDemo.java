// Develop a java program for performing various string operations with different string handling functions directed as follows
//String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()



package Stringoperation;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello"; // Using literal
        String str2 = new String("Java World"); // Using new keyword

        // 2. Length and Character Access
        System.out.println("Length of str2: " + str2.length()); //
        System.out.println("Character at index 6: " + str2.charAt(6)); //

        // 3. String Comparison
        System.out.println("Equals 'hello': " + str1.equals("hello")); // case-sensitive
        System.out.println("EqualsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello")); //
        System.out.println("CompareTo: " + str1.compareTo("He")); // Lexicographical

        // 4. String Searching
        System.out.println("Index of 'Java': " + str2.indexOf("Java")); //
        System.out.println("Contains 'World': " + str2.contains("World")); //

        // 5. Substring Operations
        String sub = str2.substring(0, 4); // Returns "Java"
        System.out.println("Substring (0-4): " + sub);

        // 6. String Modification (Returns new strings as Strings are immutable)
        System.out.println("Uppercase: " + str1.toUpperCase()); //
        System.out.println("Replace World with Universe: " + str2.replace("World", "Universe")); //

        // 7. Whitespace Handling
        String spacedStr = "   Trim Me   ";
        System.out.println("Trimmed: '" + spacedStr.trim() + "'"); //

        // 8. String Concatenation
        String combined = str1.concat(" ").concat(str2); //
        System.out.println("Concatenated: " + combined);

        // 9. String Splitting
        String csv = "apple,banana,cherry";
        String[] fruits = csv.split(","); //
        System.out.println("Split result: " + fruits[1]);

        // 10. StringBuilder Demo (Mutable strings)
        StringBuilder sb = new StringBuilder("Mutable");
        sb.append(" Content"); //
        sb.reverse(); //
        System.out.println("StringBuilder Reverse: " + sb);

        // 11. String Formatting
        String formatted = String.format("Values: %s, %d", "Success", 100); //
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email with contains(), startsWith(), and endsWith()
        validateEmail("user@example.com");
        validateEmail("invalid-email.com");
    }

    public static void validateEmail(String email) {
        // Simple logic using required methods
        boolean isValid = email.contains("@") && 
                          !email.startsWith("@") && 
                          (email.endsWith(".com") || email.endsWith(".org")); //
        System.out.println("Is '" + email + "' a valid format? " + isValid);
    }
}
