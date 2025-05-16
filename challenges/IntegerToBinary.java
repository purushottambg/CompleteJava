package challenges;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args){
        System.out.println("Enter the number to convert to the Binary: ");
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        System.out.println("Entered number is: "+num);


        /**
         * 10%2=0
         * 5%2=1
         * 4%2=0
         * 2%2=0
         * 1%?=1
         */

        while(num>1){
            int mod=num%2;
            num/=2;
            System.out.printf("mod is %d and revised value is %d  \n", mod, num);
        }
        if (num==1)
            System.out.printf("mod is %d and revised value is %d  \n", 1, num);


    }
}
