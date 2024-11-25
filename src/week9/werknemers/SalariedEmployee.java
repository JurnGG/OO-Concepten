package week9.werknemers;

public class SalariedEmployee extends Employee{
    private final int WAGE_FACTOR = 192;
    private double wageBarema;

    public SalariedEmployee(String name, Long nationalNumber, double wageBarema) {
        super(name, nationalNumber);
        this.wageBarema = wageBarema;
    }

    @Override
    public double getWages(){
        return HOURLY_WAGES * WAGE_FACTOR * wageBarema;
    }

    @Override
    public String toString() {
        return String.format("%s\nLoon: %.2f€", super.toString(), getWages());
    }
}
