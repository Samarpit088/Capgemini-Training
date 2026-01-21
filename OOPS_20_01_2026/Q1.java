package OOPS_20_01_2026;

import java.util.*;

// Employee Management System
public class Q1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new FullTimeEmployee(101, "Amit", 60000);
        Employee emp2 = new PartTimeEmployee(102, "Neha", 500, 40);

        emp1.assignDepartment("IT");
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
abstract class Employee implements Department {
    private int employeeId;
    private String name;
    double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }
    public String getDepartmentDetails() {
        return department;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
        System.out.println();
    }
}
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    public double calculateSalary() {
        return baseSalary;
    }
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

