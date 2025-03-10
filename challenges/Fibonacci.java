package challenges;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter number to print the series: ");
        Scanner scanner = new Scanner(System.in);
        Long num = scanner.nextLong();
        for(Long i : LongStream.range(0, num).toArray()){
            System.out.print(rec(i)+", ");
        }
    }

    private static Long rec(Long num){
        if(num<=1){
            return num;
        } else {
             return rec(num-1)+rec(num-2);
        }
    }
}
