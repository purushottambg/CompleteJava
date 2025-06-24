package IntervieQs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class People{
    private String name;
    private String gender;
    private Double Salary;
    private int age;

    public People(String name, String gender, Double salary, int age) {
        this.name = name;
        this.gender = gender;
        Salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", Salary=" + Salary +
                ", age=" + age +
                '}';
    }
}

public class AverageAgeByGender {
    public static void main(String[] args) {
        List<People> folks = Arrays.asList(
                new People("Aarav", "Male", 2500.00, 28),
            new People("Vihaan", "Male", 2400.50, 25),
            new People("Shaurya", "Male", 2300.75, 30),
            new People("Ishaan", "Male", 2200.00, 26),
            new People("Ayaan", "Male", 2450.20, 29),
            new People("Advika", "Female", 2600.10, 24),
            new People("Aaradhya", "Female", 2550.00, 23),
            new People("Avani", "Female", 2700.25, 27),
            new People("Navya", "Female", 2650.40, 22),
            new People("Tanisha", "Female", 2750.60, 28),
            new People("Kabir", "Male", 2800.90, 31),
            new People("Dhruv", "Male", 2850.30, 27),
            new People("Shivansh", "Male", 2900.80, 24),
            new People("Vedant", "Male", 2950.00, 29),
            new People("Pranav", "Male", 3000.20, 32),
            new People("Saanvi", "Female", 3050.50, 26),
            new People("Kiara", "Female", 3100.75, 25),
            new People("Reva", "Female", 3150.00, 23),
            new People("Zara", "Female", 3200.40, 24),
            new People("Aadhya", "Female", 3250.60, 22)
        );

        List<People> averageAge = folks.stream().filter(person->person.getGender().equals("Female")).collect(Collectors.toList());

        for(People people:averageAge){
            System.out.println("Name: "+people.getName()+" Gender:"+people.getGender()+" Salary:"+people.getSalary()+" Age:"+people.getAge());
        }

        Double averageMaleAge = folks.stream().filter(x->x.getGender().equalsIgnoreCase("Male")).mapToInt(People::getAge).average().orElse(0);
        Double averageFemaleAge = folks.stream().filter(x->x.getGender().equalsIgnoreCase("Female")).mapToInt(People::getAge).average().orElse(0);
        System.out.println("Average ages are Male:"+averageMaleAge+" Female:"+averageFemaleAge);

        Map<String, Double> averageAges = folks.stream().collect(Collectors.groupingBy(
                People::getGender, Collectors.averagingInt(People::getAge)
        ));
        System.out.println("Gender wise averageAges are: "+averageAges);

    }
}
