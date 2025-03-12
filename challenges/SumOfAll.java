package challenges;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SumOfAll {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<Integer>();
        System.out.println("Please enter unique Numbers: ");
        Scanner scanner = new Scanner(System.in);
        boolean wish=true;
        while (wish){
            nums.add(scanner.nextInt());
            System.out.println("do you hve more: y/n");
            String s = scanner.next();
            if(s.equals("n")||s.equals("N")) wish=false;
        }
        int add=0;
        int sum = nums.stream().mapToInt(Integer::intValue)
                        .sum();

         nums.forEach(System.out::println);
        System.out.println("Total addition is: "+sum);
    }
}
