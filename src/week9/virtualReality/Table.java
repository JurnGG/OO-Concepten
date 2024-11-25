package week9.virtualReality;

public class Table extends Entity implements Visible,Movable{
    public Table(String name, double[] position) {
        super(name, position);
    }

    @Override
    public void draw() {
        System.out.println("Table: "+super.toString());
    }

    @Override
    public void move(double[] position) {
        if (position.length != 3) {
            throw new IllegalArgumentException("Position array must have exactly 3 elements.");
        }
     for (int i = 0; i < 3; i++) {
            this.position[i]+= position[i];
        }
    }
}
