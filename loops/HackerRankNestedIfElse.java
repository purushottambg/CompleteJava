package loops;

import java.util.Scanner;

public class HackerRankNestedIfElse {
    public static void main(String[] args) {
        System.out.println("Enter number to make decisions: ");
        Scanner scanner = new Scanner(System.in);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        decision(scanner.nextInt());
        scanner.close();
    }
    private static void decision(Integer num){
        if(num%2!=0)
            System.out.println("Weird");
        else if (num>=2 && num<=5)
            System.out.println("Not Weird");
        else if (num>=6 && num<=20)
            System.out.println("Weird");
        else if (num>=20) {
            System.out.println("Not Weird");
        }
    }
}
