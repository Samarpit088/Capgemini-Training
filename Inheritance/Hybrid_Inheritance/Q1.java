package Inheritance.Hybrid_Inheritance;
// Restaurant Management System with Hybrid Inheritance
public class Q1 {
    public static void main(String[] args) {
        Worker w1 = new Chef("Sam", 101);
        Worker w2 = new Waiter("Samar", 102);
        w1.performDuties();
        w2.performDuties();
    }
}
class Person {
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
interface Worker {
    void performDuties();
}
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Chef is cooking food");
    }
}
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Waiter is serving customers");
    }
}

