public class Main {
    public static void main(String[] args) {
        // Creating books using both default and parameterized constructors
        Book[] books = new Book[3];
        books[0] = new Book("Effective Java", "Joshua Bloch");
        books[1] = new Book("Clean Code", "Robert C. Martin");
        books[2] = new Book();

        Library library = new Library();

        // Adding books to the library
        for (Book book : books) {
            library.addBook(book);
        }

        // Display initial catalog
        System.out.println("Initial Catalog:");
        library.displayCatalog();

        // Borrow and return a book
        books[0].borrowBook();
        System.out.println("\nDetails of the first book after borrowing:");
        System.out.println(books[0].getBookDetails());

        System.out.println("\nUpdated Catalog:");
        library.displayCatalog();

        books[0].returnBook();
        System.out.println("\nDetails of the first book after returning:");
        System.out.println(books[0].getBookDetails());

        System.out.println("\nUpdated Catalog:");
        library.displayCatalog();
    }
}
