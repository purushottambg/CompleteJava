package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CaseConversion {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("one", "soaha", "small", "CAP", "TIG", "Nope");
        values = values.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("All to the lowercase");
        for (String str : values){
            System.out.println(str);
        }
        values = values.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("All to the uppercase");
        for (String str : values){
            System.out.println(str);
        }
    }
}
