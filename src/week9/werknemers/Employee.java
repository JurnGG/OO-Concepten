package week9.werknemers;

abstract public class Employee {
    protected final double HOURLY_WAGES = 12.5;
    protected String name;
    protected Long nationalNumber;

    public Employee(String name, Long nationalNumber) {
        this.name = name;
        this.nationalNumber = nationalNumber;
    }
    public String getName() {
        return name;
    }

    public Long getNationalNumber() {
        return nationalNumber;
    }

    abstract public double getWages();

    @Override
    public String toString() {
        return "Naam: "+name+"\nNummer: "+nationalNumber;
    }
}
