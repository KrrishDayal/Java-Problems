package student;

public class Student {
    private String name;
    private int id;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getDetails() {
        return "ID: " + id + ", Name: " + name;
    }
}
package student;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void printAllStudents() {
        for (Student s : students) {
            System.out.println(s.getDetails());
        }
    }
}

import student.*;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student(1, "Alice"));
        manager.addStudent(new Student(2, "Bob"));
        manager.printAllStudents();
    }
}
