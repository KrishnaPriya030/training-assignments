import java.util.Scanner;
class Student{
    int rollno;
    String name;
    double marks;

     Student(int rollno,String name,double marks) {
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
     }
void displaydata(){
    System.out.println("The student roll number:"+rollno);
    System.out.println("The student name:"+name);
    System.out.println("The student marks:"+marks);



}

    }
    public class Highmarks{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of students:");
            int n=sc.nextInt();
            Student[] s= new Student[n];
            for(int i=0; i<n; i++){
                System.out.println("Enter the student roll number:");
                int rollno=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the student name:");
                String name=sc.nextLine();
                System.out.println("The student marks:");
                double marks=sc.nextDouble();
                sc.nextLine();
                s[i]=new Student(rollno,name,marks);
            }
            int maxindex=0;
            for(int i=1; i<n; i++){
                if(s[i].marks>s[maxindex].marks){
                    maxindex=i;
                }
            }
            System.out.println("Details of student with maximum marks:");
        s[maxindex].displaydata();

        }
        
    }
    
