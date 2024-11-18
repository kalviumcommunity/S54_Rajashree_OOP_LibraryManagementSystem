public class Main {
    public static void main(String[] args) {
        Book physicalBook = new Book("Effective Java", "Joshua Bloch");
        DigitalBook digitalBook = new DigitalBook("Clean Code", "Robert C. Martin", "PDF", 2.5);
        SpecialCollectionBook specialBook = new SpecialCollectionBook("Design Patterns", "Erich Gamma", "EPUB", 3.0, "Restricted");

        Library library = new Library();

        // Adding books to the library
        library.addBook(physicalBook);
        library.addBook(digitalBook);
        library.addBook(specialBook);

        // Display initial catalog
        System.out.println("Initial Catalog:");
        library.displayCatalog();

        // Borrow and return operations
        physicalBook.borrowBook();
        System.out.println("\nDetails of the physical book after borrowing:");
        System.out.println(physicalBook.getBookDetails());

        digitalBook.borrowBook();
        System.out.println("\nDetails of the digital book after borrowing:");
        System.out.println(digitalBook.getBookDetails());

        specialBook.borrowBook();
        System.out.println("\nDetails of the special collection book after borrowing:");
        System.out.println(specialBook.getBookDetails());
    }
}
