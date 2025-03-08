package exceptions;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        System.out.println("Please enter digit:");
        Scanner scanner = new Scanner(System.in);
        int one=0;
        try{
             one=scanner.nextInt();
        }catch (Exception e){
            System.out.println(e+" Caught exception!");
        }
        scanner.nextLine();
        System.out.println("Value of the int: "+ one);
        System.out.println("Trry again, re-entr the value:");
        try {
            one=scanner.nextInt();
        }catch (Exception e){
            System.out.println(e+" Caught exception!");
        }
        System.out.println("Value is: "+one);
    }
}
