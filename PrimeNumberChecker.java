// Checking for a Prime Number:

public class PrimeNumberChecker {
    public static void main(String[] args) {
        int num = 29; // number to test
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false; 
            }
        }

        if(isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
