import java.util.Scanner;
class Person{
    protected String name;
    protected int age;
    

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayperson(){
        System.out.println("The name:"+name);
        System.out.println("The age:"+age);
    }

}
class Student extends Person{
    int roll;
    double marks;
     Student(String name,int age,int roll,double marks){
        super(name,age);
        this.roll=age;
        this.marks=marks;

    }
    void displaystudent(){
        System.out.println("The name:"+name);
        System.out.println("The age:"+age);
        System.out.println("The roll no:"+roll);
        System.out.println("The marks:"+marks);
    }

}
public class Protected{
    public static void main(String [] args){
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
        Student s = new Student(name,age, roll, marks);

        // Calling parent class method using child object
        System.out.println("\nThe person details:");
        s.displayperson();

        // Calling child class method
        System.out.println("\nThe student details:");
        s.displaystudent();
        
        

    }
}