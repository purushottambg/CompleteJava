package java8features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,43,5467,78,56,43,65,467,34);
        List<Integer> max = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(max.get(numbers.size()-1));
    }
}
