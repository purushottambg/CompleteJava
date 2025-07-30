package java8features.streams;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringAndLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob", "Alice", "Roman");
        Map<String, Integer> namesAndLength = names.stream()
                .collect(Collectors.
                        toMap(val->val,  val->val.length()));

        for (Map.Entry<String, Integer> map : namesAndLength.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }

}
