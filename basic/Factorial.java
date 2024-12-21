package basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number to calculate the factorial: ");
        int num = scanner.nextInt();
        int additn=1;
        for(int i=1;i<=num;i++){
            additn*=i;
        }
        scanner.close();
        System.out.println("Factorial for "+num+" is:"+additn);
    }
}
