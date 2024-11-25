package Week1;

import java.util.Scanner;

public class Reeksen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hoeveel getallen wil je afdrukken? ");
        int n = scanner.nextInt();
        System.out.print("Met welke waarde wil je starten? ");
        int start = scanner.nextInt();
        System.out.print("Met welke waarde wil je verhogen? ");
        int verhogen = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            start += verhogen;
            System.out.print(start+ " ");
        }


    }
}
