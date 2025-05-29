import java.util.*;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
public static void main(String[] args) {
    // Create an instance of Circle with a default radius
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius of the circle: ");
    double inputRadius = sc.nextDouble();
        Circle myCircle = new Circle(inputRadius);

        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.calculateArea());
        System.out.println("Circumference: " + myCircle.calculateCircumference());

    sc.close();
    }
    
}


