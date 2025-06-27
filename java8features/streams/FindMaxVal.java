package java8features.streams;

import java.util.*;
import java.util.stream.Collectors;

public class FindMaxVal {
    public static void main(String[] args) {

        List<Integer> numIntList = Arrays.asList( 1, 3,2, 5, 3, 4, 6, 34, 653, 6, 54, 23, 65, 2, 34, 63, 34,  123, 54, 324, 346, 34, 23, 42, 35, 1147);

        List<Integer> sortedNum=numIntList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Integer highestNumber = numIntList.stream().mapToInt(Integer::intValue).max().orElse(0);


        System.out.println("Largest Num is: "+sortedNum.get(0));
        System.out.println("Largest Num is: "+highestNumber);

    }
}
