package java8features.streams;

import java.util.Arrays;
import java.util.stream.LongStream;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        long[] numbers = LongStream.range(Long.valueOf(0), Long.valueOf(100)).toArray();
        numbers = Arrays.stream(numbers).sorted().toArray();
        System.out.println("Second Tallest is:"+numbers[numbers.length-1]);
        System.out.println("Second Smallest is:"+numbers[1]);
    }
}
