package week9.virtualReality;

public class Player extends Entity implements Alive, Visible {
    private int numberOfLives;

    public Player(String name, double[] position, int numberOfLives) {
        super(name, position);
        this.numberOfLives = numberOfLives;
    }

    @Override
    public void kill() {
        if(numberOfLives <= 0) {
            System.out.println(name+": is dood.");
        }
        System.out.println("Aaaaaaarrrrrrgggghhh");
        numberOfLives--;
    }

    @Override
    public int getNumberOfLives() {
        return numberOfLives;
    }

    @Override
    public void draw() {
        System.out.println("Player: "+super.toString());
    }
}
