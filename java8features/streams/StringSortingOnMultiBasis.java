package java8features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortingOnMultiBasis {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        List<String> sortedColors = colors.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted in ascending order:"+sortedColors);
        List<String> reverseSortedColors = colors.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted in descending order:"+reverseSortedColors);
    }
}
