import java.util.Scanner;
class Employee{
    int empId;
    String empName;
    double empSalary;

    Employee(){

    }
    Employee(int empId,String empName,double empSalary){
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;

    }
    void displaydata(){
        System.out.println("Employee id:"+empId);
        System.out.println("Employee salary:"+empSalary);
        System.out.println("Employee name:"+empName);
    
    }
}
     public  class Overloadingcon{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee id:");
        int empId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the employee name:");
        String empName=sc.nextLine();
        System.out.println("Enter the employee salary:");
        double empSalary=sc.nextDouble();
        sc.nextLine();
        Employee e1=new Employee();
        Employee e2=new Employee(empId,empName,empSalary);
        e1.displaydata();
        e2.displaydata();

        

    } 

        
    }


