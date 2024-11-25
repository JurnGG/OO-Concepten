package PeerTutoring_week3;

import java.util.Scanner;

public class Uitdaging1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef de begintemperatuur in °C: ");
        int start = scanner.nextInt();
        System.out.print("Geef de eindtemperatuur in °C: ");
        int end = scanner.nextInt();
        System.out.print("Geef de stapgrootte: ");
        int step = scanner.nextInt();

        System.out.printf("===============%n");
        System.out.printf("| %3s | %4s |%n", "°C", "°F");
        System.out.printf("---------------%n");

        for (int i= start; i <= end; i += step) {

            System.out.printf("| %3s = %4s | \n",i , ((double) (i * 9 / 5) + 32));
        }
        System.out.printf("===============%n");
    }
}
