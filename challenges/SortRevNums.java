package challenges;

import java.util.*;

public class SortRevNums {
    public static void main(String[] args) {
        System.out.print("Enter Numbers separated by space:");
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine().trim();
        String[] vals = names.split("\\s+");
        List<Integer> valsList=new ArrayList<>();
        for (String str: vals){
            valsList.add(Integer.parseInt(str));
        }

        System.out.println("Before Sort!!");
        valsList.stream().forEach(s-> System.out.print(s+", "));

         valsList.sort(Comparator.reverseOrder());

        System.out.println("\nAfter Sort!!");
         valsList.stream().forEach(s-> System.out.print(s+", "));

    }
}
