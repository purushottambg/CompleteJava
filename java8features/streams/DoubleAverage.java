package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class DoubleAverage {
    public static void main(String[] args) {
        List<Double> doubleList = DoubleStream.iterate(22.00, n->n+20.10).limit(20).boxed().collect(Collectors.toList());
        double average = doubleList.stream().mapToDouble(i->i).average().orElse(0);
        System.out.println(average);
    }
}
