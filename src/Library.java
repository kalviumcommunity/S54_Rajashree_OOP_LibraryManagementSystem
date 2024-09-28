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
}
