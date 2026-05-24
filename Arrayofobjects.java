import java.util.Scanner;
class Student{
    int rollno;
    String name;
    double marks;
    Student(int rollno,String name,double marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;

    }
    void displaydata(){
        System.out.println("The student name:"+name);
        System.out.println("The student marks:"+marks);
        System.out.println("The student roll no:"+rollno);


    }
}
    public class Arrayofobjects{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of students:");
            int n=sc.nextInt();
            Student [] s=new Student[n]; // creates an array to store n Student object references   
            for(int i=0; i<n; i++)
            {

                    System.out.println("Enter the student roll no:");
                    int rollno=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the student name:");
                    String name=sc.nextLine();
                    System.out.println("Enter the student marks:");
                    double marks=sc.nextDouble();
                    sc.nextLine();
                    s[i]=new Student(rollno,name,marks); // creates a Student object and stores it at index i of the array

            }
            for(int i=0; i<n; i++){
                    s[i].displaydata();
            }


            
        }
    }
