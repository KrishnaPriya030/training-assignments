import java.util.Scanner;
class Automorphic{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int sqr=n*n;
        int temp=n;
        while(temp!=0){
            if(temp%10!=sqr%10){
                System.out.println("Not automorphic");
                return;

            }
            temp/=10;
            sqr/=10;

        }
         System.out.println("Automorphic");

        
    }
}