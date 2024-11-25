package week8._3DPrinter;

public class Cylinder extends PrimitiveObject{
    private double radius;
    private double height;

    public Cylinder(double x, double y, double z, double radius, double height) {
        super(x, y, z);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double volume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cilinder met straal "+radius+" en hoogte "+height+" op plaats "+super.toString();
    }
}
