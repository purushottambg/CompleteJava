package arrays;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] ar1 = {2,43, 12,5,65,43,21,71,3,65,23};
        int[] ar2 = {34,67,34,45,67,34,23,623,65,2};

        System.out.println("Are the both arrays same: "+ Arrays.equals(ar1,ar2));
        int sum=0;
        for(int i:ar1) sum+=i;
        System.out.println("sum is: "+sum);
        //if(Arrays.equals(ar1,ar2)) System.out.println("Differences are:"+ Arrays.mismatch());

    }
}
