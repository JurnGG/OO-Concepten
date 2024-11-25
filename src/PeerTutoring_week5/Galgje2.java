package PeerTutoring_week5;

import java.util.Scanner;

public class Galgje2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = "";
        char gok;
        int count = 0;
        StringBuilder sb = new StringBuilder();

        do {
            System.out.print("geef een woord (max 10 letters): ");
            w = scanner.nextLine();
            if(w.length() > 10 || w.length() < 5){
                System.out.println("Het woord moet korter dan 10 karakters en langer dan 5 karakters zijn");
            }

        }while (w.length() > 10 || w.length() < 5);

        System.out.print("\n".repeat(20));
        sb.append(".".repeat(w.length()));

        do {
            System.out.println("het te zoeken woord is: "+sb);
            System.out.print("geef een letter: ");
            gok = scanner.nextLine().charAt(0);

            if(!w.contains(String.valueOf(gok))){
                System.out.print("fout! ");
            }else {
                for (int i = 0; i < w.length(); i++) {
                    if (w.charAt(i) == gok) {
                        sb.setCharAt(i, gok);
                    }
                }
            }
            count++;
        } while (!w.contentEquals(sb) && count < 8);

        System.out.println(count == 8 ? "Het woord was: "+w : "Proficiat! Je hebt het woord geraden in "+count+" beurten");
    }
}
