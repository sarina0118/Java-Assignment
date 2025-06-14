//You are building a library management system. Design an interface named "LibraryItem" with the following methods:
//String getTitle() to retrieve the title of the library item
//String getAuthor() to retrieve the author of the library item
//int getYear() to retrieve the publication year of the library item
//boolean isAvailable() to check if the library item is currently available for borrowing.

import java.util.*;

// Interface representing a library item
interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

// Book class implementing LibraryItem
class Book implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

// Magazine class implementing LibraryItem
class Magazine implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Magazine(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

// Main class to test the implementation
public class LibraryTest {
    public static void main(String[] args) {
        // Create items
        LibraryItem book = new Book("The Hobbit", "J.R.R. Tolkien", 1937, true);
        LibraryItem magazine = new Magazine("Time", "Various", 2023, false);

        // Display info
        displayItem(book);
        displayItem(magazine);
    }

    public static void displayItem(LibraryItem item) {
        System.out.println("Title: " + item.getTitle());
        System.out.println("Author: " + item.getAuthor());
        System.out.println("Year: " + item.getYear());
        System.out.println("Available: " + (item.isAvailable() ? "Yes" : "No"));
    }
}
