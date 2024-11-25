package Week1;

import java.util.Scanner;

public class StartToRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een leeftijd: ");
        int age = scanner.nextInt();
        System.out.print("Geef je hartslag in rust: ");
        int heartRateRest = scanner.nextInt();
        int heartRateMax = 220 - age;
        int intensiteit = 0;

        System.out.println("welke soort training wil je doen?");
        System.out.println("1. recuperatie training");
        System.out.println("2. LSD training (Long Slow Distance)");
        System.out.println("3. extensieve uithouding");
        System.out.println("4. intensieve uithouding");
        System.out.println("5. tempo-interval");
        System.out.println("6. intensieve interval");
        System.out.print("maak je keuze: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> intensiteit = 65;
            case 2 -> intensiteit = 70;
            case 3 -> intensiteit = 75;
            case 4 -> intensiteit = 85;
            case 5 -> intensiteit = 90;
            case 6 -> intensiteit = 95;
        }

        if (intensiteit != 0){
            int heartRateIdeal = heartRateRest + (heartRateMax - heartRateRest) * intensiteit / 100;

            System.out.println("Je maximale hartslag is: " + heartRateMax);
            System.out.println("Je ideale hartslag is: " + heartRateIdeal);
        } else {
            System.out.println("Deze training bestaat niet");
        }






    }
}
