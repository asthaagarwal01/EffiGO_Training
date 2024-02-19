package javapractice.java.equals;

import java.util.HashMap;
import java.util.Map;

class Employee {
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Implementing equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee employee = (Employee) obj;
        return id.equals(employee.id) && name.equals(employee.name);
    }

    // Implementing hashCode
    @Override
    public int hashCode() {
        return id.hashCode() + name.hashCode();
    }
}

public class Hash {
    public static void main(String[] args) {

        Map<Employee, String> employeeMap = new HashMap<>();

        Employee emp1 = new Employee("E101", "John");
        Employee emp2 = new Employee("E102", "Alice");
        Employee emp3 = new Employee("E101", "John"); // Same content as emp1

        employeeMap.put(emp1, "Manager");
        employeeMap.put(emp2, "Engineer");

        // Checking if emp3 is present in the HashMap
        if (employeeMap.containsKey(emp3)) {
            System.out.println("Employee 3 is present: " + employeeMap.get(emp3));
        } else {
            System.out.println("Employee 3 is not present in the HashMap.");
        }
    }
}
