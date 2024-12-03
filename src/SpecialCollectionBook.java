public class SpecialCollectionBook extends DigitalBook implements BorrowableItem {
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
    public String getItemDetails() {
        return super.getItemDetails() + ", Access Level: " + accessLevel;
    }

    @Override
    public void borrowItem() {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Special Collection book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    @Override
    public void returnItem() {
        if (!isAvailable()) {
            setAvailable(true);
            System.out.println("Special Collection book returned successfully!");
        } else {
            System.out.println("Book is already available.");
        }
    }
}
