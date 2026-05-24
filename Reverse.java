import java.util.Scanner;
class Problem{
    public void doit(int n){
        int rev=0;
        int temp=n;
        
        while(temp>0){
              int rem=temp%10;
               rev=rev*10+rem;
               temp=temp/10;

    }
    System.out.println(rev);

}
}
public class Reverse {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Problem p=new Problem();
        p.doit(n);
        sc.close();
        

        
    }
}
