// Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not

package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ColorSearch {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Strings using the List interface reference
        List<String> colors = new ArrayList<>();

        // 2. Add different colors to the list
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");

        // 3. Display the initial list
        System.out.println("Color List: " + colors);

        // 4. Search for the color "Red"
        String searchColor = "Red";
        
        if (colors.contains(searchColor)) {
            System.out.println("Success: The color \"" + searchColor + "\" is available in the list.");
            
            // Optional: Find the specific index position
            int index = colors.indexOf(searchColor);
            System.out.println("It was found at index: " + index);
        } else {
            System.out.println("The color \"" + searchColor + "\" was not found.");
        }
    }
}
