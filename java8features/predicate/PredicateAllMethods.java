package java8features.predicate;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class PredicateAllMethods {
    public static void main(String[] args) {
        System.out.println("Here we'll see the predicates and their usage");
        Map<Integer, String> rollNos = new HashMap<>();
        rollNos.put(1, "Om");
        rollNos.put(2, "Namo");
        rollNos.put(3, "Shivai");

        Predicate<Map> rollNo = x->rollNos.containsKey(2);

        System.out.println("does Shivai has larger than 2 number:"+rollNo.test(rollNos));



    }
}
