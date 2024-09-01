public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new Book("Effective Java", "Joshua Bloch");
        books[1] = new Book("Clean Code", "Robert C. Martin");

        Library library = new Library();

        for (Book book : books) {
            library.addBook(book);
        }

        System.out.println("Initial Catalog:");
        library.displayCatalog();

        books[0].setAvailability(false);

        System.out.println("\nDetails of the first book after updating availability:");
        System.out.println(books[0].getBookDetails());

        System.out.println("\nUpdated Catalog:");
        library.displayCatalog();
    }
}