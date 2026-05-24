import java.util.Scanner;
class Abundant{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumofdivisors=0;
        for(int i=1; i<n; i++){
            if(n%i==0){
                sumofdivisors+= i;  
             }
        }
        if(sumofdivisors>n){
            System.out.println("Abundant");
        }
        else{
            System.out.println("Not abundant");
        }
    }
}