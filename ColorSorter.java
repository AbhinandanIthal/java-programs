//Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorSorter {
    public static void main(String[] args) {
        // Create an ArrayList of strings to store colors
        List<String> colors = new ArrayList<>();

        // Add different colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");

        // Display the list before sorting
        System.out.println("Colors before sorting: " + colors);

        // Sort the ArrayList alphabetically using Collections.sort()
        Collections.sort(colors);

        // Display the list after sorting
        System.out.println("Colors after sorting:  " + colors);
    }
}
