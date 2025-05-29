import java.util.Scanner;

public class Employee_control{
    private String name;
    private String employeeID;
    private double salary;

    public Employee_control(String name, String employeeID, double initialSalary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = initialSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void adjustSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
            System.out.println("Salary adjusted by $" + amount + ". New salary: $" + salary);
        } else {
            System.out.println("Salary cannot be negative. Adjustment not applied.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Creating a new employee record...");
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee ID number: ");
        String employeeID = sc.nextLine();
        System.out.print("Enter initial salary: ");
        double initialSalary = sc.nextDouble();
        sc.nextLine(); // Consume the newline character after reading the double

        Employee_control employee = new Employee_control(name, employeeID, initialSalary);

        System.out.print("Enter salary adjustment amount (positive or negative): ");
        double adjustment = sc.nextDouble();
        employee.adjustSalary(adjustment);

        System.out.println("\nEmployee Information:");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getEmployeeID());
        System.out.println("Salary: " + employee.getSalary());

        sc.close();
    }
}