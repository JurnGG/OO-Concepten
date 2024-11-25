package Week5.Kotbaas;

public class Student {
    private String name;
    private String streetNr;
    private String city;
    private int postalCode;

    public Student(String name, String streetNr, String city, int postalCode) {
        this.name = name;
        this.streetNr = streetNr;
        this.city = city;
        this.postalCode = postalCode;
    }
    public Student() {
        this("leegstaand", "leegstaand", "leegstaand", 0);
    }

    public String getName() {
        return name;
    }

    public String getStreetNumber() {
        return streetNr;
    }

    public String getCity() {
        return city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return name+", "+streetNr+", "+postalCode+" "+city;
    }
}
