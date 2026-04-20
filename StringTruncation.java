package c3;

public class StringTruncation {
    public static void main(String[] args) {
        String longText = "Java Programming is a powerful language for developers.";
        int limit = 20;

        // Call the user-defined function
        String result = truncate(longText, limit);

        System.out.println("Original: " + longText);
        System.out.println("Truncated: " + result);
    }

    /**
     * User-defined function to truncate a string and add an ellipsis.
     * 
     * @param text The string to be shortened.
     * @param maxLength The maximum length allowed before truncation.
     * @return The truncated string with an ellipsis or the original string.
     */
    public static String truncate(String text, int maxLength) {
        // Return original if it's already within the length limit
        if (text == null || text.length() <= maxLength) {
            return text;
        }
        
        // Truncate to the specified length and add an ellipsis
        // Note: Substring index starts at 0 and goes up to maxLength
        return text.substring(0, maxLength) + "...";
    }
}
