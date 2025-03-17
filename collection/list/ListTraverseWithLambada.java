package collection.list;

import java.util.Arrays;
import java.util.List;

public class ListTraverseWithLambada {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("One", "Two", "Three", "Nine");
        stringList.forEach(s-> System.out.print (s));  //for each from Lambada can be used to perform particular Operation on all the elements
    }
}
