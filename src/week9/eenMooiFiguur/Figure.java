package week9.eenMooiFiguur;

abstract public class Figure {
    protected String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
