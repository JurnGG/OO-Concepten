package week7.cache;

public class TireSize {
    private int width;
    private int aspect;
    private int diameter;

    public TireSize(int width, int aspect, int diameter) {
        this.width = width;
        this.aspect = aspect;
        this.diameter = diameter;
    }

    public int getWidth() {
        return width;
    }

    public int getAspect() {
        return aspect;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return width + "/" + aspect + "R" + diameter;
    }
}
