package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employees{
    String name;
    int salary;
    Employees(String name, int sal){
        this.name=name;
        this.salary=sal;
    }
    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class SortEmployees {
    public static void main(String[] args) {


        List<Employees> employeesList = Arrays.asList(
                new Employees("Purushottam", 23),
                new Employees("Purushottam", 25),
                new Employees("Raja", 23),
                new Employees("Vikas", 23),
                new Employees("Vikas", 3)

        );
        employeesList.forEach(System.out::println);
        System.out.println("After Sorting: ");
        employeesList.sort(Comparator.comparing((Employees e) -> e.name).thenComparing( e -> e.salary));
        employeesList.forEach(System.out::println);
    }
}
