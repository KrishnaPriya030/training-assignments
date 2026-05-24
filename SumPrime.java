import java.util.Scanner;
class Prime{
    boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        
            return true;
    }
}
class SumPrime{
    public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      sc.nextLine();
      int b=sc.nextInt();
      Prime p=new Prime();
      
      if(p.isprime(a) && p.isprime(b)){
        System.out.println(a+b);
      }
      else{
        System.out.println("not prime");
      }

    }
}
      
      
        