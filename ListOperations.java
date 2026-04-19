package lab1a;

import java.util.*;

public class ListOperations {

    // 1. Adding elements
    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements: " + list);
    }

    // 2. Adding element at specific index
    public static void addAtIndex(List<String> list) {
        list.add(1, "Mango");
        System.out.println("After adding at index 1: " + list);
    }

    // 3. Adding multiple elements
    public static void addMultiple(List<String> list) {
        List<String> extra = Arrays.asList("Grapes", "Pineapple");
        list.addAll(extra);
        System.out.println("After adding multiple elements: " + list);
    }

    // 4. Accessing elements
    public static void accessElements(List<String> list) {
        System.out.println("Element at index 2: " + list.get(2));
    }

    // 5. Updating elements
    public static void updateElements(List<String> list) {
        list.set(0, "Cherry");
        System.out.println("After updating element: " + list);
    }

    // 6. Removing elements
    public static void removeElements(List<String> list) {
        list.remove("Banana");
        list.remove(1);
        System.out.println("After removing elements: " + list);
    }

    // 7. Searching elements
    public static void searchElements(List<String> list) {
        System.out.println("Contains Apple? " + list.contains("Apple"));
    }

    // 8. List size
    public static void listSize(List<String> list) {
        System.out.println("List size: " + list.size());
    }

    // 9. Iterating over list
    public static void iterateList(List<String> list) {
        System.out.println("Using for-each loop:");
        for (String item : list) {
            System.out.println(item);
        }
    }

    // 10. Using Iterator
    public static void useIterator(List<String> list) {
        System.out.println("Using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // 11. Sorting
    public static void sortList(List<String> list) {
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }

    // 12. Sublist
    public static void subList(List<String> list) {
        if (list.size() >= 2) {
            List<String> sub = list.subList(0, 2);
            System.out.println("Sublist (0 to 2): " + sub);
        }
    }

    // 13. Clearing the list
    public static void clearList(List<String> list) {
        list.clear();
        System.out.println("After clearing list: " + list);
    }

    public static void main(String[] args) {

        // ArrayList
        System.out.println("=== ArrayList Operations ===");
        List<String> arrayList = new ArrayList<>();
        runAllOperations(arrayList);

        // LinkedList
        System.out.println("\n=== LinkedList Operations ===");
        List<String> linkedList = new LinkedList<>();
        runAllOperations(linkedList);
    }

    // Function to call all operations
    public static void runAllOperations(List<String> list) {
        addElements(list);
        addAtIndex(list);
        addMultiple(list);
        accessElements(list);
        updateElements(list);
        removeElements(list);
        searchElements(list);
        listSize(list);
        iterateList(list);
        useIterator(list);
        sortList(list);
        subList(list);
        clearList(list);
    }
}