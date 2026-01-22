package Object_Oriented_Design_Principle.Object_Modeling;
import java.util.*;
// Library and Books (Aggregation)
public class Q1 {
    public static void main(String[] args) {
        Book b1 = new Book("Java", "Sam");
        Book b2 = new Book("OOPs", "Sam");

        Library lib1 = new Library("Library");
        Library lib2 = new Library("College Library");
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2);
        lib1.showBooks();
        lib2.showBooks();
    }
}
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(title + " by " + author);
    }
}
class Library {
    String name;
    ArrayList<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();
        }
        System.out.println();
    }
}
