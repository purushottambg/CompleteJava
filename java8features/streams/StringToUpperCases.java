package java8features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCases {
    public static void main(String[] args) {
        List<String> strList = Arrays.stream("India is a very beutiful and populated country".split(" ")).collect(Collectors.toList());
        List<String> upperCasedString = strList.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Upper Cased List: "+upperCasedString);
    }
}
