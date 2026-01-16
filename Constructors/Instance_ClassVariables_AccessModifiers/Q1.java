package Constructors.Instance_ClassVariables_AccessModifiers;
// Product Inventory
public class Q1 {
    public static void main(String[] args) {
        Product p = new Product("Toys",2000);
        p.displayProductDetails();
        Product.displayTotalProducts();
    }
}
class Product {
    String productName;
    double price;

    static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}


