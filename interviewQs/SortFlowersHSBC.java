package interviewQs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortFlowersHSBC {
    public static void main(String[] args) {
        int[] flowerHeights = {12,43,6, 76, 18,8,14, 22, 45,11,54,7,32,66,13,56,23,5,98,89,32,1,34,65,98,43,41,17};
        createBouquet(28, 12, flowerHeights);
    }

    public static void createBouquet(int n, int k, int arr[]){
        int[] firstHalf = Arrays.copyOf(arr, k);
        int[] secondHalf = Arrays.copyOfRange(arr, k, n);

        Arrays.sort(firstHalf);
        Arrays.sort(secondHalf);

        int lastIndex = secondHalf.length-1;
        int[] tempSecond = new int[secondHalf.length];
        for (int num:secondHalf){
            tempSecond[lastIndex]=num;
            lastIndex--;
        }

        int j=0;
        for (int i = 0; i < n; i++) {
            if (i<k){
                arr[i]=firstHalf[i];
            }else {
                arr[i]=tempSecond[j];
                j++;
            }
        }

        System.out.println("final Output");
        for (int i: arr){
            System.out.print(i+" ");
        }

    }
}
