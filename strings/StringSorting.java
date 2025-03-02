package strings;


import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {
        String[] str = new String[]{"one", "Two", "three", "four","five", "six"};

        Arrays.sort(str);   //Inbuilt method for array sorting
        for (String s: str)
            System.out.println(s);
    }
}
