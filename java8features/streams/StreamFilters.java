package java8features.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilters {
    public static void main(String[] args) throws Exception {
        Stream<Integer> intStream = Stream.generate(()->(int) (Math.random()*100)).limit(20);
        List<Integer> intList =  intStream.collect(Collectors.toList());
        System.out.println("Total elements: ");
        for (Integer totArrayVals : intList){
            System.out.print(totArrayVals+", ");
        }
        System.out.println("\nEven elements: ");
        List<Integer> evenNumbersList = intList.stream().filter(n->n%2==0).collect(Collectors.toList());
        for (Integer evenNumber : evenNumbersList){
            System.out.print(evenNumber+", ");
        }
    }
}
