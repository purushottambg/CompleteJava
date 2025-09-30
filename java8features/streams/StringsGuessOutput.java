package java8features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringsGuessOutput {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Stream", "API", "Java");
        String answer =names.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(2)
                .collect(Collectors.joining(", "));
        System.out.println(answer);
    }
}
