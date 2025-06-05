package java8features.optional;
import java.util.Optional;

class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

class User {
    private String name;
    private Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

public class StringWithMap {
    public static void main(String[] args) {
        Optional<User> user = Optional.of(new User("Puru", new Address("Pune")));

        String city = user
                .map(User::getAddress)  // gets Optional<Address>
                .map(Address::getCity)  // gets Optional<String>
                .orElse("Unknown");     // fallback if null

        System.out.println("City: " + city);  // Output: City: Pune
    }
}
