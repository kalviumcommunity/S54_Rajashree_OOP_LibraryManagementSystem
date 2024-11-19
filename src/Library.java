import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> catalog;

    public Library() {
        this.catalog = new ArrayList<>();
    }

    public void addBook(LibraryItem item) {
        catalog.add(item);
    }

    public void displayCatalog() {
        for (LibraryItem item : catalog) {
            System.out.println(item.getItemDetails());
        }
    }

    public ArrayList<LibraryItem> getCatalog() {
        return new ArrayList<>(catalog);
    }

    // Search by Title
    public void searchBooks(String title) {
        System.out.println("Searching for books by Title: " + title);
        for (LibraryItem item : catalog) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println(item.getItemDetails());
            }
        }
    }

    // Search by Author
    public void searchBooksByAuthor(String author) {
        System.out.println("Searching for books by Author: " + author);
        for (LibraryItem item : catalog) {
            if (item.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(item.getItemDetails());
            }
        }
    }

    // Search by Availability
    public void searchBooks(boolean isAvailable) {
        System.out.println("Searching for books by Availability: " + (isAvailable ? "Available" : "Borrowed"));
        for (LibraryItem item : catalog) {
            if (item.isAvailable() == isAvailable) {
                System.out.println(item.getItemDetails());
            }
        }
    }
}
