import java.util.Scanner;

public class primeCheck {

    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Step 2: Prompt the user to enter a number
        System.out.println("Enter the number to check prime or not prime: ");
        
        // Step 3: Read the input number
        int n = sc.nextInt();
        
        // Step 4: Close the Scanner object
        sc.close();

        // Step 5: Check if the number is less than or equal to 1
        if (n <= 1) {
            System.out.println("neither prime nor composite");
            return; // Exit the program
        }

        // Step 6: Initialize a variable 'c' to 2
        int c = 2;
        boolean isPrime = true;
        
        // Step 7: Loop to check for factors of 'n'
        while (c * c <= n) {
            // Step 8: Check if 'n' is divisible by 'c'
            if (n % c == 0) {
                System.out.println("not prime number");
                isPrime = false;
                break; // Exit the loop
            }
            // Step 9: Increment 'c' by 1
            c += 1;
        }

        // Step 10: If no factors were found, 'n' is prime
        if (isPrime) {
            System.out.println("prime number");
        }
    }
}