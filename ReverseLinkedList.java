package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // 1. Create and populate a LinkedList
        LinkedList<String> objList = new LinkedList<>();
        objList.add("Apple");
        objList.add("Banana");
        objList.add("Cherry");
        objList.add("Date");

        System.out.println("Original List: " + objList);

        // 2. Obtain a descending iterator
        Iterator<String> reverseIterator = objList.descendingIterator();

        // 3. Iterate through the elements in reverse order
        System.out.println("Reverse Order:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
