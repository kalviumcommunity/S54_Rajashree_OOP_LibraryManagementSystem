public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "Joshua Bloch");

        Book book2 = new Book("Clean Code", "Robert C. Martin");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        library.displayCatalog();

        book1.setAvailability(false);

        System.out.println("\nUpdated Catalog:");
        library.displayCatalog();
    }
}
