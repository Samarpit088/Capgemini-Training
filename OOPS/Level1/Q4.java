package OOPS.Level1;
// Program to Track Inventory of Items
public class Q4 {
    public static void main(String[] args) {
        Item it = new Item(20,"Phone",20000);
        it.display();
        it.totalCost(20);
    }
}
class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode,String itemName,double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    void display() {
        System.out.println("Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price: " + price);
    }

    void totalCost(int qty) {
        System.out.println("Total Cost: " + (price * qty));
    }
}
