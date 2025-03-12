package strings;

import java.util.Arrays;
import java.util.List;

public class StringListToUpperCase {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Pallavi", "Shruti", "Madhuri", "Nandini", "radha");
        int couter=0;
        for (String name : stringList){
            stringList.set(couter, name.toUpperCase());
            couter++;
        }

        for (String name : stringList){
            System.out.println(name);
        }
    }
}
