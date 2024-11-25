package week6.kaartspelletjes.uitbreiding;

import java.util.Random;

public class Card {
    private int[] suits;
    private int[] values;
    private final String[] suitNames = {"Harten", "Ruiten", "Klaveren", "Schoppen"};
    private final String[] valueNames = {"Aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Heer"};

    public Card(int[] suits, int[] values) {
        this.suits = suits;
        this.values = values;
    }

    public int[] getSuits() {
        return suits;
    }

    public int[] getValues() {
        return values;
    }

    public void createCards(int n, Random random){
        for(int i = 0; i < n; i++){
            System.out.println(suitNames[suits[random.nextInt(4)]]+" "+valueNames[values[random.nextInt(13)]]);
        }
    }

    @Override
    public String toString() {
        return "Card: " + suits + " " + values;
    }
}
