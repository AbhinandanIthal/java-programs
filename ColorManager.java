package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ColorManager {
    public static void main(String[] args) {
        // Creating an object of List interface with reference to ArrayList class
        List<String> colors = new ArrayList<>();

        // Adding different colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Magenta");

        // Displaying the original list
        System.out.println("Original Color List: " + colors);

        // Deleting the nth element (e.g., the 3rd element, which is at index 2)
        int n = 3;
        int indexToRemove = n - 1; // Since ArrayList index starts at 0

        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
            String removedColor = colors.remove(indexToRemove);
            System.out.println("Removed Color at position " + n + ": " + removedColor);
        } else {
            System.out.println("Invalid index.");
        }

        // Displaying the list after removal
        System.out.println("Updated Color List: " + colors);
    }
}
