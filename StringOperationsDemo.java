package StringOperation;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("Java World");
        
        // 2. Length and Character Access
        System.out.println("Length: " + str2.length());
        System.out.println("Character at index 0: " + str2.charAt(0));

        // 3. String Comparison
        System.out.println("Equality (case-sensitive): " + str1.equals("hello"));
        System.out.println("Equality (ignore case): " + str1.equalsIgnoreCase("hello"));
        System.out.println("Lexicographical Comparison: " + str1.compareTo("He"));

        // 4. String Searching
        System.out.println("Index of 'a': " + str2.indexOf('a'));
        System.out.println("Last Index of 'o': " + str2.lastIndexOf('o'));

        // 5. Substring Operations
        System.out.println("Substring (index 5 to end): " + str2.substring(5));
        System.out.println("Substring (index 0 to 4): " + str2.substring(0, 4));

        // 6. String Modification
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Replace 'Java' with 'Code': " + str2.replace("Java", "Code"));

        // 7. Whitespace Handling
        String spacedStr = "   Trim Me   ";
        System.out.println("Trimmed: '" + spacedStr.trim() + "'");

        // 8. String Concatenation
        String combined = str1.concat(" Programmer");
        System.out.println("Concatenated: " + combined);

        // 9. String Splitting
        String sentence = "Apple,Banana,Cherry";
        String[] fruits = sentence.split(",");
        System.out.print("Split result: ");
        for (String fruit : fruits) System.out.print(fruit + " ");
        System.out.println();

        // 10. StringBuilder Demo (Mutable strings)
        StringBuilder sb = new StringBuilder("Build");
        sb.append("er Pattern");
        sb.insert(5, "ing");
        System.out.println("StringBuilder: " + sb.toString());

        // 11. String Formatting
        String formatted = String.format("Language: %s, Version: %d", "Java", 21);
        System.out.println("Formatted: " + formatted);

        // 12. Validate Email with contains(), startsWith(), and endsWith()
        validateEmail("user@example.com");
        validateEmail("invalid-email");
    }

    public static void validateEmail(String email) {
        boolean isValid = email.contains("@") && 
                          !email.startsWith("@") && 
                          (email.endsWith(".com") || email.endsWith(".org") || email.endsWith(".net"));
        
        System.out.println("Is '" + email + "' valid? " + isValid);
    }
}
