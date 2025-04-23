package geeksChallenges;

public class SwapNumbers {
    public static void main(String[] args) {
        int one =12;
        int two = 20;

        System.out.printf("Before swap a= %d and b=%d",one, two);
        two = one+two-two;
        System.out.println();
        one = one+two-one;
        System.out.printf("After swap a= %d and b=%d",one, two);
    }
}
