package Constructors.Level1;
// Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
public class Q1 {
    public static void main(String[] args) {
        Book b = new Book("GODISGREAT","Sam",2000.00);
        b.display();
   }
}
class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

