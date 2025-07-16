package IntervieQs;

import java.util.Scanner;

public class CheckIfInputStringIsConsecutiveNumes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean flag=true;
        for(int c: str.toCharArray()){
            if(c>='0' && c<='9'){
                continue;
            }else {
                flag=false;
                break;
            }
        }
        if (flag)
            System.out.println("This is consecutive");
        else
            System.out.println("Non-Consecutive");

    }
}
