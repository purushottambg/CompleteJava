package strings;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        List<String> nams= Arrays.asList(str.split(" "));
        String str2="";
        for (String s: nams)
            str2=str2+s+",";

        System.out.println("Single String will be: "+str2);

    }
}
