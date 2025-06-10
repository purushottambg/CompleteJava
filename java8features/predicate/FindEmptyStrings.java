package java8features.predicate;

import javax.naming.ldap.PagedResultsControl;
import java.util.function.Predicate;

/**
 * it's a functional interface introduced in the Java 8
 * it either returns true or false as it's a boolean valued
 */

public class FindEmptyStrings {
    public static void main(String[] args) {
        Predicate<String> isEmpty= str -> str.isEmpty();
        System.out.println("checking if string is empty: "+isEmpty.test("Normal"));
    }
}
