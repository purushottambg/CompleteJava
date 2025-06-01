package interviewQs;


import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * write function which accept plant heights as array and number of plants
 * return all the plants which are taller than neighbours
 */
public class FindTallestPlant {
    public static void main(String[] args) {
        System.out.print("enter total number of plants: ");
        Scanner scan = new Scanner(System.in);
        int plantsCount = scan.nextInt();

        System.out.println("Enter height for "+plantsCount+" plants:");
        int[] heights = new int[plantsCount];

        for (int i =0; i<plantsCount; i++){
            heights[i]=scan.nextInt();
        }

        System.out.print("Plant count taller than neighbours are:");
        int[] plantsRetrieved = tallerPlants(heights);
        for (int i: plantsRetrieved){
            if(i!=0)
                System.out.println(i);
        }
    }

    private static int[] tallerPlants(int[] plantHeights) throws ArrayIndexOutOfBoundsException{
        int result=0;
        int [] tallerPlants = new int[plantHeights.length] ;
        for(int i=0; i<=plantHeights.length-1; i++){
            System.out.println("Iteration for I:"+i+" capacity is:"+(plantHeights.length-1));
            if(i==0){
                if(plantHeights[i]>plantHeights[i+1]) {
                    tallerPlants[result] = plantHeights[i];
                    result++;
                }
                System.out.println("Iteration number is: "+(i+1)+" next digit is smaller: "+plantHeights[i+1]+" so result is:"+result);
            }else if(i==plantHeights.length-1){
                if(plantHeights[i]>plantHeights[i-1]) {
                    tallerPlants[result] = plantHeights[i];
                    result++;
                }
                System.out.println("Result: "+result);
                System.out.println("Iteration number is: "+(i+1)+" last digit is smaller: "+plantHeights[i-1]+" so result is:"+result);
            } else if (plantHeights[i]>plantHeights[i+1] && plantHeights[i]>plantHeights[i-1]) {
                tallerPlants[result] = plantHeights[i];
                result++;
                System.out.println("Iteration number is: "+(i+1)+" next digit is smaller: "+plantHeights[i+1]+" last digit is also smaller:"+plantHeights[i-1]+" so result is:"+result);
            }
        }

        return tallerPlants;
    }
}
