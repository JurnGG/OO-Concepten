package week8.boerderijdieren;

public class Rabbit extends FarmAnimal {
    private boolean likesDigging;

    public Rabbit(String name, boolean likesDigging) {
        super(name, "Snifsnif", "gras");
        this.likesDigging = likesDigging;
    }

    public boolean likesDigging() {
        return likesDigging;
    }

    @Override
    public String toString() {
        return super.toString()+" en graaft "+(likesDigging?"":"niet ")+"graag";
    }
}
