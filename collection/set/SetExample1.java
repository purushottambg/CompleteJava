package collection.set;
import java.util.*;

public class SetExample1 {
    public static void main(String[] args) {
        // HashSet example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate, won't be added
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet example
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet example
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Apple"); // Duplicate, won't be added
        System.out.println("TreeSet: " + treeSet);
    }
}
