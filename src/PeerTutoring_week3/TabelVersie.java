package PeerTutoring_week3;

import java.util.Scanner;

public class TabelVersie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef de begintemperatuur in °C: ");
        int start = scanner.nextInt();
        System.out.print("Geef de eindtemperatuur in °C: ");
        int end = scanner.nextInt();
        System.out.print("Geef de stapgrootte: ");
        int step = scanner.nextInt();

        for (int i= start; i <= end; i += step) {
            System.out.println(i + "°C = " + ((double) (i * 9 / 5) + 32) + "°F");
        }
    }
}
