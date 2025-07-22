package java8features.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseAllTheStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bjai", "fds", "Tumi");
        List<String> revNames = names.stream().forEach(n-> n.startsWith("T")).collect(Collectors.toList());
    }
}
