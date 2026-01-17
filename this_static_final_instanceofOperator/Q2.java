package this_static_final_instanceofOperator;
// Library Management System
public class Q2 {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "Sam", "ISBN123");
        Book.displayLibraryName();
        b.display(b);
    }
}
class Book {
    static String libraryName = "Central Library";
    String title;
    String author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void display(Object obj) {
        if (obj instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}