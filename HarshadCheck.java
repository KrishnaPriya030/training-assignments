import java.util.Scanner;
class HarshadCheck{
public static void main(String [] args){
 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
sc.nextLine();
int sum_digits=0;
int temp=n;
while(temp>0){
int r=temp%10;
sum_digits+=r;
temp=temp/10;
}
if(n%sum_digits==0){
System.out.println("Harshad Number");
}
}
}


