package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * filter the given transaction which are suspicious like having multiple locations and threshold above 10000
 */

class Transactions{
    private Long id;
    private List<String> devicesInvolved;
    private Double threshold;
    private String comment;

    public Transactions(Long id, List<String> devicesInvolved, Double threshold, String comment) {
        this.id = id;
        this.devicesInvolved = devicesInvolved;
        this.threshold = threshold;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getDevicesInvolved() {
        return devicesInvolved;
    }

    public void setDevicesInvolved(List<String> devicesInvolved) {
        this.devicesInvolved = devicesInvolved;
    }

    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }



}

public class FilterTransactions {
    public static void main(String[] args) {

        List<Transactions> transactions = Arrays.asList(
                new Transactions(101L, Arrays.asList("Laptop", "Mobile", "Charger"), 7500.0, "High risk"),
                new Transactions(102L, Arrays.asList("Tablet", "Mobile", "Charger"), 6500.0, "Low risk"),
                new Transactions(103L, Arrays.asList("Desktop", "Smartwatch"), 8200.0, "Potential fraud"),
                new Transactions(104L, Arrays.asList("Mobile"), 5400.0, "Normal"),
                new Transactions(105L, Arrays.asList("Laptop", "Tablet"), 9100.0, "Very high"),
                new Transactions(106L, Arrays.asList("POS Machine"), 4700.0, "Retail shop"),
                new Transactions(107L, Arrays.asList("ATM", "Mobile"), 9900.0, "Suspicious"),
                new Transactions(108L, Arrays.asList("Desktop"), 3600.0, "Normal"),
                new Transactions(109L, Arrays.asList("Smartwatch", "Tablet", "Keyboard"), 8800.0, "Flagged"),
                new Transactions(110L, Arrays.asList("Laptop", "ATM"), 10200.0, "High value")
        );

        List<Transactions> fraudlantTransactions = transactions.stream()
                .filter(n->n.getThreshold()>10000)
                .filter(n->n.getDevicesInvolved().size()>=2)
                .collect(Collectors.toList());

        System.out.println("We found total: "+fraudlantTransactions.size()+ "  Fake Transactions");

        for (Transactions t: fraudlantTransactions){
            System.out.println("id: "+t.getId()+" "+t.getThreshold());
        }

    }
}
