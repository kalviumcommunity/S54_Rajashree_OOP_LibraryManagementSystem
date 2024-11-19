public abstract class LibraryItem {
    private String title;
    private String author;
    private boolean isAvailable;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
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

    // Abstract method: must be implemented by subclasses
    public abstract String getItemDetails();

    // Virtual method: can be overridden
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Borrowed Successfully!");
        } else {
            System.out.println("Item is not available for borrowing.");
        }
    }

    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Returned Successfully!");
        } else {
            System.out.println("Item is already available.");
        }
    }
}
