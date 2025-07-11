package connectwise;

import java.util.Scanner;

public class StackQuestion {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int squareRoot=0;
        for (int i = 1; i < num/2; i++) {
            for (int j = 1; j < num/2; j++) {
                if (i*j==num && i==j){
                    squareRoot=i;
                    System.out.println(i+" is the square root");
                    break;
                }
            }
        }
        if (squareRoot==0)
            System.out.println("There's no full square root for "+num);
    }
}
