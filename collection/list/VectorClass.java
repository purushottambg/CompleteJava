package collection.list;

import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("one");
        vector.add("two");
        System.out.println(vector.capacity());
        System.out.println(vector);
    }
}
