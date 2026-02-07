import java.util.Scanner;
class Book{
    int bookid;
    String Bookname;
    double price;

    Book(){


    }
    void readdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book id:");
        bookid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the book name:");
        Bookname=sc.nextLine();
        System.out.println("Enter the book price:");
        price=sc.nextDouble();
        sc.nextLine();



    }
    void displaydata(){
        System.out.println("Book id:"+bookid);
        System.out.println("Book name:"+Bookname);
        System.out.println("Book price:"+price);
        
    }
    }
    public class Bookdetails{
        public static void main(String[] args) {
            Book b1=new Book();
            b1.readdata();
            b1.displaydata();
            Book b2=new Book();
            b2.readdata();
            b2.displaydata();

        }
    }

