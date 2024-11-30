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
}
