package collection.map;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapVSLinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHM = new LinkedHashMap<>();
        
        hashMap.put("Ram", 11);
        hashMap.put("Shyam", 12);
        hashMap.put("Arya", 13);

        linkedHM.put("Ram", 11);
        linkedHM.put("Shyam", 12);
        linkedHM.put("Arya", 13);

        System.out.println("Hash MAP: "+hashMap);
        System.out.println("Linked Hash MAP: "+linkedHM);
    }
}
