package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    private int empId;
    private String name;
    private String dep;
    private double salary;
    private int age;
    private String gender;

    public Employee(int empId, String name, String dep, double salary, int age, String gender) {
        this.empId = empId;
        this.name = name;
        this.dep = dep;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDep() {
        return dep;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

public class StreamEmpOperations {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Aarav", "IT", 75000, 27, "Male"),
                new Employee(102, "Priya", "HR", 62000, 25, "Female"),
                new Employee(103, "Rahul", "Finance", 83000, 30, "Male"),
                new Employee(104, "Sneha", "IT", 91000, 29, "Female"),
                new Employee(105, "Karan", "Admin", 50000, 26, "Male"),
                new Employee(106, "Meera", "Finance", 88000, 31, "Female"),
                new Employee(107, "Ravi", "IT", 95000, 32, "Male"),
                new Employee(108, "Pooja", "HR", 64000, 24, "Female"),
                new Employee(109, "Arjun", "IT", 72000, 28, "Male"),
                new Employee(110, "Nisha", "Finance", 81000, 27, "Female"),
                new Employee(111, "Vikram", "Admin", 56000, 33, "Male"),
                new Employee(112, "Tina", "IT", 98000, 29, "Female"),
                new Employee(113, "Sanjay", "Finance", 87000, 34, "Male"),
                new Employee(114, "Kavya", "HR", 60000, 26, "Female"),
                new Employee(115, "Manoj", "IT", 76000, 28, "Male"),
                new Employee(116, "Isha", "Finance", 92000, 30, "Female"),
                new Employee(117, "Dev", "Admin", 54000, 25, "Male"),
                new Employee(118, "Ritu", "IT", 89000, 27, "Female"),
                new Employee(119, "Neeraj", "Finance", 97000, 35, "Male"),
                new Employee(120, "Ananya", "HR", 65000, 24, "Female")
        );

        Map<String, Double> departmentAverageSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDep, Collectors.averagingDouble(Employee::getSalary)));
        Map<String, List<Double>> departmentWiseSalaries = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.getDep(), Collectors.mapping(e->e.getSalary(), Collectors.toList())));


        System.out.println("Department and Average Salary");
        for (Map.Entry<String, Double> map:departmentAverageSalary.entrySet()) System.out.println(map.getKey()+" "+map.getValue());
        System.out.println("\nDepartment and All Salaries");
        for (Map.Entry<String, List<Double>> map:departmentWiseSalaries.entrySet()) System.out.println(map.getKey()+" "+map.getValue());

    }
}
