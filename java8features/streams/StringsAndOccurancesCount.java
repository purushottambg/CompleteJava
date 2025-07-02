package java8features.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringsAndOccurancesCount {
    public static void main(String[] args) {
        String[] names = "This is the list of the Strings the Strings which is repeated and list that returns count of string repeated".split(" ");
        Map<String, Long> results = Arrays.asList(names).stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()
        ));

        System.out.println(results);
    }
}
