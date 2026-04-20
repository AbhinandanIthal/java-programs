//Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))

package LinkedList;

import java.util.LinkedList;

public class InsertElementAtEnd {
    public static void main(String[] args) {
        // Create an empty linked list
        LinkedList<String> l_listobj = new LinkedList<String>();

        // Add initial elements to the linked list
        l_listobj.add("Red");
        l_listobj.add("Green");
        l_listobj.add("Black");

        // Print the original linked list
        System.out.println("Original linked list: " + l_listobj);

        // Insert the specified element at the end of the linked list
        l_listobj.offerLast("Pink");

        // Print the final linked list to verify insertion
        System.out.println("Final linked list: " + l_listobj);
    }
}
