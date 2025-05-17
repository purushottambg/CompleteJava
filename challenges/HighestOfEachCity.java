package challenges;

import java.util.Arrays;
import java.util.List;
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
}

public class HighestOfEachCity {
    public static void main(String[] args) {
        List<Merchants> shopkeepers = Arrays.asList(
                new Merchants(1L, "Amit Traders", "Mumbai", 95000),
                new Merchants(2L, "Sharma Mart", "Delhi", 87000),
                new Merchants(3L, "Verma Stores", "Bangalore", 76000),
                new Merchants(4L, "Kapoor Bazaar", "Hyderabad", 99000),
                new Merchants(5L, "Joshi & Sons", "Chennai", 91000),
                new Merchants(6L, "Gupta Goods", "Pune", 84000),
                new Merchants(7L, "Reddy Retail", "Kolkata", 88000),
                new Merchants(8L, "Patel Traders", "Ahmedabad", 96000),
                new Merchants(9L, "Yadav Wholesale", "Jaipur", 72000),
                new Merchants(10L, "Thakur Exports", "Lucknow", 93000)
        );

        List<Merchants> highestEarnerFromEachCity = shopkeepers.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
