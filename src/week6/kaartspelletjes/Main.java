package week6.kaartspelletjes;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;
        String[] suits = { "Harten", "Schoppen", "Ruiten", "Klaveren" };
        String[] values = {
                "Aas", "Twee", "Drie", "Vier", "Vijf",
                "Zes", "Zeven", "Acht", "Negen", "Tien",
                "Boer", "Dame", "Heer"
        };
        Card card = new Card(suits, values);

        do{
            System.out.print("Hoeveel kaarten wil je trekken?(-1 om te stoppen): ");
            n = scanner.nextInt();
            if(n > 0){
                card.createCards(n,random);
                System.out.println();
            }

        }while (n > 0);

    }
}
