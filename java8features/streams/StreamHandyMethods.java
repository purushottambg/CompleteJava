package java8features.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream in java provides a lot's of method that can be amazing if used wisely
 */

public class StreamHandyMethods {
    public static void main(String[] args) {
        Stream<String> alreadyDefinedStrings = Stream.of("Raghav", "Shyam", "Dadus"); //create stream of predefined values
        alreadyDefinedStrings.forEach(System.out::println);
        List <Integer> getRangeOfDouble = Stream.iterate(0, n->n+3).limit(40).collect(Collectors.toList());
        System.out.println("Double type iterated Stream: "+getRangeOfDouble);
        Stream<Integer> integerStream = Stream.generate(()->(int) Math.random()*100).limit(10);
        integerStream.forEach(System.out::print);
    }
}
