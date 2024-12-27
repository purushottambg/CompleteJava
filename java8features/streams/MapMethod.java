package java8features.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMethod {
    public static void main(String[] args) {
        Stream<Integer> radStream = Stream.generate(()->(int) (Math.random()*100)).limit(50);
        System.out.println("Total ist:\n"+ radStream.toString());
        List<Integer> mappedList = radStream.filter(n->n%2!=0).map(n->n/3).sorted().distinct().collect(Collectors.toList());
        System.out.println(mappedList);
    }
}
