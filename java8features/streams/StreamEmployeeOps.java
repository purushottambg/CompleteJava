package java8features.streams;

import java.util.*;
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

public class StreamEmployeeOps {
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
                new People("Vihaan", "Male", 2800.90, 99),
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

        System.out.println("Pick the operations to be performed: ");
        System.out.printf("%-30s %-25s %-20s \n", "Find Youngest and oldest:",  "Group by Gender:",  "Average Salary By Gender:");
        System.out.printf("%-30s %-25s %-20s \n", "Count People by Gender:", "Names older than 30:", "Sort by Salary Desc order:");
        System.out.printf("%-30s %-25s %-20s \n", "Check if all above 18:",  "Emp above 70k salary:",  "Find all duplicate names:");
        System.out.printf("%-30s %-25s %-20s \n", "Top highest 3 paid:", "average Age of highest 3:",  "name shorter length than 5:");

        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();

        switch (choice){
            case 1:
                List<People> youngestNOldest = folks.stream().sorted(Comparator.comparingInt(People::getAge)).collect(Collectors.toList());
                System.out.println("youngest: "+youngestNOldest.get(0)+" Oldest: "+youngestNOldest.get(youngestNOldest.size()-1));
                break;

            case 2: Map<String, List<People>> groupByGender = folks.stream().collect(Collectors.groupingBy(People::getGender));
                System.out.println(groupByGender);
                break;

            case 3: Map<String, Double> averageSalByGender = folks.stream()
                    .collect(Collectors.groupingBy(
                            People::getGender, Collectors.averagingDouble(People::getSalary)
                    ));
                System.out.println("Average by Gender: "+averageSalByGender);
                break;

            case 4: Map<String, Long> countGroupByGender = folks.stream()
                    .collect(Collectors.groupingBy(
                            People::getGender, Collectors.counting()
                    ));
                System.out.println("Count by the Gender: "+countGroupByGender);
                break;

            case 5: List<String> peopleOver30 = folks.stream()
                    .filter(str->str.getAge()>30)
                    .map(People::getName)
                    .collect(Collectors.toList());
                System.out.println(peopleOver30);
                break;

            case 6: List<String> soredSalInDesc = folks.stream()
                    .sorted(Comparator.comparingDouble(People::getSalary).reversed())
                    .map(People::getName)
                    .collect(Collectors.toList());
                System.out.println("Names sorted based on the Salary: "+soredSalInDesc);
                break;

            case 7: System.out.println("Are all people Above 18: "+folks.stream().allMatch(ppl->ppl.getAge()>18));
                break;

            case 8: List<People> above70kEarner = folks.stream()
                            .filter(person->person.getSalary()>70)
                                    .collect(Collectors.toList());
                System.out.println("People earning over 70k:"+above70kEarner);
                break;

            case 9: Set<String> uniquePeople = new HashSet<>();
                Set<String> duplicateNames = folks.stream()
                    .map(People::getName)
                        .filter(ppl -> !uniquePeople.add(ppl))
                    .collect(Collectors.toSet());
                System.out.println("People earning over 70k:"+duplicateNames);
                break;

            case 10: List<People> highest3Paid = folks.stream()
                    .sorted(Comparator.comparingDouble(People::getSalary))
                    .skip(folks.size()-3)
                    .collect(Collectors.toList());
                System.out.println("Highest paid 3 employees:"+highest3Paid);
                break;

            case 11: // average age of high 3
                Double averageAgeOfTop3Paid = folks.stream()
                        .sorted(Comparator.comparingDouble(People::getSalary))
                        .limit(3)
                        .mapToDouble(People::getAge)
                        .average().orElse(0);
                System.out.println("Average age of highest paid 3 employees:"+averageAgeOfTop3Paid);
                break;

            case 12: //names shorter than 5 len
                List<String> namesShorterThan5Chars = folks.stream()
                        .filter(name->name.getName().length()<5)
                        .map(People::getName)
                        .collect(Collectors.toList());
                System.out.println("Names with shorter than 5 length: "+namesShorterThan5Chars);
                break;

            default:
        }

    }
}
