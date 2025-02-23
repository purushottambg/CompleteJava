package strings;

public class StringConcatinations {
    public static void main(String[] args) {
        String str ="ABC";
        System.out.println("First Assignment: "+str+ "  ActualVariable: "+str.hashCode());
        str="DEF";
        System.out.println("Second Assignment: "+str+ "  ActualVariable: "+str.hashCode());
        System.out.println("Same Variable Vals: "+str+ "  ActualVariable: "+str.hashCode());
    }
}
