import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Variable initialization
        int c = 2;

        // Check for prime
        boolean isPrime = true; // Assume number is prime
        while (c < num) {
            if (num % c == 0) {
                isPrime = false; // Number is not prime
                break;
            }
            c = c + 1; // Increment counter
        }

        // Output the result
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        scanner.close();
    }
}
