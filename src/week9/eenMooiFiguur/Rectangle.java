package week9.eenMooiFiguur;

public class Rectangle extends Figure implements HasBorder, HasSurface{
    private double width;
    private double length;

    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double circumference() {
        return 2 * (width + length);
    }

    @Override
    public double area() {
        return width * length;
    }
}
