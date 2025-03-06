package arrays;

import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayOps {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int size = scanner.nextInt();

        int[] intArray = new int[size];
        for(int i: IntStream.range(0, size).toArray()){
            System.out.printf("Enter %d th value: ",i);
            intArray[i]=scanner.nextInt();
        }

        System.out.println("Enter the choice of operation to perform:");
        while (true){
            System.out.print("\n1. print element:            2. update element:             3. delete element:");
            int choice = scanner.nextInt();
            switch (choice){
                case 1: for(int i: intArray) System.out.printf("%d, ",i);
                    break;

                case 2:
                    System.out.println("Enter index and new value: ");
                    int index = scanner.nextInt();
                    int val1 = scanner.nextInt();
                    intArray[index]=val1;
                    break;

                case 3:
                    System.out.println("Enter value to be deleted: ");
                    int val2 = scanner.nextInt();
                    boolean flag=true;
                    int iterator=0;
                    for(int i : intArray){
                        if (i==val2){
                            String name;
                            int salary;
                            intArray[iterator]=0;
                            flag=false;
                        }
                        iterator++;
                    }

                    if(flag==true) System.out.printf("did not find the %d in array", val2);
                    break;

                default:
                    System.out.println("Invalid input, exit");
                    break;
            }

        }

    }

}
