package Constructors.Instance_ClassVariables_AccessModifiers;
// Book Library System
public class Q5 {
    public static void main(String[] args) {
        EBook eb = new EBook("1234567891012","GodIsGreat","Sam");
        eb.display();
    }
}
class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        setAuthor(author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }
}

