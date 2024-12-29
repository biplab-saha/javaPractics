
import java.util.Scanner;

public class primeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not prime: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 1) {
            System.out.println("neither prime nor composite");

        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("not prime number");
                break;
            }
            c += 1;
            System.out.println("prime number");

        }

    }

}
