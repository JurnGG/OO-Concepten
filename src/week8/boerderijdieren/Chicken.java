package week8.boerderijdieren;

public class Chicken extends FarmAnimal{
    private int eggsPerWeek;

    public Chicken(String name, int eggsPerWeek) {
        super(name, "Toktok", "mais");
        this.eggsPerWeek = eggsPerWeek;
    }

    public int getEggsPerWeek() {
        return eggsPerWeek;
    }

    @Override
    public String toString() {
        return super.toString()+ "en legt "+eggsPerWeek+" eieren per week";
    }
}
