package java8features.streams;

import java.util.ArrayList;
import java.util.List;

public class MinAndMax {
    public static void main(String[] args) {
        List<Double> score = new ArrayList<>();
        score.add(123.5);
        score.add(93.25);
        score.add(140.00);
        score.add(312.03);
        score.add(220.43);
        score.add(321.89);
        score.add(542.09);
        System.out.println("All members are: "+score);
        System.out.println("Min member is: "+score.stream().min(Double::compareTo));
        System.out.println("Max member is: "+score.stream().max(Double::compareTo));
    }
}
