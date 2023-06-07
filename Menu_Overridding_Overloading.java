
import java.util.Scanner;

class Animal {
    public void move() {
        System.out.println("The animal moves");
    }

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("The dog walks");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("The cat walks");
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Menu_Overridding_Overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Animal Move");
            System.out.println("2. Animal Make Sound");
            System.out.println("3. Dog Move");
            System.out.println("4. Dog Make Sound");
            System.out.println("5. Cat Move");
            System.out.println("6. Cat Make Sound");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Animal animal = new Animal();
                    animal.move();
                    break;
                case 2:
                    Animal animal2 = new Animal();
                    animal2.makeSound();
                    break;
                case 3:
                    Dog dog = new Dog();
                    dog.move();
                    break;
                case 4:
                    Dog dog2 = new Dog();
                    dog2.makeSound();
                    break;
                case 5:
                    Cat cat = new Cat();
                    cat.move();
                    break;
                case 6:
                    Cat cat2 = new Cat();
                    cat2.makeSound();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 7);
    }
}
