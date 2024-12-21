package java8features;

import java.util.Scanner;
import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {
        System.out.print("Enter String to calculate the length: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        Function<String, Integer> strLength = lambStr -> str.length();

        System.out.println("The length of the "+str+" is a: "+strLength.apply(str));
    }
}
