package week8.model;

public class Address {
    private String streetnr;
    private String postalCode;

    public Address(String streetnr, String postalCode) {
        this.streetnr = streetnr;
        this.postalCode = postalCode;
    }

    public String getStreetnr() {
        return streetnr;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return streetnr + ", " + postalCode;
    }
}
