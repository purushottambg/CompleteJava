package loops.patterns;

import java.util.Scanner;

public class NthRowCentralizedPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the Nth Term:");
        Scanner scanner = new Scanner(System.in);
        int term = scanner.nextInt();

        for (int i = 0; i < term; i++) {
            for (int j = term-i; j >1 ; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <=i; j++) {
                System.out.print(" * ");
            }

            System.out.println("");
        }

    }
}
