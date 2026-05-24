import java.util.Scanner;

class Calculate{
     int count=0;

    void display(int n){
   
    while(n>0){
         n=n/10;
        count++;


    }
    System.out.println(count);

    }
}
public class Count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Calculate c=new Calculate();
        c.display(n);
        sc.close();

    }

}
