package Inheritance.Multilevel_Inheritanc;
// Educational Course Hierarchy
public class Q2 {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse("Java", 6, "BridgeLabz", true, 5000, 20);
        System.out.println("Course: " + course.courseName);
        System.out.println("Fee: " + course.fee);
        System.out.println("Discount: " + course.discount + "%");
    }
}
class Course {
    String courseName;
    int duration;
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    OnlineCourse(String name, int duration, String platform, boolean isRecorded) {
        super(name, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    PaidOnlineCourse(String name, int duration, String platform, boolean recorded,
                     double fee, double discount) {
        super(name, duration, platform, recorded);
        this.fee = fee;
        this.discount = discount;
    }
}