package Week5.TekenProgramma;

public class Rectangle {
    private double width;
    private double height;
    private Color color;

    public Rectangle(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public double Area(){
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle "+width+" x "+height+" with color "+color;
    }
}
