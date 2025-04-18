package collection.vectors;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Creating a Vector of Strings
        Vector<String> fruits = new Vector<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Inserting element at specific index
        fruits.add(2, "Grapes");

        // Accessing elements
        System.out.println("All Fruits: " + fruits);
        System.out.println("First Fruit: " + fruits.firstElement());
        System.out.println("Last Fruit: " + fruits.lastElement());

        // Removing an element
        fruits.remove("Banana");

        // Check if it contains an item
        if (fruits.contains("Mango")) {
            System.out.println("Mango is there in the list 🍋");
        }

        // Iterating
        System.out.println("Looping over fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // Size and Capacity
        System.out.println("Size: " + fruits.size());
        System.out.println("Capacity: " + fruits.capacity()); // initial capacity grows by doubling
    }
}
