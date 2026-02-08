import java.util.Scanner;

// Student class demonstrates Encapsulation
class Student {

    // private data member (data hiding)
    private double marks;

    // constructor to initialize marks
    Student(double marks) {
        this.marks = marks;
    }

    // setter method to update marks
    // encapsulation allows controlled modification of data
    void setmarks(double newmarks) {
        this.marks = newmarks;
    }

    // method to display marks
    void displaydata() {
        System.out.println("The student marks: " + marks);
    }
}

public class Update {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // user enters initial marks
        System.out.println("Enter the marks:");
        double marks = sc.nextDouble();

        // creating Student object
        Student s = new Student(marks);

        // displaying initial marks
        s.displaydata();

        // user enters updated marks
        System.out.println("Enter the updated marks:");
        double newmarks = sc.nextDouble();

        // updating marks using setter method
        // direct access to marks is not allowed due to encapsulation
        s.setmarks(newmarks);

        // displaying updated marks
        s.displaydata();
    }
}