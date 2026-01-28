package LinkedList_28_01_2026;
// Student Record Management
public class Q1 {
    public static void main(String[] args) {
        StudentRecord sr = new StudentRecord();
        sr.addAtBeginning(101, "Sam", 21, 'A');
        sr.addAtEnd(102, "Amit", 22, 'B');
        sr.addAtPosition(2, 103, "Riya", 20, 'A');
        System.out.println("All Students:");
        sr.display();
        sr.search(102);
        sr.updateGrade(102, 'A');
        sr.deleteByRoll(101);
        System.out.println("\nAfter Updates:");
        sr.display();
    }
}
class Node {
    int roll;
    String name;
    int age;
    char grade;
    Node next;

    Node(int roll, String name, int age, char grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentRecord {
    Node head;
    void addAtBeginning(int roll, String name, int age, char grade) {
        Node newNode = new Node(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }
    void addAtEnd(int roll, String name, int age, char grade) {
        Node newNode = new Node(roll, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void addAtPosition(int pos, int roll, String name, int age, char grade) {
        if (pos == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        Node newNode = new Node(roll, name, age, grade);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    void deleteByRoll(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.roll != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
        }
    }
    void search(int roll) {
        Node temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("Found: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }
    void updateGrade(int roll, char newGrade) {
        Node temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }
    void display() {
        if (head == null) {
            System.out.println("No student records available");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println("Roll: " + temp.roll + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}