package Object_Oriented_Design_Principle.Object_Modeling;
import java.util.*;
//  School and Students with Courses (Association and Aggregation)
public class Q4 {
    public static void main(String[] args) {
        School school = new School("The Badhani School Badahani");
        Student s1 = new Student("Sam");
        Student s2 = new Student("Samar");
        Course c1 = new Course("English");
        Course c2 = new Course("Computer Science");
        school.addStudent(s1);
        school.addStudent(s2);
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);
        s1.viewCourses();
        s2.viewCourses();
        c1.showStudents();
        c2.showStudents();
    }
}
class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println(s.name);
        }
        System.out.println();
    }
}
class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void viewCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
        System.out.println();
    }
}
class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println(s.name);
        }
        System.out.println();
    }
}