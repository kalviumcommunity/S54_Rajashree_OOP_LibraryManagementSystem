import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog;

    public Library() {
        this.catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void displayCatalog() {
        for (Book book : catalog) {
            System.out.println(book.getBookDetails());
        }
        Book.displayBookStats();
    }

    public ArrayList<Book> getCatalog() {
        return new ArrayList<>(catalog);
    }

    // Search by Title
    public void searchBooks(String title) {
        System.out.println("Searching for books by Title: " + title);
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book.getBookDetails());
            }
        }
    }

    // Search by Author
    public void searchBooksByAuthor(String author) {
        System.out.println("Searching for books by Author: " + author);
        for (Book book : catalog) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book.getBookDetails());
            }
        }
    }

    // Search by Availability
    public void searchBooks(boolean isAvailable) {
        System.out.println("Searching for books by Availability: " + (isAvailable ? "Available" : "Borrowed"));
        for (Book book : catalog) {
            if (book.isAvailable() == isAvailable) {
                System.out.println(book.getBookDetails());
            }
        }
    }
}
