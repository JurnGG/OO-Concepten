package week6.letterFrequenties;

import java.util.Arrays;

public class CharacterFrequencies {
    private final Integer[] frequencies;

    public CharacterFrequencies() {
        frequencies = new Integer[26];
        Arrays.fill(frequencies, 0);
    }

    public void adaptFrequencies(String sentence) {

        for (char c : sentence.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                frequencies[Character.toUpperCase(c) - 'A']++;
            }
        }
    }

    public void displayFrequencies() {
        int totalLetters = 0;
        System.out.println("Letterfrequenties tot nu toe:");
        for (int i = 0; i < frequencies.length; i++) {
            char letter = (char) ('a' + i);
            System.out.print(letter + " --> " + frequencies[i] + "x  ");

            totalLetters += frequencies[i];

            if ((i + 1) % 6 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nTotaal aantal letters: " + totalLetters);
    }

}
