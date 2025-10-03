package companyWisePrep.PreciselyDoSelectPrep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

enum foodType{
      VEG, NONVEG;
}

class Consumer{
    final String name;
    final int age;
    final foodType food;

    public Consumer(String name, int age, foodType food){
        this.name=name;
        this.age=age;
        this.food=food;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public foodType getFood() {
        return food;
    }

    @Override
    public String toString(){
        return name+" "+age+" "+food;
    }
}

public class FoodConsumerClassFilter {
    public static void main(String[] args) {
        List<Consumer> consumers = Arrays.asList(
                new Consumer("Purushottam", 25, foodType.VEG),
                new Consumer("Pallavi", 22,foodType.VEG),
                new Consumer("Dipali", 29, foodType.VEG),
                new Consumer("Sanjay",32, foodType.NONVEG),
                new Consumer("Samarth", 10, foodType.NONVEG)
        );

        List<Consumer> vegies = consumers.stream().filter(c -> c.getFood()==foodType.VEG)
                .sorted(Comparator.comparing(c->c.getAge()))
                .collect(Collectors.toList());
        List<Consumer> nonvegies = consumers.stream().filter(c -> c.getFood()==foodType.NONVEG)
                .sorted(Comparator.comparing(Consumer::getAge)).collect(Collectors.toList());

        System.out.println("Vegies");
        for (Consumer c: vegies) System.out.println(c);

        System.out.println("\nNon-Vegies");
        for (Consumer c: nonvegies) System.out.println(c);

    }
}
