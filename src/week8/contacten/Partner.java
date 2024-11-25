package week8.contacten;

public class Partner extends Contact{
    private String companyNumber;

    public Partner(String name, ContactData contactData, String companyNumber) {
        super(name, contactData);
        this.companyNumber = companyNumber;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    @Override
    public String toString() {
        return "Partner ("+companyNumber+"): "+super.toString();
    }

}
