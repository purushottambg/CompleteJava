package java8features.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        Stream<Integer> parallelStream = Stream.generate(()->1*2).limit(250);
        List<Integer> items = parallelStream.skip(0).collect(Collectors.toList());
        items.parallelStream();
        System.out.println(items);
    }
}
