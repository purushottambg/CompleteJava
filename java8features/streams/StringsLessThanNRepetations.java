package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsLessThanNRepetations {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("rob", "sweet","rob", "rama", "shital", "shital", "puru").stream()
                .collect(
                        Collectors.toList()
                );
    }
}
