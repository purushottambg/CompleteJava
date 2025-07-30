package IntervieQs;

import java.util.Set;
import java.util.TreeSet;

public class FindIfDuplicateExist {
    public static void main(String[] args) {
        Set<Integer> intSet = new TreeSet<>();
        int[] intArray = {1,3,5,3,6,4,3,2,1,9};

        for(int i: intArray){
            if (!intSet.add(i)){
                System.out.println("Contains Duplicate: "+i);
            }
        }

    }
}
