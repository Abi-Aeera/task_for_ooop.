import java.util.Scanner;

public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Car '" + make + " " + model + "' rented.");
        } else {
            System.out.println("Car '" + make + " " + model + "' is currently unavailable.");
        }
    }

    public void returnCar() {
        isAvailable = true;
        System.out.println("Car '" + make + " " + model + "' returned.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Creating a new car record...");
        System.out.print("Enter car make: ");
        String make = sc.nextLine();
        System.out.print("Enter car model: ");
        String model = sc.nextLine();
        System.out.print("Enter initial rental price per day: ");
        double rentalPricePerDay = sc.nextDouble();
        sc.nextLine(); // Consume the newline character

        Car car = new Car(make, model, rentalPricePerDay);

        System.out.print("Enter new rental price per day: ");
        double newRentalPrice = sc.nextDouble();
        car.setRentalPricePerDay(newRentalPrice);

        System.out.println("\nCar Information:");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Rental Price: $" + car.getRentalPricePerDay());
        System.out.println("Available: " + car.isAvailable());

        System.out.print("Rent or Return the car? (rent/return/no): ");
        String action = sc.nextLine().toLowerCase();

        if (action.equals("rent")) {
            car.rentCar();
        } else if (action.equals("return")) {
            car.returnCar();
        } else {
            System.out.println("No action taken.");
        }

        System.out.println("Available: " + car.isAvailable());

        sc.close();
    }
}