import java.util.Scanner;

// Parent class
class Person {

    int age;      // data member of parent class
    String name;  // data member of parent class

    // Parameterized constructor of Person
    // Used to initialize name and age
    Person(int age, String name) {
        this.name = name;   // assigns name to current object
        this.age = age;     // assigns age to current object
    }

    // Method to display Person details
    void displayPerson() {
        System.out.println("The person age: " + age);
        System.out.println("The person name: " + name);
    }
}

// Child class inheriting Person
class Student extends Person {

    int roll;        // data member of child class
    double marks;    // data member of child class

    // Parameterized constructor of Student
    // super(age, name) calls parent class constructor
    Student(int age, String name, int roll, double marks) {
        super(age, name);      // initializes parent class variables
        this.roll = roll;      // initializes roll number
        this.marks = marks;    // initializes marks
    }

    // Method to display Student details
    void displayStudent() {
         System.out.println("Name: " + name);   // protected access
        System.out.println("Age: " + age); 
        System.out.println("The Student roll number: " + roll);
        System.out.println("The Student marks: " + marks);
    }
}

// Main class
public class Singlein {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Reading input values
        System.out.println("Enter age:");
        int age = sc.nextInt();
        sc.nextLine();   // clears buffer

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter roll number:");
        int roll = sc.nextInt();

        System.out.println("Enter marks:");
        double marks = sc.nextDouble();

        // Creating Student object
        Student s = new Student(age, name, roll, marks);

        // Calling parent class method using child object
        System.out.println("\nThe person details:");
        s.displayPerson();

        // Calling child class method
        System.out.println("\nThe student details:");
        s.displayStudent();
    }
}
