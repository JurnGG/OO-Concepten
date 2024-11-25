package PeerTutoring_week5;

import java.util.Scanner;

public class Galgje3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = "";
        char gok;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        final String HANGMAN =
                "----- \n" +
                        "| |   \n" +
                        "| O   \n" +
                        "| /|\\ \n" +
                        "| |   \n" +
                        "| / \\ \n" +
                        "|     \n" +
                        "-------";


        do {
            System.out.print("geef een woord (max 10 letters): ");
            w = scanner.nextLine();
            if(w.length() > 10 || w.length() < 5){
                System.out.println("Het woord moet korter dan 10 karakters en langer dan 5 karakters zijn");
            }

        }while (w.length() > 10 || w.length() < 5);

        System.out.print("\n".repeat(20));
        sb.append(".".repeat(w.length()));
        System.out.print(sb);

        do {
            for (int i = 0; i < count*7; i++) {
                System.out.print(HANGMAN.charAt(i));
            }
            System.out.println();

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
            System.out.println("het te zoeken woord is: "+sb);
            count++;
        } while (!w.contentEquals(sb) && count <= 8);

        System.out.println(count > 8 ? "Het woord was: "+w : "Proficiat! Je hebt het woord geraden in "+count+" beurten");
    }
}
