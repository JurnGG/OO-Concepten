package Week2;

import java.util.Random;
import java.util.Scanner;

public class Nimb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int startAantal = 21;
        int maxAantal = 3;
        int aantal;

        System.out.println("Welkom bij Nimb!");
        System.out.print("Wie begint er de computer of jij? (c/j) ");
        String keuze = scanner.nextLine();

        while (!keuze.equals("j") && !keuze.equals("c")) {
            System.out.print("Ongeldige keuze, wie begint er de computer of jij? (c/j) ");
            keuze = scanner.nextLine();
        }
        while (startAantal > 0) {
            if (keuze.equals("j")) {
                do {
                    System.out.print("Kies een getal tussen 1 en " + maxAantal + "? ");
                    aantal = scanner.nextInt();
                    if (aantal > 0 && aantal <= maxAantal) {
                        startAantal -= aantal;
                        System.out.println("Er zijn nog " + startAantal + " lucifers over");
                        keuze = "c";
                    } else {
                        System.out.println("Ongeldige keuze");
                    }

                } while (aantal > maxAantal || aantal <= 0);
            }else if(keuze.equals("c")) {
                aantal = random.nextInt(1, maxAantal+1);
                startAantal -= aantal;
                System.out.println("De computer kiest " + aantal);
                System.out.println("Er zijn nog " + startAantal + " lucifers over");
                keuze = "j";
            }
        }

        System.out.println(keuze.equals("j") ? "Proficiat, je hebt gewonnen!" : "De computer heeft gewonnen!");

    }
}
