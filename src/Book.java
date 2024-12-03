public class Book extends LibraryItem implements BorrowableItem {
    private static int totalBooks = 0;
    private static int availableBooks = 0;

    public Book(String title, String author) {
        super(title, author);
        totalBooks++;
        availableBooks++;
    }

    @Override
    public String getItemDetails() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", Available: " + isAvailable();
    }

    @Override
    public void borrowItem() {
        if (isAvailable()) {
            setAvailable(false);
            availableBooks--;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    @Override
    public void returnItem() {
        if (!isAvailable()) {
            setAvailable(true);
            availableBooks++;
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book is already available.");
        }
    }

    public static void displayBookStats() {
        System.out.println("Total Books in Library: " + totalBooks);
        System.out.println("Available Books: " + availableBooks);
    }
}
