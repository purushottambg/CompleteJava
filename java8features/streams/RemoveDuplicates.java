package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> uniqueItems = Arrays.asList("three", "Three", "seven", "Nine", "one", "Purvi", "Purvi", "Three");
        System.out.println("all Items:"+uniqueItems);
        uniqueItems = uniqueItems.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique Items:"+uniqueItems);
    }
}
