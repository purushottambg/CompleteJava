package oops;

public class ImplementingClass extends ClassToBeInherited implements InheritInterface{

    @Override //Necessary Methods from Interface must be implemented
    public void greet1() {
        System.out.println("Greet1 is form the class implementing interface");
    }

    @Override  //Necessary Methods from Interface must be implemented
    public void greet2() {
        System.out.println("Greet2 is form the class implementing interface");
    }
}
