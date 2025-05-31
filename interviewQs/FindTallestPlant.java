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

        System.out.print("Plant count taller than neighbours are:"+tallerPlants(heights));
    }

    private static int tallerPlants(int[] plantHeights){
        int result=0;

        for(int i=0; i<plantHeights.length; i++){
            if(i==0 && plantHeights[i]<plantHeights[i+1]){
                result++;
            }else if(i==plantHeights.length-1 && plantHeights[i]<plantHeights[i-1]){
                result++;
            } else if (plantHeights[i]>plantHeights[i+1] && plantHeights[i]>plantHeights[i-1]) {
                result++;
            }
        }

        return result;
    }
}
