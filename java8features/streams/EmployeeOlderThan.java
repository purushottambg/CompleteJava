package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeClass{
    private String name;
    private Double salary;
    private String address;

    public EmployeeClass(String name, Double salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class EmployeeOlderThan {
    public static void main(String[] args) {
        List<EmployeeClass> employeeList = Arrays.asList(
                new EmployeeClass("Aarav", 2100.75, "Kalyani Nagar, Pune"),
                new EmployeeClass("Kiaan", 1950.50, "Viman Nagar, Pune"),
                new EmployeeClass("Advika", 2050.00, "Aundh, Pune"),
                new EmployeeClass("Ananya", 2200.40, "Baner, Pune"),
                new EmployeeClass("Shivansh", 2300.60, "Wakad, Pune"),
                new EmployeeClass("Dhruv", 1980.20, "Kharadi, Pune"),
                new EmployeeClass("Kabir", 2150.30, "Hadapsar, Pune"),
                new EmployeeClass("Arya", 2250.90, "Magarpatta, Pune"),
                new EmployeeClass("Vedant", 2400.10, "Shivajinagar, Pune"),
                new EmployeeClass("Viraj", 2000.25, "Kondhwa, Pune")
        );

        List<EmployeeClass> sortedEmployee =
                employeeList.stream().filter(emp->emp.getSalary()>2000).collect(Collectors.toList());

        for (EmployeeClass e: sortedEmployee){
            System.out.println(e);
        }
    }
}
