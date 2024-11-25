package week9.eenMooiFiguur;

public class Cuboid extends Figure implements HasVolume{
    private Rectangle base;
    private double height;

    public Cuboid(String name, Rectangle base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }
    public Cuboid(String name, double width, double length, double height) {
        super(name);
        base = new Rectangle(name, width, length);
        this.height = height;
    }

    public double getLength(){
        return base.getLength();
    }

    public double getWidth(){
        return base.getWidth();
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double volume() {
        return base.area() * height;
    }
}
