package challenges;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Merchants{
    private Long id;
    private String name;
    private String city;
    private double income;
    public Merchants(Long id, String name, String city, double income) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.income = income;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Details are id: " + id+ " name: "+
                name+ " city: "+
                city+ " income: "+
                income+ " ";
    }
}

public class HighestOfEachCity {
    public static void main(String[] args) {
        List<Merchants> shopkeepers = Arrays.asList(
                new Merchants(1L, "Amit Traders", "Mumbai", 95000),
                new Merchants(2L, "Sharma Mart", "Pune", 87000),
                new Merchants(3L, "Verma Stores", "Bangalore", 76000),
                new Merchants(4L, "Kapoor Bazaar", "Pune", 99000),
                new Merchants(5L, "Joshi & Sons", "Chennai", 91000),
                new Merchants(6L, "Gupta Goods", "Pune", 84000),
                new Merchants(7L, "Reddy Retail", "Kolkata", 88000),
                new Merchants(8L, "Patel Traders", "Pune", 96000),
                new Merchants(9L, "Yadav Wholesale", "Jaipur", 72000),
                new Merchants(10L, "Thakur Exports", "Jaipur", 93000)
        );

        List<Merchants> highestEarnerFromEachCity = shopkeepers.stream()
                .sorted(Comparator.comparing(Merchants::getCity).thenComparing(Comparator.comparingDouble(Merchants::getIncome).reversed()))
                .filter(new Predicate<Merchants>() {
                    Set<String> uniqueCities = new HashSet<>();
                    @Override
                    public boolean test(Merchants merchants) {
                        return uniqueCities.add(merchants.getCity());  //only one merchant will be returned here as we've already sorted them by their income
                    }
                })
                .collect(Collectors.toList());

        System.out.println(highestEarnerFromEachCity);

        for (Merchants merchants: highestEarnerFromEachCity){
            System.out.println(merchants.toString());
        }

        System.out.println("With one line solution: ");

//        Map<String, Merchants> topEarners = shopkeepers.stream()
//                .collect(Collectors.toMap(
//                        Merchants::getCity,                            // key = city
//                        Function.identity()                        // value = Merchant object
//                        //BinaryOperator.maxBy(Comparator.comparingDouble(Merchants::getIncome)) // resolve duplicate cities
//                ));
//
//        shopkeepers.forEach((city, merchant) ->
//                System.out.println("City: " + city + ", Top Earner: " + merchant.getName() + ", Income: " + merchant.getIncome())
//        );

    }
}
