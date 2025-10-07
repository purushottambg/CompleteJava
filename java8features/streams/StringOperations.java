package java8features.streams;

public class StringOperations {
    public static void main(String[] args) {
        System.out.println(reverseString("ReverseString"));
        String string = "Chaaya";
        System.out.println("Is "+string+" Palindrome:"+isPalindrome(string));

    }
    public static boolean isPalindrome(String str){
        return str.equals(reverseString(str));
    }
    public static String reverseString(String str){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=str.length()-1; i>=0; i--){
            stringBuffer.append(str.charAt(i));
        }
        return stringBuffer.toString();
    }
}
