package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareofEven {
    public static void main(String[] args) {
        //Stream that finds the square of all even numbers in a list and collects them into a list.
        List<Integer> nums= Arrays.asList(1,34,6,76,89,8,7,65,4);

        List<Integer> squares = nums.stream().filter(n->n%2==0)
                .map(n->n*n)
                .collect(Collectors.toList());

        for(Integer i: squares){
            System.out.print(i+" ");
        }

    }
}
