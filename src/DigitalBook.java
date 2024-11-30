public class DigitalBook extends LibraryItem {
    private String fileFormat;
    private double fileSize; // Size in MB

    public DigitalBook(String title, String author, String fileFormat, double fileSize) {
        super(title, author);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public String getItemDetails() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", File Format: " + fileFormat +
                ", File Size: " + fileSize + "MB, Available: " + isAvailable();
    }
}
