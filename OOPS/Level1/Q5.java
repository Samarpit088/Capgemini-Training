package OOPS.Level1;
// Program to Handle Mobile Phone Details
public class Q5 {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("Apple","13",75000);
        mp.display();
    }
}
class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand,String model,double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
