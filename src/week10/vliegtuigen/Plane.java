package week10.vliegtuigen;

public class Plane {
    private PlaneType type;
    private String name;
    private String airline;

    public Plane(PlaneType type, String name, String airline) {
        this.type = type;
        this.name = name;
        this.airline = airline;
    }

    public PlaneType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getAirline() {
        return airline;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", airline='" + airline + '\'' +
                '}';
    }

}
