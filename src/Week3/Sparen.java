package Week3;

import java.util.Scanner;

public class Sparen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef het bedrag in dat je wilt sparen: ");
        double startBedrag = scanner.nextDouble();
        System.out.print("Geef het percentage: ");
        double percentage = scanner.nextDouble();

        for (int i = 1; i <= 10; i++) {
            startBedrag += startBedrag * (percentage / 100);
            System.out.printf("Jaar %d: %.2f%n", i, startBedrag);
        }
    }
}
