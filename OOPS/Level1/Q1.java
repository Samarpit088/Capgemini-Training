package OOPS.Level1;
// Program to Display Employee Details
public class Q1 {
    public static void main(String[] args){
        Employee emp = new Employee("Samarpit",121,575000);
        emp.display();
    }
}
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
