import java.util.*;
public class doog{
    private String name;
    private String breed;

    public doog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the dog:");
        String name = scanner.nextLine();
        System.out.println("Enter the breed of the dog:");
        String breed = scanner.nextLine();

        doog dog = new doog(name, breed);
        

        System.out.println(dog.getName() + " is a " + dog.getBreed());
        System.out.println("Setting a new name for the dog...");
        name = scanner.nextLine();
        dog.setName(name);
        System.out.println("The dog's new name is: " + dog.getName());
        scanner.close();
    } 
}