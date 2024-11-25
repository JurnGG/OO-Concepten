package week8._3DPrinter;

public class Sphere extends PrimitiveObject{
    private double radius;

    public Sphere(double x, double y, double z, double radius) {
        super(x, y, z);
        Sphere.this.radius = radius;
    }

    public double getradius() {
        return radius;
    }

    @Override
    public double volume(){
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Bol met straal "+radius+" op plaats "+super.toString();
    }
}
