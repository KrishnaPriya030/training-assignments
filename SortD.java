import java.util.Scanner;
class Student{
    int roll;
    String name;
    double marks;
    Student(int roll,String name,double marks){

        this.roll=roll;
        this.name=name;
        this.marks=marks;


    }
    void displaydata(){
        System.out.println("the student roll number:"+roll);
        System.out.println("the student name:"+name);
        System.out.println("the student marks:"+marks);

    }
}
public class SortD{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();
        sc.nextLine();
        Student [] s=new Student[n];
        for(int i=0; i<n; i++){
        System.out.println("Enter the students roll number:");
        int roll=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the students name:");
        String name=sc.nextLine();
        System.out.println("Enter the students mark:");
        double marks=sc.nextDouble();
        sc.nextLine();
        s[i]=new Student(roll,name,marks);
        
        }
       for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
            if(s[i].marks<s[j].marks){
                Student temp=s[i];
                s[i]=s[j];
                s[j]=temp;


            }
        }
       }
       System.out.println("The details of student with marks in descending order:");
       for(int i=0; i<n; i++){
        s[i].displaydata();
       }
    }
}
