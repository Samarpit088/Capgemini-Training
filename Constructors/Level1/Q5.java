package Constructors.Level1;
// Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
public class Q5 {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("GodIsGreat","Sam",3000.00,true);
        lb.borrowBook();
        lb.display();
    }
}
class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have borrowed: " + title);
            return true;
        } else {
            System.out.println("Sorry, " + title + " is not available.");
            return false;
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }
}


