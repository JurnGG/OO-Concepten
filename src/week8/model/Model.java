package week8.model;

public class Model extends Person {
    private BodyMeusures bodyMeusures;
    private Address address;

    public Model(String name) {
        super(name);
        bodyMeusures = new BodyMeusures();
    }

    public Model(String name, double bust, double hips, double waist) {
        super(name);
        bodyMeusures = new BodyMeusures(bust,hips,waist);
        address = null;
    }

    public double getBust() {
        return bodyMeusures.getBust();
    }


    public double getHips() {
        return bodyMeusures.getHips();
    }

    public double getWaist() {
        return bodyMeusures.getWaist();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Naam: " + name + "\n" +
                "Adres: " + ((address != null)?address:"onbekend") + "\n" +
                "Maten: " + bodyMeusures;
    }
}
