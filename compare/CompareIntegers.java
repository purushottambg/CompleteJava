package compare;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompareIntegers {
    public static void main(String[] args) {
        int [] arrays = new int[10];
        arrays = IntStream.range(0,25).toArray();
        List<Integer> wrappedIntList = Arrays.stream(arrays).boxed().collect(Collectors.toList());

        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1>o2){
                    return -1;
                }else if(o2>o1){
                    return 1;
                }else return 0;
            }
        };

        System.out.println("Reversed order Array: ");
        Collections.sort(wrappedIntList, integerComparator);
        System.out.println(wrappedIntList);
    }
}
