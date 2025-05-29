import java.util.*;
public class Student {
    private String name;
    private String idNumber;
    private final double gpa;  // Read-only, set in constructor

    public Student(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating a new student record...");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student ID number: ");
        String idNumber = sc.nextLine();
        System.out.print("Enter student GPA: ");
        double gpa = sc.nextDouble();

        Student student = new Student(name, idNumber, gpa);

        System.out.println("what should the new name and id be? ");
        String newName = sc.next();
        String newId = sc.next();
        student.setName(newName);
        student.setIdNumber(newId);
        System.out.println("\nUpdated Name:\n " + student.getName());
        System.out.println("Updated ID: " + student.getIdNumber());
        sc.close();
    }
}