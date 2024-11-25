package Week5.TekenProgramma;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3.5, 6, Color.CYAN);
        Rectangle rectangle2 = new Rectangle(3.1, 7.3, Color.MAGENTA);
        Circle circle1 = new Circle(5, Color.YELLOW);
        Circle circle2 = new Circle(2, Color.MAGENTA);
        double totalArea = 0, cyanArea = 0, magentaArea = 0, yellowArea = 0;

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(circle1);
        System.out.println(circle2 + "\n");

        ShapeInfo[] shapeInfos = {
                new ShapeInfo(rectangle1.Area(), rectangle1.getColor()),
                new ShapeInfo(rectangle2.Area(), rectangle2.getColor()),
                new ShapeInfo(circle1.Area(), circle1.getColor()),
                new ShapeInfo(circle2.Area(), circle2.getColor())
        };

        for (ShapeInfo shape : shapeInfos){
            double area = shape.getArea();
            totalArea += area;

            switch (shape.getColor()){
                case CYAN -> cyanArea += area;
                case MAGENTA -> magentaArea += area;
                case YELLOW -> yellowArea += area;
            }
        }

        System.out.printf("Totale oppervlakte is: %f%n", totalArea);
        System.out.printf("Totale oppervlakte cyaan is: %f%n", cyanArea);
        System.out.printf("Totale oppervlakte magenta is: %f%n", magentaArea);
        System.out.printf("Totale oppervlakte geel is: %f%n", yellowArea);
    }
}
