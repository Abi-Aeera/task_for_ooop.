import java.util.*;
public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double calculateBonus(double percentage) {
        return salary * (percentage / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Job Title: ");
        String jobTitle = sc.nextLine();        
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        Employee employee = new Employee(name,jobTitle,salary);

        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: " + employee.getSalary());
        System.out.print("Enter new salary: ");
        double newSalary = sc.nextDouble();
        employee.updateSalary(newSalary);
        System.out.println("\nUpdated Salary: " + employee.getSalary());

        System.out.print("Enter bonus percentage: ");
        double per = sc.nextDouble();
        double bonus = employee.calculateBonus(per);
        System.out.println("Bonus: " + bonus);
        sc.close();
    }
}