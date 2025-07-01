package loops.patterns;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        System.out.print("Enter the Nth Term:");
        Scanner scanner = new Scanner(System.in);
        int term = scanner.nextInt();
        for (int i = 1; i <=term; i++) {
            for (int j = 1; j <=term; j++) {
                if (i==1 || i==term){
                    System.out.print(" * ");
                }

                if(j==1 || j==term) {
                    System.out.print(" * ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
