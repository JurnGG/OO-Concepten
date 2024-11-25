package Week2;

import java.util.Scanner;

public class Belasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double prijs, btw;
        int keuze = 0;

        System.out.print("Geef de btw percentage: ");
        btw = scanner.nextDouble();
        System.out.print("Geef de prijs: ");
        prijs = scanner.nextDouble();
        while (keuze != 1 && keuze != 2) {
            System.out.print("Maak een keuze (1 = inclusief, 2 = exclusief): ");
            keuze = scanner.nextInt();
            if(keuze > 2 || keuze < 1){
                System.out.println("Ongeldige keuze");
            }
        }

        switch (keuze) {
            case 1:
                System.out.printf("$%.2f + %.1Belastingf%% BTW = $%.2f\n", prijs, btw, prijs * (1 + btw / 100));
                break;
            case 2:
                System.out.printf("$%.2f - %.1f%% BTW = $%.2f\n", prijs, btw, prijs / (1 + btw / 100));
                break;
        }
    }
}
