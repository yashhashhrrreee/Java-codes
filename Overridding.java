
class Animal {
    public void move() {
        System.out.println("The animal moves");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("The dog walks");
    }
}

class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("The fish swims");
    }
}

public class Overridding {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal dog1 = new Dog();
        Animal fish1 = new Fish();

        animal1.move(); // prints "The animal moves"
        dog1.move(); // prints "The dog walks"
        fish1.move(); // prints "The fish swims"
    }
}
