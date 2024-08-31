import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void displayCatalog() {
        for (Book book : catalog) {
            System.out.println(book.getBookDetails());
        }
    }
}
