package java8features.lambda;
import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " : " + marks;
    }
}

public class LambdaAdvancedDemo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Aman", 85),
                new Student("Bharat", 55),
                new Student("Chirag", 75),
                new Student("Deepak", 90),
                new Student("Esha", 45)
        );

        // Step 1: Filter students with marks >= 60
        // Step 2: Sort them by marks in descending order
        // Step 3: Print top 3 students

        List<Student> topStudents = students.stream()
                .filter(s -> s.marks >= 60)
                .sorted((s1, s2) -> Integer.compare(s2.marks, s1.marks))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Top Students:");
        topStudents.forEach(s -> System.out.println(s));
    }
}
