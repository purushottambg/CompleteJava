package java8features.streams;

import java.util.Arrays;

public class ChetanGhateStreamPoroblems {
    public static void main(String[] args) {
        int numbers = Arrays.asList(1,2,4,6,5,7,8,3,7,20).stream().mapToInt(n->(int)n).filter(n->n%2==0).map(n->n*n).sum();

        System.out.println(numbers);


    }
}
