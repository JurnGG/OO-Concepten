package Week1;

import java.util.Random;
import java.util.Scanner;

public class HogerLager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = false;
        int guess;

        do {
            int random = new Random().nextInt(1,100);
            System.out.println("-----------------------------");
            System.out.println("Welkom bij hoger lager");
            System.out.println("Raad het getal tussen 1 en 100");
            System.out.println("-----------------------------");

            do {
                System.out.print("geef een getal: ");
                guess = scanner.nextInt();

                System.out.print((guess > random) ? "Te groot, " : "Te klein, ");
            } while (guess != random);

            System.out.print("Wil je nog eens spelen? (j/n)");
            String answer = scanner.next();
            playAgain = answer.equals("j");

        } while (playAgain);
    }
}
