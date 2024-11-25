package PeerTutoring_week6.golven;

public class GolfTest {
    public static void main(String[] args) {
        Golf golf = new Golf();
        GolvenGrafiek golvenGrafiek = new GolvenGrafiek(3);
        golf.setAmplitude(2.0);
        golf.setFrequentie(2.0);
        golf.setFase(2.0);
        System.out.println(golf);
        golf.setAmplitude(1.0);
        System.out.println(golf);
        golf.setFrequentie(1.0);
        System.out.println(golf);
        golf.setFase(-1.0);
        System.out.println(golf);
        golf.setFase(0.0);
        System.out.println(golf);
        golvenGrafiek.maakGolven();
        golvenGrafiek.tekenGolven();


    }
}
