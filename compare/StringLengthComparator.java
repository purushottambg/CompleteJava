package compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringLengthComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arun", "Raghav", "Mahadev", "Ashok", "Sid", "Damodhar");
        System.out.println("Default order of the list elements: "+names);
        Collections.sort(names);
        System.out.println("Collections.sort() method sorting:"+names);
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                if(str1.length()>str2.length())
                    return 1;
                else return 2;
            }
        };

        Collections.sort(names, stringComparator);
        System.out.println("Sorting after user defined sort: "+names);

    }
}
