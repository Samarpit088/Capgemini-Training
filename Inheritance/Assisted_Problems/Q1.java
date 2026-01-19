package Inheritance.Assisted_Problems;
// Animal Hierarchy
public class Q1 {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.makeSound();
        Animal c = new Cat();
        c.makeSound();
        Animal b = new Bird();
        b.makeSound();
    }
}
class Animal {
    String name;
    int age;
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Bird chirps");
    }
}
