package java8features.streams;

import java.util.HashMap;
import java.util.Map;

public class NumberWithOnlyOneOccurance {
    public static void main(String[] args) {
        int uniqueVal = singleNumber(new int[]{1,1,2,3,3});
    }
    public static int singleNumber(int[] nums) {
        int result=0;
        Map<Integer, Integer> occCount = new HashMap<>();
        for (int i: nums)
            occCount.put(i, occCount.getOrDefault(i,0 )+1);

        for (Map.Entry<Integer, Integer> map: occCount.entrySet())
            if(map.getValue()==1)
                result = map.getKey();

        return result;

    }
}
