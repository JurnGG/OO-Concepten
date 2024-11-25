package Week5.VerhuisFirma;

public class Box {
    private String type;
    private double height, width, length;

    public Box(String type, double height, double width, double length) {
        this.type = type;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box(String type) {
        this.type = type;
        switch (type){
            case "Type1"->{
                this.height = 100;
                this.width = 50;
                this.length = 50;
            }
            case "Type2"->{
                this.height = 50;
                this.width = 25;
                this.length = 25;
            }
            case "Type3"->{
                this.height = 25;
                this.width = 12.5;
                this.length = 12.5;
            }
            default->{
                System.out.println("Invalid type");
                this.height = -1;
                this.width = -1;
                this.length = -1;
            }
        }
    }

    public double groundArea(){
        return width * length;
    }

    public double volume(){
        return height * width * length;
    }

    public double tapeLength(){
        return (2*length) + (2*height);
    }

    @Override
    public String toString() {
        return "Doos van type " + type + ":\n"
                + height + " * " + width + " * " + length + "\n"
                + "Oppervlakte: " + groundArea() + "\n"
                + "Volume: " + volume() + "\n"
                + "Lengte tape: " + tapeLength();
    }
}
