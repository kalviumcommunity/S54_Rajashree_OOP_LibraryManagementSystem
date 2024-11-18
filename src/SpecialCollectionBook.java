public class SpecialCollectionBook extends DigitalBook {
    private String accessLevel;

    public SpecialCollectionBook(String title, String author, String fileFormat, double fileSize, String accessLevel) {
        super(title, author, fileFormat, fileSize);
        this.accessLevel = accessLevel;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public String getBookDetails() {
        return super.getBookDetails() + ", Access Level: " + accessLevel;
    }
}
