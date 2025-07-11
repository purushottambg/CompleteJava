package SmartGenInt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumFilter {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,10,15,8,49,25,98,32);
        List<Integer> filteredNum = myList.stream()
                .filter(num->num==1 || num>=10 && num<=19).collect(Collectors.toList());
        System.out.println(filteredNum);
    }
}
