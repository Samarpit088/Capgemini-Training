package this_static_final_instanceofOperator;
// Shopping Cart System
public class Q4 {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 50000, 1, 111);
        Product.updateDiscount(15);
        p.display(p);
    }
}
class Product {
    static double discount = 10.0;
    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double d) {
        discount = d;
    }

    void display(Object obj) {
        if (obj instanceof Product) {
            System.out.println("Product: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}