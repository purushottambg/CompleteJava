package java8features.consumer;

import java.io.StringBufferInputStream;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MultiOperations {
    public static void main(String[] args) {
        Consumer<String> subString = val ->  System.out.print( val.substring(val.length()-3, val.length()) +" ");
        Consumer<String>  length = val ->  System.out.println( val.length() );
        Consumer<String> chained = subString.andThen(length);
        
        String[] strings = Arrays.asList("Raghav", "Rupali", "Tiruanantpuram", "Valvel", "Waloor")
                .stream()
                .toArray(String[]::new);

        for (String str: strings){
            System.out.print(str+" ");  chained.accept(str);
        }
        
    }
}
