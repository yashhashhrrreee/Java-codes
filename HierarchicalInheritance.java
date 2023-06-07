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

// Define the first subclass
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

// Define the second subclass
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    public void wagTail() {
        System.out.println(name + " is wagging its tail.");
    }
}

// Define the third subclass that inherits from two superclasses
class CatDog extends Animal {
    private String breed;

    public CatDog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main method
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat myCat = new Cat("Fluffy", 3, "Persian");
        myCat.eat();
        myCat.sleep();
        myCat.meow();
        myCat.purr();

        Dog myDog = new Dog("Rex", 5, "German Shepherd");
        myDog.eat();
        myDog.sleep();
        myDog.bark();
        myDog.wagTail();

        CatDog myCatDog = new CatDog("Max", 2, "Siamese/Golden Retriever");
        myCatDog.eat();
        myCatDog.sleep();
        myCatDog.meow();
        myCatDog.bark();
    }
}
