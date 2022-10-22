import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the limit: ");
        int limit = in.nextInt();
        primeInRange(limit);
        System.out.println("***********************************");
        findPrime(limit);
    }

    static void primeInRange(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i == 1 || i == 2 || i == 3 || i == 5) {
                System.out.println(i + " is a prime");
            } else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                System.out.println(i + " is not prime");
            } else if (i % i == 0 && i % 1 == 0) {
                System.out.println(i + " is prime");
            }
        }
    }

    static void findPrime(int num) {
        if (num == 1 || num == 2 || num == 3 || num == 5) {
            System.out.println(num + " is prime");
        } else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0) {
            System.out.println(num + " is not prime");
        } else {
            System.out.println(num + " is prime");
        }
    }
}
