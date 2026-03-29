import java.util.ArrayList;

class PayrollManager {
    private ArrayList<Employee> employees;

    // Constructor
    public PayrollManager() {
        employees = new ArrayList<>();
    }

    // Add employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added successfully.");
    }

    // Remove employee by ID
    public void removeEmployee(int id) {
        boolean found = false;

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                employees.remove(emp);
                System.out.println("Employee removed successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    // Display all employees
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        for (Employee emp : employees) {
            emp.displayDetails(); // Polymorphism
        }
    }

    // Calculate total payroll
    public double calculateTotalPayroll() {
        double total = 0;

        for (Employee emp : employees) {
            total += emp.calculateSalary(); // Polymorphism
        }

        return total;
    }

    // Find employee by ID
    public Employee findEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }
}
