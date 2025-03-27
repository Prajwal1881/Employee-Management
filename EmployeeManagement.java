import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        // Creating Employee objects
        employees.add(new Employee(1, "Prajwal", 50000));
        employees.add(new Employee(2, "Cladie", 60000));
        employees.add(new Employee(3, "Vandana", 55000));
        
        // Displaying Employee details
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
