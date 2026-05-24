
import java.util.Scanner;
class Palindrome{
    public void doit(int n){
        int rev=0;
        int temp=n;
        
        while(temp>0){
              int rem=temp%10;
               rev=rev*10+rem;
               temp=temp/10;

    }
    if(n==rev){
    System.out.println("Palindrome");

}
else{
     System.out.println("not palindrome");


}
}
}
public class Main {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Palindrome p=new Palindrome();
        p.doit(n);
        sc.close();
        

        
    }
}


