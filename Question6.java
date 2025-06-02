// Base class
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
    }
}

// FictionBook inherits Book
class FictionBook extends Book {
    public FictionBook(String title, String author) {
        super(title, author);
    }
}

// NonFictionBook inherits Book
class NonFictionBook extends Book {
    public NonFictionBook(String title, String author) {
        super(title, author);
    }
}

// TechnicalBook inherits Book
class TechnicalBook extends Book {
    public TechnicalBook(String title, String author) {
        super(title, author);
    }
}

// Main class to test
public class Question6 {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("Harry Potter", "J.K. Rowling");
        NonFictionBook nonfiction = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook tech = new TechnicalBook("Effective Java", "Joshua Bloch");

        System.out.println("Fiction Book:");
        fiction.displayDetails();

        System.out.println("\nNon-Fiction Book:");
        nonfiction.displayDetails();

        System.out.println("\nTechnical Book:");
        tech.displayDetails();
    }
}
