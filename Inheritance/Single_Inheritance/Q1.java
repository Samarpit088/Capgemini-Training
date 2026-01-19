package Inheritance.Single_Inheritance;
// Library Management with Books and Authors
public class Q1 {
    public static void main(String[] args) {
        Author book = new Author("GOD", 2008, "Sam", "GOD");
        book.displayInfo();
    }
}
class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println(title + " (" + publicationYear + ")");
        System.out.println("Author: " + name);
    }
}


