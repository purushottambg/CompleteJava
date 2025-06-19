package java8features.streams;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,43,5,1,64,34,54,34,46,76,45,34,5,34,5,34);
        Set<Integer> set = new HashSet<>();

        List<Integer> onlyDuplicates = list.stream().filter(num->!set.add(num)).collect(Collectors.toList());

        onlyDuplicates.stream().forEach(System.out::println);

    }
}
