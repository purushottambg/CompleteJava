package java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;
    int marks;
    String subject;

    public Student(int id, String name, int marks, String subject) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }

    public int getMarks(){
        return marks;
    }
    public int getId(){return id;}

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + '\'' +
                ", marks=" + marks + ", subject='" + subject + "'}";
    }
}

public class Group {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Adding 25 students
        students.add(new Student(1, "Alice", 85, "Math"));
        students.add(new Student(2, "Bob", 78, "Science"));
        students.add(new Student(3, "Charlie", 92, "English"));
        students.add(new Student(4, "David", 74, "History"));
        students.add(new Student(5, "Eva", 88, "Geography"));
        students.add(new Student(6, "Frank", 81, "Math"));
        students.add(new Student(7, "Grace", 95, "Science"));
        students.add(new Student(8, "Hannah", 67, "English"));
        students.add(new Student(9, "Ian", 73, "History"));
        students.add(new Student(10, "Jack", 84, "Geography"));
        students.add(new Student(11, "Karen", 79, "Math"));
        students.add(new Student(12, "Leo", 91, "Science"));
        students.add(new Student(13, "Mona", 69, "English"));
        students.add(new Student(14, "Nina", 76, "History"));
        students.add(new Student(15, "Oscar", 87, "Geography"));
        students.add(new Student(16, "Paul", 82, "Math"));
        students.add(new Student(17, "Quincy", 93, "Science"));
        students.add(new Student(18, "Rachel", 71, "English"));
        students.add(new Student(19, "Steve", 77, "History"));
        students.add(new Student(20, "Tracy", 86, "Geography"));
        students.add(new Student(21, "Uma", 80, "Math"));
        students.add(new Student(22, "Victor", 90, "Science"));
        students.add(new Student(23, "Wendy", 68, "English"));
        students.add(new Student(24, "Xander", 75, "History"));
        students.add(new Student(25, "Yara", 89, "Geography"));

        Map<Integer, List<Integer>> studentFiltered = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getMarks, Collectors.mapping(Student::getId,Collectors.toList()))
                );

        for (Map.Entry<Integer, List<Integer>> groupedData:studentFiltered.entrySet()) {
            System.out.println("Key:"+groupedData.getKey());
            for (int i: groupedData.getValue()) System.out.print(i+", ");
        }



    }
}
