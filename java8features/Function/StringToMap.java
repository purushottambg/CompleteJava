package java8features.Function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Function in Java 8 are the functional interfaces with apply abstract method.
 * Function<T, R> where T is acceptance type where R is a return type
 * it also has some default methods like andThen(), compose(),
 */
public class StringToMap {
    public static void main(String[] args) {
        Function<List<String>, Map<String, Integer>> stringToMap = val -> {
          Map<String, Integer> results = new HashMap<>();
          for (String str: val){
              results.put(str, str.length());
          }
          return results;
        };

        List<String> strings = Stream.of("All", "New", "Serious", "World", "Thread").collect(Collectors.toList());
        Map<String, Integer> preparededMap = stringToMap.apply(strings);
        System.out.println(preparededMap);
    }
}
