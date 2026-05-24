import java.util.Scanner;

class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int original = n;
        int digits = 0;
        int result = 0;

        int temp = n;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;

        while (temp != 0) {

            int rem = temp % 10;

            result += Math.pow(rem, digits);

            temp = temp / 10;
        }

        if (original == result) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}