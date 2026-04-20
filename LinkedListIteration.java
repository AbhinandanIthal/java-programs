//Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())

package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {
    public static void main(String[] args) {
        // 1. Create and populate a LinkedList
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");    // Index 0
        colors.add("Green");  // Index 1 (2nd position)
        colors.add("Black");  // Index 2
        colors.add("White");  // Index 3

        // 2. Initialize ListIterator starting at the 2nd position (index 1)
        // Note: Java lists use 0-based indexing
        ListIterator<String> iterator = colors.listIterator(1);

        // 3. Iterate and print the remaining elements
        System.out.println("Elements from the 2nd position onwards:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
