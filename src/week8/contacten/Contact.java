package week8.contacten;

public class Contact {
    protected String name;
    protected ContactData contactData;

    public Contact(String name, ContactData contactData) {
        this.name = name;
        this.contactData = contactData;
    }

    public String getName() {
        return name;
    }

    public ContactData getContactData() {
        return contactData;
    }

    @Override
    public String toString() {
        return name +", "+contactData;
    }
}
