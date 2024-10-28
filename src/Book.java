public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    private static int totalBooks = 0;
    private static int availableBooks = 0;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.isAvailable = true;
        totalBooks++;
        availableBooks++;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        totalBooks++;
        availableBooks++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
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

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static int getAvailableBooks() {
        return availableBooks;
    }
}
