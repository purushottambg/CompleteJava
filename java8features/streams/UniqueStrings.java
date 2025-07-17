package java8features.streams;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueStrings {
    public static void main(String[] args) {
        Set<String> uniqueNames = Arrays.asList("rob", "sweet","rob", "rama", "shital", "shital", "puru").stream().collect(Collectors.toSet());
        for (String str: uniqueNames){
            System.out.println(str+" ");
        }
    }
}
