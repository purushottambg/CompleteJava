package java8features.optional;

import java.util.Optional;

public class DealWithNull {
    public static void main(String[] args) {
        Optional<String> str =  sendNull();

         str.ifPresent(string -> System.out.println(string));
         if(str.isPresent()){
             System.out.println(str.get());
         }
        System.out.println(str.orElse("This is Null"));
    }
    private static Optional<String> sendNull(){
        String value = null;
        return Optional.ofNullable(value);
    }
}
