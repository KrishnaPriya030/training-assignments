import java.util.Scanner;

// Student class represents a student object
class Student {
    int roll;        // stores roll number
    String name;     // stores student name
    double marks;    // stores student marks

    // Parameterized constructor to initialize student data
    Student(int roll, String name, double marks) {
        this.roll = roll;     // assigns roll number
        this.name = name;     // assigns name
        this.marks = marks;  // assigns marks
    }

    // Method to display student details
    void displaydata() {
        System.out.println("The student roll number: " + roll);
        System.out.println("The student name: " + name);
        System.out.println("The student marks: " + marks);
    }
}

// Main class
public class Returnobject {

    // Static method that finds and returns the topper Student object
    static Student findtopper(Student[] s, int n) {
        int maxindex = 0;   // stores index of student with highest marks

        // Loop to compare marks of all students
        for (int i = 1; i < n; i++) {
            if (s[i].marks > s[maxindex].marks) {
                maxindex = i;   // update index if higher marks found
            }
        }

        // Return the Student object with highest marks
        return s[maxindex];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner object for input

        System.out.println("Enter number of students:");
        int n = sc.nextInt();   // number of students

        // Array to store Student object references
        Student[] s = new Student[n];

        // Reading student details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1));

            System.out.println("Enter roll number:");
            int roll = sc.nextInt();
            sc.nextLine(); // clears buffer

            System.out.println("Enter name:");
            String name = sc.nextLine();

            System.out.println("Enter marks:");
            double marks = sc.nextDouble();

            // Creating Student object and storing in array
            s[i] = new Student(roll, name, marks);
        }

        // Calling method that returns a Student object
        Student topper = findtopper(s, n);

        // Displaying topper details
        System.out.println("The topper details:");
        topper.displaydata();
    }
}
