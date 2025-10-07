package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayOperations {
    public static void main(String[] args) {
        duplicates(new int[]{2,4,6,46,76,46,76,5,43});
    }

    public static void duplicates(int[] array){
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> duplicated = new ArrayList<>();
        for (int i: array)
            if(!uniqueElements.add(i)) duplicated.add(i);

        System.out.println(duplicated);
    }

}
