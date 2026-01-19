package Inheritance.Multilevel_Inheritanc;
// Online Retail order Management
public class Q1 {
    public static void main(String[] args) {
        Order o1 = new Order(1, "01-Jan-2026");
        Order o2 = new ShippedOrder(2, "02-Jan-2026", "TRK1");
        Order o3 = new DeliveredOrder(3, "03-Jan-2026", "TRK1", "05-Jan-2026");
        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
class Order {
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order Placed";
    }
}
class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(int id, String date, String trackingNumber) {
        super(id, date);
        this.trackingNumber = trackingNumber;
    }
    String getOrderStatus() {
        return "Order Shipped";
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int id, String date, String track, String deliveryDate) {
        super(id, date, track);
        this.deliveryDate = deliveryDate;
    }
    String getOrderStatus() {
        return "Order Delivered";
    }
}