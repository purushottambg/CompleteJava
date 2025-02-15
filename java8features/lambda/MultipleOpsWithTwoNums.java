package java8features.lambda;

@FunctionalInterface
interface Ops{
    int Operation(int a, int b);
    default void greetFunc(String name){
        System.out.println("Hello ".concat(name) );
    }
    default boolean compare(int a, int b){
        if(a>b) return true;
        return false;
    }
}

interface Compare {
    boolean compare(int a, int b);
}
public class MultipleOpsWithTwoNums {
    public static void main(String[] args) {
        Ops add = (a, b) -> a+b;
        Ops sub = (a, b) -> a-b;
        Ops mul = (a, b) -> a*b;
        Ops div = (a, b) -> a/b;
        Ops comp1;

        Compare comp = (a, b)-> a>b;

        System.out.println("Addition is: "+add.Operation(12,34));
        System.out.println("Subtraction is: "+sub.Operation(12,34));
        System.out.println("Mul is: "+mul.Operation(12,34));
        System.out.println("Division is: "+div.Operation(12,3));
        //System.out.println("Is first larger? "+comp1.compare(12,34));
        if(comp.compare(12,12))
            System.out.println("First element is greater");
        else
            System.out.println("Second element is greater");
        add.greetFunc("Purushottam");
    }


}
