public class Book extends LibraryItem {
    private static int totalBooks = 0;
    private static int availableBooks = 0;

    public Book(String title, String author) {
        super(title, author);
        totalBooks++;
        availableBooks++;
    }

    @Override
    public String getItemDetails() { // Implementation of abstract method
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", Available: " + isAvailable();
    }

    @Override
    public void borrowItem() { // Overriding virtual method
        super.borrowItem();
        if (!isAvailable()) {
            availableBooks--;
        }
    }

    @Override
    public void returnItem() { // Overriding virtual method
        super.returnItem();
        if (isAvailable()) {
            availableBooks++;
        }
    }

    public static void displayBookStats() {
        System.out.println("Total Books in Library: " + totalBooks);
        System.out.println("Available Books: " + availableBooks);
    }
}
