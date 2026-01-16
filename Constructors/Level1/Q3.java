package Constructors.Level1;
// Create a Person class with a copy constructor that clones another person's attributes.
public class Q3 {
    public static void main(String[] args) {
        Person p1 = new Person("Sam",22);
        Person p2 = new Person(p1);
        p2.display();
    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

