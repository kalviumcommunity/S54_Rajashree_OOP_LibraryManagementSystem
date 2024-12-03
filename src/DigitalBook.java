public class DigitalBook extends Book {
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
        return super.getItemDetails() + ", File Format: " + fileFormat + ", File Size: " + fileSize + "MB";
    }

    // Overriding borrowItem to reflect the behavior for digital books
    @Override
    public void borrowItem() {
        System.out.println("Digital books cannot be borrowed. Please download or access the file.");
    }

    // Overriding returnItem to reflect the behavior for digital books
    @Override
    public void returnItem() {
        System.out.println("Digital books do not need to be returned.");
    }
}
