package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AcceptStringCnvertItToTheMap {
    public static void main(String[] args) {
        List<String> strgs = Arrays.asList("Rukmini", "Sheetal", "Nayaka", "Purushottam");

        Map<String, Integer> results = strgs.stream()
                .collect(Collectors.toMap( string -> string,
                        String::length,
                        (val1, val2)->val1
                        ));

        System.out.println("Entered String Values:"+strgs);
        System.out.println("Collected Map Values:"+results);
    }
}
