package strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartingWith {
    public static void main(String[] args) {
        List< String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        colors = colors.stream().filter(x->x.startsWith("B")).collect(Collectors.toList());
        System.out.println("Total "+colors.size()+" colors starts with 'B'!");
    }
}
