   import java.util.Scanner;
    class Employee{

    int empid;
    String empname;
    double empsalary;

    Employee(int empid,String empname,double empsalary){
        this.empid=empid;
        this.empname=empname;
        this.empsalary=empsalary;

    }
    void displaydata(){
        System.out.println("Employee name:"+empname);
        System.out.println("Employee salary:"+empsalary);
        System.out.println("Employee id:"+empid);
        
    }



}
public class Empdetails{ 
    public static void main(String [] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee 1 details");
        System.out.println("Enter employee 1 id:");
        int id1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee 1 name:");
        String n1=sc.nextLine();
        System.out.println("Enter employee 1 salary:");
        double s1=sc.nextDouble();
        sc.nextLine();
        Employee e1=new Employee(id1,n1,s1);
        System.out.println("Enter employee 2 details");
        System.out.println("Enter employee 2 id:");
        int id2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee 2 name:");
        String n2=sc.nextLine();
        System.out.println("Enter employee 2 salary:");
        double s2=sc.nextDouble();
        sc.nextLine();
        Employee e2=new Employee(id2,n2,s2);
        e1.displaydata();
        e2.displaydata();
        




    }
}