package week9.transportmiddelen;

public class Main {
    public static void main(String[] args) {
        MeansOfTransport[] meansOfTransport = new MeansOfTransport[]{
                new Bus(50), new Tram(40), new Train(120), new Bike(25),
                new OnFoot(5), new Step(20)
        };
        for (MeansOfTransport mot : meansOfTransport) {
            System.out.println(mot.travelDistance(10));
        }
    }
}
