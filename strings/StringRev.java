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

    static String  revString(String str){
        String revStringVal="";
        for(int i=str.length()-1;i>=0;i--)
            revStringVal+=str.charAt(i);
        return revStringVal;
    }
}
