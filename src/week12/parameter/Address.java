package week12.parameter;

public class Address {
    private String streetnr;
    private String postalCode;

    public Address(String streetnr, String postalCode) {
        if (streetnr == null || streetnr.isBlank()) {
            throw new IllegalArgumentException("Street number cannot be null or empty");
        }
        if (postalCode == null || !postalCode.matches("\\d{4}")) {
            throw new IllegalArgumentException("Postal code must be exactly 4 digits");
        }
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