import java.util.ArrayList;

public class SearchService {
    private Library library;

    public SearchService(Library library) {
        this.library = library;
    }

    public void searchBooksByTitle(String title) {
        System.out.println("Searching for books by Title: " + title);
        for (LibraryItem item : library.getCatalog()) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println(item.getItemDetails());
            }
        }
    }

    public void searchBooksByAuthor(String author) {
        System.out.println("Searching for books by Author: " + author);
        for (LibraryItem item : library.getCatalog()) {
            if (item.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(item.getItemDetails());
            }
        }
    }

    public void searchBooksByAvailability(boolean isAvailable) {
        System.out.println("Searching for books by Availability: " + (isAvailable ? "Available" : "Borrowed"));
        for (LibraryItem item : library.getCatalog()) {
            if (item.isAvailable() == isAvailable) {
                System.out.println(item.getItemDetails());
            }
        }
    }
}
