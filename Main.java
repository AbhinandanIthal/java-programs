//Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()


package c3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10; // Specify desired length here
        
        // Calling the user-defined function
        String randomString = generateRandomString(length);
        
        System.out.println("Generated Random String: " + randomString);
    }

    /**
     * User-defined function to generate a random alphanumeric string.
     * @param length The length of the random string to be generated.
     * @return A random alphanumeric string of the specified length.
     */
    public static String generateRandomString(int length) {
        // Character set from which the random string will be built
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                          + "abcdefghijklmnopqrstuvwxyz"
                          + "0123456789";
        
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            // Select a random index from the characters string
            int index = random.nextInt(characters.length());
            
            // Append the character at the selected index to the result
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
}
