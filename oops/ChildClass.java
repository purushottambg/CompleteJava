package oops;

public class ChildClass extends ImplementingClass implements InheritInterface {

    public static void main(String[] args) {
        System.out.println("Flag value is set to "+true);
    }
    @Override
    public void greet1() {
        System.out.println("Greet1 is form the Child class");
    }

    @Override
    public void greet2() {
        System.out.println("Greet1 is form the Child class");
    }

    public Boolean flag(){
        return super.updateFlag();
    }

}
