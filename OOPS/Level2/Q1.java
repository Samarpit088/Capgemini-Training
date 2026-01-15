package OOPS.Level2;
// Program to Simulate Student Report
public class Q1 {
    public static void main(String[] args) {
        Student s = new Student("Samarpit",35,93);
        s.display();
    }
}
class Student {
    String name;
    int rollNumber;
    int marks;

    Student(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }

    char calculateGrade() {
        if(marks >= 90) return 'A';
        else if(marks >= 75) return 'B';
        else if(marks >= 60) return 'C';
        else if(marks >= 40) return 'D';
        else return 'F';
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

