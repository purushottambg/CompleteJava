package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipNElements {
    public static void main(String[] args) {
        List<String> strList = Arrays.stream("amdocs make it amazing also memorable".split(" ")).collect(Collectors.toList());
        List<String> skipped = strList.stream().skip(2).collect(Collectors.toList());
        skipped.stream().forEach(System.out::println);
    }
}
