package arrays;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = scanner.nextInt();

        int[] intArray = new int[size];
        for(int i: IntStream.range(0, size).toArray()){
            System.out.printf("Enter %d th value: ",i);
            intArray[i]=scanner.nextInt();
        }

        for(int i: intArray)
            System.out.printf("%d, ",i);
    }
}
