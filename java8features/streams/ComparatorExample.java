package java8features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,43,456,67,543,5,743,4323);
        System.out.println("Before the sort: "+nums);

        List<Integer> sortedNums = nums.stream().sorted(Comparator.comparingInt(n->n)).collect(Collectors.toList());
        System.out.println("After sort: ");
        for (Integer i: sortedNums){
            System.out.print(i+" ");
        }

    }
}
