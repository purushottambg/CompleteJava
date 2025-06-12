package java8features.supplier;

import java.util.function.Supplier;

public class SupplyString {
    public static void main(String[] args) {
        Supplier<String> giveMeString = () -> "String Value from the supplier";

        System.out.println("Supplier will give: "+ giveMeString.get());
    }
}
