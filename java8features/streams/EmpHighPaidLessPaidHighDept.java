package java8features.streams;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private Double salary;
    private boolean isActive;

    public Employee(int id, String name, String department, double salary, boolean isActive) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

public class EmpHighPaidLessPaidHighDept {
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rohit", "IT", 72000, true),
                new Employee(2, "Anjali", "HR", 48000, true),
                new Employee(3, "Sameer", "Sales", 23000, false),
                new Employee(4, "Pooja", "HR", 22000, true),
                new Employee(5, "Kiran", "Sales", 68000, true),
                new Employee(6, "Arun", "IT", 24000, false),
                new Employee(7, "Sneha", "Finance", 77000, true),
                new Employee(8, "Ravi", "Finance", 52000, true),
                new Employee(9, "Meera", "IT", 31000, false),
                new Employee(10, "Deepak", "Sales", 25000, true)
        );

        System.out.println("Total Employees are: "+employees.stream().count()); //Check the elements given to the Streams
        Optional<Employee> employee = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("Highest Paid Employee: "+employee.get().getName());

        Map<String, Optional<Employee>> highestByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));

        System.out.println("Highest paid in all the departments: "+highestByDept);

        String topPayingDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("N/A");
        System.out.println("Highest paid department: "+topPayingDept);


    }
}
