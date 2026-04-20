//Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using Collections.swap(l_list, 0, 2))

package LinkedList;

import java.util.LinkedList;
import java.util.Collections;

public class SwapLinkedListElements {
    public static void main(String[] args) {
        // Create a linked list and add elements
        LinkedList<String> l_list = new LinkedList<>();
        l_list.add("First");
        l_list.add("Second");
        l_list.add("Third");
        l_list.add("Fourth");

        // Display the list before swapping
        System.out.println("Original Linked List: " + l_list);

        // Swap the 1st element (index 0) and 3rd element (index 2)
        // Syntax: Collections.swap(list, index1, index2)
        Collections.swap(l_list, 0, 2);

        // Display the list after swapping
        System.out.println("Linked List after swapping: " + l_list);
    }
}
