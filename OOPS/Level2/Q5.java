package OOPS.Level2;
// Program to Simulate a Shopping Cart
public class Q5 {
    public static void main(String[] args) {
        CartItem c = new CartItem("Screen",50000,2);
        c.add(6);
        c.remove(2);
        c.totalCost();
    }
}
class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }

    void add(int qty){
        quantity += qty;
    }

    void remove(int qty){
        if(qty <= quantity)
            quantity -= qty;
    }

    void totalCost(){
        System.out.println("Total Cost: " + (price * quantity));
    }
}
