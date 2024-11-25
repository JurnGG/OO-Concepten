package PeerTutoring_week3;

import java.util.Scanner;

public class MenuVersie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1 = 1;

       do{
            System.out.print("Welke conversie wens je te doen?\n" +
                    "1) °C naar °F\n" +
                    "2) °F naar °C\n" +
                    "Uw keuze? ");
            k1 = scanner.nextInt();

            if(k1 == 1 || k1 == 2) {
                System.out.print("Geef de waarde in " + (k1 == 1 ? "°C" : "°F") + " : ");
                int temp = scanner.nextInt();

                if (k1 == 1) {
                    System.out.printf("%d°C = %.2f%n°F", temp, ((double) (temp * 9 / 5) + 32));
                }

                if (k1 == 2) {
                    System.out.printf("%d°F = %.2f%n°C", temp, ((double) (temp - 32) * 5 / 9));
                }
            }

        } while (k1 == 1 || k1 == 2);

    }
}
