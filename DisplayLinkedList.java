// */4. Write a Java program to display elements and their positions in a linked list ( using
// l_listobj.get(p) )/*
package LinkedList;

import java.util.LinkedList;

public class DisplayLinkedList {
    public static void main(String[] args) {
        // Create an empty linked list
        LinkedList<String> l_listobj = new LinkedList<String>();

        // Add elements to the linked list
        l_listobj.add("Red");
        l_listobj.add("Green");
        l_listobj.add("Black");
        l_listobj.add("Pink");
        l_listobj.add("Orange");

        // Display elements and their positions using l_listobj.get(p)
        System.out.println("Original linked list: " + l_listobj);
        
        for (int p = 0; p < l_listobj.size(); p++) {
            // Retrieve and display element at current index 'p'
            System.out.println("Element at index " + p + ": " + l_listobj.get(p));
        }
    }
}
