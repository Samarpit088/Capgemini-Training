package OOPS.Level1;
// Program to Compute Area of a Circle
public class Q2 {
    public static void main(String[] args) {
        Circle c = new Circle(2);
        c.area();
        c.circumference();
    }
}
class Circle {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }

    void area() {
        System.out.println("Area: " + (3.14 * radius * radius));
    }

    void circumference() {
        System.out.println("Circumference: " + (2 * 3.14 * radius));
    }
}
