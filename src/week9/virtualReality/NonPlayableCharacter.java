package week9.virtualReality;

import java.util.Random;

public class NonPlayableCharacter extends Entity implements Visible, Alive {
    private int numberOfLives;
    Random random = new Random(42);

    public NonPlayableCharacter(String name, double[] position, int numberOfLives) {
        super(name, position);
        this.numberOfLives = numberOfLives;
    }

    @Override
    public void draw() {
        System.out.println("NonPlayableCharacter: " + super.toString());
    }

    @Override
    public int getNumberOfLives() {
        return numberOfLives;
    }

    @Override
    public void kill() {
        if(numberOfLives <= 0) {
            System.out.println(name+": is dood.");
        }
        System.out.println("Aaaaaaarrrrrrgggghhh");
        numberOfLives--;
    }

    public void animate(){
        for (double p: position) {
            p += random.nextInt(-10,10);
        }

    }
}
