package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class First3Elements {
    public static void main(String[] args) {
        List<String> strList = Arrays.stream("amdocs make it amazing also memorable".split(" ")).collect(Collectors.toList());
        List<String> first3 = strList.stream().limit(3).collect(Collectors.toList());
        System.out.println("First 3 elements are: "+first3);
    }
}
