package Week3;

import java.util.Random;
import java.util.Scanner;

public class Wachtwoorden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String w;

        do {
            System.out.print("Geef een nieuw wachtwoord: ");
            w = scanner.nextLine();
        } while (!readPassword(w, random));

        System.out.println("Je nieuwe wachtwoord is goedgekeurd!");
    }
    public static boolean readPassword(String w, Random random){
        boolean systemEr = random.nextBoolean();

        // bullying user with random system errors
        if(systemEr){
            System.out.println("Systeem fout, probeer het opnieuw.");
            return false;
        }

        if(w.length() < 8){
            System.out.println("Het wachtwoord moet minstens 8 karakters bevatten.");
            return false;
        }

        if(!w.matches(".*[A-Z].*")){
            System.out.println("Het wachtwoord moet minstens 1 hoofdletter bevatten.");
            return false;
        }

        if (!w.matches(".*[a-z].*")){
            System.out.println("Het wachtwoord moet minstens 1 kleine letter bevatten.");
            return false;
        }

        if (!w.matches(".*[0-9].*")){
            System.out.println("Het wachtwoord moet minstens 1 cijfer bevatten.");
            return false;
        }

        if(!w.matches(".*[!?.,].*")){
            System.out.println("Het wachtwoord moet minstens 1 leesteken bevatten.");
            return false;
        }

        return true;
    }
}
