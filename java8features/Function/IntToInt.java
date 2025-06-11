package java8features.Function;

import java.util.function.Function;

public class IntToInt {
    public static void main(String[] args) {
        Function<Integer, Integer> intToInt = val -> val*val;

        System.out.println("Integer by Function: "+intToInt.apply(1220));
    }
}
