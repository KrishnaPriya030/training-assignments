import java.util.Scanner;
class Person{
    String  name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Student extends Person{
    int sid;
    String course;
 boolean feepaid;
 Student(String name,int age,int sid,String course){
    super(name,age);
    this.sid=sid;
    this.course=course;
    this.feepaid=false;

 }
 void displayStudent(){
        System.out.println("The name:"+name);
        System.out.println("The age:"+age);
        System.out.println("The studentid:"+sid);
        System.out.println("The course:"+course);   

 }
 void payfee(){
    if(!feepaid){
        feepaid=true;
    }
    else{
        System.out.println("the fees alredy paid");
    }
 }
 void checkFeeStatus() {
    if (feepaid) {
        System.out.println("Fee Status: Paid");
    } else {
        System.out.println("Fee Status: Not Paid");
    }
}


    
}
public class Registration{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();
        sc.nextLine();
        Student [] s=new Student[n];
        
        for(int i=0; i<n; ++i){
             System.out.println("Enter the age:");
            int age=sc.nextInt();
            sc.nextLine();
             System.out.println("Enter the name:");
            String name=sc.nextLine();
             System.out.println("Enter the student id:");
            int sid=sc.nextInt();
            sc.nextLine();
             System.out.println("Enter the course:");
            String course=sc.nextLine();
            s[i]=new Student(name,age,sid,course);

        }
    
    int choice;
    do{
        System.out.println("_____menu-_____");
        System.out.println("1.Display all ");
        System.out.println("2.Payfee");
        System.out.println("3.Check status");
        System.out.println("4.Exit");
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1 -> {
                for(int i=0; i<n; i++){
                    s[i].displayStudent();
                }   }
            case 2 -> {
                System.out.println("Enter the pay id:");
                int payid=sc.nextInt();
                
                for (int i = 0; i < n; i++) {
                    if (s[i].sid== payid) {
                        s[i].payfee();
                    }
                }
                }
                    case 3 -> {
                        System.out.println("Enter the student id to check fee status:");
                        int checkid=sc.nextInt();
                        
                        for (int i = 0; i < n; i++) {
                            if (s[i].sid == checkid) {
                                s[i].checkFeeStatus();
                            }
                        }
                }
                    case 4 -> System.out.println("Exiting...");
default -> System.out.println("The invaalid choice!");

            
        }

            }while(choice!=4);

}
}