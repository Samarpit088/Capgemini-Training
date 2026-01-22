package Object_Oriented_Design_Principle.Object_Modeling;
import java.util.*;
// Company and Departments (Composition)
public class Q3 {
    public static void main(String[] args) {
        Company company = new Company("BridgeLab");
        company.addDepartment("IT");
        company.addDepartment("HR");
        company.departments.get(0).addEmployee("Sam");
        company.departments.get(0).addEmployee("Samar");
        company.departments.get(1).addEmployee("Samarpit");
        company.showCompanyDetails();
        company.closeCompany();
    }
}
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Employee: " + name);
    }
}
class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.show();
        }
    }
}
class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    void closeCompany() {
        departments.clear();
        System.out.println(companyName + " is closed. All departments and employees removed.");
    }
}