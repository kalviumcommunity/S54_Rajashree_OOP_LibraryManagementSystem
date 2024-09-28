public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    private static int totalBooks = 0;
    private static int availableBooks = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        totalBooks++;
        availableBooks++;
    }

    public String getBookDetails() {
        return "Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            availableBooks--;
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            availableBooks++;
        } else {
            System.out.println("Book is already available.");
        }
    }

    public static void displayBookStats() {
        System.out.println("Total Books in Library: " + totalBooks);
        System.out.println("Available Books: " + availableBooks);
    }
}
