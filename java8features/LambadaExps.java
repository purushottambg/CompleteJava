package java8features;

import java.util.Scanner;

public class LambadaExps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=scan.next();
        Greet greet = name1 -> "Hello ".concat(name1);

        System.out.println("After Lambada Functions: "+ greet.greet(name));
    }
}

class LambadaEx<T>{
    T type;
    LambadaEx(T type){
        this.type=type;
    }
}

@FunctionalInterface
interface Greet{
    public String greet(String name);
}