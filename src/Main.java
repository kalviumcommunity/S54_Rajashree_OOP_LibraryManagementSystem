import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Adding some initial books to the library
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
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add a Book
                    System.out.println("Enter Book Type (1: Physical, 2: Digital, 3: Special Collection): ");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
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
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Access Level: ");
                        String accessLevel = scanner.nextLine();
                        library.addBook(new SpecialCollectionBook(title, author, fileFormat, fileSize, accessLevel));
                    } else {
                        System.out.println("Invalid Book Type!");
                    }
                    break;

                case 2: // Display Catalog
                    System.out.println("\nLibrary Catalog:");
                    library.displayCatalog();
                    break;

                case 3: // Search Book
                    System.out.println("Search By: 1. Title  2. Author  3. Availability");
                    int searchChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (searchChoice == 1) {
                        System.out.print("Enter Title: ");
                        String searchTitle = scanner.nextLine();
                        library.searchBooks(searchTitle);
                    } else if (searchChoice == 2) {
                        System.out.print("Enter Author: ");
                        String searchAuthor = scanner.nextLine();
                        library.searchBooksByAuthor(searchAuthor);
                    } else if (searchChoice == 3) {
                        System.out.print("Search Available Books? (true/false): ");
                        boolean isAvailable = scanner.nextBoolean();
                        library.searchBooks(isAvailable);
                    } else {
                        System.out.println("Invalid Search Choice!");
                    }
                    break;

                case 4: // Borrow Book
                    System.out.print("Enter Title of Book to Borrow: ");
                    String borrowTitle = scanner.nextLine();
                    boolean found = false;
                    for (Book book : library.getCatalog()) {
                        if (book.getTitle().equalsIgnoreCase(borrowTitle)) {
                            book.borrowBook();
                            System.out.println("Borrowed Successfully: " + book.getBookDetails());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found or unavailable.");
                    }
                    break;

                case 5: // Return Book
                    System.out.print("Enter Title of Book to Return: ");
                    String returnTitle = scanner.nextLine();
                    found = false;
                    for (Book book : library.getCatalog()) {
                        if (book.getTitle().equalsIgnoreCase(returnTitle)) {
                            book.returnBook();
                            System.out.println("Returned Successfully: " + book.getBookDetails());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found or already available.");
                    }
                    break;

                case 6: // Exit
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
