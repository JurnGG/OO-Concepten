package Week5.Verkopers;

public class SalesPerson {
    private String name;
    private double revenue;

    public SalesPerson(String name, double revenue) {
        this.name = name;
        this.revenue = revenue;
    }

    public boolean generatesMoreRevenueThan(SalesPerson other) {
        return this.revenue > other.revenue;
    }

    @Override
    public String toString() {
        return name+" met de omzet van €"+revenue;
    }
}
