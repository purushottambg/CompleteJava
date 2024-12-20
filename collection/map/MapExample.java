package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>(); //Hash Map //No order maintained //unique keys and only one null allowed
        hashMap.put(1, "Purushottam");
        hashMap.put(null,"Bhagwat");  //will be autoSorted
        hashMap.put(2, "Pratik");
        hashMap.put(3, "Rahul");
        hashMap.put(4, "Abhishek");
        hashMap.put(5, "Pranav");
        hashMap.put(5, "Pranav");  //duplicate Value not allowed

        for (Map.Entry<Integer, String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        hashMap.replace(2,"Pratik", "Sonu");
        for (Map.Entry<Integer, String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
