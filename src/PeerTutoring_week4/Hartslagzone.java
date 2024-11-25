package PeerTutoring_week4;

import java.util.Scanner;

public class Hartslagzone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ans;
        int hrr = 0, rest = 0, max = 0;

       /* do {
            System.out.print("is de HRR gekend? (ja/nee): ");
            ans = scanner.nextLine().toLowerCase().charAt(0);

            if (ans == 'j') {
                System.out.print("geef de HRR: ");
                hrr = scanner.nextInt();
            } else if (ans == 'n') {
                rest = (int) findRestingHeartRate(scanner);
                max = (int) findMaxHeartRate(scanner);
                hrr = max - rest;
            }

        } while (ans != 'j' && ans != 'n');

        System.out.println("HRR: " + hrr);

        if (ans == 'j') {
            rest = (int) findRestingHeartRate(scanner);
            max = (int) findMaxHeartRate(scanner);
        }
        System.out.println("In welke zone zou je willen trainen? (1-5): ");
        int zone = scanner.nextInt();

        switch (zone) {
            case 1 -> {
                System.out.println("zone 1");
                displayHeartRateZones(rest, max, 0.5);
            }
            case 2 -> {
                System.out.println("zone 2");
                displayHeartRateZones(rest, max, 0.6);
            }
            case 3 -> {
                System.out.println("zone 3");
                displayHeartRateZones(rest, max, 0.7);
            }
            case 4 -> {
                System.out.println("zone 4");
                displayHeartRateZones(rest, max, 0.8);
            }
            case 5 -> {
                System.out.println("zone 5");
                displayHeartRateZones(rest, max, 0.9);
            }
            default -> System.out.println("ongeldige zone");

        }*/

        do {
            System.out.print("ben je een gevorderde of beginner (B/G): ");
            ans = scanner.nextLine().toLowerCase().charAt(0);
        } while (ans != 'b' && ans != 'g');

        System.out.print("De hoeveelste dag voer je dit uit: ");
        int dag = scanner.nextInt();

        if (ans == 'b') {
            makeSchemaBeginner(dag);
        } else {
            makeSchemaGevorderde(dag);
        }
    }

    public static void countdown(){
        System.out.println("tel nu je hartslagen gedurende 15 seconden");
        System.out.println("Start");
        for (int i = 15; i >= 1; i--) {
            System.out.print(i + " - ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("stop");
    }

    public static double findRestingHeartRate(Scanner scanner){
        System.out.print("Ga rustig zitten en haal 10 keer diep adem(Type ok om verder te gaan): ");
        scanner.nextLine();
        scanner.nextLine();
        countdown();
        System.out.print("geef het aantal hartslagen: ");
        return scanner.nextDouble()*4;
    }

    public static double findMaxHeartRate(Scanner scanner){
        for(int i = 1; i <= 2; i++){
            System.out.println("Interval "+i+": Ren 30 seconden op volle snelheid.");
            System.out.println("Herstelperiode "+i+": Rust 60 seconden.");
        }
        System.out.println("Interval 3: Ren 60 seconden op volle snelheid.");
        System.out.print("Type ok om verder te gaan: ");
        scanner.nextLine();
        scanner.nextLine();
        countdown();
        System.out.print("geef het aantal hartslagen: ");
        return scanner.nextDouble()*4;
    }

    public static void displayHeartRateZones(int rest, int max, double zone){
        System.out.println("rusthartSlag: "+rest);
        System.out.println("maxHartslag: "+max);
        System.out.println("limieten hartslag: tussen "+((max - rest)*zone + rest)+" en "+((max - rest)*(zone+0.1) + rest));
    }

    public static void makeSchemaBeginner(int dag){
        System.out.println("1. "+10*(1.1 * dag)+" minuten lopen tussen de limieten van zone 3 tot en met 4");
        System.out.println("2. " + ((10 * (1.1 * dag) > 30) ? "30" : (10 * (1.1 * dag))) + " seconden hardlopen in zone 5");
        System.out.println("3. Wandelen tot dat de bovengrens van zone 2 bereikt is");
        System.out.println("4. "+(40*(1.1*dag))+" seconden wandelen/joggen tussen de limieten van zone 1 tot en met 2");
        System.out.println("5. "+10*(1.1 * dag)+" minuten wandelen/joggen in zone 2");
    }

    public static void makeSchemaGevorderde(int dag){
        System.out.println("1. "+20*(1.1 * dag)+" minuten lopen tussen de limieten van zone 3 tot en met 4");
        System.out.println("2. " + ((10 * (1.1 * dag) > 30) ? "30" : (10 * (1.1 * dag))) + " seconden hardlopen in zone 5");
        System.out.println("3. Wandelen tot dat de bovengrens van zone 2 bereikt is");
        System.out.println("4. "+40*(1.1 * dag)+" seconden wandelen/joggen tussen de limieten van zone 1 tot en met 2");
        System.out.println("5. "+10*(1.1 * dag)+" minuten wandelen/joggen in zone 2 tem zone 3");
    }
}
