// Define the superclass
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Define the subclass
class Cat extends Animal {
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }

    public void purr() {
        System.out.println(name + " is purring.");
    }
}

// Main method
public class SingleInhertance {
    public static void main(String[] args) {
        Cat myCat = new Cat("Fluffy", 3, "Persian");
        myCat.eat();
        myCat.sleep();
        myCat.meow();
        myCat.purr();
    }
}
