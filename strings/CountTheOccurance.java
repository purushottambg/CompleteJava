package strings;

import java.util.Scanner;

public class CountTheOccurance {
    public static void main(String[] args) {
        System.out.println("Enter the line: ");
        Scanner in = new Scanner(System.in);
        int occount=0;
        String s = in.nextLine();
        System.out.println("Enter word to count the occurance: ");
        String oc = in.next();
        String[] words = s.split("\\W+");
        for(String str : words){
            if (str.equalsIgnoreCase(oc)){
                occount++;
            }
        }
        System.out.printf("Presence is: %d",occount);
    }
}
