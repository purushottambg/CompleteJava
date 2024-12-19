package oops;
import oops.Polymorphism.*;
public class PolyMorphismWithMain {
    public static void main(String[] args) {
        Polymorphism polymorphism=new Polymorphism();
        System.out.println(polymorphism.MathOps(23,54));
        System.out.println(polymorphism.MathOps("one ","two"));
    }
}
