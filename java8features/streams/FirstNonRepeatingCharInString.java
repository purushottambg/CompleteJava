package java8features.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharInString {
    public static void main(String[] args) {
        String str="StringValues";
        str=str.toLowerCase();
       char firstChar = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(), LinkedHashMap::new, Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(element->element.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('c');

       String names = "Jysiyrm Sita Bhagwar Shiva Ram Lakhan Jivaji";

       List<String> longerNames = Arrays.stream(names.toLowerCase().split(" "))
               .filter(n-> n.toLowerCase().contains("a"))
               .sorted(Comparator.comparing(String::length).reversed())
               .limit(5)
               .collect(Collectors.toList());

        System.out.println("Longest 5 names");
       for (String name: longerNames){
           System.out.println(name);
       }
       System.out.println("First Non Repeating Char is:"+firstChar);
    }
}
