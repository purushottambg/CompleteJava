package java8features.streams;

import jdk.internal.dynalink.linker.LinkerServices;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CalculateAverage {
    public static void main(String[] args) {
        List<Integer> integers = IntStream.range(0,45).boxed().collect(Collectors.toList());

        double avg = integers.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Average is: "+avg);
    }
}
