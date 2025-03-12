package strings;

import java.util.Arrays;
import java.util.List;

public class StartFirstSString {

        public static void main(String[] args) {
            List<String> stringList = Arrays.asList("Pallavi", "Shruti", "Madhuri", "Nandini", "radha");
            int couter=0;
            for (String name : stringList){
                if(name.startsWith("s") || name.startsWith("S")){
                    System.out.println(couter+" is first index where element start with S");
                }
                couter++;
            }
            streamMethod(stringList);
       }
       private static void streamMethod(List<String> names){
            String first = names.stream().filter(name->name.startsWith("S")).findFirst().toString();
           System.out.println("Via Stream Method, First element is: "+first);
       }
}
