package PeerTutoring_week5;

import java.util.Scanner;

public class Galgje1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = "", gok = "";
        int count = 0;

        do {
            System.out.print("geef een woord (max 10 letters): ");
            w = scanner.nextLine();
            if(w.length() > 10 || w.length() < 5){
                System.out.println("Het woord moet korter dan 10 karakters en langer dan 5 karakters zijn");
            }

        }while (w.length() > 10 || w.length() < 5);

        System.out.print("\n".repeat(20));
        System.out.print("het te zoeken woord is: ");
        System.out.print(".".repeat(w.length()));

        do {
            System.out.print("doe een gok: ");
            gok = scanner.nextLine();

            if(!gok.equals(w)){
                System.out.print("fout! ");
            }
            count++;
        } while (!gok.equals(w) && count < 5);

        System.out.println(count == 5 ? "Het woord was: "+w : "Proficiat! Je hebt het woord geraden in "+count+" beurten");
    }
}
