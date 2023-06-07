
abstract class Shape {
    protected int x, y;
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    abstract public void draw();
    abstract public double area();
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}

class Rectangle extends Shape {
    private int width, height;
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    public void draw() {
        System.out.println("Drawing Rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }
    public double area() {
        return width * height;
    }
}

class Circle extends Shape {
    private int radius;
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Drawing Circle at (" + x + ", " + y + ") with radius " + radius);
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClasses_Methods {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(10, 20, 30, 40);
        shapes[1] = new Circle(50, 60, 70);
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.area());
        }
    }
}
