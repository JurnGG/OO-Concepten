package week9.dierenRijk;

public class Eagle implements Animal, CanFly, LaysEggs {
    private String name;
    private int amountOfEggsPerYear;
    private double maxFlyingSpeed;
    private double maxDivingSpeed;

    public Eagle(String name, int amountOfEggsPerYear, double maxFlyingSpeed, double maxDivingSpeed) {
        this.name = name;
        this.amountOfEggsPerYear = amountOfEggsPerYear;
        this.maxFlyingSpeed = maxFlyingSpeed;
        this.maxDivingSpeed = maxDivingSpeed;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAmountOfEggsPerYear() {
        return amountOfEggsPerYear;
    }

    @Override
    public double getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    public double getMaxDivingSpeed() {
        return maxDivingSpeed;
    }

    @Override
    public String toString() {
        return "Naam: "+name+"\nEieren: "+amountOfEggsPerYear
        +"\nMax vliegsnelheid: "+maxFlyingSpeed+"\nMax duiksnelheid: "+maxDivingSpeed;
    }
}
