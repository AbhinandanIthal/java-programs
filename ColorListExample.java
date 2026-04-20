// Write a java program for getting different colors through ArrayList interface and extract the
// elements 1st and 2nd from the ArrayList object by using SubList()
package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ColorListExample {
    public static void main(String[] args) {
        // 1. Create an ArrayList of strings to store colors
        ArrayList<String> colors = new ArrayList<>();

        // 2. Adding different colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println("Original ArrayList: " + colors);

        // 3. Extracting the 1st and 2nd elements using subList()
        // Index 0 is inclusive (1st element), index 2 is exclusive (stops before 3rd element)
        List<String> subList = colors.subList(0, 2);

        // 4. Display the extracted elements
        System.out.println("Extracted elements (1st and 2nd): " + subList);
    }
}
