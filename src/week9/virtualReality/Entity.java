package week9.virtualReality;

abstract public class Entity {
    protected String name;
    protected double[] position;

    public Entity(String name,double[] position) {
        if (position.length != 3) {
            throw new IllegalArgumentException("Position array must have exactly 3 elements.");
        }
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double[] getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name +" ("+position[0]+", "+position[1]+", "+position[2]+")";
    }
}
