package challenges;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args){
        System.out.println("Enter the number to convert to the Binary: ");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        System.out.println("Entered number is: "+num);
    }
}
