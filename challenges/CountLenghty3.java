package challenges;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountLenghty3 {
    public static void main(String[] args) {
        System.out.print("Enter words separated by space:");
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine();

        List<String> namesList = Arrays.asList(names.split(" "));
        namesList.stream().forEach(element -> System.out.print(element+", "));
        List <String> lengthyNames = namesList.stream().filter(name -> name.length()>=3).collect(Collectors.toList());
        lengthyNames.forEach(System.out::println);
    }
}
