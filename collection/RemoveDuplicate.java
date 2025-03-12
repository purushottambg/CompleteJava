package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.print("Enter words separated by space:");
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine().trim();

        List<String> namesList = Arrays.asList(names.split(" "));
        namesList.forEach(s-> System.out.print(s+", "));
        List<String> uniqueNamesList = namesList.stream().distinct().collect(Collectors.toList());

        System.out.println("\nOriginal element: ");
        uniqueNamesList.forEach(s-> System.out.print(s+", "));
    }
}
