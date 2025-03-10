package challenges;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23,54,5,4,2432,574,345,23,12,54,2,34,65,23,2,96,65,32);

        List<Integer> evenNums = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        for (int i: evenNums){
            System.out.print(i+", " );
        }
    }
}
