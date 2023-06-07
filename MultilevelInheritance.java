// Define the base class
class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void start() {
        System.out.println("Vehicle starting.");
    }

    public void stop() {
        System.out.println("Vehicle stopping.");
    }
}

// Define the first subclass
class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void drive() {
        System.out.println("Car driving.");
    }

    public void brake() {
        System.out.println("Car braking.");
    }
}

// Define the second subclass that inherits from the first subclass
class SportsCar extends Car {
    private boolean isFast;

    public SportsCar(String make, String model, int numDoors, boolean isFast) {
        super(make, model, numDoors);
        this.isFast = isFast;
    }

    public boolean isFast() {
        return isFast;
    }

    public void race() {
        System.out.println("Sports car racing.");
    }

    public void drift() {
        System.out.println("Sports car drifting.");
    }
}

// Main method
public class MultilevelInheritance {
    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Civic", 4);
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Number of doors: " + myCar.getNumDoors());
        myCar.start();
        myCar.drive();
        myCar.brake();
        myCar.stop();

        SportsCar mySportsCar = new SportsCar("Ferrari", "458 Italia", 2, true);
        System.out.println("Make: " + mySportsCar.getMake());
        System.out.println("Model: " + mySportsCar.getModel());
        System.out.println("Number of doors: " + mySportsCar.getNumDoors());
        System.out.println("Is fast: " + mySportsCar.isFast());
        mySportsCar.start();
        mySportsCar.drive();
        mySportsCar.brake();
        mySportsCar.race();
        mySportsCar.drift();
        mySportsCar.stop();
    }
}
