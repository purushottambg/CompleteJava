package java8features.lambda;

@FunctionalInterface
interface PalindromeString{
    boolean isPalindrome(String str);
}

public class PalindromeStringWithLambda {
    public static void main(String[] args) {
        String string = new String("Sonata");
        PalindromeString isStringPalindrome = (String str) ->
                str.equals(new StringBuilder(str).reverse().toString());
        System.out.println("Palindrome Results for "+string+":"+isStringPalindrome.isPalindrome(string));
    }
}
