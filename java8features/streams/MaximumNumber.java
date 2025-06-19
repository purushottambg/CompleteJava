package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,43,5467,78,56,43,65,467,34);
        Optional<Integer> maxNum = numbers.stream().max(Integer::compareTo);
        //List<Integer> max = numbers.stream().sorted().collect(Collectors.toList());
        maxNum.ifPresent(x->System.out.println(x));
        if(maxNum.isPresent()) System.out.println(maxNum.get());
    }
}
