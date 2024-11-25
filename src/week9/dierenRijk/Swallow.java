package week9.dierenRijk;

public class Swallow implements Animal, CanFly, LaysEggs {
    private String name;
    private int amountOfEggsPerYear;
    private double maxFlyingSpeed;

    public Swallow(String name, int amountOfEggsPerYear, double maxFlyingSpeed) {
        this.name = name;
        this.amountOfEggsPerYear = amountOfEggsPerYear;
        this.maxFlyingSpeed = maxFlyingSpeed;
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

    @Override
    public String toString() {
        return "Name: " + name + "\nEggs: " + amountOfEggsPerYear + "\nMax flying speed: " + maxFlyingSpeed;
    }
}
