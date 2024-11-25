package week9.dierenRijk;

public class Ostrich implements Animal, LaysEggs {
    private String name;
    private int amountOfEggsPerYear;

    public Ostrich(String name, int amountOfEggsPerYear) {
        this.name = name;
        this.amountOfEggsPerYear = amountOfEggsPerYear;
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
    public String toString() {
        return "Name: " + name + "\nEggs: " + amountOfEggsPerYear;
    }
}
