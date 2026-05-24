import java.util.Scanner;
class Person{
    int age;
    String name;
    Person(int age,String name){
        this.age=age;
        this.name=name;


    }
    void displayPerson(){
        System.out.println("The name:"+name);
        System.out.println("The age:"+age);

    }
}
class Student extends Person{
    int roll;
    String course;
    Student(int age,String name,int roll,String course){
        super(age,name);
        this.roll=roll;
        this.course=course;
    }
    void displayStudent(){
         System.out.println("The roll number:"+roll);
        System.out.println("The course:"+course);

    }
    }
   public  class College{
        public static void main(String [] args){
            Scanner sc=new Scanner(System.in);
             System.out.println("Enter the age:");
            int age=sc.nextInt();
            sc.nextLine();
             System.out.println("Enter the name:");
            String name=sc.nextLine();
             System.out.println("Enter the roll number:");
            int roll=sc.nextInt();
            sc.nextLine();
             System.out.println("Enter the coursw:");
            String course=sc.nextLine();
            Student s=new Student(age,name,roll,course);

    
            s.displayPerson();
            s.displayStudent();
        }
    }
