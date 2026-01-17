package this_static_final_instanceofOperator;
// University Student Management
public class Q5 {
    public static void main(String[] args) {
        Student s = new Student("Sam", 21, 'A');
        s.display(s);
        Student.displayTotalStudents();
    }
}
class Student {
    static String universityName = "Chitkara University";
    static int totalStudents = 0;
    String name;
    final int rollNumber;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display(Object obj) {
        if (obj instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
}