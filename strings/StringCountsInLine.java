package strings;

import java.util.Arrays;

public class StringCountsInLine {
    public static void main(String[] args) {
        String[] line = "home customer walk in, processed orders, and friendly prompt and friendly service both in walk and through home delivery".split(" ");
        int count = line.length;
        System.out.println("Count is:"+count);
    }
}
