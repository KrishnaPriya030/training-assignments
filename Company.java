import java.util.Scanner;
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;

    }
    void displayPerson(){
        System.out.println("The name:"+name);
        System.out.println("The age:"+age);

    }
}
class Employee extends Person{
    int empid;
    double salary;
    Employee(String name,int age,int empid,double salary){
        super(name,age);
        this.empid=empid;
        this.salary=salary;

    }
    void displayEmp(){
         System.out.println("The employee id:"+empid);
        System.out.println("The salary:"+salary);

    }

}
class Manager extends Employee{
    String department;
    double bonus;
    Manager(String name,int age,int empid,double salary,String department,double bonus){
        super(name,age,empid,salary);
        this.department=department;
        this.bonus=bonus;


    }
    void displayManager(){
        System.out.println("The department:"+department);
        System.out.println("The bonus:"+bonus);



    }
}
public class Company{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the employee id:");
         int empid=sc.nextInt();
        System.out.println("Enter the salary:");
        double salary=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the department:");
        String department=sc.nextLine();
        System.out.println("Enter the bonus:");
        double bonus=sc.nextDouble();
     Manager m=new Manager(name,age,empid,salary,department,bonus);
     m.displayPerson();
     m.displayEmp();
    m.displayManager();
                

    }
}
