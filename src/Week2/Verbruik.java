package Week2;

import java.util.Scanner;

public class Verbruik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldKm, newKm;
        double fuel;

        System.out.print("geef de vorige kilometerstand: ");
        oldKm = scanner.nextInt();
        System.out.print("geef de huidge kilometerstand: ");
        newKm = scanner.nextInt();
        System.out.print("Geef het aantal getankte liters: ");
        fuel = scanner.nextDouble();

        System.out.printf("Verbuik voor %d km: %.2f liter per 100 km\n", newKm - oldKm, fuel / (newKm - oldKm) * 100);

        

    }
}
