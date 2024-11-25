package Week3;

import java.util.Scanner;

public class AutocorrectieVervolg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("geef een woord: ");
        String w = scanner.nextLine();
        System.out.println("Bedoelde je " + autoCorrect(w) + "?");
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

    public static String autoCorrect(String w){
        String[] words = {"appel", "peer", "banaan", "kiwi", "citroen", "bier", "wijn", "water", "koffie"};
        int distance = Integer.MAX_VALUE;
        String closeWord= null;

        for(String word: words){
            if(calculateDistance(w, word) < distance){
                distance = calculateDistance(w, word);
                closeWord = word;
            }
        }
    return closeWord;
    }
}