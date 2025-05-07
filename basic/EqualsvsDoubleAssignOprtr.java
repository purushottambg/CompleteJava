package basic;

public class EqualsvsDoubleAssignOprtr {
    public static void main(String[] args) {
        String one= new String("str");
        String two= new String("str");

        if(one==two){
            System.out.println("The result for the == is true and values are same");
        }
        if (one.equals(two)) {
            System.out.println("Seems values are same even for .equals()");
        }
    }
}
