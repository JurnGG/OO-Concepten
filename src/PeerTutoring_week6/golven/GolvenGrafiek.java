package PeerTutoring_week6.golven;

import java.awt.*;
import java.util.Random;

public class GolvenGrafiek {
    private Golf[] golven;
    private Random random;
    private final Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK, Color.CYAN, Color.MAGENTA, Color.LIGHT_GRAY, Color.DARK_GRAY};

    public GolvenGrafiek(int aantalGolven) {
        golven = new Golf[aantalGolven];
        random = new Random();
    }

    public void maakGolven(){
        for (int i = 0; i < golven.length; i++) {
            golven[i] = new Golf();
            golven[i].setAmplitude(random.nextDouble(0.1, 4.0));
            golven[i].setFrequentie(random.nextDouble(0.1, 4.0));
            golven[i].setFase(random.nextDouble(-1.0,1.0));
        }
    }

    public void tekenGolven(){
        golven.GrafiekWindow window = new golven.GrafiekWindow(10,6);
        for (Golf golf : golven) {
            Color color = colors[random.nextInt(colors.length)];
            for (double j = -5; j < 5; j+=0.001) {
                window.tekenPunt(j, golf.getYwaarde(j), color);
            }
        }

        window.toon();
    }
}
