package challenges;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class RerseTheNumber {
    public static void main(String args[]){
        System.out.println("Enter the number to reverse: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Entered number is: "+num);
        System.out.println("Reveresed number is: "+reverse(num));
    }

    public static int reverse(int x){
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;

            // Check for overflow (if reversed goes out of int bounds)
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                throw new ArithmeticException("Integer overflow");
            }

            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }
}
