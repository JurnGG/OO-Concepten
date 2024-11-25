package week8._3DPrinter;

public class PrimitiveObject {
    protected double[] position;

    public PrimitiveObject(){
        position = new double[]{0, 0, 0};
    }

    public PrimitiveObject(double x, double y, double z){
        position = new double[]{x, y, z};
    }

    public double getX(){
        return position[0];
    }

    public double getY(){
        return position[1];
    }

    public double getZ(){
        return position[2];
    }

    public double volume(){
        return 0;
    }

    @Override
    public String toString() {
        return "(" + position[0] + ", " + position[1] + ", " + position[2] + ") en volume "+String.format("%.2f", volume());
    }
}
