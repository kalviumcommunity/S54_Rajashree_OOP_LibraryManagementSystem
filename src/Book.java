public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getBookDetails() {
        return "Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
    }

    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }
}
