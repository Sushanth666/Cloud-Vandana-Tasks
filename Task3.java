// Task 3: Employee Management System (Java, OOP)

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void displayEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}

public class EmployeeManagement {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(int id, String name, String department) {
        employees.add(new Employee(id, name, department));
    }

    public void displayAllEmployees() {
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }

    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement();
        em.addEmployee(1, "Alice", "HR");
        em.addEmployee(2, "Bob", "IT");
        em.displayAllEmployees();
    }
}
