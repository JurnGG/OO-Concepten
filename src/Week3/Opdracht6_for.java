package Week3;

import java.util.Scanner;

public class Opdracht6_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 10000; i++) {
            if(i % 6 == 0 && i % 28 == 0) {
                System.out.println(i);
            }
        }

        // PriemGetal oefening
        /*System.out.print("Geef een getal in: ");

        if(isPrime(scanner.nextInt())) {
            System.out.println("Het getal is een priemgetal.");
            return;
        }

        System.out.println("Het getal is geen priemgetal.");*/
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
