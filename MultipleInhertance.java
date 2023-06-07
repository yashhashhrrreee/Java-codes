// Define the first interface
interface Animal {
    void eat();
    void sleep();
}

// Define the second interface
interface Vehicle {
    void start();
    void stop();
}

// Define the third interface
interface Computer {
    void turnOn();
    void turnOff();
}

// Define a class that implements all three interfaces
class Robot implements Animal, Vehicle, Computer {
    public void eat() {
        System.out.println("Robot eating.");
    }

    public void sleep() {
        System.out.println("Robot sleeping.");
    }

    public void start() {
        System.out.println("Robot starting.");
    }

    public void stop() {
        System.out.println("Robot stopping.");
    }

    public void turnOn() {
        System.out.println("Robot turning on.");
    }

    public void turnOff() {
        System.out.println("Robot turning off.");
    }

    public void walk() {
        System.out.println("Robot walking.");
    }

    public void talk() {
        System.out.println("Robot talking.");
    }

    public void compute() {
        System.out.println("Robot computing.");
    }
}

// Main method
public class MultipleInhertance {
    public static void main(String[] args) {
        Robot myRobot = new Robot();
        myRobot.eat();
        myRobot.sleep();
        myRobot.start();
        myRobot.turnOn();
        myRobot.walk();
        myRobot.talk();
        myRobot.compute();
        myRobot.turnOff();
        myRobot.stop();
    }
}
