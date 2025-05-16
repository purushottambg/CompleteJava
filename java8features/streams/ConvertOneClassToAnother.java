package java8features.streams;

/**
 * Implement a method that accept normal customer class and then convert it to the another class
 */

class NormalCustomer{
    private int id;
    private String fname;
    private String sname;
    private String lname;
    private String email;
    private String address;
    private double salary;
}

class RefinedClass{
    private String id;
    private String name;
    private String contact;
    private String address;
    private Double salary;
}

public class ConvertOneClassToAnother {
    public static void main(String[] args) {
        NormalCustomer normalCustomer = new NormalCustomer();
    }
}
