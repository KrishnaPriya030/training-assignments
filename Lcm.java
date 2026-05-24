import java.util.Scanner;


class Lcm{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
sc.nextLine();
int b=sc.nextInt();
sc.nextLine();

int x=a;
int y=b;
while(y!=0){

int temp=y;
y=x%y;
x=temp;
}
int gcd=x;
int lcm=a*b/(gcd);
System.out.println(lcm);

}

}


