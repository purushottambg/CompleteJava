package arrays;

import java.util.Arrays;

public class FindSmallestAndLargest {
    public static void main(String[] args) {
        int[] ints = {2,4,2,5,7,3,6,35,84,446,56,5};

        Arrays.sort(ints);
        System.out.println("Smallest:"+ints[0]+" Largest:"+ints[ints.length-1]);
    }
}
