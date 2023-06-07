
import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Class_Instance {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) 
        {
            // Create an array to hold up to 5 Car objects
            Car[] inventory = new Car[2];

            // Ask the user to input information for each car in the inventory
            for (int i = 0; i < inventory.length; i++) {
                System.out.println("Enter information for car #" + (i+1) + ":");
                System.out.print("Make: ");
                String make = input.nextLine();
                System.out.print("Model: ");
                String model = input.nextLine();
                System.out.print("Year: ");
                int year = input.nextInt();
                input.nextLine(); // consume the newline character

                // Create a new Car object and add it to the inventory array
                inventory[i] = new Car(make, model, year);
            }

            // Print out the information for each car in the inventory
            System.out.println("\nCar Inventory:");
            for (int i = 0; i < inventory.length; i++) {
                System.out.println("Car #" + (i+1) + ":");
                inventory[i].printInfo();
                System.out.println();
            }
        }
    }
}
