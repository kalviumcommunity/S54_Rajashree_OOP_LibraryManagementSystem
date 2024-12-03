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

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String getItemDetails() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() +
                ", Available: " + isAvailable() +
                ", File Format: " + fileFormat +
                ", File Size: " + fileSize + "MB";
    }
}
