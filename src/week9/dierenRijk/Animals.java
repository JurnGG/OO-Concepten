package week9.dierenRijk;

public class Animals {
    private Animal[] animals;
    private int amount;

    public Animals() {
     animals = new Animal[100];
     amount = 0;
    }

    public boolean add(Animal animal) {
        if(amount < animals.length) {
            animals[amount] = animal;
            amount++;
            return true;
        }
        return false;
    }

    public void show(){
        for (int i = 0; i < amount; i++) {
            System.out.println(animals[i]+"\n");
        }
    }
}
