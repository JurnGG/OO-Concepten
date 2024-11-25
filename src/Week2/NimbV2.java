package Week2;

import java.util.Random;
import java.util.Scanner;

public class NimbV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int startAantal, maxAantal, aantal;
        boolean playAgain = true;

        do {
            do {
                startAantal = random.nextInt(1, 100);
                maxAantal = random.nextInt(1, 100);
            } while (startAantal / 5 < maxAantal);

            System.out.println("Welkom bij Nimb!");
            String keuze = random.nextInt(0, 2) == 0 ? "c" : "j";
            System.out.println(keuze.equals("j") ? "Jij begint!" : "De computer begint!");
            System.out.println("Er zijn " + startAantal + " lucifers");

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
                } else if (keuze.equals("c")) {
                    aantal = random.nextInt(1, startAantal < maxAantal ? startAantal+1 : maxAantal+1);
                    startAantal -= aantal;
                    System.out.println("De computer kiest " + aantal);
                    System.out.println("Er zijn nog " + startAantal + " lucifers over");
                    keuze = "j";
                }
            }

            System.out.println(keuze.equals("j") ? "Proficiat, je hebt gewonnen!" : "De computer heeft gewonnen!");
            System.out.print("Wil je nog een keer spelen? (j/n) ");
            playAgain = scanner.next().equals("j");
        } while (playAgain);
    }
}
