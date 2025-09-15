package arrays;

import java.util.HashMap;
import java.util.Map;

public class UnionMissingInArray {
    public static void main(String[] args) {
        int[] array1 = {2,4,6,4,6,2,8,4,5};
        int[] array2 = {7,5,4,8,3,2,7,9,2};

        System.out.println("Only in A");
        for(int a: elementsInOnlyA(array1, array2))
            System.out.print(a+", ");

        System.out.println("\nOnly in B");
        for(int a: elementsInOnlyB(array1, array2))
            System.out.print(a+", ");

        System.out.println("\nUnion");
        for(int a: elementsUnionAB(array1, array2))
            System.out.print(a+", ");

    }

    public static int[] elementsInOnlyA(int[] array1, int[] array2){
        int[] result=new int[array1.length+array2.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: array1) map.put(i, map.getOrDefault(i, 0)+1);
        int counter=0;
        for (int j: array2) if(!map.containsKey(j)) result[counter++]=j;
        return result;
    }

    public static int[] elementsInOnlyB(int[] array1, int[] array2){
        int[] result=new int[array1.length+array2.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: array2) map.put(i, map.getOrDefault(i, 0)+1);
        int counter=0;
        for (int j: array1) if(!map.containsKey(j)) result[counter++]=j;
        return result;
    }

    public static int[] elementsUnionAB(int[] array1, int[] array2){
        int[] result=new int[array1.length+array2.length];
        int counter=0;
        for (int i: array1) result[counter++]=i;
        for (int i: array2) result[counter++]=i;
        return result;
    }
}
