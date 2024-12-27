package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("One", "Two", "Three", "Four", "Five");
        Stream<String> strStream = strList.stream();   //Create stream from the list
        System.out.println("Type of Name: "+strStream.getClass().getName());

        Integer[] intArray = {1,2,3, 4, 5, 6, 7};
        Stream<Integer> intStream = Stream.of(intArray);  //Create Stream using stream.of() method
        System.out.println("Type of Stream created from of method: "+ intStream.getClass().getName());

        Stream <Integer> floatStream = Stream.iterate(0,   n -> n + 1).limit(200); //Stream creation using iterate method, limit will specify max number to be generated
        System.out.println("Type of Stream created from iterate method: "+floatStream.getClass().getName());

        Stream <String>  streamString = Stream.generate(()->"str".concat("Faltuu"));  //Stream from Generate  method
        System.out.println("Type of stream created from generate method: "+ streamString.getClass().getName()  );
    }
}
