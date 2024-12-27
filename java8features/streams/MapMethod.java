package java8features.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMethod {
    public static void main(String[] args) {
        Stream<Integer> radStream = Stream.generate(()->(int) (Math.random()*100)).limit(50);
        System.out.println("Total ist:\n"+ radStream.toString());
        List<Integer> mappedList = radStream.filter(n->n%2!=0)   //Only selective will be chosen to stay in filtered
                .map(n->n/3)        //this is performed on all the elements
                .sorted()           // all the remaining will be sorted in asc order by default
                .distinct()         // only unique will be printed
                .collect(Collectors
                        .toList()); // Values are stored or returned in the list collection objects
        System.out.println(mappedList);
    }
}
