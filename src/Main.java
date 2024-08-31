public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Clean Code", "Robert C. Martin");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Initial Catalog:");
        library.displayCatalog();

        book1.setAvailability(false);

        System.out.println("\nDetails of the first book after updating availability:");
        System.out.println(book1.getBookDetails());

        System.out.println("\nUpdated Catalog:");
        library.displayCatalog();
    }
}
