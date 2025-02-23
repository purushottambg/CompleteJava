package strings;

import java.util.Scanner;

class Operations{
    String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    Boolean isPalindrome(String strVal) {
        return new StringBuilder(strVal).reverse().toString().equals(strVal);
    }

    Integer vowelsCount(String string){
        int vowels=0,cons=0;
        for(char c:string.toCharArray()){
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                vowels+=1;
            else cons++;
        }
        return vowels;
    }




    public String duplicatePart(String strVal) {
        StringBuilder result = new StringBuilder();
        for (char c : strVal.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public String uniqueChar(String strVal) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c: strVal.toCharArray()){
            if(strVal.indexOf(c) ==strVal.lastIndexOf(c))
                stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
public class StringConcatinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String Value: ");
        String strVal = scanner.next();
        System.out.println("Now Choose Operation to Perform: ");
        Operations Oprs= new Operations();
        System.out.println("Choose Operation to perform:");
        System.out.println("1: Reverse      2: Palindrome");
        System.out.println("3: Vowels       4: Unique Chars");
        Integer Ops = scanner.nextInt();
        switch (Ops){
            case 1:
                System.out.println(Oprs.reverse(strVal));
                break;
            case 2:
                System.out.println(Oprs.isPalindrome(strVal));
                break;
            case 3:
                System.out.println("Vowels Count is: "+Oprs.vowelsCount(strVal));
                break;
            case 4:
                System.out.println("First Unique Char is:"+Oprs.uniqueChar(strVal));
                break;
            case 5:
                System.out.println("Repeated Part is String: "+Oprs.duplicatePart(strVal));
                break;
            default:
                System.out.println("Choose Valid Option next time");
        }

    }
}
