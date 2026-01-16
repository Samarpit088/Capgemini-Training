package Constructors.Level1;
// Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
public class Q2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.area());
    }
}
class Circle {
    double radius;

    public Circle() {
        this(2.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

