import java.util.Scanner;

// Define the parent class for single inheritance
class Vehicle {
    public void start() {
        System.out.println("Vehicle starting.");
    }

    public void stop() {
        System.out.println("Vehicle stopping.");
    }
}

// Define the child class for single inheritance
class Car extends Vehicle {
    public void drive() {
        System.out.println("Car driving.");
    }

    public void brake() {
        System.out.println("Car braking.");
    }
}

// Define the parent class for hierarchical inheritance
class Animal {
    public void eat() {
        System.out.println("Animal eating.");
    }

    public void sleep() {
        System.out.println("Animal sleeping.");
    }
}

// Define the child classes for hierarchical inheritance
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meowing.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barking.");
    }
}

// Define the parent class for multilevel inheritance
class A {
    public void methodA() {
        System.out.println("Method A.");
    }
}

// Define the child class for multilevel inheritance
class B extends A {
    public void methodB() {
        System.out.println("Method B.");
    }
}

// Define the grandchild class for multilevel inheritance
class C extends B {
    public void methodC() {
        System.out.println("Method C.");
    }
}

// Define the first interface for multiple inheritance
interface Computer {
    void turnOn();
    void turnOff();
}

// Define the second interface for multiple inheritance
interface Radio {
    void turnOn();
    void turnOff();
}

// Define the class that implements both interfaces for multiple inheritance
class ElectronicDevice implements Computer, Radio {
    public void turnOn() {
        System.out.println("Electronic device turning on.");
    }

    public void turnOff() {
        System.out.println("Electronic device turning off.");
    }
}

// Main method
public class MenuInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Select an option:");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Hierarchical Inheritance");
            System.out.println("3. Multilevel Inheritance");
            System.out.println("4. Multiple Inheritance");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Car myCar = new Car();
                    myCar.start();
                    myCar.drive();
                    myCar.brake();
                    myCar.stop();
                    break;

                case 2:
                    Cat myCat = new Cat();
                    Dog myDog = new Dog();
                    myCat.eat();
                    myCat.sleep();
                    myCat.meow();
                    myDog.eat();
                    myDog.sleep();
                    myDog.bark();
                    break;

                case 3:
                    C myC = new C();
                    myC.methodA();
                    myC.methodB();
                    myC.methodC();
                    break;

                case 4:
                    ElectronicDevice myDevice = new ElectronicDevice();
                    myDevice.turnOn();
                    myDevice.turnOff();
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
