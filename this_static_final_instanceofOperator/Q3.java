package this_static_final_instanceofOperator;
//Employee Management System
public class Q3 {
    public static void main(String[] args) {
        Employee e = new Employee("Sam", 1, "Developer");
        e.display(e);
        Employee.displayTotalEmployees();
    }
}
class Employee {
    static String companyName = "Google";
    static int totalEmployees = 0;
    String name;
    final int id;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display(Object obj) {
        if (obj instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}