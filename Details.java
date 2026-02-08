import java.util.Scanner;

// Book class demonstrates Encapsulation
class Book {

    // private variables → data hiding (Encapsulation)
    private final int bookid;
    private final String bookname;
    private double price;

    // constructor to initialize object
    Book(int bookid, String bookname, double price) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.price = price;
    }

    // ❌ MISTAKE YOU MADE:
    // void getid(int bookid) { return bookid; }
    // ❌ Getter should NOT take parameters
    // ❌ Getter should NOT be void

    // ✅ CORRECT: Getter method for book id
    int getBookId() {
        return bookid; // returns private variable
    }

    // ❌ MISTAKE YOU MADE:
    // void getname(String bookname) { return bookname; }

    // ✅ CORRECT: Getter method for book name
    String getBookName() {
        return bookname;
    }

    // ❌ MISTAKE YOU MADE:
    // void getprice(double price) { return price; }

    // ✅ CORRECT: Getter method for price
    double getPrice() {
        return price;
    }

    // ❌ MISTAKE YOU MADE:
    // void setprice(double price) { this.price = newprice; }
    // ❌ newprice variable was not defined

    // ✅ CORRECT: Setter method to update price
    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    // ❌ MISTAKE YOU MADE:
    // System.out.println("The book id:" + getbookid);
    // ❌ Getter must be CALLED using ()

    // ✅ CORRECT: Display method using getters
    void displaydata() {
        System.out.println("The book id: " + getBookId());
        System.out.println("The book name: " + getBookName());
        System.out.println("The book price: " + getPrice());
    }
}

public class Details {
    public static void main(String[] args) {

        // ❌ MISTAKE YOU MADE:
        // Scanenr sc = new Scanner(System.in);

        // ✅ CORRECT: Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // reading book id
        System.out.println("Enter the book id:");
        int bookid = sc.nextInt();
        sc.nextLine(); // clears buffer

        // reading book name
        System.out.println("Enter the book name:");
        String bookname = sc.nextLine();

        // reading book price
        System.out.println("Enter the book price:");
        double price = sc.nextDouble();

        // creating Book object
        Book b = new Book(bookid, bookname, price);

        // displaying original details
        System.out.println("\nBook Details:");
        b.displaydata();

        // updating price
        System.out.println("\nEnter the updated price of the book:");
        double newprice = sc.nextDouble();

        // updating price using setter (Encapsulation)
        b.setPrice(newprice);

        // displaying updated details
        System.out.println("\nUpdated Book Details:");
        b.displaydata();
    }
}
