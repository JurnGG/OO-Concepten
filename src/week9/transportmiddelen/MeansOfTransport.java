package week9.transportmiddelen;

abstract public class MeansOfTransport {
    protected double speed;

    public MeansOfTransport(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    abstract public String travelDistance(double distance);
}
