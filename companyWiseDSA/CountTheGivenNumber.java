package companyWiseDSA;

import java.util.Scanner;

public class CountTheGivenNumber {
    public static void main(String[] args) {
        String str = "the cat and the dog and the cat";
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the string to count occurance:");
        String word = scanner.next();
        int count=0;
        for (String wrd: str.split(" ")){
            if (wrd.equals(word)){
                count+=1;
            }
        }

        System.out.println("Count is:"+count);
    }
}
