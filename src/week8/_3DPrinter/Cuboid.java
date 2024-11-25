package week8._3DPrinter;

public class Cuboid extends PrimitiveObject {
    private double[] size;

    public Cuboid(double x, double y, double z, double width, double height, double depth) {
        super(x, y, z);
        size = new double[]{width, height, depth};
    }

    public double getWidth(){
        return size[0];
    }

    public double getHeight(){
        return size[1];
    }

    public double getDepth(){
        return size[2];
    }

    @Override
    public double volume(){
        return size[0] * size[1] * size[2];
    }

    @Override
    public String toString() {
        return "Balk met afmetingen (" + size[0] + ", " + size[1] + ", " + size[2] + ") op plaats " +super.toString();
    }
}
