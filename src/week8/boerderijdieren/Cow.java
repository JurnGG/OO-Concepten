package week8.boerderijdieren;

public class Cow extends FarmAnimal {
    private double literMilkPerDay;

    public Cow(String name, double literMilkPerDay) {
        super(name, "Boeboe", "gras");
        this.literMilkPerDay = literMilkPerDay;
    }

    public double getLiterMilkPerDay() {
        return literMilkPerDay;
    }

    @Override
    public String toString() {
        return super.toString()+" en geeft "+literMilkPerDay+" liter melk per dag";
    }
}
