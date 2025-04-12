package studentinfo;

public class Studenttwo {
    private String name;
    private int rollNo;
    private String course;

    public Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course : " + course);
    }
}
import studentinfo.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aarav", 101, "Computer Science");
        s1.displayDetails();
    }
}
