package strings;

import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        System.out.print("Enter the string to reverse: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String revString = revString(str);
        System.out.println("Reversed String val: "+revString);
    }

    private static String revString(String str){
        String revstr="";
        int len = str.length()-1;
        for (int i=len;i>=0;i--){
           revstr+=str.charAt(i);
        }
        return revstr;
    }
}
