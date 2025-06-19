package java8features.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class CountTheNumbers {
    public static void main(String[] args) {
        List<Double> numbers = DoubleStream.iterate(12.03, x->x*2.1).limit(100).boxed().collect(Collectors.toList());

        //System.out.println(numbers);

        Long count = numbers.stream().count();
        System.out.println("Total count of the numbers: "+count);

    }
}
