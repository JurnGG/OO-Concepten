package Week4;

import java.util.Random;

public class Dobbelsteen {
    Random random = new Random();
    private int aantalZijden;

    public Dobbelsteen(int aantalZijden) {
        this.aantalZijden = aantalZijden;
    }

    public int getAantalZijden() {
        return aantalZijden;
    }

    public void setAantalZijden(int aantalZijden) {
        this.aantalZijden = aantalZijden;
    }

    public int gooi() {
        return (int) (random.nextInt(aantalZijden) + 1);
    }
}
