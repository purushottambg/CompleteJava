package challenges;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter number to print the series: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(rec(num));
    }

    private static int rec(int num){
        if(num<=1){
            return 1;
        } else {
             return rec(num-1)+rec(num-2);
        }
    }
}
