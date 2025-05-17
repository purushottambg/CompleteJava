package java8features.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collection of variables from the collection which can perform finctional anddeclarative method operation
 * Advantages of stream are readability, flexibility, parallelism, encapsilation
 */
public class StreamUnderstanding {
    public static void main(String[] args) {
        List<Integer> intStream = Stream.iterate(1, n->n+3).limit(20).collect(Collectors.toList());
        System.out.println("Generated List is: "+intStream);

        List<Integer> evenNumbers = intStream.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Even numbers: "+ evenNumbers);

        List<Integer> squareOfEvens = intStream.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
        System.out.println("Square of the even numbers: "+squareOfEvens);


    }
}
