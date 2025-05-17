package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implement a method that accept normal customer class and then convert it to the another class
 */

class NormalCustomer{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private int id;
    private String fname;
    private String sname;
    private String lname;
    private String email;
    private long phone;
    private String address;
    private double salary;

    public NormalCustomer(int id, String fname, String sname, String lname, String email, long phone, String address, double salary) {
        this.id = id;
        this.fname = fname;
        this.sname = sname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }
}

class RefinedCustomers{
    public RefinedCustomers(String id, String name, String contact, String address, Double annualSalary) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.annualSalary = annualSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Double annualSalary) {
        this.annualSalary = annualSalary;
    }

    private String id;
    private String name;
    private String contact;
    private String address;
    private Double annualSalary;
}

public class ConvertOneClassToAnother {
    public static void main(String[] args) {

        List<NormalCustomer> oldCustomersList = Arrays.asList(
                        new NormalCustomer(1, "Aarav", "Kumar", "Sharma", "aarav.sharma@gmail.com", 9876543210L, "Delhi", 50000),
                        new NormalCustomer(2, "Neha", "Rani", "Verma", "neha.verma@yahoo.com", 9123456780L, "Mumbai", 60000),
                        new NormalCustomer(3, "Raj", "Singh", "Chauhan", "raj.c@gmail.com", 9784561230L, "Pune", 55000),
                        new NormalCustomer(4, "Priya", "Mehta", "Kapoor", "priya.kapoor@gmail.com", 9988776655L, "Bangalore", 62000),
                        new NormalCustomer(5, "Vikram", "Raj", "Malhotra", "vikram.m@outlook.com", 9345612870L, "Chennai", 48000),
                        new NormalCustomer(6, "Anjali", "N.", "Tiwari", "anjali.t@gmail.com", 9900123456L, "Kolkata", 53000),
                        new NormalCustomer(7, "Rohan", "S.", "Jain", "rohan.jain@gmail.com", 9090909090L, "Hyderabad", 70000),
                        new NormalCustomer(8, "Sneha", "R.", "Patel", "sneha.patel@gmail.com", 9111222233L, "Ahmedabad", 47000),
                        new NormalCustomer(9, "Aman", "Dev", "Joshi", "aman.joshi@gmail.com", 9800980098L, "Jaipur", 65000),
                        new NormalCustomer(10, "Kriti", "A.", "Mishra", "kriti.m@gmail.com", 9123456123L, "Lucknow", 59000)
        );

        List<RefinedCustomers> refinedCustomers = oldCustomersList.stream()
                .map(normalCustomer-> new RefinedCustomers(
                        String.valueOf(normalCustomer.getId()),
                        normalCustomer.getFname()+normalCustomer.getSname()+normalCustomer.getLname(),
                        normalCustomer.getAddress(),
                        normalCustomer.getEmail()+" | "+ normalCustomer.getPhone(),
                        normalCustomer.getSalary()*12
                ))
                .collect(Collectors.toList());

        System.out.println("We have total: "+refinedCustomers.size()+ " customers refined and these are: ");
        for (RefinedCustomers refinedCustomer : refinedCustomers ){
            System.out.println("id: "+ refinedCustomer.getId());
            System.out.println("name: "+ refinedCustomer.getName());
            System.out.println("address: "+ refinedCustomer.getAddress());
            System.out.println("salary: "+ refinedCustomer.getAnnualSalary());
            System.out.println("Contact: "+ refinedCustomer.getContact());
        }

    }
}
