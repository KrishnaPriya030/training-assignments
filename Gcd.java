import java.util.Scanner;
class Gcd{
public static void main(String [] args){

Scanner sc=new Scanner(System.in);

int a=sc.nextInt();
sc.nextLine();
int b=sc.nextInt();
sc.nextLine();
while(b!=0){

int temp=b;
b=a%b;
a=temp;

}
System.out.println(a);
}
}
