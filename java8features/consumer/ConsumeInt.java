package java8features.consumer;

import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * The Consumer is a functional interface with accept abstract method
 * while andThen() is a default method
 */
public class ConsumeInt {
    public static void main(String[] args) {
        Consumer<Integer> printNext = x -> System.out.println(x+1);

        Integer[] nums = IntStream.range(123, 128)
                    .boxed()
                        .toArray(Integer[]::new);
        for (Integer i: nums){
            printNext.accept(i);
        }
    }
}
