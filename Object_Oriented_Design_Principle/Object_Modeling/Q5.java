package Object_Oriented_Design_Principle.Object_Modeling;
import java.util.*;
// University with Faculties and Departments (Composition and Aggregation)
public class Q5 {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Singla");
        University uni = new University("Chitkara University");
        uni.addDepartment("Computer Science");
        uni.addDepartment("Civil");
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.showDetails();
        uni.closeUniversity();
        f1.show();
        f2.show();
    }
}
class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Faculty: " + name);
    }
}
class Departments {
    String deptName;

    Departments(String deptName) {
        this.deptName = deptName;
    }

    void show() {
        System.out.println("Department: " + deptName);
    }
}
class University {
    String uniName;
    ArrayList<Departments> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String uniName) {
        this.uniName = uniName;
    }

    void addDepartment(String deptName) {
        departments.add(new Departments(deptName));
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void showDetails() {
        System.out.println("University: " + uniName);
        for (Departments d : departments) d.show();
        for (Faculty f : faculties) f.show();
        System.out.println();
    }

    void closeUniversity() {
        departments.clear();
        System.out.println(uniName + " closed. All departments removed.");
    }
}