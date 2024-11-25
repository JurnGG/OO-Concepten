package week8.contacten;

public class Customer extends Contact{
    private int id;

    public Customer(String name, ContactData contactData, int id) {
        super(name, contactData);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Klant ("+id+"): "+super.toString();
    }
}
