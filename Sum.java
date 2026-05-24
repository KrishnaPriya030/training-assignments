import java.util.Scanner;

class Calcsum{
    int sum=0;

    void display(int n){
         while(n>0){
        int rem=n%10;
        sum+=rem;
        n=n/10;
    }
    System.out.println(sum);
}
}
public class Sum {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Calcsum c=new Calcsum();
        c.display(n);



    }

}
