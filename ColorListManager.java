package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ColorListManager {
    public static void main(String[] args) {
        // 1. Create an ArrayList of strings to store colors
        List<String> colors = new ArrayList<>();

        // 2. Add different colors to the list
        colors.add("Red");    // Index 0
        colors.add("Green");  // Index 1 (2nd element)
        colors.add("Blue");   // Index 2
        colors.add("Yellow"); // Index 3
        colors.add("White");  // Index 4

        System.out.println("Original ArrayList: " + colors);

        // 3. Remove the 2nd element (index 1)
        // Note: ArrayList indices start at 0, so the 2nd element is at index 1.
        if (colors.size() >= 2) {
            String removedByIndex = colors.remove(1); 
            System.out.println("Removed 2nd element (index 1): " + removedByIndex);
        }

        // 4. Remove the color "Blue" from the ArrayList
        // The remove(Object) method removes the first occurrence of the specified value.
        boolean isRemoved = colors.remove("Blue");
        if (isRemoved) {
            System.out.println("Successfully removed 'Blue'.");
        } else {
            System.out.println("'Blue' not found in the list.");
        }

        // 5. Print the final ArrayList
        System.out.println("Final ArrayList after removals: " + colors);
    }
}
