package Constructors.Instance_ClassVariables_AccessModifiers;
// Online Course Management
public class Q2 {
    public static void main(String[] args) {
        Course c = new Course("AI",30,30000);
        c.displayCourseDetails();
        Course.updateInstituteName("CBC Institute");
        c.displayCourseDetails();
    }
}
class Course {
    String courseName;
    int duration;
    double fee;

    static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + ", Duration: " + duration +
                ", Fee: " + fee + ", Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

