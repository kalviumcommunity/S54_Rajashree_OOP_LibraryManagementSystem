import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        SearchService searchService = new SearchService(library);

        library.addBook(new Book("Effective Java", "Joshua Bloch"));
        library.addBook(new DigitalBook("Clean Code", "Robert C. Martin", "PDF", 2.5));
        library.addBook(new SpecialCollectionBook("Design Patterns", "Erich Gamma", "EPUB", 3.0, "Restricted"));

        boolean exit = false;
        while (!exit) {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Display Catalog");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Book Type (1: Physical, 2: Digital, 3: Special Collection): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();

                    if (type == 1) {
                        library.addBook(new Book(title, author));
                    } else if (type == 2) {
                        System.out.print("Enter File Format: ");
                        String fileFormat = scanner.nextLine();
                        System.out.print("Enter File Size (MB): ");
                        double fileSize = scanner.nextDouble();
                        library.addBook(new DigitalBook(title, author, fileFormat, fileSize));
                    } else if (type == 3) {
                        System.out.print("Enter File Format: ");
                        String fileFormat = scanner.nextLine();
                        System.out.print("Enter File Size (MB): ");
                        double fileSize = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Enter Access Level: ");
                        String accessLevel = scanner.nextLine();
                        library.addBook(new SpecialCollectionBook(title, author, fileFormat, fileSize, accessLevel));
                    } else {
                        System.out.println("Invalid Book Type!");
                    }
                    break;

                case 2:
                    System.out.println("\nLibrary Catalog:");
                    library.displayCatalog();
                    break;

                case 3:
                    System.out.println("Search By: 1. Title  2. Author  3. Availability");
                    int searchChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (searchChoice == 1) {
                        System.out.print("Enter Title: ");
                        String searchTitle = scanner.nextLine();
                        searchService.searchBooksByTitle(searchTitle);
                    } else if (searchChoice == 2) {
                        System.out.print("Enter Author: ");
                        String searchAuthor = scanner.nextLine();
                        searchService.searchBooksByAuthor(searchAuthor);
                    } else if (searchChoice == 3) {
                        System.out.print("Search Available Books? (true/false): ");
                        boolean isAvailable = scanner.nextBoolean();
                        searchService.searchBooksByAvailability(isAvailable);
                    } else {
                        System.out.println("Invalid Search Choice!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Title of Item to Borrow: ");
                    String borrowTitle = scanner.nextLine();
                    boolean found = false;
                    for (LibraryItem item : library.getCatalog()) {
                        if (item.getTitle().equalsIgnoreCase(borrowTitle) && item instanceof BorrowableItem) {
                            BorrowableItem borrowableItem = (BorrowableItem) item;
                            borrowableItem.borrowItem();
                            System.out.println("Updated Status: " + item.getItemDetails());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found or unavailable for borrowing.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Title of Item to Return: ");
                    String returnTitle = scanner.nextLine();
                    found = false;
                    for (LibraryItem item : library.getCatalog()) {
                        if (item.getTitle().equalsIgnoreCase(returnTitle) && item instanceof BorrowableItem) {
                            BorrowableItem borrowableItem = (BorrowableItem) item;
                            borrowableItem.returnItem();
                            System.out.println("Updated Status: " + item.getItemDetails());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }

        scanner.close();
    }
}
