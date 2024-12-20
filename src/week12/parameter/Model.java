package week12.parameter;

public class Model extends Person {
    private BodyMeusures bodyMeasures;
    private Address address;

    public Model(String name) {
        super(name);
        this.bodyMeasures = new BodyMeusures();
    }

    public Model(String name, double bust, double hips, double waist) {
        super(name);
        this.bodyMeasures = new BodyMeusures(bust, hips, waist);
        this.address = null;
    }

    public double getBust() {
        return bodyMeasures.getBust();
    }

    public double getHips() {
        return bodyMeasures.getHips();
    }

    public double getWaist() {
        return bodyMeasures.getWaist();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Address: " + ((address != null) ? address : "unknown") + "\n" +
                "Measurements: " + bodyMeasures;
    }
}