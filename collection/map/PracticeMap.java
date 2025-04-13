package collection.map;

import sun.reflect.generics.tree.Tree;

import  java.util.Map;
import java.util.TreeMap;

public class PracticeMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(23,"Nandini");
        treeMap.put(32,"Abhishek");
        treeMap.put(29,"Pranav");
        treeMap.put(24,"Rohini");
        treeMap.put(12,"Pratik");
        treeMap.put(8,"Purushottam");

        System.out.println(treeMap);

    }
}
