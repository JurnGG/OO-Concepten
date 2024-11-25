package Week3;

import java.util.Scanner;

public class Morse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een woord: ");
        String w = scanner.nextLine().toUpperCase();
        StringBuilder morse = new StringBuilder();

        for (int i = 0; i < w.length(); i++) {
            char l = w.charAt(i);

            switch (l) {
                case 'A' -> morse.append(".- ");
                case 'B' -> morse.append("-... ");
                case 'C' -> morse.append("-.-. ");
                case 'D' -> morse.append("-.. ");
                case 'E' -> morse.append(". ");
                case 'F' -> morse.append("..-. ");
                case 'G' -> morse.append("--. ");
                case 'H' -> morse.append(".... ");
                case 'I' -> morse.append(".. ");
                case 'J' -> morse.append(".--- ");
                case 'K' -> morse.append("-.- ");
                case 'L' -> morse.append(".-.. ");
                case 'M' -> morse.append("-- ");
                case 'N' -> morse.append("-. ");
                case 'O' -> morse.append("--- ");
                case 'P' -> morse.append(".--. ");
                case 'Q' -> morse.append("--.- ");
                case 'R' -> morse.append(".-. ");
                case 'S' -> morse.append("... ");
                case 'T' -> morse.append("- ");
                case 'U' -> morse.append("..- ");
                case 'V' -> morse.append("...- ");
                case 'W' -> morse.append(".-- ");
                case 'X' -> morse.append("-..- ");
                case 'Y' -> morse.append("-.-- ");
                case 'Z' -> morse.append("--.. ");
                default ->{
                    System.out.println("Ongeldige invoer, alleen letters a-z zijn toegestaan.");
                    return;
                }
            }
        }
        System.out.println(morse);
    }
}
