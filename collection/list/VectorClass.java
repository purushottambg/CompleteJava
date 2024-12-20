package collection.list;

import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector vector = new Vector<>();
        vector.add(23);
        vector.add(45);
        System.out.println(vector.capacity());
        System.out.println(vector);
    }
}
