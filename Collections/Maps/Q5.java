package Collections.Maps;
import java.util.*;
// Group Objects by Property
public class Q5 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );
        Map<String, List<Employee>> deptMap = new HashMap<>();
        for (Employee emp : employees) {
            deptMap.putIfAbsent(emp.department, new ArrayList<>());
            deptMap.get(emp.department).add(emp);
        }
        System.out.println(deptMap);
    }
}
class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

