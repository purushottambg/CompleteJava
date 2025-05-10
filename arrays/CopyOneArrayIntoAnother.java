package arrays;

import java.sql.Array;
import java.util.Arrays;

public class CopyOneArrayIntoAnother {
    public static void main(String[] args) {
        Integer[] arrayOne =  {12,32,3,46,76,45,34,23,4,67,34,35,34};
        Integer[] arrayTwo = new Integer[arrayOne.length];
        arrayTwo = arrayOne;

        for (Integer i: arrayTwo){
            System.out.println(i);
        }
    }
}
