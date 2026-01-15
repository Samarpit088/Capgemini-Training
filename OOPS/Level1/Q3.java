package OOPS.Level1;
// Program to Handle Book Details
public class Q3 {
    public static void main(String[] args) {
        Book b = new Book("Sorrow","Sam",2000);
        b.display();
    }
}
class Book {
    String title;
    String author;
    double price;

    Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
