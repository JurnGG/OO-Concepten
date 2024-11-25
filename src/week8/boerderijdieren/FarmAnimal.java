package week8.boerderijdieren;

public class FarmAnimal {
    protected String name;
    protected String sound;
    protected String food;

    public FarmAnimal(String name, String sound, String food) {
        this.name = name;
        this.sound = sound;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    @Override
    public String toString() {
        return name+" maakt geluid '"+sound+"' en eet "+food;
    }
}
