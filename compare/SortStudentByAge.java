package compare;

import java.util.*;

class Student{
    private String name;
    private Integer age;
    private Double score;

    public Student(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
    public void data(){
        System.out.println("Name:"+this.name+" age:"+this.age+" score:"+this.score);
    }
}
public class SortStudentByAge {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ravi", 11, 68.22),
                new Student("Aditya", 13, 68.22),
                new Student("Riya", 14, 72.10),
                new Student("Kabir", 15, 65.00),
                new Student("Sneha", 13, 74.50),
                new Student("Aarav", 14, 81.35),
                new Student("Ishita", 13, 62.45),
                new Student("Manav", 15, 79.60),
                new Student("Neha", 14, 70.00),
                new Student("Dev", 13, 88.20),
                new Student("Tanya", 15, 67.30)
        );
        for (Student student: students){
            student.data();
        }

        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge()>o2.getAge()){
                    return 1;
                }else if(o2.getAge()>o1.getAge()){
                    return -1;
                }else return 0;
            }
        };
        System.out.println("\n After sorting\n");
        Collections.sort(students, studentComparator);
        for (Student student: students){
            student.data();
        }
    }
}
