package week7.kaartspelletjes_2;

public class Main {
    public static void main(String[] args) {
        int totaleWaarde = 0;

        for(int i = 0; i < 5; i++){
            Card card = new Card();
            totaleWaarde += card.getValueAsInt();
            System.out.println(card);
        }
        System.out.println("Totale waarde: " + totaleWaarde);
    }
}
