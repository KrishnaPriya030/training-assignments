import java.util.Scanner;

class Library {
    String libraryName;

    Library(String libraryName) {
        this.libraryName = libraryName;
    }
}

class Book extends Library {
    int bookId;
    String title;
    String author;
    boolean issued;

    Book(String libraryName, int bookId, String title, String author) {
        super(libraryName);
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    void displayBook() {
        System.out.println("Library Name : " + libraryName);
        System.out.println("Book ID      : " + bookId);
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Issued       : " + (issued ? "Yes" : "No"));
        System.out.println("--------------------------------");
    }

    void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    void checkStatus() {
        if (issued)
            System.out.println("Book is currently issued.");
        else
            System.out.println("Book is available.");
    }
}

public class LibraryApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Library Name:");
        String libraryName = sc.nextLine();

        System.out.println("Enter number of books:");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Book ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Title:");
            String title = sc.nextLine();

            System.out.println("Enter Author:");
            String author = sc.nextLine();

            books[i] = new Book(libraryName, id, title, author);
        }

        int choice;

        do {
            System.out.println("1. Display all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. Check book issue status");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (Book b : books)
                        b.displayBook();
                    break;

                case 2:
                    System.out.println("Enter Book ID to issue:");
                    int issueId = sc.nextInt();
                    for (Book b : books)
                        if (b.bookId == issueId)
                            b.issueBook();
                    break;

                case 3:
                    System.out.println("Enter Book ID to return:");
                    int returnId = sc.nextInt();
                    for (Book b : books)
                        if (b.bookId == returnId)
                            b.returnBook();
                    break;

                case 4:
                    System.out.println("Enter Book ID to check status:");
                    int statusId = sc.nextInt();
                    for (Book b : books)
                        if (b.bookId == statusId)
                            b.checkStatus();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
}
