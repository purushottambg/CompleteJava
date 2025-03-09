package challenges;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter number to print the series: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printSeries(num);
    }

    private static int printSeries(int num){
        if(num==0) System.out.println("0, ");
        else if (num==1) {
            System.out.println("1, ");
            return num--;
        }
        else {
            printSeries(num--);
            System.out.println(num+", ");
        }
        return 0;
    }
}
