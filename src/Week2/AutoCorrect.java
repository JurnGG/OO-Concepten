package Week2;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class AutoCorrect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w1,w2;

        System.out.print("geef een woord: ");
        w1 = scanner.nextLine();
        System.out.print("geef nog een woord: ");
        w2 = scanner.nextLine();

        System.out.println("De afstand tussen " + w1 + " en " + w2 + " is " + calculateDistance(w1, w2));


    }
    public static int calculateDistance(String w1, String w2) {
        return Math.abs(getCodepoint(w1) - getCodepoint(w2));
    }

    public static int getCodepoint(String word){
        int codepoint = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            codepoint += (int) c;
        }
        return codepoint;
    }
}

