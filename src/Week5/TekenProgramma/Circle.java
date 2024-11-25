package Week5.TekenProgramma;

public class Circle {
    private double radius;
    private Color color;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public Color getColor() {
        return color;
    }

    public double Area(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle with radius "+radius+" with color "+color;
    }
}
