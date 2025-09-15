package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NamesWithAStart {
    public static void main(String[] args) {
        List<String> strList = Arrays.stream("amdocs make it amazing also memorable".split(" ")).collect(Collectors.toList());
        List<String> Filtered = strList.stream().filter(str->str.toLowerCase().startsWith("a")).collect(Collectors.toList());
        System.out.println("Filtered List: "+Filtered);
        String string = "RavetIsCleanCity";
        Map<Character, Long> charCount = string.chars().mapToObj(n->(char) n).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        for (Map.Entry<Character, Long> chars: charCount.entrySet()){
            System.out.println(chars.getKey()+" "+chars.getValue());
        }
    }
}
