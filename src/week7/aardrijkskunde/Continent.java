package week7.aardrijkskunde;

public enum Continent {
    NORTH_AMERICA(24256000, 470),
    SOUTH_AMERICA(17819000, 331),
    EUROPE(10530750, 728),
    ASIA(44579000, 3604),
    AFRICA(30665000, 654.5),
    AUSTRALIA(8535117, 29.5),
    ANTARCTICA(13209000, 0);

    private final long area;
    private final double population;

    Continent(long area, double population) {
        this.area = area;
        this.population = population;
    }

    public int populationDensity() {
        return (int) ((population* 1_000_000)/ area);
    }

    @Override
    public String toString() {
        return name()+" (pop.density: "+populationDensity()+")";
    }
}
