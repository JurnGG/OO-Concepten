package week6.kaartspelletjes;

import java.util.Random;

public class Card {
    private String[] suits;
    private String[] values;

    public Card(String[] suits, String[] values) {
        this.suits = suits;
        this.values = values;
    }

    public String[] getSuits() {
        return suits;
    }

    public String[] getValues() {
        return values;
    }

    public void createCards(int n, Random random){
        for(int i = 0; i < n; i++){
            System.out.println(suits[random.nextInt(4)]+" "+values[random.nextInt(13)]);
        }
    }

    @Override
    public String toString() {
        return "Card: " + suits + " " + values;
    }
}
