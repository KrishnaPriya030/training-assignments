import java.util.Scanner;
class Student{
    int rollno;
    String name;
    double marks;
    Student(){
    }
    
       
    

    void readdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student roll number:");
        rollno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the student name:");
        name=sc.nextLine();
        System.out.println("Enter the student marks:");
        marks=sc.nextDouble();
        sc.nextLine();

    }
    void displaydata(){
        System.out.println("Student name:"+name);
        System.out.println("Studenyt rollno:"+rollno);
        System.out.print("Student marks:"+marks);
    }
}
public class StudentRecord{
    public static void main(String [] args){
        Student s=new Student();
        s.readdata();
        s.displaydata();


    }
}