
import java.util.Scanner;

abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("1. Create Rectangle");
                System.out.println("2. Create Circle");
                System.out.println("3. Exit");

                System.out.print("Enter choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter rectangle name: ");
                        String rectName = scanner.next();

                        System.out.print("Enter rectangle width: ");
                        double rectWidth = scanner.nextDouble();

                        System.out.print("Enter rectangle height: ");
                        double rectHeight = scanner.nextDouble();

                        Rectangle rect = new Rectangle(rectName, rectWidth, rectHeight);
                        System.out.println("Area of " + rect.getName() + ": " + rect.getArea());
                        break;

                    case 2:
                        System.out.print("Enter circle name: ");
                        String circleName = scanner.next();

                        System.out.print("Enter circle radius: ");
                        double radius = scanner.nextDouble();

                        Circle circle = new Circle(circleName, radius);
                        System.out.println("Area of " + circle.getName() + ": " + circle.getArea());
                        break;

                    case 3:
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            } while (choice != 3);
        }
    }
}
