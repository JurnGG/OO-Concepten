package week9.eenMooiFiguur;

public class Sphere extends Figure implements HasVolume{
    private double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double volume() {
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }
}
