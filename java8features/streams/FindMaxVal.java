package java8features.streams;

import java.util.*;
import java.util.stream.Collectors;

public class FindMaxVal {
    public static void main(String[] args) {
        System.out.print("Enter the nums separated by space; ");
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.nextLine().trim();

        List<String> numStringList = Arrays.asList(numStr.split(" "));
        List<Integer> numIntList = new ArrayList<>();
        for (String s:numStringList){
            numIntList.add(Integer.parseInt(s));
        }
        List<Integer> sortedNum=numIntList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Largest Num is: "+sortedNum.get(0));

    }
}
