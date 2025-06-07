package java8features.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> nums = IntStream.range(1,29).boxed().collect(Collectors.toList());

        System.out.println("Sum of all the even numbers:"+nums.stream().filter(x->x%2==0).mapToInt(Integer::intValue).sum());
        System.out.println("Sum of all the odd numbers:"+nums.stream().filter(x->x%2!=0).mapToInt(Integer::intValue).sum());


    }
}
